package br.com.gerenciajogos.jogos;
import br.com.gerenciajogos.utils.Vendavel;

import java.util.ArrayList;
public class Fisico extends Jogo implements Vendavel{
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
    @Override
    public boolean vender(){
        if (this.estoque > 0){
            System.out.println("Venda concluída com sucesso");
            this.estoque--;
            System.out.println("Estoque: " + getEstoque());
            return true;
        }else{
            System.out.println("Venda negada, estoque igual a 0");
            return false;
        }
    }
}
