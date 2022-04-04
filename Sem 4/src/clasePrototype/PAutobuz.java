package clasePrototype;

public class PAutobuz implements MijlocDeTransport {
    private String numeSofer;

    public PAutobuz(String numeSofer) {
        this.numeSofer = numeSofer;
    }

    public void setNumeSofer(String numeSofer) {
        this.numeSofer = numeSofer;
    }

    @Override
    public String toString() {
        return "PAutobuz{" +
                "numeSofer='" + numeSofer + '\'' +
                '}';
    }

    @Override
    public MijlocDeTransport copiaza() throws CloneNotSupportedException {
        return (MijlocDeTransport)super.clone();
    }
}
