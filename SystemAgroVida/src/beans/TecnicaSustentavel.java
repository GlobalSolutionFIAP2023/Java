package beans;

import java.util.List;

public class TecnicaSustentavel extends Tecnica {
    // Atributos
    private int idTecnicaSustentavel;
    private List<String> componentes;
    private String periodo;




    // Construtores
    public TecnicaSustentavel(int idTecnica, String nome, String descricao, String requisitos, List<String> materiaisNecessarios, int idTecnicaSustentavel, List<String> componentes, String periodo) {
        super(idTecnica, nome, descricao, requisitos, materiaisNecessarios);
        this.idTecnicaSustentavel = idTecnicaSustentavel;
        this.componentes = componentes;
        this.periodo = periodo;
    }
    public TecnicaSustentavel(){}




    // Métodos
    // Aiciona um item a uma lista.
    public List<TecnicaSustentavel> Adicionar (List<TecnicaSustentavel> tecnicasSustentaveis, TecnicaSustentavel tecnicaSustentavel){
        tecnicasSustentaveis.add(tecnicaSustentavel);
        return tecnicasSustentaveis;
    }
    // Método com sobrecarga - Um Remove um item especifico o outro remove todos os itens.
    public List<TecnicaSustentavel> Remover (List<TecnicaSustentavel> tecnicasSustentaveis, TecnicaSustentavel tecnicaSustentavel){
        tecnicasSustentaveis.remove(tecnicaSustentavel);
        return tecnicasSustentaveis;
    }
    public List<TecnicaSustentavel> Remover (List<TecnicaSustentavel> tecnicasSustentaveis){
        tecnicasSustentaveis.clear();
        return tecnicasSustentaveis;
    }
    // Método com sobrescrista - Altera o nome do objeto.
    @Override
    public String AlterarNome(String nomeNovo){
        this.setNome(nomeNovo);
        String texto = "Nome alterado com sucesso, novo nome é: " + this.getNome();
        return texto;
    }




    // GetterSetter
    public int getIdTecnicaSustentavel() {
        return idTecnicaSustentavel;
    }

    public void setIdTecnicaSustentavel(int idTecnicaSustentavel) {
        this.idTecnicaSustentavel = idTecnicaSustentavel;
    }

    public List<String> getComponentes() {
        return componentes;
    }

    public void setComponentes(List<String> componentes) {
        this.componentes = componentes;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }
}
