package beans;

import java.util.Date;
import java.util.List;

public class SistemaDePlantio {
    // Atributos
    private int idSistemaDePlantio;
    private String nome;
    private String descricao;
    private Double area;
    private Regiao regiao;
    private Agricultor agricultor;
    private List<TecnicaPlantio> tecnicasPlantios;
}
