package DataStore;

public class DS1 extends DataStore {

    private int temp_p;
    private int temp_v;
    private int price;
    private int cf;

    public int getTemp_p(){
        return temp_p;
    }       //function to return the int temp_p variable

    public void setTemp_p(int p){
        temp_p = p;
    }   //function to set the int temp_p variable

    public int getTemp_v(){
        return temp_v;
    }      //function to return the int temp_v variable

    public void setTemp_v(int v){
        temp_v = v;
    }   //function to set the int temp_v variable

    public int get_price(){
        return price;
    }       //function to return the int price variable

    public void SetPrice(int pr){
        price = pr;
    }    //function to set the int price variable

    public int get_cf(){
        return cf;
    }              //function to return the int cf variable

    public void set_cf(int c){
        cf = c;
    }          //function to set the int cf variable

    @Override
    public float getTemp_fp() {
        return 0;
    }

    @Override
    public void setTemp_p(float p) {
    }

    @Override
    public float getTemp_fv() {
        return 0;
    }

    @Override
    public void setTemp_v(float v) {
    }

    @Override
    public float get_fprice() {
        return 0;
    }

    @Override
    public void SetPrice(float pr) {
    }

    @Override
    public float get_fcf() {
        return 0;
    }

    @Override
    public void set_cf(float c) {
    }
}
