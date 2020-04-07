package OutputProcessor.StrategyPattern;
                                                        //Implementing Strategy pattern
import DataStore.*;
                                //This class implements the DisposeDrink function as per the VM2 specifics
public class DisposeDrink2 implements DisposeDrink{

    public void DisposeDrink(int d) {
        if (d == 1)                                      //convention used for drinks: 1-coffee, 2-tea, 3-chocolate
            System.out.println("\nCOFFEE is disposed");  //If 1 is received as parameter in this function, then dispose COFFEE
    }
}
