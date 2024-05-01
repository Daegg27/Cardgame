import java.util.Scanner;

public class gameDriver {
    
    public static void main(String[] args){

        LinkedQueue<StackHand> trackTurns = new LinkedQueue<>();
        Scanner newObj = new Scanner(System.in);
        boolean gameStarted = false;
        

        StackHand playerOne = new StackHand("Dalton");
        StackHand playerTwo = new StackHand("Tim");
        StackHand playerThree = new StackHand("Andre");
        StackHand currentChampion = playerOne;

        
        trackTurns.enqueue(playerTwo);
        trackTurns.enqueue(playerThree); // Game structure is now created


        System.out.println("Would you like to play a game? Enter '1' for yes and '2' for no: ");
        int userInput = newObj.nextInt();

        if (userInput == 1){

            gameStarted = true;

            while (gameStarted){

                boolean duelNow = false;
                StackHand challenger = trackTurns.dequeue();

                if (currentChampion.play(duelNow).getRank() > challenger.play(duelNow).getRank()){ // Current Champion remains the winner
                    if (currentChampion.play(duelNow).getRank() == 14){
                        System.out.println("\n***" + currentChampion.name.toUpperCase() +" IS THE WINNER. CONGRATULATIONS BUDDY!!!***\n");
                        break;
                    }
                    duelNow = true;
                    currentChampion.play(duelNow);
                    challenger.play(duelNow);
                    System.out.println(currentChampion.name + " is now the Champion");
                    trackTurns.enqueue(challenger);
                }
                 else if (currentChampion.play(duelNow).getRank() == challenger.play(duelNow).getRank()){ // Draw has occured, champion wins by default
                    if (currentChampion.play(duelNow).getRank() == 14){
                        System.out.println("\n***" + currentChampion.name.toUpperCase() +" IS THE WINNER. CONGRATULATIONS BUDDY!!!***\n");
                        break;
                    }
                    duelNow = true;
                    currentChampion.play(duelNow);
                    challenger.play(duelNow);
                    System.out.println(currentChampion.name + " is now the Champion by draw");
                    trackTurns.enqueue(challenger);
                }
                    else if (currentChampion.play(duelNow).getRank() < challenger.play(duelNow).getRank()){ // The king has fallen! 
                        if (currentChampion.play(duelNow).getRank() == 14){
                            System.out.println("\n***" + currentChampion.name.toUpperCase() +" IS THE WINNER. CONGRATULATIONS BUDDY!!!***\n");
                            break;
                        }
                    duelNow = true;
                    currentChampion.play(duelNow);
                    challenger.play(duelNow);
                    System.out.println(challenger.name + " is now the new undisputed champion!");
                    trackTurns.enqueue(currentChampion);
                    currentChampion = challenger;
                }

                System.out.println("\nWould you like to continue playing? Enter '1' for yes and '2' for no: ");
                userInput = newObj.nextInt();

                if (userInput != 1){
                    gameStarted = false;
                    System.out.println("Thanks for playing!");
                }
                

            }
        } else {
            System.out.println("No worries! Take care!");
        }


        

    }

    
}
