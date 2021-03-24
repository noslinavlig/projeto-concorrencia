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

    public boolean isAlive(){
        if(this.getVida() == 0)
        	return false;
        else
        	return true;
    }

	public boolean ataca(Guerreiro adversario){
		if (this.getAtaque() >= adversario.getVida()){
			System.out.println("ATAQUE!!!\n" + this.getNome() + " desfere um golpe de " + adversario.getVida() + " de dano em " + adversario.getNome());
			System.out.println(this.getNome() + " matou " + adversario.getNome() + "!");
			adversario.setVida(0);
			return true;
		} else 
			return false;
	}

}