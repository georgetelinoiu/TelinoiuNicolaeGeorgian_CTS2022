package main;

import claseBuilder.AutobuzBuilder;
import claseFactory.*;
import clasePrototype.PAutobuz;
import clasePrototype.PTramvai;

public class Main {

    public static void afisareMijlocTransport(Factory fact, String nrInmatriculare) {
        MijlocTransport mijlocTransport = fact.getMijlocTransport(nrInmatriculare);
        mijlocTransport.afiseazaDescriere();
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        //Factory
        afisareMijlocTransport(new AutobuzFactory(), "B-22-ABC");
        MijlocTransport troleibuz = new TroleibuzFactory().getMijlocTransport("AG-33-ROC");
        troleibuz.afiseazaDescriere();
        new TramvaiFactory().getMijlocTransport("AB-33").afiseazaDescriere();
        //Prototype
        PAutobuz a1 = new PAutobuz("Gigel");
        PAutobuz a2 = (PAutobuz) a1.copiaza();
        a2.setNumeSofer("Andrei");
        PTramvai t1 = new PTramvai("Ionell");

        System.out.println(a1.toString());
        System.out.println(a2.toString());
        //Builder
        AutobuzBuilder autobuzBuilder = new AutobuzBuilder();
        autobuzBuilder.setNumarInmatriculare("BOLT");
        autobuzBuilder.setOprireCapatLinie(false);
        autobuzBuilder.setNumarLocuri(80);
        claseBuilder.Autobuz autobuz = new AutobuzBuilder().build();
        claseBuilder.Autobuz autobuz2 = autobuzBuilder.build();
        System.out.println(autobuz);
        System.out.println(autobuz2);
    }
}
