package model;
/**
*
* @author Leon
*/
public class ModelCliente {

    private int idCliente;
    private String cliNome;
    private String cliTelefone;
    private String cliCpf;
    private String cliDataNasc;
    

    /**
    * Construtor
    */
    public ModelCliente(){}

    /**
    * seta o valor de idCliente
    * @param pIdCliente
    */
    public void setIdCliente(int pIdCliente){
        this.idCliente = pIdCliente;
    }
    /**
    * return pk_idCliente
    */
    public int getIdCliente(){
        return this.idCliente;
    }

    /**
    * seta o valor de cliNome
    * @param pCliNome
    */
    public void setCliNome(String pCliNome){
        this.cliNome = pCliNome;
    }
    /**
    * return cliNome
    */
    public String getCliNome(){
        return this.cliNome;
    }

    /**
    * seta o valor de cliTelefone
    * @param pCliTelefone
    */
    public void setCliTelefone(String pCliTelefone){
        this.cliTelefone = pCliTelefone;
    }
    /**
    * return cliTelefone
    */
    public String getCliTelefone(){
        return this.cliTelefone;
    }

    /**
    * seta o valor de cliCpf
    * @param pCliCpf
    */
    public void setCliCpf(String pCliCpf){
        this.cliCpf = pCliCpf;
    }
    /**
    * return cliCpf
    */
    public String getCliCpf(){
        return this.cliCpf;
    }

    /**
    * seta o valor de cliDataNasc
    * @param pCliDataNasc
    */
    public void setCliDataNasc(String pCliDataNasc){
        this.cliDataNasc = pCliDataNasc;
    }
    /**
    * return cliDataNasc
    */
    public String getCliDataNasc(){
        return this.cliDataNasc;
    }

    @Override
    public String toString(){
        return "ModelCliente {" + "::idCliente = " + this.idCliente + "::cliNome = " + this.cliNome + "::cliTelefone = " + this.cliTelefone + "::cliCpf = " + this.cliCpf + "::cliDataNasc = " + this.cliDataNasc +  "}";
    }
}