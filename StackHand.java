public class StackHand extends Deck implements HandOfCards{ // Public class Player
    
    


    private Hand handOne;
    private Hand handTwo;
    private Hand handThree;
    public String name; // Public so I can be lazy and avoid making a getName function :D
    LinkedStack<Hand> handsAvailable = new LinkedStack<>();

    public StackHand(String name){ 
        this.name = name;
        handOne = new Hand();
        handTwo = new Hand();
        handThree = new Hand();
        handsAvailable.push(handOne);
        handsAvailable.push(handTwo);
        handsAvailable.push(handThree);
    }


    
    public void add(Card c){ // Unneeded
        
        
    }

    public Card play(boolean playCard){ // This function essientially serves two purposes, which is dependant on the boolean, one is to check and one is to use.
        try{
            Hand tempHand = handsAvailable.peek(); // Allows me to check the card for comparison
            Card tempCard = tempHand.card1;

            if (playCard == true){ // Logic for actually using the card 
                
                System.out.println(name + " played a " + tempCard.getRank() + " of " + tempCard.getSuit());
                if (tempHand.card2 != null){
                    tempHand.card1 = tempHand.card2;
                    tempHand.card2 = null;
                    System.out.println(name + " has " + size() + " hands remaining"); // Shows the stack is working properly.
                }else {
                    handsAvailable.pop();
                    System.out.println(name + " has " + size() + " hands remaining"); // Shows the stack is working properly.
                }
            }
            return tempCard;
        }catch (EmptyCollectionException e){
            Card endgameCard = new Card();
            endgameCard.setRank(14);
            return endgameCard; // Will check for rank 14 (out of normal card boudary to terminate while loop) :D
        }
    }

    public int size(){

        return handsAvailable.size(); 

    }

    public String toString(){
        return "The player has " + size() + " hands left to play";
    }

}
