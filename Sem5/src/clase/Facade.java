package clase;

public class Facade {
    private Autobuz auztobuz;

    public Facade() {
        this.auztobuz = new Autobuz();
    }

    public void deschideUsiAutobuz(){
        auztobuz.deschideUsaFata();
        auztobuz.deschideUsaMijloc();
        auztobuz.deschideUsaSpate();
    }

    public void liberUsiAutobuz(){
        auztobuz.liberUsaFata();
        auztobuz.liberUsaMijloc();
        auztobuz.liberUsaSpate();
    }
}
