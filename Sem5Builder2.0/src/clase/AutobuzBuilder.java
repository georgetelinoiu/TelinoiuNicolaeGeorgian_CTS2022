package clase;

public class AutobuzBuilder implements Build{

    private String numeSofer;
    private String numarLinie;
    private Integer nrLinie;
    private Integer nrLocuri;
    private String nrInmatriculare;
    private Boolean deschideUsi;
    private Boolean oprireCapat;

    public AutobuzBuilder setNumeSofer(String numeSofer) {
        this.numeSofer = numeSofer;
        return this;
    }

    public AutobuzBuilder setNumarLinie(String numarLinie) {
        this.numarLinie = numarLinie;
        return this;
    }

    public AutobuzBuilder setNrLinie(Integer nrLinie) {
        this.nrLinie = nrLinie;
        return this;
    }

    public AutobuzBuilder setNrLocuri(Integer nrLocuri) {
        this.nrLocuri = nrLocuri;
        return this;
    }

    public AutobuzBuilder setNrInmatriculare(String nrInmatriculare) {
        this.nrInmatriculare = nrInmatriculare;
        return this;
    }

    public AutobuzBuilder setDeschideUsi(Boolean deschideUsi) {
        this.deschideUsi = deschideUsi;
        return this;
    }

    public AutobuzBuilder setOprireCapat(Boolean oprireCapat) {
        this.oprireCapat = oprireCapat;
        return this;
    }

    @Override
    public Autobuz build() {
        return new Autobuz(this.numeSofer,this.numarLinie,this.nrLinie,this.nrLocuri,this.nrInmatriculare,this.deschideUsi,this.oprireCapat);
    }
}
