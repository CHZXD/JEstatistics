import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        String msg = "HELLO GARDEN";
        byte numFerramentas = 127;
        short agendamentosMes = 32767;
        int idAgendamento =2147483647;
        long dataAgendamento = System.currentTimeMillis();
        float precoServico = 99.90f;
        double areaJardim = 170.75;
        char tipoServico = 'P';
        boolean concluído = true;
        String cliente= "Caio";
        String servico = "Poda";
        JOptionPane.showMessageDialog(null "msg");
        JOptionPane.showMessageDialog(null, "número de ferramentos: " +numFerramentas);
        JOptionPane.showMessageDialog(null, "número de ferramentos: " +agendamentosMes);
        JOptionPane.showMessageDialog(null, "número de ferramentos: " +dataAgendamento);
        JOptionPane.showMessageDialog(null, "número de ferramentos: " +precoServico);
        JOptionPane.showMessageDialog(null, "número de ferramentos: " +precoServico);
        JOptionPane.showMessageDialog(null, "número de ferramentos: " +areaJardim);
        JOptionPane.showMessageDialog(null,"Tipo de serviço"+ (tipoServico== 'P'? "Poda" : "Corte de grama"));
        if (concluído) {
            JOptionPane.showMessageDialog(null, "Faz o Pix agora"+cliente+"você sabia que seu nome tem"+cliente.length()+"letras");
            
        } else {
            JOptionPane.showMessageDialog(null,  "Serviço em andamento aguarade please" );
            
        }
       
    
    }}