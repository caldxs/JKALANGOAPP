public class Fomiga extends Personagem{

    @Override
    public void mover() {
     System.out.println("Anda só pra frente, se perder a rota Game Over");
    }

    @Override
    public int dormir(){
        return +10;
    }
     @Override
     public void fazerSom(){
        System.out.println("rsrsrsrsrs");
     }
       


}