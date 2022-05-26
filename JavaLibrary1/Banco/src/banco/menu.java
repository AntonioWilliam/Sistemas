package banco;

import javax.swing.*;
class Menu {

    public static void main (String [] args) {

        abstrata [] abs =  new abstrata[5];
	
        Metodos m = new Metodos();
	
        for (int i=0; i<3;i++) {
		abs[i] = new abstrata();
	}
        int opc= 0 ;
        while(opc!=9){
            opc = Integer.parseInt(JOptionPane.showInputDialog(null,"...................................................... \n" +
"\n" +
".                MENU PRINCIPAL           . \n" +
"\n" +
"...................................................... \n" +
"\n" +
". 1 - Cadastra Contas Correntes    .  \n" +
"\n" +
". 2 - Cadastra movimento              . \n" +
"\n" +
". 3 - Gera Contas Atualizadas       . \n" +
"\n" +
". 4 - Consulta cadastros                . \n" +
"\n" +
". 9 - FIM                                           . \n" +
"\n" +
".................................................... "));
            switch(opc){
            case 1: abs = m.Fcadastra(abs); break;
            case 2:; m.Fconsulta(abs); break;
            case 3:; break;
            case 4:; break;
            default: JOptionPane.showMessageDialog(null,"Opção Inválida");
            }
        }
}
}//fim menu