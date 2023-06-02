package beans;

public class EstacaoAno {
    // Atributos
    private int idEstacaoAno;
    private String nome;
    private Double temperaturaMedia;
    private Double precipitacaoMedia;
    private Double umidadeMedia;
    private Double incidenciaSolarMedia;




    // Construtores
    public EstacaoAno(int idEstacaoAno, String nome, Double temperaturaMedia, Double precipitacaoMedia, Double umidadeMedia, Double incidenciaSolarMedia) {
        this.idEstacaoAno = idEstacaoAno;
        this.nome = nome;
        this.temperaturaMedia = temperaturaMedia;
        this.precipitacaoMedia = precipitacaoMedia;
        this.umidadeMedia = umidadeMedia;
        this.incidenciaSolarMedia = incidenciaSolarMedia;
    }
    public EstacaoAno(){}




    // GetterSetter
    public int getIdEstacaoAno() {
        return idEstacaoAno;
    }

    public void setIdEstacaoAno(int idEstacaoAno) {
        this.idEstacaoAno = idEstacaoAno;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getTemperaturaMedia() {
        return temperaturaMedia;
    }

    public void setTemperaturaMedia(Double temperaturaMedia) {
        this.temperaturaMedia = temperaturaMedia;
    }

    public Double getPrecipitacaoMedia() {
        return precipitacaoMedia;
    }

    public void setPrecipitacaoMedia(Double precipitacaoMedia) {
        this.precipitacaoMedia = precipitacaoMedia;
    }

    public Double getUmidadeMedia() {
        return umidadeMedia;
    }

    public void setUmidadeMedia(Double umidadeMedia) {
        this.umidadeMedia = umidadeMedia;
    }

    public Double getIncidenciaSolarMedia() {
        return incidenciaSolarMedia;
    }

    public void setIncidenciaSolarMedia(Double incidenciaSolarMedia) {
        this.incidenciaSolarMedia = incidenciaSolarMedia;
    }
}
