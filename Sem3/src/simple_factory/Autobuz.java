package simple_factory;

public class Autobuz extends MijlocTransport{

	public Autobuz(String nrInmatriculare) {
		super(nrInmatriculare);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Autobuz [getNrInmatriculare()=" + getNrInmatriculare() + ", toString()=" + super.toString()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}

	
}
