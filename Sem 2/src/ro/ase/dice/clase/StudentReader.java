package ro.ase.dice.clase;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentReader extends Reader {

    public StudentReader(String file) throws FileNotFoundException {
        super(file);
    }

    @Override
    public List<Aplicant> readAplicanti() throws FileNotFoundException {
        super.scanner.useDelimiter(",");
        List<Aplicant> studenti = new ArrayList<Aplicant>();

        while (super.scanner.hasNext()) {
            Student s = new Student();
            readAplicant(super.scanner,s);
            s.setFacultate(super.scanner.next());
            s.setAn_studii(super.scanner.nextInt());
            studenti.add(s);
        }
        super.scanner.close();
        return studenti;
    }
}
