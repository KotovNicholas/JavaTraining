package ua.designPattern.factoryMethod;

import java.util.Date;

public class FactoryMethodApp {
    public static void main(String[] args) {

        WatchMaker maker = getMakerbyName("Rome");

        Watch watch = maker.createWatch();
        watch.showTime();
    }

    public static WatchMaker getMakerbyName(String maker){
        if (maker.equals("Digital"))
            return new DigitelWatchMaker();
        else if (maker.equals("Rome"))
            return new RomeWatchMaker();

        throw  new RuntimeException("Не поддерживаемая производственная линия часов:"+maker);
    }
}

interface Watch {
    void showTime();
}

class DigitalWatch implements Watch{

    public void showTime() {
        System.out.println(new Date());
    }

}

class RomeWatch implements Watch{

    public void showTime() {
        System.out.println("VII-XX");
    }

}

interface WatchMaker{
    Watch createWatch();
}

class DigitelWatchMaker implements WatchMaker{

    public Watch createWatch() {
        return new DigitalWatch();
    }
}

class RomeWatchMaker implements WatchMaker{

    public Watch createWatch() {
        return new RomeWatch();
    }
}

