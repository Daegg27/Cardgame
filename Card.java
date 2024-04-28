public class Card {
    
    public int rank;
    public String suit;

    public Card(){

        rank = 1;
        suit = "Spade";

    }


    public void setRank(int rank){

        this.rank = rank;

    }

    public void setSuit(String suit){

        this.suit = suit;

    }

    public int getRank(){
        return rank;
    }

    public String getSuit(){
        return suit;
    }

    public String toString(){

        return "This card has a rank of: " + rank + " and a Suit of: " + suit;

    }


}
