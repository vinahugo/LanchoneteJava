package controllers;

import banco.BancoDadosLanchonete;
import java.util.List;
import models.Cliente;

public class ClientesController {
    
    public static void adicionarCliente(int codigo, String nome, String cpf){
        
        Cliente c = new Cliente();
        
        
        c.setCodigo(codigo);
        c.setNome(nome);
        c.setCpf(cpf);
        
        BancoDadosLanchonete.getTabelaCliente().add(c);
    }
    
    public static Cliente buscarPorCodigo(int codigo){
        
        for(Cliente c : BancoDadosLanchonete.getTabelaCliente()){
            if(c.getCodigo() == codigo){
                return c;
            }
        }
        
        return null;
    }
    
    public static List<Cliente> listarClientes(){
        return BancoDadosLanchonete.getTabelaCliente();
    }

}
