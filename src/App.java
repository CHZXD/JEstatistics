import java.util.Random;
import javax.swing.JOptionPane;

public class App {

    public static void main(String[] args) throws Exception {

        String[] espacoAmostral = {"1", "2", "3", "4", "5", "6"};
        Random random = new Random();

        int contnumero1 = 0;
        int contnumero2 = 0;
        int contnumero3 = 0;
        int contnumero4 = 0;
        int contnumero5 = 0;
        int contnumero6 = 0;

        String mensagem = "Espaço amostral: {1, 2, 3, 4, 5, 6}\n" +
                          "Probabilidade de cada número: 16,67%\n" +
                          "Deseja jogar o dado?";

        while (true) {
            int opcao = JOptionPane.showConfirmDialog(null, mensagem, "Jogando muito meu brother", JOptionPane.YES_NO_OPTION);

            if (opcao != JOptionPane.YES_OPTION) {
                // Mostra as estatísticas finais
                int total = contnumero1 + contnumero2 + contnumero3 + contnumero4 + contnumero5 + contnumero6;

                String estatisticas = "Jogo acabou,agora vamos ler a bíblia!\n" +
                    "Total de jogadas malucas: " + total + "\n" +
                    "Número 1: " + contnumero1 + "\n" +
                    "Número 2: " + contnumero2 + "\n" +
                    "Número 3: " + contnumero3 + "\n" +
                    "Número 4: " + contnumero4 + "\n" +
                    "Número 5: " + contnumero5 + "\n" +
                    "Número 6: " + contnumero6 + "\n";

                JOptionPane.showMessageDialog(null, estatisticas, "Estatísticas do vosso game meu Senhor ", JOptionPane.INFORMATION_MESSAGE);
                break;
            }

            // Gera número aleatório de 1 a 6
            int resultado = random.nextInt(6) + 1;

            // Atualiza contador e mostra resultado
            switch (resultado) {
                case 1: contnumero1++; break;
                case 2: contnumero2++; break;
                case 3: contnumero3++; break;
                case 4: contnumero4++; break;
                case 5: contnumero5++; break;
                case 6: contnumero6++; break;
            }

            JOptionPane.showMessageDialog(null, "Receba: " + resultado, "Resultado", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
