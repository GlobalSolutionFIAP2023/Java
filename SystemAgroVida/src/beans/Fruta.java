package beans;

import java.util.List;

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




    // Métodos
    // Adiciona um item a uma lista.
    public List<Fruta> Adicionar(List<Fruta> frutas, Fruta fruta){
        frutas.add(fruta);
        return frutas;
    }
    // Método com sobrecarga - Remove um item específico da lista e o outro Remove todos os itens.
    public List<Fruta> Remover(List<Fruta> frutas, Fruta fruta){
        frutas.remove(fruta);
        return frutas;
    }
    public List<Fruta> Remover(List<Fruta> frutas){
        frutas.clear();
        return frutas;
    }




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
