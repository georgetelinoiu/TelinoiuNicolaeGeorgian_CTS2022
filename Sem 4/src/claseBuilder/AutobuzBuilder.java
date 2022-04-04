package claseBuilder;

public class AutobuzBuilder implements Builder {
    private Autobuz autobuz;

    public AutobuzBuilder() {
        autobuz = new Autobuz();
    }

    @Override
    public Autobuz build() {
        return autobuz;
    }

    public AutobuzBuilder setNumeSofer(String numeSofer) {
        autobuz.setNumeSofer(numeSofer);
        return this;
    }

    public AutobuzBuilder setNumarInmatriculare(String numarInmatriculare) {
        autobuz.setNumarInmatriculare(numarInmatriculare);
        return this;
    }

    public AutobuzBuilder setNumarLinie(String numarLinie) {
        autobuz.setNumarLinie(numarLinie);
        return this;
    }

    public AutobuzBuilder setOpenDoors(Boolean openDoors) {
        autobuz.setOpenDoors(openDoors);
        return this;
    }

    public AutobuzBuilder setOprireCapatLinie(Boolean oprireCapatLinie) {
        autobuz.setOprireCapatLinie(oprireCapatLinie);
        return this;
    }

    public AutobuzBuilder setTextulDeRulat(String textulDeRulat) {
        autobuz.setTextulDeRulat(textulDeRulat);
        return this;
    }

    public AutobuzBuilder setNumarLocuri(int numarLocuri) {
        autobuz.setNumarLocuri(numarLocuri);
        return this;
    }
}
