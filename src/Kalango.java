import javax.swing.JOptionPane;

public class Kalango extends Personagem {

    @Override
    public void mover() {
        energia -=3;
        JOptionPane.showMessageDialog(null,"Terrestre com velocidade:" + energia);
    }
    @Override
    public void fazerSom(){
        JOptionPane.showMessageDialog(null,"Som Kalango:" + "\n" + "tstststs" + "\n");
    }
    public void mostrarEnergia(){
        JOptionPane.showMessageDialog(null,"Dormindo, Energia atual:"+energia);

    }
    @Override
    public void comer(){
        energia +=5;
        JOptionPane.showMessageDialog(null,"Comendo");
    }
}