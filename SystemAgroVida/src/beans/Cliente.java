package beans;

import java.util.List;

public class Cliente extends Usuario {
    // Atributos
    private int idCliente;
    private String objetivo;
    private String experiencia;
    private List<TecnicaSustentavel> tecnicasSustentaveis;




    // Construtores
    public Cliente(String nome, String sobreNome, int idade, String genero, List<Telefone> telefones, Endereco endereco, int idCliente, String objetivo, String experiencia, List<TecnicaSustentavel> tecnicasSustentaveis) {
        super(nome, sobreNome, idade, genero, telefones, endereco);
        this.idCliente = idCliente;
        this.objetivo = objetivo;
        this.experiencia = experiencia;
        this.tecnicasSustentaveis = tecnicasSustentaveis;
    }
    public Cliente(){}




    // Métodos
    // Adiciona um item a uma lista.
    public List<Cliente> Adicionar(List<Cliente> clientes, Cliente cliente){
        clientes.add(cliente);
        return clientes;
    }
    // Método com sobrecarga - Remove um item específico da lista e o outro Remove todos os itens.
    public List<Cliente> Remover(List<Cliente> clientes, Cliente cliente){
        clientes.remove(cliente);
        return clientes;
    }
    public List<Cliente> Remover(List<Cliente> clientes){
        clientes.clear();
        return clientes;
    }
    // Método com sobrescrita - Altera o nome do objeto.
    @Override
    public String AlterarNome(String nomeNovo){
        this.setNome(nomeNovo);
        String texto = "Nome alterado com sucesso, novo nome é: " + this.getNome();
        return texto;
    }




    // GetterSetter
    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
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