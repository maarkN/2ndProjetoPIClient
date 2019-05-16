/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import comunicacao.ClienteTCP;
import java.io.IOException;
import modelos.Contato;
import modelos.Dados;
import javax.swing.JOptionPane;        

/**
 *
 * @author eugeniojulio
 */
public class ControleContato {
    
    private ClienteTCP comunicacaoCliente = null;
    public ControleContato() throws IOException{
        comunicacaoCliente = new ClienteTCP("127.0.0.1",7777);
    }
    
    public void incluirDadosPersistencia(Object objeto, int operacao)throws Exception{
        try {
            
            
            String msg = objeto.getClass().getSimpleName()+"#"+operacao+"#";
            Dados dado = (Dados)objeto;
            msg += dado.desmontarObjeto();
            JOptionPane.showMessageDialog(null, msg);
            comunicacaoCliente.enviarMensagem(msg);
            String msgRecebido = comunicacaoCliente.receberMensagem();
            System.out.println(msgRecebido);
        } catch (Exception erro) {
            throw erro;
        }
             
    }
}
