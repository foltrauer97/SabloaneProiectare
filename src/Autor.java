
public class Autor {

	
	private String nume;
	
	Autor(String nume){
		this.nume=nume;
	}
	@Override
	public String toString() {
		return "Autor" +
				"nume= " + nume + '\'' + '}';
	}
}
