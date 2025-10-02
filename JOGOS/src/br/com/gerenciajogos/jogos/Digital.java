package br.com.gerenciajogos.jogos;
import br.com.gerenciajogos.utils.Vendavel;
public class Digital extends Jogo implements Vendavel{
    private double tamanho;
    private String tipoLinceca;
    //constructor
    public Digital(){}
    public Digital(String titulo, String plataforma, double preco, double tamanho, String tipoLinceca){
        super(titulo, plataforma, preco);
        this.tamanho = tamanho;
        this.tipoLinceca = tipoLinceca;
    }
    //setters
    public void setTamanho(double tamanho){this.tamanho = tamanho;}
    public void setTipoLinceca(String tipoLinceca){this.tipoLinceca = tipoLinceca;}
    //getters
    public double getTamanho(){return tamanho;}
    public String getTipoLinceca(){return tipoLinceca;}
    @Override
    public boolean vender(){
        return true;
    }
}
