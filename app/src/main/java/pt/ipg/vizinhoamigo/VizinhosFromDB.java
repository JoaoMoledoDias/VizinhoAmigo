package pt.ipg.vizinhoamigo;

public class VizinhosFromDB {

    String nome;
    String morada;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMorada() {
        return morada;
    }

    public void setMorada(String morada) {
        this.morada = morada;
    }

    public VizinhosFromDB() {
    }

    public VizinhosFromDB(String nome, String morada) {
        this.nome = nome;
        this.morada = morada;
    }
}
