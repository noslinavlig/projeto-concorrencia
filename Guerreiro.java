public class Guerreiro {

	public Guerreiro(String nome, double vida, int ataque){
		this.nome = nome;
		this.vida = vida;
		this.ataque = ataque;
	}

	private String nome;
	private double vida;
	private int ataque;
	
	public double getVida(){
		return this.vida;
	}
	private void setVida(double vida){
		this.vida = vida;
	}
	private int getAtaque(){
		return this.ataque;
	}

	public String getNome(){
		return this.nome;
	}

	private boolean isAlive(){	//Testa se o objeto que invocou está vivo
		if(this.getVida() > 0)
			return true;
		else 
			return false;
	}

	public boolean ataca(Guerreiro adversario){	//O objeto invoca esse método passando o objeto adversário como argumento
		if(this.isAlive()){	//Testa se o objeto que invocou um ataque está vivo
			if (this.getAtaque() >= adversario.getVida()){	//Testa se o ataque do objeto invocador do metodo é maior ou igual à quantidade de vida do adversário
				System.out.println("ATAQUE!!!\n" + this.getNome() + " desfere um golpe de " + adversario.getVida() + " de dano em " + adversario.getNome());
				System.out.println(this.getNome() + " matou " + adversario.getNome() + "!");
				adversario.setVida(0);
				return true;
			} else {
				adversario.setVida(adversario.getVida() - this.getAtaque());	//Se não for maior ou igual, subtrai da vida do adversário o dano do invocador
				System.out.println("ATAQUE!!!\n" + this.getNome() + " desfere um golpe de " + this.getAtaque() + " de dano em " + adversario.getNome());
				System.out.println(this.getNome() + "\t\t" + adversario.getNome() + "\nVida: " + this.getVida() + "\tVida: " + adversario.getVida() + "\n");
				return false;
			}
		}
		else{	//Se não estiver vivo, returna verdadeiro para o fim da luta
			return true;
		}
	}
}