
import javax.swing.JOptionPane;

public class metodo {

    public Transito[] FCad(Transito[] transito) {
        for (int i = 0; i < transito.length; i++) {
            transito[i].codCidade = Integer.parseInt(JOptionPane.showInputDialog("Codigo da Cidade"));
            transito[i].nomeCidade = JOptionPane.showInputDialog("Bome da cidade");
            transito[i].QTDacidente = Integer.parseInt(JOptionPane.showInputDialog("Quantidade acidente"));
            transito[i].tipoVeiculo = Integer.parseInt(JOptionPane.showInputDialog("Tipo Veiculo"));
        }
        return transito;
    }

    public void Ftipo(Transito[] transito) {
        int opc = Integer.parseInt(JOptionPane.showInputDialog("Digite o número do veículo"));
        for (int i = 0; i < transito.length; i++) {
            if (transito[i].tipoVeiculo == opc) {
                JOptionPane.showMessageDialog(null, transito[i].codCidade + transito[i].nomeCidade + transito[i].QTDacidente + transito[i].tipoVeiculo);
            }
        }
    }

    public void consAcid(Transito[] x) {
        for (int i = 0; i < x.length; i++) {
            if (x[i].QTDacidente > 100 && x[i].QTDacidente < 500) {
                JOptionPane.showMessageDialog(null, x[i].codCidade + x[i].nomeCidade + x[i].QTDacidente + x[i].tipoVeiculo);
            }
        }
    }

    public void tipoAci(Transito[] y) {
        int opc = Integer.parseInt(JOptionPane.showInputDialog("Digite o tipo de acidente"));
        for (int i = 0; i < y.length; i++) {

            if (opc == y[i].QTDacidente) {
                JOptionPane.showMessageDialog(null, y[i].codCidade + y[i].nomeCidade + y[i].QTDacidente + y[i].tipoVeiculo);
            }
        }
    }

    public void media(Transito[] m) {
        int maior = m[0].QTDacidente, menor = m[0].QTDacidente, soma = 0;
        for (int i = 0; i < m.length; i++) {
            if (maior < m[i].QTDacidente) { maior = m[i].QTDacidente; }
            if (menor > m[i].QTDacidente) { menor = m[i].QTDacidente; }
            soma = soma + m[i].QTDacidente;                                                             
        }
       
        JOptionPane.showMessageDialog(null, "Maior: " + maior + "/ menor: " + menor);
       
    }

}
