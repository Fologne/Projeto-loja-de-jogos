package br.com.gerenciajogos.main;
import br.com.gerenciajogos.jogos.Digital;
import br.com.gerenciajogos.jogos.Fisico;
import br.com.gerenciajogos.utils.Teclado;
import java.util.ArrayList;

public class Main{
    public static void main(String[] args){
        int escolha;
        ArrayList <Fisico> fisicos = new ArrayList<>();
        ArrayList < Digital> digitals = new ArrayList<>();
        do{
            escolha = Teclado.LerInteiro("Digite\n1 para cadastrar um jogo\n2 para realizar a venda de um jogo\n3 para exibir os jogos cadastrados\n4 para excluir um jogo\n0 para sair");
            switch(escolha){
                case 1://cadastro = nao feito
                    break;
                case 2://venda = nao feito
                    break;
                case 3://exibir = nao feito
                    break;
                case 4://excluir = nao feito
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Escolha inválida");
                    break;
            }
        }while(escolha != 0);
    }
}
