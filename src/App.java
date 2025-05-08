import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        //classe é um conjunto de objetos 
        //nosso objetivo nesse cóidigo é entender a difernça 
        //entre método com tipo void 
            Mamifero m1 = new Mamifero();
            Mamifero m2 = new Mamifero();
            Mamifero m3 = new Mamifero();
            m1.setNomeCientifico("Bos Taurus");
            JOptionPane.showMessageDialog(null, "Nome Científico:"+m1.getnomeCientifico());
            m2.setNomeCientifico("cangurus");
            JOptionPane.showMessageDialog(null, "Nome Científico:"+m2.getnomeCientifico());
            m3.setNomeCientifico("peixe boi");
            JOptionPane.showMessageDialog(null, "Nome Científico:"+m3.getnomeCientifico());

          
    }
    //Exercicios
/*
 * Considerando a utilização de métodos set e get
 * Considerando a aula de hoje
 * anatomia entre função e procedimento
 * set - void procedimento
 * get - String, int, boolean
 *
 * Desafio:
 * crie mais dois objetos
 * para armazenar e mostrar os dados do
 * canguru
 * peixe boi
 */


}
