public class Hand extends Deck implements HandOfCards{

    Card card1;
    Card card2;


    public Hand(){

        card1 = null;
        card2 = null;
        add(dealCard());
        add(dealCard());

    }
    
    @Override
    public void add(Card c){
        if (card1 == null){
            card1 = c;
        }
        else if (card2 == null){
            card2 = c;
        }
        
    }

    public int getSize(){

        if (card2 == null){
            return 1;
        } else {
            return 2;
        }

    }

    public String toString(){
        return "Hand: \n" + card1 + "\n" + card2;
    }
    
}
