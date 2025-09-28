package br.com.gerenciajogos.jogos;
public abstract class Jogo{
    private String titulo;
    private String plataforma;
    private double preco;
    //constructor
    public Jogo(){}
    public Jogo(String titulo, String plataforma, double preco){
        this.titulo = titulo;
        this.plataforma = plataforma;
        this.preco = preco;
    }
    //setters
    public void setTitulo(String titulo){this.titulo = titulo;}
    public void setPlataforma(String plataforma){this.plataforma = plataforma;}
    public void setPreco(double preco){this.preco = preco;}
    //getters
    public String getTitulo(){return titulo;}
    public String getPlataforma(){return plataforma;}
    public double getPreco(){return preco;}
}
