package DataStore;

public abstract class DataStore {                  //Abstract Data Store class for the concrete DS1 and DS2 classes

    public abstract int getTemp_p();              //Abstract function to return the int temp_p variable
    public abstract void setTemp_p(int p);        //Abstract function to set the int temp_p variable
    public abstract int getTemp_v();              //Abstract function to return the int temp_v variable
    public abstract void setTemp_v(int v);        //Abstract function to set the int temp_v variable
    public abstract int get_price();             //Abstract function to return the int price variable
    public abstract void SetPrice(int pr);       //Abstract function to set the int price variable
    public abstract int get_cf();                //Abstract function to return the int cf variable
    public abstract void set_cf(int c);          //Abstract function to set the int cf variable

    public abstract float getTemp_fp();           //Abstract function to return the float temp_p variable
    public abstract void setTemp_p(float p);      //Abstract function to set the float temp_p variable
    public abstract float getTemp_fv();           ///Abstract function to return the float temp_v variable
    public abstract void setTemp_v(float v);      //Abstract function to set the float temp_v variable
    public abstract float get_fprice();           //Abstract function to return the float price variable
    public abstract void SetPrice(float pr);       //Abstract function to set the float price variable
    public abstract float get_fcf();               //Abstract function to return the float cf variable
    public abstract void set_cf(float c);         //Abstract function to set the float cf variable

}
