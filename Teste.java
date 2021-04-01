import javax.swing.JOptionPane;

public class Teste {
	public static void main(String[] args){

	    String nome1 = JOptionPane.showInputDialog("Digite o nome do seu Guerreiro: ");
        String nome2 = JOptionPane.showInputDialog("Digite o nome do seu Guerreiro: ");
        String nome3 = JOptionPane.showInputDialog("Digite o nome do seu Guerreiro: ");
		String nome4 = JOptionPane.showInputDialog("Digite o nome do seu Guerreiro: ");

		Guerreiro warrior1 = new Guerreiro(nome1, 80, 25);
		Guerreiro warrior2 = new Guerreiro(nome2,100, 10);
		Guerreiro warrior3 = new Guerreiro(nome3, 90, 15);
		Guerreiro warrior4 = new Guerreiro(nome4,100, 22);

		Luta luta1 = new Luta(warrior1,warrior2);
		Luta luta2 = new Luta(warrior3,warrior4);
		
        Thread inicioLuta1 = new Thread(luta1);
		Thread inicioLuta2 = new Thread(luta2);
        
		inicioLuta1.start();
		inicioLuta2.start();
	}
}