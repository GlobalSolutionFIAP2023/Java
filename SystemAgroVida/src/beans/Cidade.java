package beans;

import java.util.List;

public class Cidade {
    // Atributos
    private int idCidade;
    private String nome;
    private Estado estado;




    // Construtores
    public Cidade(int idCidade, String nome, Estado estado) {
        this.idCidade = idCidade;
        this.nome = nome;
        this.estado = estado;
    }
    public Cidade(){}




    // Métodos
    // Adiciona um item a uma lista.
    public List<Cidade> Adicionar(List<Cidade> cidades, Cidade cidade){
        cidades.add(cidade);
        return cidades;
    }
    // Método com sobrecarga - Remove um item específico da lista e o outro Remove todos os itens.
    public List<Cidade> Remover(List<Cidade> cidades, Cidade cidade){
        cidades.remove(cidade);
        return cidades;
    }
    public List<Cidade> Remover(List<Cidade> cidades){
        cidades.clear();
        return cidades;
    }




    // GetterSetter
    public int getIdCidade() {
        return idCidade;
    }

    public void setIdCidade(int idCidade) {
        this.idCidade = idCidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }
}
