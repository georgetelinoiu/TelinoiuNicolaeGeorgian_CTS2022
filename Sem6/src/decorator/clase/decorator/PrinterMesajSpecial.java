package decorator.clase.decorator;

import decorator.PrinterBilet;

public class PrinterMesajSpecial extends Decorator{
    public PrinterMesajSpecial(PrinterBilet printerBilet) {
        super(printerBilet);
    }

    @Override
    public void afiseazaBilet() {

    }

    @Override
    public void afiseazaVerso() {

    }
}
