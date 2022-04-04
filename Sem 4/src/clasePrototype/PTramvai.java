package clasePrototype;

public class PTramvai implements MijlocDeTransport {
    private String numeVatman;

    public PTramvai(String numeVatman) {
        this.numeVatman = numeVatman;
    }

    @Override
    public String toString() {
        return "Tramvai{" +
                "numeVatman='" + numeVatman + '\'' +
                '}';
    }

    @Override
    public MijlocDeTransport copiaza() throws CloneNotSupportedException {
        return (MijlocDeTransport)super.clone();
    }
}
