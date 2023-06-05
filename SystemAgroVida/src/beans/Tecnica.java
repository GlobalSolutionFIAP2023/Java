package beans;

import java.util.List;

public abstract class Tecnica {
    // Atributos
    private int idTecnica;
    private String nome;
    private String descricao;
    private String requisitos;
    private List<String> materiaisNecessarios;




    // Construtores
    public Tecnica(int idTecnica, String nome, String descricao, String requisitos, List<String> materiaisNecessarios) {
        this.idTecnica = idTecnica;
        this.nome = nome;
        this.descricao = descricao;
        this.requisitos = requisitos;
        this.materiaisNecessarios = materiaisNecessarios;
    }
    public Tecnica(int idTecnica, String nome){
        this.idTecnica = idTecnica;
        this.nome = nome;
    }
    public Tecnica(){}




    // Métodos
    // Altera o nome do objeto.
    public abstract String AlterarNome(String nomeNovo);




    // GetterSetter
    public int getIdTecnica() {
        return idTecnica;
    }

    public void setIdTecnica(int idTecnica) {
        this.idTecnica = idTecnica;
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

    public String getRequisitos() {
        return requisitos;
    }

    public void setRequisitos(String requisitos) {
        this.requisitos = requisitos;
    }

    public List<String> getMateriaisNecessarios() {
        return materiaisNecessarios;
    }

    public void setMateriaisNecessarios(List<String> materiaisNecessarios) {
        this.materiaisNecessarios = materiaisNecessarios;
    }
}
