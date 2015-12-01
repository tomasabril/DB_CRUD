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
@Table(name = "pedidos")
public class Pedidos implements Serializable {

    @Id
    private Integer PEDIDO_ID;
    private Integer USUARIO_ID;
    private String DATA_PEDIDO;
    private String TIPO_PAG;

    /**
     * @return the PEDIDO_ID
     */
    public Integer getPEDIDO_ID() {
        return PEDIDO_ID;
    }

    /**
     * @param PEDIDO_ID the PEDIDO_ID to set
     */
    public void setPEDIDO_ID(Integer PEDIDO_ID) {
        this.PEDIDO_ID = PEDIDO_ID;
    }

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
     * @return the DATA_PEDIDO
     */
    public String getDATA_PEDIDO() {
        return DATA_PEDIDO;
    }

    /**
     * @param DATA_PEDIDO the DATA_PEDIDO to set
     */
    public void setDATA_PEDIDO(String DATA_PEDIDO) {
        this.DATA_PEDIDO = DATA_PEDIDO;
    }

    /**
     * @return the TIPO_PAG
     */
    public String getTIPO_PAG() {
        return TIPO_PAG;
    }

    /**
     * @param TIPO_PAG the TIPO_PAG to set
     */
    public void setTIPO_PAG(String TIPO_PAG) {
        this.TIPO_PAG = TIPO_PAG;
    }

    @Override
    public String toString() {
        return "id:" + getPEDIDO_ID() + " - " + "usuario_id:" + getUSUARIO_ID() + " - " + "tipo pag:" + getTIPO_PAG();
    }

}
