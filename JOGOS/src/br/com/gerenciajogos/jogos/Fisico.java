package br.com.gerenciajogos.jogos;
import java.util.ArrayList;
public class Fisico extends Jogo{
    private double peso;
    private int estoque;
    //constructor
    public Fisico(){}
    public Fisico(String titulo, String plataforma, double preco, double peso, int estoque){
        super(titulo, plataforma, preco);
        this.peso = peso;
        this.estoque = estoque;
    }
    //setter
    public void setPeso(double peso){this.peso = peso;}
    public void setEstoque(int estoque){this.estoque = estoque;}
    //getter
    public double getPeso(){return peso;}
    public int getEstoque(){return estoque;}
    //metodo
    public static double calcularDesconto(ArrayList <Fisico> fisicos, int i){
        if(fisicos.get(i).getPeso()< 0.150){
            return fisicos.get(i).getPreco() * 0.1;
        }else{
            return fisicos.get(i).getPreco() * 0.05;
        }
    }
}
