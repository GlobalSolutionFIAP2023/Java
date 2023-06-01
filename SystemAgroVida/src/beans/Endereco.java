package beans;

public class Endereco {
    // Atributos
    private int idEndereco;
    private String cep;
    private int numero;
    private String complemento;
    private Cidade cidade;




    // Construtores
    public Endereco(int idEndereco, String cep, int numero, String complemento, Cidade cidade) {
        this.idEndereco = idEndereco;
        this.cep = cep;
        this.numero = numero;
        this.complemento = complemento;
        this.cidade = cidade;
    }

    public Endereco(){}




    // GetterSetter
    public int getIdEndereco() {
        return idEndereco;
    }

    public void setIdEndereco(int idEndereco) {
        this.idEndereco = idEndereco;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }
}
