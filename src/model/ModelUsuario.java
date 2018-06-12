package model;
/**
*
* @author Leon
*/
public class ModelUsuario {

    private int idUsuario;
    private String usuNome;
    private String usulogin;
    private String usuSenha;

    /**
    * Construtor
    */
    public ModelUsuario(){}

    /**
    * seta o valor de idUsuario
    * @param pIdUsuario
    */
    public void setIdUsuario(int pIdUsuario){
        this.idUsuario = pIdUsuario;
    }
    /**
    * return pk_idUsuario
    */
    public int getIdUsuario(){
        return this.idUsuario;
    }

    /**
    * seta o valor de usuNome
    * @param pUsuNome
    */
    public void setUsuNome(String pUsuNome){
        this.usuNome = pUsuNome;
    }
    /**
    * return usuNome
    */
    public String getUsuNome(){
        return this.usuNome;
    }

    /**
    * seta o valor de usulogin
    * @param pUsulogin
    */
    public void setUsulogin(String pUsulogin){
        this.usulogin = pUsulogin;
    }
    /**
    * return usulogin
    */
    public String getUsulogin(){
        return this.usulogin;
    }

    /**
    * seta o valor de usuSenha
    * @param pUsuSenha
    */
    public void setUsuSenha(String pUsuSenha){
        this.usuSenha = pUsuSenha;
    }
    /**
    * return usuSenha
    */
    public String getUsuSenha(){
        return this.usuSenha;
    }

    @Override
    public String toString(){
        return "ModelUsuario {" + "::idUsuario = " + this.idUsuario + "::usuNome = " + this.usuNome + "::usulogin = " + this.usulogin + "::usuSenha = " + this.usuSenha +  "}";
    }
}