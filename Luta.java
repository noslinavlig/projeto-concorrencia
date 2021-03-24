public class Luta {
  
    private Guerreiro w1;
    private Guerreiro w2;
   
    public Luta(Guerreiro warrior1, Guerreiro warrior2){
       this.w1 = warrior1;
       this.w2 = warrior2;
    }
    
    public void batalha(){
           System.out.println("\nInicio:\n" + w1.getNome() + "\t\t" + w2.getNome() + "\nVida: " + w1.getVida() + "\tVida: " + w2.getVida() + "\n");
         
          do{
           w1.ataca(w2);
           w2.ataca(w1);
          } while(w1.isAlive() && w2.isAlive());
    }
   }
   