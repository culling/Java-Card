public class Card {

    private int rank;
    private int suite;

    // Rank
    public static final int ACE   = 1;
    public static final int TWO   = 2;
    public static final int THREE = 3;
    public static final int FOUR  = 4;
    public static final int FIVE  = 5;
    public static final int SIX   = 6;
    public static final int SEVEN = 7;
    public static final int EIGHT = 8;
    public static final int NINE  = 9;
    public static final int TEN   = 10;
    public static final int JACK  = 11;
    public static final int QUEEN = 12;
    public static final int KING  = 13;

    // Suite
    public static final int DIAMONDS  = 1;
    public static final int CLUBS     = 2; 
    public static final int HEARTS    = 3;
    public static final int SPADES    = 4;


    Card (int rank, int suite){
        assert isValidRank(rank);
        assert isValidSuite(suite);
        this.rank   = rank;
        this.suite  = suite;
    }
    
    public int getRank(){
        return rank;
    }

    public int getSuite(){
        return suite;
    }

    public static boolean isValidRank(int rank){
        return ACE <= rank && rank <= KING;
    }

    public static boolean isValidSuite(int suite){
        return DIAMONDS <= suite && suite <= SPADES;
    }

    public static String suiteToString(int suite){
        switch(suite){
            case DIAMONDS:
                return "Diamonds";
            case HEARTS:
                return "Hearts";
            case CLUBS:
                return "Clubs";
            case SPADES:
                return "Spades";
            default:
                return null;
        }
    }

    public static String rankToString(int rank){
        switch(rank) {
            case ACE:
                return "Ace";
            case TWO:
                return "Two";
            case THREE:
                return "Three";
            case FOUR:
                return "Four";
            case FIVE:
                return "Five";
            case SIX:
                return "Six";
            case SEVEN:
                return "Seven";
            case EIGHT:
                return "Eight";
            case NINE:
                return "Nine";
            case TEN:
                return "Ten";
            case JACK:
                return "Jack";
            case QUEEN:
                return "Queen";
            case KING:
                return "King";
            default:
                return null;
        }


    }


    public String toString(){
        return  rankToString(rank) + " of " + suiteToString(suite) ;
    }

}