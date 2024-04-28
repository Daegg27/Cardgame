import java.util.Random;

public class Deck {
    

    

    public Deck(){

    }

    public Card dealCard(){

        Card firstCard = new Card();
        Random rand = new Random();
        

        int newInt = rand.nextInt(13) + 1;
        int findSuit = rand.nextInt(4);

        firstCard.setRank(newInt);

        if (findSuit == 0){
            firstCard.setSuit("Diamond");
        }
        else if (findSuit == 1){
            firstCard.setSuit("Clubs");
        }
        else if (findSuit == 2){
            firstCard.setSuit("Hearts");;
        }
        else {
            firstCard.setSuit("Spades");
        }
        
        return firstCard;

    }

    public String toString(){
        return "This deck has a card with a rank of: " + dealCard() + 
        " and a suit of: " + dealCard();
    }




}
