package beans;

import java.util.List;

public class Agricultor extends Usuario {
    // Atributos
    private int idAgricultor;
    private String objetivo;
    private String experiencia;
    private List<TecnicaSustentavel> tecnicasSustentaveis;




    // Construtores

    public Agricultor(String nome, String sobreNome, int idade, String genero, List<Telefone> telefones, Endereco endereco, int idAgricultor, String objetivo, String experiencia, List<TecnicaSustentavel> tecnicasSustentaveis) {
        super(nome, sobreNome, idade, genero, telefones, endereco);
        this.idAgricultor = idAgricultor;
        this.objetivo = objetivo;
        this.experiencia = experiencia;
        this.tecnicasSustentaveis = tecnicasSustentaveis;
    }
    public Agricultor(){}




    // GetterSetter
    public int getIdAgricultor() {
        return idAgricultor;
    }

    public void setIdAgricultor(int idAgricultor) {
        this.idAgricultor = idAgricultor;
    }

    public String getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }

    public String getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(String experiencia) {
        this.experiencia = experiencia;
    }

    public List<TecnicaSustentavel> getTecnicasSustentaveis() {
        return tecnicasSustentaveis;
    }

    public void setTecnicasSustentaveis(List<TecnicaSustentavel> tecnicasSustentaveis) {
        this.tecnicasSustentaveis = tecnicasSustentaveis;
    }
}