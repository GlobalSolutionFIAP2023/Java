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




    // Métodos
    // Adiciona um item a uma lista.
    public List<Agricultor> Adicionar(List<Agricultor> agricultores, Agricultor agricultor){
        agricultores.add(agricultor);
        return agricultores;
    }
    // Método com sobrecarga - Remove um item específico da lista e o outro Remove todos os itens.
    public List<Agricultor> Remover(List<Agricultor> agricultores, Agricultor agricultor){
        agricultores.remove(agricultor);
        return agricultores;
    }
    public List<Agricultor> Remover(List<Agricultor> agricultores){
        agricultores.clear();
        return agricultores;
    }
    // Método com sobrescrita - Altera o nome do objeto.
    @Override
    public String AlterarNome(String nomeNovo){
        this.setNome(nomeNovo);
        String texto = "Nome alterado com sucesso, novo nome é: " + this.getNome();
        return texto;
    }




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