public class Roda {
	
    int id;
    double diametro;
    double raio;
    String material;

    public Roda(int id, double diametro, String material){
    	
        this.id = id;
        this.diametro = diametro;
        this.raio = diametro / 2;
        this.material = material;
    }
    
    public void visualizarRoda() {
    	
        System.out.println("ID: " + id);
        System.out.println("Diâmetro: " + diametro + " cm");
        System.out.println("Raio: " + raio + " cm");
        System.out.println("Material: " + material);
    }
}