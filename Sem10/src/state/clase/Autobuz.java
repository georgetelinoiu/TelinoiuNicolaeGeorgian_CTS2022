package state.clase;

public class Autobuz {
    private Stare stare;
    private int nrAutobuz;

    public Autobuz(int nrAutobuz) {
        this.stare = new StareLaCapatDeLinie();
        this.nrAutobuz = nrAutobuz;
    }

    public Stare getStare() {
        return stare;
    }

    public void setStare(Stare stare) {
        this.stare = stare;
    }

    public int getNrAutobuz() {
        return nrAutobuz;
    }

    public void setNrAutobuz(int nrAutobuz) {
        this.nrAutobuz = nrAutobuz;
    }

    public void pleacaInCursa(){
        StareInCursa s= new StareInCursa();
        s.doAction(this);
    }

    public void intraInService(){
        StareInService s= new StareInService();
        s.doAction(this);
    }

    public void ieseDinService(){
        StareLaCapatDeLinie s= new StareLaCapatDeLinie();
        s.doAction(this);
    }

    public void ajungeLaCapatDeLinie(){
        ieseDinService();
    }
}
