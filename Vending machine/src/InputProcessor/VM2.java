package InputProcessor;

import DataStore.*;
import MDAEFSM.*;

public class VM2 {                          //Vending Machine 2 class
    private MDAEFSM mda;
    private DataStore ds;

    // Constructor
    public VM2(MDAEFSM mda, DataStore ds) {      //Constructor to initialize the MDAEFSM and DataStore objects
        this.mda = mda;
        this.ds = ds;
    }

    public void CREATE(float p){         //function starts the vending machine 1, p is an initial price of a drink
        ds.setTemp_p(p);                 //storing the p value in data store
        mda.create();
    }
    public void COIN(float v){          //function to insert a coin with value v
        ds.setTemp_v(v);                //storing the v value in data store
        if(ds.get_fcf()+v >= ds.get_fprice())       //Check if total value of inserted coins is greater than the price of the drink
            mda.coin(1);
        else
            mda.coin(0);
    }
    public void SUGAR(){                 //sugar button is pressed
        mda.additive(1);              //convention used for additives: 1-sugar, 2-cream
    }
    public void CREAM(){                  //cream button is pressed
        mda.additive(2);             //convention used for additives: 1-sugar, 2-cream
    }
    public void COFFE(){                 //coffee button is pressed
        mda.dispose_drink(1);        //convention used for drinks: 1-coffee, 2-tea, 3-chocolate
    }
    public void InsertCups(int n){       //n cups are inserted into the vending machine
        mda.insert_cups(n);
    }
    public void SetPrice(float p){       //new price of a cup of tea/chocolate is set to value p
        ds.setTemp_p(p);
        mda.set_price();
    }
    public void CANCEL(){
        mda.cancel();
    }   //cancel selection for a cup of coffee
}
