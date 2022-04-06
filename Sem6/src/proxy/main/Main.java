package proxy.main;

import proxy.clase.Autobuz;
import proxy.clase.AutobuzDeNoapte;
import proxy.clase.MijlocTransport;

public class Main {

    public static void main(String[] args) {
        Autobuz a = new Autobuz(5,434);
        a.opresteInStatie();

        a.setNrCalatori(0);
        a.opresteInStatie();

        AutobuzDeNoapte an = new AutobuzDeNoapte(a);
        an.opresteInStatie();
        an.setNrCalatori(10);
        an.opresteInStatie();
    }

}
