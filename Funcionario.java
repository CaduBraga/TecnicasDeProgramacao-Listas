public class Funcionario {
	
    String nome;
    double salario;
    String cargo;
    
	public Funcionario(String nome, double salario, String cargo){

        this.nome = nome;
        this.salario = salario;
        this.cargo = cargo;
	}
	
    public void visualizarFuncionario(){
    	
        System.out.println("Nome: " + nome);
        System.out.println("Salário: R$" + String.format("%.2f", salario));
      //Sei que ainda não aprendemos o String.format, mas descobri como usar e decidi implementá-lo no código
        System.out.println("Cargo: " + cargo);
    }
}