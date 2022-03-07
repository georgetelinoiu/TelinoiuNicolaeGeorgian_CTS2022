package ro.ase.dice.main;

import ro.ase.dice.Elefant;
import ro.ase.dice.IngrijitorZOO;
import ro.ase.dice.ZOO;
import ro.ase.dice.Zebra;

public class Main {
    public static void main(String[] args) {

        IngrijitorZOO ingrijitorZOO = new IngrijitorZOO("Marius");
        Zebra z1 = new Zebra("Elena");
        Zebra z2 = new Zebra("Alexandru");

        Elefant e1 = new Elefant("Mihai");
        Elefant e2 = new Elefant("George");



        ZOO zoo = new ZOO("ZOO Municipal", ingrijitorZOO);
        zoo.adaugaAnimal(z1);
        zoo.adaugaAnimal(z2);
        zoo.adaugaAnimal(e1);
        zoo.adaugaAnimal(e2);
        zoo.hranesteAnimale("Fan");
    }
}
