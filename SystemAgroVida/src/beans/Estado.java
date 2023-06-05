package beans;

import java.util.List;

public class Estado {
    // Atributos
    private int idEstado;
    private String nome;
    private String sigla;




    // Construtores
    public Estado(int idEstado, String nome, String sigla) {
        this.idEstado = idEstado;
        this.nome = nome;
        this.sigla = sigla;
    }
    public Estado(){}




    // Métodos
    // Adiciona um item a uma lista.
    public List<Estado> Adicionar(List<Estado> estados, Estado estado){
        estados.add(estado);
        return estados;
    }
    // Método com sobrecarga - Remove um item específico da lista e o outro Remove todos os itens.
    public List<Estado> Remover(List<Estado> estados, Estado estado){
        estados.remove(estado);
        return estados;
    }
    public List<Estado> Remover(List<Estado> estados){
        estados.clear();
        return estados;
    }




    // GetterSetter
    public int getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(int idEstado) {
        this.idEstado = idEstado;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }
}
