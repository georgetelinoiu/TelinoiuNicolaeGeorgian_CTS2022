package state.main;

import state.clase.Autobuz;

public class Main {

    public static void main(String[] args) {
        Autobuz a = new Autobuz(20);
        a.ieseDinService();
        a.intraInService();
        a.ajungeLaCapatDeLinie();
        a.pleacaInCursa();
        a.intraInService();
        a.ieseDinService();
        a.ajungeLaCapatDeLinie();

    }

}
