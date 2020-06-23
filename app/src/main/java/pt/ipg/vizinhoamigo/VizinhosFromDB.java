package pt.ipg.vizinhoamigo;

public class VizinhosFromDB {

    public String nomevizinho;

    public VizinhosFromDB(){}

    public VizinhosFromDB(String nome){
        this.nomevizinho = nome;
    }

    public String getNomevizinho() {
        return nomevizinho;
    }

    public void setNomevizinho(String nomevizinho) {
        this.nomevizinho = nomevizinho;
    }
}
