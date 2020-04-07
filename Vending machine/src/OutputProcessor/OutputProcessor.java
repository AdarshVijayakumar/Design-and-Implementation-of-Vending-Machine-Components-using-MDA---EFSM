package OutputProcessor;
                              //Strategy Pattern is implemented for the OutputProcessor
import AbstractFactory.*;
import DataStore.*;
import OutputProcessor.StrategyPattern.*;

public class OutputProcessor {

    private DataStore ds;
    private AbstractFactory af;
                                   //objects of all the abstract classes which are implementing strategy pattern
    private StorePrice  spr;
    private ZeroCF zcf;
    private IncreaseCF icf;
    private ReturnCoins rcn;
    private DisposeDrink dd;
    private DisposeAdditive da;

    public OutputProcessor(AbstractFactory af, DataStore ds) {      //constructor
        this.af = af;              //this class's af object is initialized with the af object which points to required version of VM
        this.ds = ds;              //DataStore object is also initialized
                                    //objects of all the abstract classes which are implementing strategy pattern are initialized
        spr = af.get_StorePrice();
        zcf = af.get_ZeroCF();
        icf = af.get_IncreaseCF();
        rcn = af.get_ReturnCoins();
        dd = af.get_DisposeDrink();
        da = af.get_DisposeAdditive();
    }

    public void StorePrice(){
        spr.set_DataStore(ds);
        spr.StorePrice();         //required version of the StorePrice() function is invoked
    }

    public void ZeroCF() {
        zcf.set_DataStore(ds);
        zcf.ZeroCF();         //required version of the ZeroCF() function is invoked
    }

    public void IncreaseCF() {
        icf.set_DataStore(ds);
        icf.IncreaseCF();        //required version of the IncreaseCF() function is invoked
    }

    public void ReturnCoins(){
        rcn.set_DataStore(ds);
        rcn.ReturnCoins();       //required version of the ReturnCoins() function is invoked
    }

    public void DisposeDrink(int d){
        dd.DisposeDrink(d);          //required version of the DisposeDrink() function is invoked
    }

    public void DisposeAdditive(int A[]){
        da.DisposeAdditive(A);      //required version of the DisposeAdditive() function is invoked
    }

    public AbstractFactory get_AbstractFactory() {       //return the AbstractFactory object
        return af;
    }

    public void set_AbstractFactory(AbstractFactory af) {      //Initialize the AbstractFactory object of this class
        this.af = af;
    }

    public DataStore get_DataStore() {             //return the DataStore object
        return ds;
    }

    public void setDataStore(DataStore ds) {         //Initialize the DataStore object of this class
        this.ds = ds;
    }

}
