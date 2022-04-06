package decorator;

import decorator.PrinterBilet;

public class PrinterBiletConcret implements PrinterBilet {
    private String dataEliberarii;
    private int pret;

    public PrinterBiletConcret(String dataEliberarii, int pret) {
        this.dataEliberarii = dataEliberarii;
        this.pret = pret;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PrinterBiletConcret{");
        sb.append("dataEliberarii='").append(dataEliberarii).append('\'');
        sb.append(", pret=").append(pret);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void afiseazaBilet() {
        toString();
    }

    @Override
    public void afiseazaDescriere() {

    }
}
