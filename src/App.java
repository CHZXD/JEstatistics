import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) {
        int numJardins = Integer.parseInt(JOptionPane.showInputDialog("Quantos jardins você tem?"));
        double somaAreas = 0;

        for (int i = 1; i <= numJardins; i++) {
            
            double largura = Double.parseDouble(JOptionPane.showInputDialog("Largura do jardim " + i + ":").replace(",", "."));
            double comprimento = Double.parseDouble(JOptionPane.showInputDialog("Comprimento do jardim " + i + ":").replace(",", "."));
            double area = largura * comprimento;
            somaAreas += area;

            
            String tamanho = (area > 100) ? "Grandão" : "Pequenininho";
            JOptionPane.showMessageDialog(null, "Área do Jardim " + i + ": " + area + " m²\nTamanho: " + tamanho);

            
            String servicos = "";
            while (true) {
                String opcao = JOptionPane.showInputDialog(
                    "Escolha um serviço para o jardim " + i + ":\n" +
                    "1 - Corte de Grama\n" +
                    "2 - Poda\n" +
                    "3 - Plantio\n" +
                    "4 - Corte e Poda\n" +
                    "5 - Adubar\n" +
                    "0 - Finalizar"
                );

                if (opcao.equals("0")) {
                    break;
                }

                switch (opcao) {
                    case "1": servicos += "Corte de Grama\n"; break;
                    case "2": servicos += "Poda\n"; break;
                    case "3": servicos += "Plantio\n"; break;
                    case "4": servicos += "Corte e Poda\n"; break;
                    case "5": servicos += "Adubar\n"; break;
                    default: JOptionPane.showMessageDialog(null, "Serviço inválido.");
                }
            }

           
            if (!servicos.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Serviços para o jardim " + i + ":\n" + servicos);
            } else {
                JOptionPane.showMessageDialog(null, "Nenhum serviço escolhido para o jardim " + i + ".");
            }
        }

        
        double media = somaAreas / numJardins;
        JOptionPane.showMessageDialog(null, "Média da área dos jardins: " + media + " m²");
    }
}
