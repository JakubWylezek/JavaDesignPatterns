package pl.wylezek.creational.factory;

public class GamesFactory {

    public static Games getGame(String type, String title, double price) {
        if(type.equals("action"))
            return new ActionGame(title, price);
        else if (type.equals("strategy"))
            return new StrategyGame(title, price);
        return null;
    }
}
