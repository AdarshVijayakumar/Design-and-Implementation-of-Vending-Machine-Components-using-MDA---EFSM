package AbstractFactory;
                                                //Implementing Abstract Factory Pattern design
import DataStore.*;
import OutputProcessor.StrategyPattern.*;

public interface AbstractFactory {               //This is an abstract factory class for the concrete factory classes

    DataStore get_DataStore();                  // This class contains only the abstract functions

    StorePrice get_StorePrice();

    ZeroCF get_ZeroCF();

    IncreaseCF get_IncreaseCF();

    ReturnCoins get_ReturnCoins();

    DisposeDrink get_DisposeDrink();

    DisposeAdditive get_DisposeAdditive();

}
