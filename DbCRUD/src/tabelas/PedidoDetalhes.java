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
@Table(name = "pedidos_detalhe")
public class PedidoDetalhes implements Serializable {

    @Id
    private Integer DETALHE_ID;
    private Integer PEDIDO_ID;
    private Integer LIVRO_ID;
    private Integer QTD;

    /**
     * @return the DETALHE_ID
     */
    public Integer getDETALHE_ID() {
        return DETALHE_ID;
    }

    /**
     * @param DETALHE_ID the DETALHE_ID to set
     */
    public void setDETALHE_ID(Integer DETALHE_ID) {
        this.DETALHE_ID = DETALHE_ID;
    }

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
     * @return the QTD
     */
    public Integer getQTD() {
        return QTD;
    }

    /**
     * @param QTD the QTD to set
     */
    public void setQTD(Integer QTD) {
        this.QTD = QTD;
    }

    @Override
    public String toString() {
        return getDETALHE_ID() + "-" + getLIVRO_ID() + "-" + getQTD();
    }
}
