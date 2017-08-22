public class Deck {
    int numSuites = 4;
    int numRanks  = 13;
    int cardCount = 0;

    private Card[][] cards;

    /*
    class Joker{
        public void speak(){
            System.out.println("The Jokers Here!");
        }
    }
    */

    public Deck (){
        Joker joker = new Deck.Joker();
        joker.speak();

        cards = new Card[numSuites][numRanks];
        for (int suite = 1; suite <= numSuites; suite++ ){
            for (int rank = 1; rank <= numRanks; rank++ ){
                cards[suite-1][rank-1] = new Card( rank, suite);
            }
        }
    }

    public Card getCard(int suite, int rank){
        return cards[suite -1][rank-1];
    }

}