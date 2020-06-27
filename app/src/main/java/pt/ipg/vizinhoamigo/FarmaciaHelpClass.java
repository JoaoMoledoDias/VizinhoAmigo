package pt.ipg.vizinhoamigo;

public class FarmaciaHelpClass {

    String nome, telemovel, morada;

    public FarmaciaHelpClass(String nome, String telemovel, String morada) {
        this.nome = nome;
        this.telemovel = telemovel;
        this.morada = morada;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelemovel() {
        return telemovel;
    }

    public void setTelemovel(String telemovel) {
        this.telemovel = telemovel;
    }

    public String getMorada() {
        return morada;
    }

    public void setMorada(String morada) {
        this.morada = morada;
    }
}
