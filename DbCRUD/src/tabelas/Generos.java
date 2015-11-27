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
@Table(name = "generos")
public class Generos implements Serializable {

    @Id
    Integer GENERO_ID;
    String DESCRICAO;

    public Generos() {

    }

    public int getGENERO_ID() {
        return GENERO_ID;
    }
    
    public void setGENERO_ID(int num){
        this.GENERO_ID = num;
    }

    public String getDESCRICAO() {
        return DESCRICAO;
    }

    public void setDESCRICAO(String DESCRICAO) {
        this.DESCRICAO = DESCRICAO;
    }

    @Override
    public String toString() {
        return GENERO_ID + "-" + DESCRICAO;
    }
}
