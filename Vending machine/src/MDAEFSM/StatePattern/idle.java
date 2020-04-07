package MDAEFSM.StatePattern;
                                                    //Implementing De-centralized State pattern
import MDAEFSM.*;
import OutputProcessor.*;

public class idle extends state{                      //class for the idle state of the MDAEFSM design

    public idle(MDAEFSM mda, OutputProcessor op) {       //Constructor to initialize the MDAEFSM and OutputProcessor objects
        this.mda = mda;
        this.op = op;
    }

    public void coin(int f){
        if(f == 0){                 //If total value of inserted coins is less than the price of the drink
            op.IncreaseCF();        //Then increase the cumilative fund (cf = cf + v)
        }
        else if (f == 1){          //If total value of inserted coins is greater or equal to the price of the drink
            mda.change_state(3);    //Change the state to coins inserted
            System.out.println("\n-----------------------Reached coins_inserted State-----------------------------");
            System.out.println("\nSelect the Additive. Then select the Drink\n");
            op.IncreaseCF();         //Increase the cumilative fund
            for(int i=0; i<mda.A.length; i++)         //set the additive array to 0
                mda.A[i]=0;                          //i.e.. no additive is selected at the beginning
        }
    }

    public void insert_cups(int n){
        if(n > 0){                //If n is a positive integer greater than 0
            mda.k = mda.k +n;      //add n to the no. of cups k variable
        }
    }

    public void set_price(){     //you can set the price of the drink to a new price in idle state
        op.StorePrice();
    }

    public void card(){        //paying for the drink by card
        op.ZeroCF();          //set the cumilative fund to 0
        mda.change_state(3);     //change the state to coins inseeted
        System.out.println("\n-----------------------Reached coins_inserted State-----------------------------");
        System.out.println("\nSelect the Additive. Then select the Drink\n");
        for(int i=0; i<mda.A.length; i++)           //set the additive array to 0
            mda.A[i]=0;                            //i.e.. no additive is selected at the beginning
    }

}
