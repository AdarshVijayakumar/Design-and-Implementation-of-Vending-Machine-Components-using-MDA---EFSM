package AbstractFactory;

import DataStore.*;
import OutputProcessor.StrategyPattern.*;
                                                                        //Implementing Abstract Factory Pattern design
public class VM2_Factory implements AbstractFactory{                    //This is concrete class for VM1 class required objects

    @Override
    public DataStore get_DataStore(){
        return new DS2();
    }               // returns DataStore object for VM2

    @Override
    public StorePrice get_StorePrice(){
        return new StorePrice2();
    }     // returns StorePrice object for VM2

    @Override
    public ZeroCF get_ZeroCF(){
        return new ZeroCF2();
    }                // returns ZeroCF object for VM2

    @Override
    public IncreaseCF get_IncreaseCF(){
        return new IncreaseCF2();
    }      // returns IncreaseCF object for VM2

    @Override
    public ReturnCoins get_ReturnCoins(){
        return new ReturnCoins2();
    }     // returns ReturnCoins object for VM2

    @Override
    public DisposeDrink get_DisposeDrink(){
        return new DisposeDrink2();
    }   // returns DisposeDrink object for VM2

    @Override
    public DisposeAdditive get_DisposeAdditive(){                         // returns DisposeAdditive object for VM2
        return new DisposeAdditive2();
    }


}
