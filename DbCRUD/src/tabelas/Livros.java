/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tabelas;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author tomas
 */

@Entity
@Table(name = "livros")
public class Livros implements Serializable {

    @Id
    private Integer LIVRO_ID;
    private String TITULO;
    private String AUTOR;
    private String EDITORA;
    private Integer ANO;
    private Integer GENERO_ID;
    private String DESCRICAO;
    private Double PRECO;
    private Integer ESTOQUE;
    private Integer RESERVA;
    //blob > array de bytes//

    /**
     * @return the LIVRO_ID
     */
    public Integer getLIVRO_ID() {
        return LIVRO_ID;
    }

    /**
     * @param LIVRO_ID the LIVRO_ID to set
     */
    public void setLIVRO_ID(Integer LIVRO_ID) {
        this.LIVRO_ID = LIVRO_ID;
    }

    /**
     * @return the TITULO
     */
    public String getTITULO() {
        return TITULO;
    }

    /**
     * @param TITULO the TITULO to set
     */
    public void setTITULO(String TITULO) {
        this.TITULO = TITULO;
    }

    /**
     * @return the AUTOR
     */
    public String getAUTOR() {
        return AUTOR;
    }

    /**
     * @param AUTOR the AUTOR to set
     */
    public void setAUTOR(String AUTOR) {
        this.AUTOR = AUTOR;
    }

    /**
     * @return the EDITORA
     */
    public String getEDITORA() {
        return EDITORA;
    }

    /**
     * @param EDITORA the EDITORA to set
     */
    public void setEDITORA(String EDITORA) {
        this.EDITORA = EDITORA;
    }

    /**
     * @return the ANO
     */
    public Integer getANO() {
        return ANO;
    }

    /**
     * @param ANO the ANO to set
     */
    public void setANO(Integer ANO) {
        this.ANO = ANO;
    }

    /**
     * @return the GENERO_ID
     */
    public Integer getGENERO_ID() {
        return GENERO_ID;
    }

    /**
     * @param GENERO_ID the GENERO_ID to set
     */
    public void setGENERO_ID(Integer GENERO_ID) {
        this.GENERO_ID = GENERO_ID;
    }

    /**
     * @return the DESCRICAO
     */
    public String getDESCRICAO() {
        return DESCRICAO;
    }

    /**
     * @param DESCRICAO the DESCRICAO to set
     */
    public void setDESCRICAO(String DESCRICAO) {
        this.DESCRICAO = DESCRICAO;
    }

    /**
     * @return the PRECO
     */
    public Double getPRECO() {
        return PRECO;
    }

    /**
     * @param PRECO the PRECO to set
     */
    public void setPRECO(Double PRECO) {
        this.PRECO = PRECO;
    }

    /**
     * @return the ESTOQUE
     */
    public Integer getESTOQUE() {
        return ESTOQUE;
    }

    /**
     * @param ESTOQUE the ESTOQUE to set
     */
    public void setESTOQUE(Integer ESTOQUE) {
        this.ESTOQUE = ESTOQUE;
    }

    /**
     * @return the RESERVA
     */
    public Integer getRESERVA() {
        return RESERVA;
    }

    /**
     * @param RESERVA the RESERVA to set
     */
    public void setRESERVA(Integer RESERVA) {
        this.RESERVA = RESERVA;
    }

    @Override
    public String toString() {
        return getLIVRO_ID() + "-" + getTITULO();
    }
}
