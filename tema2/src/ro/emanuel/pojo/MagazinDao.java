package ro.emanuel.pojo;

public class MagazinDao {
	
	private int id;
	private String nume;
	private String adresa;
	private int nrAngajati;

	public MagazinDao(int id, String nume, String adresa, int nrAngajati) {
		this.id = id;
		this.nume = nume;
		this.adresa = adresa;
		this.nrAngajati = nrAngajati;
	}

	public int getId() {
		return id;
	}

	public String getNume() {
		return nume;
	}

	public String getAdresa() {
		return adresa;
	}

	public int getNrAngajati() {
		return nrAngajati;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public void setAdresa(String adresa) {
		this.adresa = adresa;
	}

	public void setNrAngajati(int nrAngajati) {
		this.nrAngajati = nrAngajati;
	}
	
	public String toString() {
		return "Magazin [id=" + id + ", nume=" + nume + ", adresa=" + adresa + ", nrAngajati=" + nrAngajati + "]";
	}

}
