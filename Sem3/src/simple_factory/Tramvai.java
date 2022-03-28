package simple_factory;

public class Tramvai extends MijlocTransport {

	public Tramvai(String nrInmatriculare) {
		super(nrInmatriculare);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Tramvai [getNrInmatriculare()=" + getNrInmatriculare() + ", toString()=" + super.toString()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
	

}
