package beans;

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
