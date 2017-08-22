import java.util.*;  
import java.util.ArrayList;

/**
* https://docs.oracle.com/javase/tutorial/java/concepts/class.html
*
 */
/*
class Bicycle{
    int cadance =   0;
    int speed   =   0;
    int gear    =   1;

    void changeCadance(int newValue){
        cadance = newValue;
    }

    void changeGear(int newValue){
        gear = newValue;
    }

    void speedUp(int increment){
        speed = speed + increment;
    }

    void applyBreaks(int decrement){
        speed = speed - decrement;
    }

    void printStates(){
        System.out.println("cadence:" + cadance +
            "; speed: " + speed + 
            "; gear: "  + gear
        );   
    }
}

class ClassExampleApp{
    public static void main(String[] args){
        //Create two different 
        //bicycle objects
        Bicycle bike1 = new Bicycle();
        Bicycle bike2 = new Bicycle();

        //invoke methods on
        //those objects
        bike1.changeCadance(50);
        bike1.speedUp(10);
        bike1.changeGear(2);
        bike1.printStates();

        bike2.changeCadance(50);
        bike2.speedUp(10);
        bike2.changeGear(2);
        bike2.changeCadance(40);
        bike2.speedUp(10);
        bike2.changeGear(3);
        bike2.printStates();

    }
}
*/




class _MainApp{
    public static void main (String[] args){

        Deck deck = new Deck();

        for (int suite = 1; suite   <= deck.numSuites ; suite++ ){ 
            for(int rank = 1; rank  <= deck.numRanks;   rank++ ){
                System.out.println( deck.getCard(suite, rank)   );
            }
        }
    }
}