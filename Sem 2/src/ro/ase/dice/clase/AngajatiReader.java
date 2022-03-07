package ro.ase.dice.clase;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AngajatiReader extends Reader{
    public AngajatiReader(String file) throws FileNotFoundException {
        super(file);
    }



    @Override
    public List<Aplicant> readAplicanti() throws FileNotFoundException {
        super.scanner.useDelimiter(",");
        List<Aplicant> angajati = new ArrayList<Aplicant>();

        while (super.scanner.hasNext()) {
            Angajat a = new Angajat();
            readAplicant(super.scanner,a);
            a.setSalariu(super.scanner.nextInt());
            a.setOcupatie(super.scanner.next());
            angajati.add(a);
        }
        super.scanner.close();
        return angajati;
    }
    }

