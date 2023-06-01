package beans;

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
