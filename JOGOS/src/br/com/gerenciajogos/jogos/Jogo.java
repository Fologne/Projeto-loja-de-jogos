package br.com.gerenciajogos.jogos;
import br.com.gerenciajogos.exceptions.PrecoInvalido;
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
    public void setPreco(double preco) throws PrecoInvalido{
        if(preco < 0){
            throw new PrecoInvalido("O preço não pode ser negativo!");
        }
        this.preco = preco;
    }
    //getters
    public String getTitulo(){return titulo;}
    public String getPlataforma(){return plataforma;}
    public double getPreco(){return preco;}
}
