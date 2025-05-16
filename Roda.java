public class Roda {

	private int id;
	private double diametro;
	private double raio;
	private String material;

	public Roda() {
		this.id = 0;
		this.diametro = 0.0;
		this.raio = 0.0;
		this.material = "";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getDiametro() {
		return diametro;
	}

	public void setDiametro(double diametro) {
		this.diametro = diametro;
	}

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}
}