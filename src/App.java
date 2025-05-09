import javax.swing.JOptionPane;
import java.io.FileWriter;
import java.io.IOException;

public class App {
    public static void main(String[] args) throws Exception {
        JOptionPane.showMessageDialog(null, "Alô, jardim");

        String name = JOptionPane.showInputDialog("Digite seu nome!!!!");
        String endereco = JOptionPane.showInputDialog("Qual seu endereço camarada?");

        String larguraStr = JOptionPane.showInputDialog("Qual a largura do vosso jardim?");
        String comprimentoStr = JOptionPane.showInputDialog("Qual o comprimento do vosso jardim?");

        double largura = Double.parseDouble(larguraStr.replace(",", "."));
        double comprimento = Double.parseDouble(comprimentoStr.replace(",", "."));
        double area = largura * comprimento;

        String resultado = String.format("A área do jardim é %.2f metros quadrados.", area);
        JOptionPane.showMessageDialog(null, resultado);

        try (FileWriter escritor = new FileWriter("dados.txt", true)) {
            
            escritor.write(name + "," + endereco + "," + String.format("%.2f", area) + "\n");
            System.out.println("Dados gravados com sucesso.");
        } catch (IOException e) {
            System.out.println("Erro ao gravar dados: " + e.getMessage());
        }
    }
}
