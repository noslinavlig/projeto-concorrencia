public class Teste {
	public static void main(String[] args){
		Guerreiro warrior1 = new Guerreiro("Perseu", 70, 15);
		Guerreiro warrior2 = new Guerreiro("Medusa",100, 20);
		System.out.println("\nInicio:\n" + warrior1.getNome() + "\t\t" + warrior2.getNome() + "\nVida: " + warrior1.getVida() + "\tVida: " + warrior2.getVida() + "\n");
		boolean fimdaluta = warrior1.ataca(warrior2);;
		while(!fimdaluta){
			fimdaluta = warrior2.ataca(warrior1);
			fimdaluta = warrior1.ataca(warrior2);
		}
	}
}