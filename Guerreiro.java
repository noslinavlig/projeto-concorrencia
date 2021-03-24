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

	public boolean ataca(Guerreiro adversario){
		if (this.getAtaque() >= adversario.getVida()){
			System.out.println("ATAQUE!!!\n" + this.getNome() + " desfere um golpe de " + adversario.getVida() + " de dano em " + adversario.getNome());
			System.out.println(this.getNome() + " matou " + adversario.getNome() + "!");
			adversario.setVida(0);
			return true;
		} else {
			adversario.setVida(adversario.getVida() - this.getAtaque());
			System.out.println("ATAQUE!!!\n" + this.getNome() + " desfere um golpe de " + this.getAtaque() + " de dano em " + adversario.getNome());
			System.out.println(this.getNome() + "\t\t" + adversario.getNome() + "\nVida: " + this.getVida() + "\tVida: " + adversario.getVida() + "\n");
			return false;
		}
	}
}