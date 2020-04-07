package OutputProcessor.StrategyPattern;
                                                            //Implementing Strategy pattern
import DataStore.*;
                                                //This class implements the StorePrice function as per the VM2 specifics
public class StorePrice2 implements StorePrice {

    private DataStore ds;

    @Override
    public DataStore get_DataStore(){
        return ds;
    }      //returns the DataStore object

    @Override
    public void set_DataStore(DataStore ds){
        this.ds = ds;
    }     //set the ds object of this class to the ds received as parameter in this function

    @Override
    public void StorePrice() {
        float t_p;
        t_p = ds.getTemp_fp();
        ds.SetPrice(t_p);            //copy the price value to the temp_p variable in datastore
        System.out.println("The price has been set to " + ds.get_fprice());
    }
}
