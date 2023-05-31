package beans;

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
