package beans;

import java.util.List;

public class Solo {
    // Atributos
    private int idSolo;
    private String nome;
    private String descricao;




    // Construtores
    public Solo(int idSolo, String nome, String descricao) {
        this.idSolo = idSolo;
        this.nome = nome;
        this.descricao = descricao;
    }
    public Solo(){}




    // Métodos
    // Adiciona um item a uma lista.
    public List<Solo> Adicionar(List<Solo> solos, Solo solo){
        solos.add(solo);
        return solos;
    }
    // Método com sobrecarga - Remove um item específico da lista e o outro Remove todos os itens.
    public List<Solo> Remover(List<Solo> solos, Solo solo){
        solos.remove(solo);
        return solos;
    }
    public List<Solo> Remover(List<Solo> solos){
        solos.clear();
        return solos;
    }




    // GetterSetter
    public int getIdSolo() {
        return idSolo;
    }

    public void setIdSolo(int idSolo) {
        this.idSolo = idSolo;
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
}
