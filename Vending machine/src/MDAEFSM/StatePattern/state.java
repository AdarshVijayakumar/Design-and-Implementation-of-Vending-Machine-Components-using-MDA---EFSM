package MDAEFSM.StatePattern;
                                                            //Implementing De-centralized State pattern
import MDAEFSM.*;
import OutputProcessor.*;

public class state {            //This is an abstract class for all the state classes

    MDAEFSM mda;
    OutputProcessor op;

    public void create(){

    }    //This is the abstract function for the actual implementation of the function create()

    public void coin(int f){

    }   //This is the abstract function for the actual implementation of the function coin()

    public void insert_cups(int n){

    }  //This is the abstract function for the actual implementation of the function insert_cups()

    public void set_price(){

    }   //This is the abstract function for the actual implementation of the function set_price()

    public void card(){

    }    //This is the abstract function for the actual implementation of the function card()

    public void additive(int a){

    }  //This is the abstract function for the actual implementation of the function additive(int a)

    public void cancel(){

    }    //This is the abstract function for the actual implementation of the function cancel()

    public void dispose_drink(int d){

    }  //This is the abstract function for the actual implementation of the function dispose_drink(int d)

    public MDAEFSM get_MDAEFSM() {
        return mda;
    }   //This is the abstract function for the actual implementation of the function get_MDAEFSM()

    public void set_MDAEFSM(MDAEFSM mda) {
        this.mda = mda;
    }  //abstract function for set_MDAEFSM()

    public OutputProcessor get_OutputProcessor() {
        return op;
    }  //abstract function for get_OutPutProcessor()

    public void set_OutputProcessor(OutputProcessor op) {
        this.op = op;
    }   //abstract function for set_OutputProcessor()

}
