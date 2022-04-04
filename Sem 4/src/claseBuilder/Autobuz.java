package claseBuilder;

public class Autobuz {
    private String numeSofer;
    private String numarInmatriculare;
    private String numarLinie;
    private Boolean openDoors;
    private Boolean oprireCapatLinie;
    private String textulDeRulat;
    private int numarLocuri;

     Autobuz() {
        this.numeSofer = "Doru";
        this.numarInmatriculare = "b12345";
        this.numarLinie = "54";
        this.openDoors = true;
        this.oprireCapatLinie = true;
        this.textulDeRulat = "textul derulat";
        this.numarLocuri = 20;
    }

     void setNumeSofer(String numeSofer) {
        this.numeSofer = numeSofer;
    }

     void setNumarInmatriculare(String numarInmatriculare) {
        this.numarInmatriculare = numarInmatriculare;
    }

     void setNumarLinie(String numarLinie) {
        this.numarLinie = numarLinie;
    }

     void setOpenDoors(Boolean openDoors) {
        this.openDoors = openDoors;
    }

     void setOprireCapatLinie(Boolean oprireCapatLinie) {
        this.oprireCapatLinie = oprireCapatLinie;
    }

     void setTextulDeRulat(String textulDeRulat) {
        this.textulDeRulat = textulDeRulat;
    }

     void setNumarLocuri(int numarLocuri) {
        this.numarLocuri = numarLocuri;
    }

    @Override
    public String toString() {
        return "Autobuz{" +
                "numeSofer='" + numeSofer + '\'' +
                ", numarInmatriculare='" + numarInmatriculare + '\'' +
                ", numarLinie='" + numarLinie + '\'' +
                ", openDoors=" + openDoors +
                ", oprireCapatLinie=" + oprireCapatLinie +
                ", textulDeRulat='" + textulDeRulat + '\'' +
                ", numarLocuri=" + numarLocuri +
                '}';
    }
}
