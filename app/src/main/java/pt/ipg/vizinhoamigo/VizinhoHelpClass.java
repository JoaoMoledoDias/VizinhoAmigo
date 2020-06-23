package pt.ipg.vizinhoamigo;

public class VizinhoHelpClass {


    String nome, email, telemovel, morada;

    public VizinhoHelpClass(String nome, String email, String telemovel, String morada) {
        this.nome = nome;
        this.email = email;
        this.telemovel = telemovel;
        this.morada = morada;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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
