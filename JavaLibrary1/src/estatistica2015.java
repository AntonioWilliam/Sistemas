
import javax.swing.JOptionPane;

public class estatistica2015 {

    public static void main(String[] args) {
        Transito[] t = new Transito[2];
        metodo m = new metodo();
        //Limpar os registros de cada vetor
        for (int i = 0; i < t.length; i++) {
            t[i] = new Transito();
        }
        int opc = 0;
        while (opc != 9) {
            opc = Integer.parseInt(JOptionPane.showInputDialog("----------------------------------------------------------------\n"
                    + "|	MENU ESTATÍSTICA			|\n"
                    + "| Estatísticas de acidentes em 2015		|\n"
                    + "| 1 - Cadastro Estatística			|\n"
                    + "| 2 - Consulta por tipo de veículo		|\n"
                    + "| 3 - Consulta por quantidade de acidentes	|\n"
                    + "| 4 - Consulta todos as cidades                  |\n"
                    + "| 5 - Consulta maior menor média de acidentes	|\n"
                    + "| 9 - Finaliza.					|\n"
                    + "----------------------------------------------------------------"));
            switch (opc) {
                case 1:
                    t = m.FCad(t);
                    break;
                case 2:
                    m.Ftipo(t);
                    break;
                case 3:
                    m.consAcid(t);
                    break;
                case 4: m.tipoAci(t);
                    break;
                case 5: m.media(t);
                    break;
                default:
                    break;

            }

        }
    }

}
