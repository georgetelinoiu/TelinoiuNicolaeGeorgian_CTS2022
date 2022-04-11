package main;

import clase.Autobuz;
import clase.AutobuzLinie;
import clase.FlyweightFactory;

public class Main {
    public static void main(String[] args) {
        Autobuz a1 = new Autobuz("Model1", 2020, 20);
        AutobuzLinie a2 = new Autobuz("Model2", 2019, 10);
        AutobuzLinie a3 = new Autobuz("Model3", 2022, 23);
        AutobuzLinie a4= new Autobuz("Model4", 2021, 40);

        FlyweightFactory factory = new FlyweightFactory();

        a1.descrie(factory.getLinie(168));
        a2.descrie(factory.getLinie(226));
        a3.descrie(factory.getLinie(168));
        a4.descrie(factory.getLinie(137));
    }
}
