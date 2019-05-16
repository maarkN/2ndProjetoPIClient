/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comunicacao;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author eugeniojulio
 */
public class ClienteTCP {
    Socket socket;
    DataInputStream entrada;
    DataOutputStream saida;

    //Modo Cliente
    public ClienteTCP(String ipServer, int portaServer) throws IOException {
        socket = new Socket(ipServer, portaServer);
        entrada = new DataInputStream(socket.getInputStream());
        saida = new DataOutputStream(socket.getOutputStream());
    }   
    public void enviarMensagem(String mensagem) throws IOException {
        saida.writeUTF(mensagem);
        saida.flush();
    }
    
    public String receberMensagem() throws IOException {
        return entrada.readUTF();
    }    
}
