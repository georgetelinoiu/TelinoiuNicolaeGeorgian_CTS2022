package ro.ase.dice.clase;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EleviReader extends Reader {
    public EleviReader(String file) throws FileNotFoundException {
        super(file);
    }

    @Override
    public List<Aplicant> readAplicanti() throws FileNotFoundException {
        super.scanner.useDelimiter(",");
        List<Aplicant> elevi = new ArrayList<Aplicant>();

        while (super.scanner.hasNext()) {
            Elev e = new Elev();
            readAplicant(super.scanner,e);
            e.setClasa(super.scanner.nextInt());
            e.setTutore(super.scanner.next());
            elevi.add(e);
        }
        super.scanner.close();
        return elevi;
    }
}
