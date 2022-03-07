package ro.ase.dice;

import java.util.ArrayList;
import java.util.List;

public class ZOO {
    private String nume;
    private IngrijitorZOO ingrijitorZOO;
    private List<Animal> animals;

    public ZOO(String nume, IngrijitorZOO ingrijitorZOO) {
        this.nume = nume;
        this.ingrijitorZOO = ingrijitorZOO;
        this.animals = new ArrayList<Animal>();
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public IngrijitorZOO getIngrijitorZOO() {
        return ingrijitorZOO;
    }

    public void setIngrijitorZOO(IngrijitorZOO ingrijitorZOO) {
        this.ingrijitorZOO = ingrijitorZOO;
    }

    public List<Animal> getAnimals() {
        return animals;
    }

    public void setAnimals(List<Animal> animals) {
        this.animals = animals;
    }

    public void adaugaAnimal(Animal animal){
        this.animals.add(animal);
    }

    public void hranesteAnimale(String mancare){
        for(var a : this.animals) {
            ingrijitorZOO.hranesteAnimal(a,mancare);
        }
    }

}
