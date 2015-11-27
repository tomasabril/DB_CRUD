/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tabelas;

import java.io.Serializable;
import javax.persistence.*;

/**
 *
 * @author toams
 */
@Entity
@Table(name = "usuarios")
public class Usuarios implements Serializable {

    @Id
    private Integer USUARIO_ID;
    private String NOME;
    private String ENDERECO;
    private String BAIRRO;
    private String CIDADE;

    /**
     * @return the USUARIO_ID
     */
    public Integer getUSUARIO_ID() {
        return USUARIO_ID;
    }

    /**
     * @param USUARIO_ID the USUARIO_ID to set
     */
    public void setUSUARIO_ID(Integer USUARIO_ID) {
        this.USUARIO_ID = USUARIO_ID;
    }

    /**
     * @return the NOME
     */
    public String getNOME() {
        return NOME;
    }

    /**
     * @param NOME the NOME to set
     */
    public void setNOME(String NOME) {
        this.NOME = NOME;
    }

    /**
     * @return the ENDERECO
     */
    public String getENDERECO() {
        return ENDERECO;
    }

    /**
     * @param ENDERECO the ENDERECO to set
     */
    public void setENDERECO(String ENDERECO) {
        this.ENDERECO = ENDERECO;
    }

    /**
     * @return the BAIRRO
     */
    public String getBAIRRO() {
        return BAIRRO;
    }

    /**
     * @param BAIRRO the BAIRRO to set
     */
    public void setBAIRRO(String BAIRRO) {
        this.BAIRRO = BAIRRO;
    }

    /**
     * @return the CIDADE
     */
    public String getCIDADE() {
        return CIDADE;
    }

    /**
     * @param CIDADE the CIDADE to set
     */
    public void setCIDADE(String CIDADE) {
        this.CIDADE = CIDADE;
    }

    @Override
    public String toString() {
        return getUSUARIO_ID() + "-" + getNOME();
    }

}
