import javax.swing.JOptionPane;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Aula3- Switch  e Loops");
        //O switch é uma estrutura de seleção múltipla
        //Um if mais organizado
        //Escolha 
        //Caso 
        //Para resolver listas ou constantes 
         //menu
          //opção 1 
          //opção 2
    /*int op = Integer.parseInt(JOptionPane.showInputDialog("Digite a opção: \n 1- Estatística \n 2- Probabilidade \n3-Modelos probabilísticos \n4- sair") );
    //!= diferente
    if (op!= 4) {switch (op) {
        case 1:JOptionPane.showMessageDialog(null, "\nDigite a opção: \n 1: Estatística \n2: Probabilidade \n3- Modelos probabilísticos \n4- sair ");
            
            break;
    
        case 2 :JOptionPane.showMessageDialog(null, "Probabilidade");

            break;

        case 3:JOptionPane.showMessageDialog(null, "Modelos probabilísticos");

        break;

        case 4:  JOptionPane.showMessageDialog(null, "Encerrando sistema ");

        break;
    }
        
    

    /*Como funciona os loops */
    //while 
    //for 
    //do while 
    /*
     * início=1
     * condição>=5
     * incremento/decremento i=i+1
     * esse é topp
     */
    /*int contador = 1;
    while (contador<=1) {
        JOptionPane.showMessageDialog(null,"Viva o senai");
        contador = contador+1;
        
    }
    
    }
}*/
     for(int cont=1;cont<=10;cont++){
        System.out.println(cont);
     }
        String sair;
        do{
              //System.out.println("sair:sim ou não");
               sair = JOptionPane.showInputDialog( "Digite s-sim e n-nao");
        
        }while(sair != "nao");
    
}
}

