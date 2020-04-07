package MDAEFSM.StatePattern;
                                           //Implementing De-centralized State pattern
import MDAEFSM.*;
import OutputProcessor.*;

public class coins_inserted extends state {         //class for the coins inserted state of the MDAEFSM design

    public coins_inserted(MDAEFSM mda, OutputProcessor op) {      //Constructor to initialize the MDAEFSM and OutputProcessor objects
        this.mda = mda;
        this.op = op;
    }

    public void coin(int f){
        System.out.println("\nSelect the Additive. Then select the Drink\n");
        op.ReturnCoins();                            //coins are returned in the coins inserted state
    }

    public void additive(int a){          // a is the index position received as the parameter
        System.out.println("\nSelect the Additive. Then select the Drink\n");
        if(mda.A[a]==0)           //If the additive is not selected
            mda.A[a]=1;           //Then select that additive
        else if (mda.A[a]==1)     //If it's already selected
            mda.A[a]=0;           //Then de-select that additive
    }

    public void cancel(){
        op.ZeroCF();                //make the cf 0
        op.ReturnCoins();           //Return the coins on cancelling
        mda.change_state(2);        //and change the state back to idle
        System.out.println("\n-----------------------Reached idle State-----------------------------");
    }

    public void dispose_drink(int d){      //convention used for drinks: 1-coffee, 2-tea, 3-chocolate
        if(mda.k > 1){                    //more than 1 cup is there
            mda.k = mda.k -1;             //decrease the no. of cup by 1
            op.DisposeDrink(d);           //call the function to dispose the selected drink
            op.DisposeAdditive(mda.A);     // with selected additive
            op.ZeroCF();                  // reset the cumilative fund back to 0
            mda.change_state(2);          //change the state back to idle
            System.out.println("\n-----------------------Reached idle State-----------------------------");
        }
        else if (mda.k<=1){             //If only one cup is there in the machine
            op.DisposeDrink(d);
            op.DisposeAdditive(mda.A);
            mda.change_state(1);           //change the state to no cups, after disposing the drink
            System.out.println("\n-----------------------Reached no_cups State-----------------------------");
        }
    }
}
