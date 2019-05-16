/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package modelos;

/**
 *
 * @author eugenio
 */
public class Contato implements Dados{
    //Atributos
    private String nome;
    private long telefone;
    private String email;

    public Contato(){
        this.nome="";
        this.telefone = 0;
        this.email = "";
    }
    public Contato(String nome, long telefone, String email){
        this.nome = nome;
        this.telefone = telefone;
        this.email= email;
    }
    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the telefone
     */
    public long getTelefone() {
        return telefone;
    }

    /**
     * @param telefone the telefone to set
     */
    public void setTelefone(long telefone) {
        this.telefone = telefone;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }
    
    /**
   *
   * @return
   */
  @Override
  public String desmontarObjeto(){
    return this.nome + ";" + this.telefone + ";" + this.email;
  }

  /**
   *
   * @param stringDados
   * @throws java.lang.Exception
   */
  @Override
  public void montarObjeto(String stringDados)throws Exception{
    try{
      String vetorString[] = stringDados.split(";");
      this.nome = vetorString[0];
      this.telefone = Long.parseLong(vetorString[1]);
      this.email = vetorString[2];
    }catch(Exception erro){
      throw new Exception("Erro no metodos montarObjeto do contato");
    }
  }
    
}
