package ro.emanuel.pojo;

public class MasinaDao {
   
	private int id;
	private String marca;
	private String model;
	private int anFabricatie;
	private int pret;
	
	public MasinaDao(int id, String marca, String model, int anFabricatie, int pret) {
		this.id = id;
		this.marca = marca;
		this.model = model;
		this.anFabricatie = anFabricatie;
		this.pret = pret;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getAnFabricatie() {
		return anFabricatie;
	}

	public void setAnFabricatie(int anFabricatie) {
		this.anFabricatie = anFabricatie;
	}

	public int getPret() {
		return pret;
	}

	public void setPret(int pret) {
		this.pret = pret;
	}
	 
	public String toString() {
		return "Masina [id=" + id + ", marca=" + marca + ", model=" + model + ", anFabricatie=" + anFabricatie
				+ ", pret=" + pret + "]";
	}
	
}

