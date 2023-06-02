package beans;

import java.util.List;

public class SistemaDePlantio {
    // Atributos
    private int idSistemaDePlantio;
    private String nome;
    private String descricao;
    private Double area;
    private Regiao regiao;
    private Agricultor agricultor;
    private List<TecnicaPlantio> tecnicasPlantios;




    // Construtores
    public SistemaDePlantio(int idSistemaDePlantio, String nome, String descricao, Double area, Regiao regiao, Agricultor agricultor, List<TecnicaPlantio> tecnicasPlantios) {
        this.idSistemaDePlantio = idSistemaDePlantio;
        this.nome = nome;
        this.descricao = descricao;
        this.area = area;
        this.regiao = regiao;
        this.agricultor = agricultor;
        this.tecnicasPlantios = tecnicasPlantios;
    }
    public SistemaDePlantio(){}




    // Métodos




    // GetterSetter
    public int getIdSistemaDePlantio() {
        return idSistemaDePlantio;
    }

    public void setIdSistemaDePlantio(int idSistemaDePlantio) {
        this.idSistemaDePlantio = idSistemaDePlantio;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getArea() {
        return area;
    }

    public void setArea(Double area) {
        this.area = area;
    }

    public Regiao getRegiao() {
        return regiao;
    }

    public void setRegiao(Regiao regiao) {
        this.regiao = regiao;
    }

    public Agricultor getAgricultor() {
        return agricultor;
    }

    public void setAgricultor(Agricultor agricultor) {
        this.agricultor = agricultor;
    }

    public List<TecnicaPlantio> getTecnicasPlantios() {
        return tecnicasPlantios;
    }

    public void setTecnicasPlantios(List<TecnicaPlantio> tecnicasPlantios) {
        this.tecnicasPlantios = tecnicasPlantios;
    }
}
