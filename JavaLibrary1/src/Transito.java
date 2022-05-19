
class Transito {

    int codCidade;
    String nomeCidade;
    int QTDacidente;
    int tipoVeiculo;

    Transito() {
        this(0, "", 0, 0);
    }

    Transito(int codCid, String nomeCid, int QTDacid, int TVeic) {
        codCidade = codCid;
        nomeCidade = nomeCid;
        QTDacidente = QTDacid;
        tipoVeiculo = TVeic;
    }
}
