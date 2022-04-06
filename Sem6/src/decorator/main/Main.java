package decorator.main;

import decorator.PrinterBilet;
import decorator.PrinterBiletConcret;

public class Main {

    public static void main(String[] args) {
        PrinterBilet printerBilet = new PrinterBiletConcret("1/12/2022", 10);
        printerBilet.afiseazaBilet();
    }

}
