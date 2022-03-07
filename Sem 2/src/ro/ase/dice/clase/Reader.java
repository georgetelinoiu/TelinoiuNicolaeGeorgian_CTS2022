package ro.ase.dice.clase;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

public abstract class Reader {
    protected Scanner scanner;

    public Reader(String file) throws FileNotFoundException {
        scanner = new Scanner(new File((file)));
    }

    public abstract List<Aplicant> readAplicanti() throws FileNotFoundException;

    public void readAplicant(Scanner scanner, Aplicant aplicant) {
        aplicant.setNume(scanner.next());
        aplicant.setPrenume(scanner.next());
        aplicant.setVarsta(scanner.nextInt());
        aplicant.setPunctaj(scanner.nextInt());
        int nrProiecte = scanner.nextInt();
        String[] proiecte = new String[nrProiecte];
        for (int i = 0; i < nrProiecte; i++)
            proiecte[i] = scanner.next();
        aplicant.setNr_proiecte(nrProiecte,proiecte);
    }
}
