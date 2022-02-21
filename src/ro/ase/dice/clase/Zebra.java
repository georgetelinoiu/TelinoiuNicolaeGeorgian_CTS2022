package ro.ase.dice.clase;

public class Zebra extends Animal{


    public Zebra(String nume) {
        super(nume);
    }

    @Override
    public void mananca(String mancare) {
        System.out.println(this.getNume() + " a fost hranit cu " + mancare);
    }
}
