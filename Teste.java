public class Teste {
	public static void main(String[] args){

		Guerreiro warrior1 = new Guerreiro("Perseu", 80, 25);
		Guerreiro warrior2 = new Guerreiro("Medusa", 100, 10);
		Luta luta = new Luta(warrior1,warrior2);
        
        luta.inicio();
	}
}