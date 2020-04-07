package OutputProcessor.StrategyPattern;
                                                //Implementing Strategy pattern
import DataStore.*;
                                                    //This class implements the IncreaseCF function as per the VM2 specifics
public class IncreaseCF2 implements IncreaseCF {

    private DataStore ds;
    private int c;
    private int v;

    @Override
    public DataStore get_DataStore(){
        return ds;
    }           //returns the DataStore object

    @Override
    public void set_DataStore(DataStore ds){
        this.ds = ds;
    }    //set the ds object of this class to the ds received as parameter in this function

    @Override
    public void IncreaseCF() {
        float new_c;
        new_c = ds.get_fcf()+ds.getTemp_fv();        //update the cf value -> cf = cf+v
        ds.set_cf(new_c);                         //set the updated cf value to the cf variable in datastore
        System.out.println("The cumilative fund now is "+new_c);
    }
}
