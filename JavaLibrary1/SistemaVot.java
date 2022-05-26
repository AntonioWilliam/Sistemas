package sistemavot;

import java.io.IOException;
import javax.swing.JOptionPane;

public class SistemaVot {

    public static void main(String[] args) throws IOException {
        Votos[] vot = new Votos[100];
        metodo m = new metodo();
        for (int i = 0; i < vot.length; i++) {
            vot[i] = new Votos();
        }
        int opc=0;
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
                    vot = m.registraVotos(vot);
                    break;

                case 2:
                    vot=m.secao(vot);
                    break;
                case 3:
                    vot=m.Grava(vot);
                    break;
                case 4:
                    m.subMenu(vot);
                    break;
                default:
                    JOptionPane.showConfirmDialog(null, "ERROR!");
                    break;
                    
            };
            
        }
    }
        
    }


