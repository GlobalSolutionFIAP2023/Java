package beans;

import java.util.List;

public class InseticidaNatural {
    // Atributos
    private int idInseticidaNatural;
    private String nome;
    private String descricao;
    private List<String> componentes;
    private String modoPreparo;




    // Construtores
    public InseticidaNatural(int idInseticidaNatural, String nome, String descricao, List<String> componentes, String modoPreparo) {
        this.idInseticidaNatural = idInseticidaNatural;
        this.nome = nome;
        this.descricao = descricao;
        this.componentes = componentes;
        this.modoPreparo = modoPreparo;
    }
    public InseticidaNatural(){}




    // GetterSetter
    public int getIdInseticidaNatural() {
        return idInseticidaNatural;
    }

    public void setIdInseticidaNatural(int idInseticidaNatural) {
        this.idInseticidaNatural = idInseticidaNatural;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public List<String> getComponentes() {
        return componentes;
    }

    public void setComponentes(List<String> componentes) {
        this.componentes = componentes;
    }

    public String getModoPreparo() {
        return modoPreparo;
    }

    public void setModoPreparo(String modoPreparo) {
        this.modoPreparo = modoPreparo;
    }
}
