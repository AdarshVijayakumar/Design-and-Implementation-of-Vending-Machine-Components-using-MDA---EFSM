package MDAEFSM.StatePattern;
                                                    //Implementing De-centralized State pattern
import MDAEFSM.*;
import OutputProcessor.*;

public class no_cups extends state {             //class for the no cups state of the MDAEFSM design

    public no_cups(MDAEFSM mda, OutputProcessor op) {          //Constructor to initialize the MDAEFSM and OutputProcessor objects
        this.mda = mda;
        this.op = op;
    }

    public void coin(int f){
        op.ReturnCoins();              //coins are returned in the coins inserted state
    }

    public void insert_cups(int n){
        if(n > 0){                       //If n is a positive integer greater than 0
            mda.k = n;                   //copy the no. of cups to the variable k
            op.ZeroCF();                 //set the cumilative fund to 0
            mda.change_state(2);        //change the state to coins inseeted
            System.out.println("\n-----------------------Reached idle State-----------------------------");
        }
    }

}
