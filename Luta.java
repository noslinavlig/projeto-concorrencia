public class Luta implements Runnable{
  
    private Guerreiro guerreiro1;
    private Guerreiro guerreiro2;
   
    public Luta(Guerreiro warrior1, Guerreiro warrior2){
       this.guerreiro1 = warrior1;
       this.guerreiro2 = warrior2;
    }
    
    public void run(){
        System.out.println("\nInicio:\n" + guerreiro1.getNome() + "\t\t" + guerreiro2.getNome() + "\nVida: " + guerreiro1.getVida() + "\tVida: " + guerreiro2.getVida() + "\n");
         
        do{
           guerreiro1.ataca(guerreiro2);
           guerreiro2.ataca(guerreiro1);
        }while(guerreiro1.isAlive() && guerreiro2.isAlive());
    }
   }
   