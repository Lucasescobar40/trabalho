package model;

public class Jogo {
    //Atributos
    private int cod;
    private String nome;
    private double valor;
    private String genero;
    private String imagem;
    private String console;

    public Jogo(int cod, String nome, double valor, String genero, String imagem, String console) {
        this.cod = cod;
        this.nome = nome;
        this.valor = valor;
        this.genero = genero;
        this.imagem = imagem;
        this.console = console;
    }

    public Jogo() {
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getImagem() {
        return imagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }

    public String getConsole() {
        return console;
    }

    public void setConsole(String console) {
        this.console = console;
    }
        
    
    
}
