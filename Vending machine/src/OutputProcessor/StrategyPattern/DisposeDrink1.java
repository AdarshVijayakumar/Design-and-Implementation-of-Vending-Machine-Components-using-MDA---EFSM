package OutputProcessor.StrategyPattern;
                                                        //Implementing Strategy pattern
import DataStore.*;
                            //This class implements the DisposeDrink function as per the VM1 specifics
public class DisposeDrink1 implements DisposeDrink {

    public void DisposeDrink(int d){
        if(d == 2)                                    //convention used for drinks: 1-coffee, 2-tea, 3-chocolate
            System.out.println("\nTEA is disposed");  //If 2 is received as parameter in this function, then dispose TEA
        else if (d == 3)
            System.out.println("\nCHOCOLATE is disposed");    //If 3 is received as parameter in this function, then dispose CHOCOLATE
    }

}
