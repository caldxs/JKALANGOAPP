public abstract class Personagem {
    public abstract void mover();
    public abstract void fazerSom();
    public int dormir(){

        return energia + 10;

    }
    protected int energia;


}
