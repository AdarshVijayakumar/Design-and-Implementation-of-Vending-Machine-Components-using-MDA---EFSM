package MDAEFSM.StatePattern;
                                                    //Implementing De-centralized State pattern
import MDAEFSM.*;
import OutputProcessor.*;

public class start extends state {               //class for the start state of the MDAEFSM design

    public start(MDAEFSM mda, OutputProcessor op) {          //Constructor to initialize the MDAEFSM and OutputProcessor objects
        this.mda = mda;
        this.op = op;
    }

    public void create(){                          //function starts the vending machine
        op.StorePrice();
        mda.change_state(1);                       //change the state to coins inseeted
        System.out.println("\n-----------------------Reached no_cups State-----------------------------");
    }
}
