package OutputProcessor.StrategyPattern;
                                                //Implementing Strategy pattern
import DataStore.*;
                                            //This class implements the DisposeAdditive function as per the VM2 specifics
public class  DisposeAdditive2 implements DisposeAdditive{

        public void DisposeAdditive(int A[]) {
            if (A[1] == 1)                    //convention used for additives: 1-sugar, 2-cream
                System.out.println("SUGAR is disposed");      //If value in index position one is 1, then dispose sugar

            if (A[2] == 1)                   //convention used for additives: 1-sugar, 2-cream
                System.out.println("CREAM is disposed");        //If value in index position two is 1, then dispose cream
        }
}


