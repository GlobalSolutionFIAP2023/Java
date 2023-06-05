package beans;

import java.util.List;

public class Telefone {
    // Atributos
    private int idTelefone;
    private int numero;
    private int ddd;
    private int ddi;
    private String operadora;




    // Construtores
    public Telefone(int idTelefone, int numero, int ddd, int ddi, String operadora) {
        this.idTelefone = idTelefone;
        this.numero = numero;
        this.ddd = ddd;
        this.ddi = ddi;
        this.operadora = operadora;
    }
    public Telefone(){}




    // Métodos
    // Adiciona um item a uma lista.
    public List<Telefone> Adicionar(List<Telefone> telefones, Telefone telefone){
        telefones.add(telefone);
        return telefones;
    }
    // Método com sobrecarga - Remove um item específico da lista e o outro Remove todos os itens.
    public List<Telefone> Remover(List<Telefone> telefones, Telefone telefone){
        telefones.remove(telefone);
        return telefones;
    }
    public List<Telefone> Remover(List<Telefone> telefones){
        telefones.clear();
        return telefones;
    }




    // GetterSetter
    public int getIdTelefone() {
        return idTelefone;
    }

    public void setIdTelefone(int idTelefone) {
        this.idTelefone = idTelefone;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getDdd() {
        return ddd;
    }

    public void setDdd(int ddd) {
        this.ddd = ddd;
    }

    public int getDdi() {
        return ddi;
    }

    public void setDdi(int ddi) {
        this.ddi = ddi;
    }

    public String getOperadora() {
        return operadora;
    }

    public void setOperadora(String operadora) {
        this.operadora = operadora;
    }
}
