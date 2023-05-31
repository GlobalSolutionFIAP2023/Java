package beans;

import java.util.List;

public abstract class Usuario {
    // Atributos
    private String nome;
    private String sobreNome;
    private int idade;
    private String genero;
    private String login;
    private String senha;
    private List<Telefone> telefones;
    private Endereco endereco;




    // Construtores
    public Usuario(String nome, String sobreNome, int idade, String genero, String login, String senha, List<Telefone> telefones, Endereco endereco) {
        this.nome = nome;
        this.sobreNome = sobreNome;
        this.idade = idade;
        this.genero = genero;
        this.login = login;
        this.senha = senha;
        this.telefones = telefones;
        this.endereco = endereco;
    }

    public Usuario(){}




    // GetterSetter
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobreNome() {
        return sobreNome;
    }

    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public List<Telefone> getTelefones() {
        return telefones;
    }

    public void setTelefones(List<Telefone> telefones) {
        this.telefones = telefones;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
