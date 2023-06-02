package beans;

import java.util.List;

public class Regiao {
    // Atributos
    private int idRegiao;
    private String descricao;
    private String clima;
    private List<String> vegetação;
    private List<Solo> solo;
    private EstacaoAno estacaoAno;




    // Construtores
    public Regiao(int idRegiao, String descricao, String clima, List<String> vegetação, List<Solo> solo, EstacaoAno estacaoAno) {
        this.idRegiao = idRegiao;
        this.descricao = descricao;
        this.clima = clima;
        this.vegetação = vegetação;
        this.solo = solo;
        this.estacaoAno = estacaoAno;
    }
    public Regiao(){}




    // GetterSetter
    public int getIdRegiao() {
        return idRegiao;
    }

    public void setIdRegiao(int idRegiao) {
        this.idRegiao = idRegiao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getClima() {
        return clima;
    }

    public void setClima(String clima) {
        this.clima = clima;
    }

    public List<String> getVegetação() {
        return vegetação;
    }

    public void setVegetação(List<String> vegetação) {
        this.vegetação = vegetação;
    }

    public List<Solo> getSolo() {
        return solo;
    }

    public void setSolo(List<Solo> solo) {
        this.solo = solo;
    }

    public EstacaoAno getEstacaoAno() {
        return estacaoAno;
    }

    public void setEstacaoAno(EstacaoAno estacaoAno) {
        this.estacaoAno = estacaoAno;
    }
}
