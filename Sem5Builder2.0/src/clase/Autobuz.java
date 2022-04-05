package clase;

public class Autobuz {
    private String numeSofer;
    private String numarLinie;
    private Integer nrLinie;
    private Integer nrLocuri;
    private String nrInmatriculare;
    private Boolean deschideUsi;
    private Boolean oprireCapat;

    public Autobuz(String numeSofer, String numarLinie, Integer nrLinie, Integer nrLocuri, String nrInmatriculare, Boolean deschideUsi, Boolean oprireCapat) {
        this.numeSofer = numeSofer;
        this.numarLinie = numarLinie;
        this.nrLinie = nrLinie;
        this.nrLocuri = nrLocuri;
        this.nrInmatriculare = nrInmatriculare;
        this.deschideUsi = deschideUsi;
        this.oprireCapat = oprireCapat;
    }

    public void setNumeSofer(String numeSofer) {
        this.numeSofer = numeSofer;
    }

    public void setNumarLinie(String numarLinie) {
        this.numarLinie = numarLinie;
    }

    public void setNrLinie(Integer nrLinie) {
        this.nrLinie = nrLinie;
    }

    public void setNrLocuri(Integer nrLocuri) {
        this.nrLocuri = nrLocuri;
    }

    public void setNrInmatriculare(String nrInmatriculare) {
        this.nrInmatriculare = nrInmatriculare;
    }

    public void setDeschideUsi(Boolean deschideUsi) {
        this.deschideUsi = deschideUsi;
    }

    public void setOprireCapat(Boolean oprireCapat) {
        this.oprireCapat = oprireCapat;
    }

    @Override
    public String toString() {
        return "Autobuz{" +
                "numeSofer='" + numeSofer + '\'' +
                ", numarLinie='" + numarLinie + '\'' +
                ", nrLinie=" + nrLinie +
                ", nrLocuri=" + nrLocuri +
                ", nrInmatriculare='" + nrInmatriculare + '\'' +
                ", deschideUsi=" + deschideUsi +
                ", oprireCapat=" + oprireCapat +
                '}';
    }
}
