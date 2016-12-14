package TrabalhoLanchonete;

import banco.BancoDadosLanchonete;
//import java.util.Scanner;
//import views.ClienteView;
//import views.LancheView;
//import views.VendaView;
import views.MenuInicioView;


public class TrabalhoLanchonete {

    public static void main(String[] args) {
        BancoDadosLanchonete.inicializarBancoCliente();
        BancoDadosLanchonete.inicializarBancoLanche();
        BancoDadosLanchonete.inicializarBancoVenda();
        
        MenuInicioView menu = new MenuInicioView();
        try{
            menu.exibirMenu();
        }catch(Exception erro){
            System.out.println("Erro: "+ erro);
        }
        
    }
}
