package InputProcessor;

import DataStore.*;
import MDAEFSM.*;

public class VM1 {                   //Vending Machine 1 class
    private MDAEFSM mda;
    private DataStore ds;

    // Constructor
    public VM1(MDAEFSM mda, DataStore ds) {      //Constructor to initialize the MDAEFSM and DataStore objects
        this.mda = mda;
        this.ds = ds;
    }

    public void create(int p){                //function starts the vending machine 1, p is an initial price of a drink
        ds.setTemp_p(p);                     //storing the p value in data store
        mda.create();
    }
    public void coin(int v){                     //function to insert a coin with value v
        ds.setTemp_v(v);                        //storing the v value in data store
        if(ds.get_cf()+v >= ds.get_price())     //Check if total value of inserted coins is greater than the price of the drink
            mda.coin(1);
        else
            mda.coin(0);
    }
    public void card(float x){          //credit card is swiped, where x is an available fund
        if(x >= ds.get_price())         //Check if available fund is greater than the price of the drink
            mda.card();
    }
    public void sugar(){                //sugar button is pressed
        mda.additive(1);             //convention used for additives: 1-sugar, 2-cream
    }
    public void tea(){                  //tea button is pressed
        mda.dispose_drink(2);        //convention used for drinks: 1-coffee, 2-tea, 3-chocolate
    }
    public void chocolate(){             //chocolate button is pressed
        mda.dispose_drink(3);         //convention used for drinks: 1-coffee, 2-tea, 3-chocolate
    }
    public void insert_cups(int n){      //n cups are inserted into the vending machine
        mda.insert_cups(n);
    }
    public void set_price(int p){         //new price of a cup of tea/chocolate is set to value p
        ds.setTemp_p(p);
        mda.set_price();
    }
    public void cancel(){                //cancel selection for a cup of tea or hot chocolate
        mda.cancel();
    }

}
