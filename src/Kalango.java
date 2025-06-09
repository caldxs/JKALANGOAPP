public class Kalango extends Personagem {

    @Override
    public void mover() {
        System.out.println("Terrestre com velocidade");
    }
    @Override
    public int dormir(){
        return +10;
    }

    @Override
    public void fazerSom(){
        System.out.println("zzzzzz");
    }

}
