package beans;

import java.util.List;

public class SistemaDePlantio {
    // Atributos
    private int idSistemaDePlantio;
    private String nome;
    private String descricao;
    private Double area;
    private Regiao regiao;
    private Cliente cliente;
    private List<TecnicaPlantio> tecnicasPlantios;




    // Construtores
    public SistemaDePlantio(int idSistemaDePlantio, String nome, String descricao, Double area, Regiao regiao, Cliente cliente, List<TecnicaPlantio> tecnicasPlantios) {
        this.idSistemaDePlantio = idSistemaDePlantio;
        this.nome = nome;
        this.descricao = descricao;
        this.area = area;
        this.regiao = regiao;
        this.cliente = cliente;
        this.tecnicasPlantios = tecnicasPlantios;
    }
    public SistemaDePlantio(){}




    // Métodos
    // Adiciona um item a lista.
    public List<SistemaDePlantio> Adicionar(List<SistemaDePlantio> sistemasDePlantio, SistemaDePlantio sistemaDePlantio){
        sistemasDePlantio.add(sistemaDePlantio);
        return sistemasDePlantio;
    }
    // Método com sobrecarga - Remove um item específico da lista e o outro Remove todos os itens.
    public List<SistemaDePlantio> Remover(List<SistemaDePlantio> sistemasDePlantio, SistemaDePlantio sistemaDePlantio){
        sistemasDePlantio.remove(sistemaDePlantio);
        return sistemasDePlantio;
    }
    public List<SistemaDePlantio> Remover(List<SistemaDePlantio> sistemasDePlantio){
        sistemasDePlantio.clear();
        return sistemasDePlantio;
    }




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

    public Cliente getAgricultor() {
        return cliente;
    }

    public void setAgricultor(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<TecnicaPlantio> getTecnicasPlantios() {
        return tecnicasPlantios;
    }

    public void setTecnicasPlantios(List<TecnicaPlantio> tecnicasPlantios) {
        this.tecnicasPlantios = tecnicasPlantios;
    }
}
