package main;

import clase.Autobuz;
import clase.AutobuzBuilder;

public class Main {

    public static void main(String[] args) {
        AutobuzBuilder autobuzBuilder = new AutobuzBuilder();
        autobuzBuilder.setDeschideUsi(false);
        autobuzBuilder.setNrInmatriculare("AG22ABC");
        Autobuz a = autobuzBuilder.build();
        System.out.println(a);
    }
}
