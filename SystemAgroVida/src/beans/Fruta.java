package beans;

public class Fruta {
    // Atributos
    private int idFruta;
    private String nome;
    private String epocaDeColheita;
    private String tempoDeCrescimento;
    private String detalhesDoCultivo;




    // Construtor
    public Fruta(int idFruta, String nome, String epocaDeColheita, String tempoDeCrescimento, String detalhesDoCultivo) {
        this.idFruta = idFruta;
        this.nome = nome;
        this.epocaDeColheita = epocaDeColheita;
        this.tempoDeCrescimento = tempoDeCrescimento;
        this.detalhesDoCultivo = detalhesDoCultivo;
    }

    public Fruta(){}




    // GetterSetter
    public int getIdFruta() {
        return idFruta;
    }

    public void setIdFruta(int idFruta) {
        this.idFruta = idFruta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEpocaDeColheita() {
        return epocaDeColheita;
    }

    public void setEpocaDeColheita(String epocaDeColheita) {
        this.epocaDeColheita = epocaDeColheita;
    }

    public String getTempoDeCrescimento() {
        return tempoDeCrescimento;
    }

    public void setTempoDeCrescimento(String tempoDeCrescimento) {
        this.tempoDeCrescimento = tempoDeCrescimento;
    }

    public String getDetalhesDoCultivo() {
        return detalhesDoCultivo;
    }

    public void setDetalhesDoCultivo(String detalhesDoCultivo) {
        this.detalhesDoCultivo = detalhesDoCultivo;
    }
}
