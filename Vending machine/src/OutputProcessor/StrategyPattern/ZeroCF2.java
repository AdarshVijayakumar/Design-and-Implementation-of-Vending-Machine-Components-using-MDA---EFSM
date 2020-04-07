package OutputProcessor.StrategyPattern;
                                                    //Implementing Strategy pattern
import DataStore.*;
                                    //This class implements the IncreaseCF function as per the VM1 specifics
public class ZeroCF2 implements ZeroCF {

    private DataStore ds;

    @Override
    public DataStore get_DataStore(){
        return ds;
    }      //returns the DataStore object

    @Override
    public void set_DataStore(DataStore ds){
        this.ds = ds;
    }      //set the ds object of this class to the ds received as parameter in this function

    @Override
    public void ZeroCF(){
        ds.set_cf(0f);          //reset the value of the cf variable in DataStore to 0
    }

}
