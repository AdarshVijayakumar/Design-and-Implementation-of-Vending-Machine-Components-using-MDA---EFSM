package OutputProcessor.StrategyPattern;
                                                        //Implementing Strategy pattern
import DataStore.*;
                                        //This class implements the IncreaseCF function as per the VM2 specifics
public class ReturnCoins2 implements ReturnCoins {

    private DataStore ds;

    @Override
    public DataStore get_DataStore(){
        return ds;
    }      //returns the DataStore object

    @Override
    public void set_DataStore(DataStore ds){
        this.ds = ds;
    }   //set the ds object of this class to the ds received as parameter in this function

    @Override
    public void ReturnCoins(){
        System.out.println("Coins are returned ");
    }   //Coins are returned

}
