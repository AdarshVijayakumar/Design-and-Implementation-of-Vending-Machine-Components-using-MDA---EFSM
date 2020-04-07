package OutputProcessor.StrategyPattern;
                                            //Implementing Strategy pattern
import DataStore.*;

public interface IncreaseCF {              //This is an abstract class for the implementation of 2 versions IncreaseCF

    public DataStore get_DataStore();       //This function returns the DataStore object of the required version of the vending machine

    public void set_DataStore(DataStore ds);  //This function sets the ds object to the required version of the DataStore

    public void IncreaseCF();               //This is an abstract function for the actual implementation of the function IncreaseCF()

}
