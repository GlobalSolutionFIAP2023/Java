package beans;

import java.util.List;

public class TecnicaPlantio extends Tecnica {
    // Atributos
    private int idTecnicaPlantio;
    private Double quantAguaUsada;
    private String tempoColheita;
    private String epocaPlantio;
    private List<Solo> solosApropriados;
    private List<Adubo> adubos;
    private List<InseticidaNatural> inseticidasNaturais;
    private List<Fruta> frutas;




    // Construtores
    public TecnicaPlantio(int idTecnica, String nome, String descricao, String requisitos, List<String> materiaisNecessarios, int idTecnicaPlantio, Double quantAguaUsada, String tempoColheita, String epocaPlantio, List<Solo> solosApropriados, List<Adubo> adubos, List<InseticidaNatural> inseticidasNaturais, List<Fruta> frutas) {
        super(idTecnica, nome, descricao, requisitos, materiaisNecessarios);
        this.idTecnicaPlantio = idTecnicaPlantio;
        this.quantAguaUsada = quantAguaUsada;
        this.tempoColheita = tempoColheita;
        this.epocaPlantio = epocaPlantio;
        this.solosApropriados = solosApropriados;
        this.adubos = adubos;
        this.inseticidasNaturais = inseticidasNaturais;
        this.frutas = frutas;
    }
    public TecnicaPlantio(){}




    // Métodos
    // Adiciona um item a uma lista.
    public List<TecnicaPlantio> Adicionar (List<TecnicaPlantio> tecnicasPlantio, TecnicaPlantio tecnicaPlantio){
        tecnicasPlantio.add(tecnicaPlantio);
        return tecnicasPlantio;
    }
    // Método com sobrecarga - Um Remove um item especifico o outro remove todos os itens.
    public List<TecnicaPlantio> Remover (List<TecnicaPlantio> tecnicasPlantio, TecnicaPlantio tecnicaPlantio){
        tecnicasPlantio.remove(tecnicaPlantio);
        return tecnicasPlantio;
    }
    public List<TecnicaPlantio> Remover (List<TecnicaPlantio> tecnicasPlantio){
        tecnicasPlantio.clear();
        return tecnicasPlantio;
    }
    // Método com sobrescrita - Altera o nome do objeto.
    @Override
    public String AlterarNome(String nomeNovo){
        this.setNome(nomeNovo);
        String texto = "Nome alterado com sucesso, novo nome é: " + this.getNome();
        return texto;
    }




    // GetterSetter
    public int getIdTecnicaPlantio() {
        return idTecnicaPlantio;
    }

    public void setIdTecnicaPlantio(int idTecnicaPlantio) {
        this.idTecnicaPlantio = idTecnicaPlantio;
    }

    public Double getQuantAguaUsada() {
        return quantAguaUsada;
    }

    public void setQuantAguaUsada(Double quantAguaUsada) {
        this.quantAguaUsada = quantAguaUsada;
    }

    public String getTempoColheita() {
        return tempoColheita;
    }

    public void setTempoColheita(String tempoColheita) {
        this.tempoColheita = tempoColheita;
    }

    public String getEpocaPlantio() {
        return epocaPlantio;
    }

    public void setEpocaPlantio(String epocaPlantio) {
        this.epocaPlantio = epocaPlantio;
    }

    public List<Solo> getSolosApropriados() {
        return solosApropriados;
    }

    public void setSolosApropriados(List<Solo> solosApropriados) {
        this.solosApropriados = solosApropriados;
    }

    public List<Adubo> getAdubos() {
        return adubos;
    }

    public void setAdubos(List<Adubo> adubos) {
        this.adubos = adubos;
    }

    public List<InseticidaNatural> getInseticidasNaturais() {
        return inseticidasNaturais;
    }

    public void setInseticidasNaturais(List<InseticidaNatural> inseticidasNaturais) {
        this.inseticidasNaturais = inseticidasNaturais;
    }

    public List<Fruta> getFrutas() {
        return frutas;
    }

    public void setFrutas(List<Fruta> frutas) {
        this.frutas = frutas;
    }
}
