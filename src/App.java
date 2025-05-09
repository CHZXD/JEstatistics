import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) {
        // Entrada de dados
        double largura = Double.parseDouble(JOptionPane.showInputDialog("Largura do vosso  jardim:").replace(",", "."));
        double comprimento = Double.parseDouble(JOptionPane.showInputDialog("Comprimento do vosso jardim meu senhor :").replace(",", "."));
        double area = largura * comprimento;
        String tamanho = (area > 100) ? "Grandão" : "Pequenininho";

        // Escolha do serviço
        int servico = Integer.parseInt(JOptionPane.showInputDialog(
            "Escolha o serviço:\n1 - Corte de Grama\n2 - Poda\n3 - Plantio\n4 - Corte e Poda\n5 - Quero Tudo"));
        
        String descricao;
        int qtdServicos;
        switch (servico) {
            case 1: descricao = "Plantio"; qtdServicos = 1; break;
            case 2: descricao = "Poda de Árvores e Arbustos"; qtdServicos = 2; break;
            case 3: descricao = "Plantio"; qtdServicos = 3; break;
            case 4: descricao = "Corte e Poda"; qtdServicos = 4; break;
            case 5: descricao = "Os três serviços"; qtdServicos = 6; break;
            default: descricao = "Serviço Inexistente"; qtdServicos = 0;
        }

        
        double desconto = (qtdServicos >= 6) ? 15 : (qtdServicos >= 3) ? 10 : 0;

       
        JOptionPane.showMessageDialog(null,
            "Área: " + area + " m²\nTamanho: " + tamanho +
            "\nServiço: " + descricao +
            "\nDesconto: " + desconto + "%"
        );
    }
}
