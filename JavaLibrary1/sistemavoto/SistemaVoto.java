package sistemavoto;

import javax.swing.JOptionPane;

public class SistemaVoto {

    public static void main(String[] args) {
        int opc = 0;

        absVoto[] voto = new absVoto[2];
        metodo m = new metodo();

        for (int i = 0; i < voto.length; i++) {
            voto[i] = new absVoto();
        }
        while (opc != 9) {
            opc = Integer.parseInt(JOptionPane.showInputDialog("----------------------------------------------------------------\n"
                    + "|	SISTEMA DE VOTAÇÃO			|\n"
                    + "|      1 – Carregar Seção/Número Eleitor  	|\n"
                    + "|      2 – Classificar por Seção      		|\n"
                    + "|      3 – Gravar Registros                                	|\n"
                    + "|      4 – Mostrar Indicadores                                   |\n"
                    + "|      9 – Finalizar                                           	|\n"
                    + "----------------------------------------------------------------"));

            switch (opc) {
                case 1:
                    voto = m.registraVotos(voto);
                    break;

                case 2:
                    m.Classif(voto);
                    break;
                case 3:
                    m.Classif(voto);
                    break;
            };
        }
    }

}
