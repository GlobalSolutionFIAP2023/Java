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
