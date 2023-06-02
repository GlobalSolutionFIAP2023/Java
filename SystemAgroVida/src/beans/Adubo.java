package beans;

import java.util.ArrayList;
import java.util.List;

public class Adubo {
    // Atributos
    private int idAdubo;
    private String nome;
    private String descricao;




    // Construtores
    public Adubo(int idAdubo, String nome, String descricao) {
        this.idAdubo = idAdubo;
        this.nome = nome;
        this.descricao = descricao;
    }
    public Adubo(){}




    // Métodos
    public List<Adubo> Adicionar(List<Adubo> adubos, Adubo adubo){
        adubos.add(adubo);
        return adubos;
    }
    public List<Adubo> Remover(List<Adubo> adubos, Adubo adubo){
        adubos.remove(adubo);
        return adubos;
    }




    // GetterSetter
    public int getIdAdubo() {
        return idAdubo;
    }

    public void setIdAdubo(int idAdubo) {
        this.idAdubo = idAdubo;
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
}
