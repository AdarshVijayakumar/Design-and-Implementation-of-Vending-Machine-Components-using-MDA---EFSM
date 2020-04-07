package OutputProcessor.StrategyPattern;
                                                    //Implementing Strategy pattern
import DataStore.*;
                           //This class implements the DisposeAdditive function as per the VM1 specifics
public class DisposeAdditive1 implements DisposeAdditive {

    public void DisposeAdditive(int A[]){
        if (A[1]==1)                    //convention used for additives: 1-sugar, 2-cream
                System.out.println("\nSUGAR is disposed");    //If value in index position one is 1, then dispose sugar

    }

}
