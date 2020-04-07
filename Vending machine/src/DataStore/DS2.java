package DataStore;

public class DS2 extends DataStore {

    private float temp_p;
    private float temp_v;
    private float price;
    private float cf;

    public float getTemp_fp(){
        return temp_p;
    }       //function to return the float temp_p variable

    public void setTemp_p(float p){
        temp_p = p;
    }     //function to set the float temp_p variable

    public float getTemp_fv(){
        return temp_v;
    }      //function to return the float temp_v variable

    public void setTemp_v(float v){
        temp_v = v;
    }    //function to set the float temp_v variable

    public float get_fprice(){
        return price;
    }       //function to return the float price variable

    public void SetPrice(float pr){
        price = pr;
    }    //function to set the float price variable

    public float get_fcf(){
        return cf;
    }             //function to return the float cf variable

    public void set_cf(float c){
        cf = c;
    }           //function to set the float cf variable

    @Override
    public void setTemp_p(int p) {
    }

    @Override
    public int getTemp_p() {
        return 0;
    }

    @Override
    public int getTemp_v() {
        return 0;
    }

    @Override
    public void setTemp_v(int v) {
    }

    @Override
    public int get_price() {
        return 0;
    }

    @Override
    public void SetPrice(int pr) {
    }

    @Override
    public int get_cf() {
        return 0;
    }

    @Override
    public void set_cf(int c) {
    }
}
