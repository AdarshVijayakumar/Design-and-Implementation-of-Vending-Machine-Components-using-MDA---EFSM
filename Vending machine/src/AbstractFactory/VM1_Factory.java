package AbstractFactory;

import DataStore.*;
import OutputProcessor.StrategyPattern.*;
                                                                        //Implementing Abstract Factory Pattern design
public class VM1_Factory implements AbstractFactory {                     //This is concrete class for VM1 class required objects

    @Override
    public DataStore get_DataStore(){
        return new DS1();
    }                // returns DataStore object for VM1

    @Override
    public StorePrice get_StorePrice(){
        return new StorePrice1();
    }     // returns StorePrice object for VM1

    @Override
    public ZeroCF get_ZeroCF(){
        return new ZeroCF1();
    }                 // returns ZeroCF object for VM1

    @Override
    public IncreaseCF get_IncreaseCF(){
        return new IncreaseCF1();
    }     // returns IncreaseCF object for VM1

    @Override
    public ReturnCoins get_ReturnCoins(){
        return new ReturnCoins1();
    }   // returns ReturnCoins object for VM1

    @Override
    public DisposeDrink get_DisposeDrink(){                                 // returns DisposeDrink object for VM1
        return new DisposeDrink1();
    }

    @Override
    public DisposeAdditive get_DisposeAdditive(){
        return new DisposeAdditive1();
    }                                                                   // returns DisposeAdditive object for VM1


}
