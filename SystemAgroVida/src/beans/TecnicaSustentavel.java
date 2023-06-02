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
