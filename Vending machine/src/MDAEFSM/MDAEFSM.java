package MDAEFSM;
                                        //Implementing De-centralized State pattern
import MDAEFSM.StatePattern.*;
import OutputProcessor.*;

public class MDAEFSM {              //This is the context class in the De-centralized state pattern

    private state s;               //The pointer s always points to the current state
    private state[] LS;            //LS contains the list of states
    public int k;
    public int[] A = new int[3];      //Array to manage the selection, de-selection of additives

    public MDAEFSM(OutputProcessor op) {

        // Keeps track of states
        LS = new state[4];
                                              //In our convention here, we assign the 4 states to the following index positions
        LS[0] = new start(this, op);
        LS[1] = new no_cups(this, op);
        LS[2] = new idle(this, op);
        LS[3] = new coins_inserted(this, op);

        s = LS[0]; //initialize to start state     //At the beginning s points to the start state i.e LS[0]
    }

    public void change_state(int state){      //Function for changing the state
        s = LS[state];
    }

    public void create(){         //In context class, we just call the actual implementation of the function
        s.create();              //which is in the respective state classes
    }

    public void insert_cups(int n){
        s.insert_cups(n);                //Call the insert_cups() function
    }

    public void coin(int f){         //f is integer parameter which differentiates total coin value greater or less than the actual drink price
        s.coin(f);                  //Call the coin() function from the pointer s
    }

    public void card(){
        s.card();            //call the card() function from pointer s
    }

    public void cancel(){
        s.cancel();         //call the cancel() function from pointer s - which points to the current state
    }

    public void set_price(){
        s.set_price();         //call the set_price() function from pointer s - which points to the current state
    }

    public void dispose_drink(int d){  //convention used for drinks: 1-coffee, 2-tea, 3-chocolate
        s.dispose_drink(d);           //call the dispose_drink() function from pointer s - which points to the current state
    }

    public void additive(int a){    //convention used for additives: 1-sugar, 2-cream
        s.additive(a);            //call the additive() function from pointer s - which points to the current state
    }

}
