package sistemavot;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import javax.swing.JOptionPane;

public class metodo {

    public Votos[] registraVotos(Votos[] voto) {
        Random gerador = new Random();
        int i;
        for (i = 0; i < voto.length; i++) {
            voto[i].numSecao = gerador.nextInt(11);
            voto[i].numCand = gerador.nextInt(301);
            System.out.println("\n Numero da seção: " + voto[i].numSecao + " Candidato: " + voto[i].numCand);

        }
        return voto;
    
    

    

    public Votos[] secao(Votos[] Totoro) {
        Votos[] seinao = new Votos[1]; //bloquinho com os dados --- gera 1 construtor para usar como auxiliar para ajudar a organizar
        int i, j;
        //Bubble sort
        // o "i" recebe o valor do indice 0 e vai ate a penultimo indice do veto
        for (i = 0; i < Totoro.length - 1; i++) { //orgarnizando de acordo com a ordem das seções menor para maior
            for (j = (i + 1); j < (Totoro.length); j++) { //o "j" recebe o valor do indici 1 (i+1) e vai ate o ultimo inidice do vetor

                if (Totoro[i].numSecao > Totoro[j].numSecao) { //fazendo o bubble sort  comparando o "i" com o "j"
                    seinao[0] = Totoro[i];
                    Totoro[i] = Totoro[j];
                    Totoro[j] = seinao[0]; //trocando os valores dos indices deixando nas ordem certas
                }
            }
        }
        for (i = 0; i < Totoro.length; i++) { //aqui é para testes -- dados de forma organizado
            System.out.println((i + 1) + " Depois - Seção: " + Totoro[i].numSecao + " Candidato: " + Totoro[i].numCand);
        }
        JOptionPane.showMessageDialog(null, "Dados Classificados");
        return Totoro;
    }

    public Votos[] Grava(Votos[] grava) throws IOException {
        BufferedWriter io = new BufferedWriter(new FileWriter("votoBolsonaro.txt"));
        for (int i = 0; i < grava.length; i++) {
            io.write("Seção: " + Integer.toString(grava[i].numSecao) + "Candidato: " + Integer.toString(grava[i].numCand)); // <- concatenaçao / formataçao de como é pra estar escrito no txt
            io.newLine(); // <- pular linha no txt

        }
        JOptionPane.showMessageDialog(null, "Concluido");
        io.close();
        return grava;

    }

    public void subMenu(Votos[] Mododesenho) {
        int vSecao[] = new int[101];
        int opc = 0;
        Votos[] organizar = new Votos[1];

        while (opc != 9) {
            opc = Integer.parseInt(JOptionPane.showInputDialog("-----------------------------------------------------------------------\n"
                    + "|	    Mostrar Indicadores			           |\n"
                    + "|        Estatísticas de Votação em 2016		           |\n"
                    + "|  1 – Quantidade Eleitores por Seção	                         |\n"
                    + "|  2 –Seção com Maior e Menor número de Eleitores  |\n"
                    + "|  3 – Quantidade de votos por candidato                       |\n"
                    + "|  4 – 10 primeiros colocadas (nro  cand. e qtd votos )  |\n"
                    + "|  9 – Finaliza consulta	                		            |\n"
                    + "------------------------------------------------------------------------"));
            switch (opc) {
                case 1:

                    for (int i = 0; i < 100; i++) {
                        vSecao[Mododesenho[i].numSecao]++;
                    }
                    //mostra todas as seçoes
                    for (int j = 0; j < 11; j++) {
                        System.out.print("  \n seçao: " + j + " total de eleitores : " + vSecao[j]);
                    }
                    break;

                case 2:
                    int maior = Mododesenho[0].numSecao;
                    int menor = Mododesenho[0].numSecao;
                    for (int i = 0; i < Mododesenho.length; i++) {
                        if (maior < vSecao[i]) {
                            maior = Mododesenho[i].numSecao;
                        }
                        if (menor > vSecao[i]) {
                            menor = Mododesenho[i].numSecao;
                        }
                    }
                    JOptionPane.showMessageDialog(null, "Maior: " + maior + "/ menor: " + menor);
                    break;
                case 4:

                    for (int i = 0; i < (Mododesenho.length - 1); i++) { //orgarnizando de acordo com a ordem das seções menor para maior
                        for (int j = (i + 1); j < (Mododesenho.length); j++) { //o "j" recebe o valor do indici 1 (i+1) e vai ate o ultimo inidice do vetor

                            if (Mododesenho[i].numSecao > Mododesenho[j].numSecao) { //fazendo o bubble sort  comparando o "i" com o "j"
                                organizar[0] = Mododesenho[i];
                                Mododesenho[i] = Mododesenho[j];
                                Mododesenho[j] = organizar[0]; //trocando os valores dos indices deixando nas ordem certas
                            }
                        }
                    }
                    break;//para o loop de consulta
                default:
                    JOptionPane.showConfirmDialog(null, "ERROR!");
                    break;
            }
        }

    }
}
