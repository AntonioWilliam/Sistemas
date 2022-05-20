package sistemavoto;

import java.util.Random;
import javax.swing.JOptionPane;

public class metodo {

    public absVoto[] registraVotos(absVoto[] voto) {
        Random gerador = new Random();
        int i;
        for ( i = 0; i < voto.length; i++) {
            voto[i].numSeçao=gerador.nextInt(11);       
            voto[i].numCand=gerador.nextInt(301);       
             JOptionPane.showMessageDialog(null,"Numero da seção: " + voto[i].numSeçao+ " = "+"Candidato: " + voto[i].numCand ); 
    } 
    return voto ;
    }
    public void Classif ()
}