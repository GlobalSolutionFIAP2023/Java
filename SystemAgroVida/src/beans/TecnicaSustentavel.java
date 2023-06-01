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
}
