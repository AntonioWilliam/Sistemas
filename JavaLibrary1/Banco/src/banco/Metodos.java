
package banco;

import javax.swing.JOptionPane;

class Metodos {
public abstrata[] Fcadastra(abstrata[] abs){
    int cod = 0;
    Ftipodeconta();
    for(int i = 0; i<5; i++){
        cod ++;
        abs[i].codConta = cod ;
        JOptionPane.showMessageDialog(null,"Código da Conta: " + cod);
        abs[i].nomeClientesC = JOptionPane.showInputDialog("Digite o nome do cliente: ");
        abs[i].saldoContaC = Double.parseDouble(JOptionPane.showInputDialog("Digite o Valor do Saldo: "));
        abs[i].limitecontaC = Double.parseDouble(JOptionPane.showInputDialog("Digite o limite: "));
        abs[i].tipoContaC = Ftipodeconta();
    }  
    return abs;}
public void Fconsulta(abstrata [] abs){
    for (int i = 0; i<3; i++){
        System.out.println("Código " + abs[i].codConta + "Nome " + abs[i].nomeClientesC + " " + abs[i].saldoContaC + " " + abs[i].limitecontaC + " " + abs[i].tipoContaC + " ");
    }
}
public int Ftipodeconta(){
    int opc=0;
            opc = Integer.parseInt(JOptionPane.showInputDialog(null," 1 ----------- física \n" +
"\n" +
"   2 ----------- conjunta \n" +
"\n" +
"   3 ----------- jurídica \n" +
"\n" +
"   4 ----------- especial "));
        switch(opc){
            case 1: opc = 1; 
            JOptionPane.showMessageDialog(null,"Conta Física");break;
            case 2: opc = 2;
            JOptionPane.showMessageDialog(null,"Conta consjunta");break;
            case 3: opc = 3;
            JOptionPane.showMessageDialog(null,"Conta Jurídica");break;
            case 4: opc = 4;
            JOptionPane.showMessageDialog(null,"Conta Especial");break;
            default: JOptionPane.showMessageDialog(null,"Opção Inválida");
        }
    return opc;
}
 
}