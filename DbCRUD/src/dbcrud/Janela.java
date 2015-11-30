/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbcrud;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import tabelas.*;

/**
 *
 * @author Tomás Abril
 */
public class Janela extends javax.swing.JFrame {

    EntityManagerFactory emf;
    EntityManager em;

    /**
     * Creates new form Janela
     */
    public Janela() {
        initComponents();

        //fazer conexao com o banco de dados
        emf = Persistence.createEntityManagerFactory("DbCRUDPU");
        em = emf.createEntityManager();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        insercaoGenero = new javax.swing.JDialog();
        jLabel8 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        findGenero = new javax.swing.JDialog();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        alterGenero = new javax.swing.JDialog();
        jLabel5 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        excludeGenero = new javax.swing.JDialog();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jButton8 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();

        insercaoGenero.setMinimumSize(new java.awt.Dimension(400, 300));

        jLabel8.setText("Genero");

        jButton5.setText("inserir");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel10.setText("Descrição:");

        jLabel3.setText("id:");

        javax.swing.GroupLayout insercaoGeneroLayout = new javax.swing.GroupLayout(insercaoGenero.getContentPane());
        insercaoGenero.getContentPane().setLayout(insercaoGeneroLayout);
        insercaoGeneroLayout.setHorizontalGroup(
            insercaoGeneroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(insercaoGeneroLayout.createSequentialGroup()
                .addGroup(insercaoGeneroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(insercaoGeneroLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel8))
                    .addGroup(insercaoGeneroLayout.createSequentialGroup()
                        .addGap(161, 161, 161)
                        .addComponent(jButton5))
                    .addGroup(insercaoGeneroLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel10))
                    .addGroup(insercaoGeneroLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3))
                    .addGroup(insercaoGeneroLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(insercaoGeneroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))))
                .addContainerGap(179, Short.MAX_VALUE))
        );
        insercaoGeneroLayout.setVerticalGroup(
            insercaoGeneroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(insercaoGeneroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addGap(30, 30, 30)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 123, Short.MAX_VALUE)
                .addComponent(jButton5)
                .addContainerGap())
        );

        findGenero.setMinimumSize(new java.awt.Dimension(400, 300));

        jLabel2.setText("Find:");

        jLabel4.setText("ID");

        jButton6.setText("Find");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout findGeneroLayout = new javax.swing.GroupLayout(findGenero.getContentPane());
        findGenero.getContentPane().setLayout(findGeneroLayout);
        findGeneroLayout.setHorizontalGroup(
            findGeneroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(findGeneroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(findGeneroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, findGeneroLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton6)
                .addGap(169, 169, 169))
        );
        findGeneroLayout.setVerticalGroup(
            findGeneroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(findGeneroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(findGeneroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(findGeneroLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jButton6)
                .addContainerGap())
        );

        alterGenero.setMinimumSize(new java.awt.Dimension(400, 300));

        jLabel5.setText("alter genero");

        jButton7.setText("Alter");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jLabel6.setText("id do campo para alterar");

        jLabel7.setText("nova descricao");

        javax.swing.GroupLayout alterGeneroLayout = new javax.swing.GroupLayout(alterGenero.getContentPane());
        alterGenero.getContentPane().setLayout(alterGeneroLayout);
        alterGeneroLayout.setHorizontalGroup(
            alterGeneroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(alterGeneroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(alterGeneroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(alterGeneroLayout.createSequentialGroup()
                        .addGroup(alterGeneroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(30, 30, 30)
                        .addGroup(alterGeneroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton7))))
                .addContainerGap(144, Short.MAX_VALUE))
        );
        alterGeneroLayout.setVerticalGroup(
            alterGeneroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(alterGeneroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addGroup(alterGeneroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(alterGeneroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 183, Short.MAX_VALUE)
                .addComponent(jButton7)
                .addContainerGap())
        );

        excludeGenero.setMinimumSize(new java.awt.Dimension(400, 300));

        jLabel9.setText("Exclude Genero");

        jLabel11.setText("ID do objeto a ser excluido:");

        jButton8.setText("Exclude");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout excludeGeneroLayout = new javax.swing.GroupLayout(excludeGenero.getContentPane());
        excludeGenero.getContentPane().setLayout(excludeGeneroLayout);
        excludeGeneroLayout.setHorizontalGroup(
            excludeGeneroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(excludeGeneroLayout.createSequentialGroup()
                .addGroup(excludeGeneroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(excludeGeneroLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(excludeGeneroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel11)
                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(excludeGeneroLayout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addComponent(jButton8)))
                .addContainerGap(178, Short.MAX_VALUE))
        );
        excludeGeneroLayout.setVerticalGroup(
            excludeGeneroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(excludeGeneroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 175, Short.MAX_VALUE)
                .addComponent(jButton8)
                .addGap(19, 19, 19))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CRUD em JPA");

        jButton1.setText("Inserção");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Alteração");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Exclusão");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Consulta");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel1.setText("Generos:");

        jLabel12.setText("Livro:");

        jButton9.setText("Consulta");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setText("Exclusão");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton11.setText("Alteração");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton12.setText("Inserção");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jLabel13.setText("Pedido:");

        jButton13.setText("Consulta");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jButton14.setText("Exclusão");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        jButton15.setText("Alteração");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        jButton16.setText("Inserção");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(517, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton13))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel12)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton12)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton11)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton10)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton9))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton4))))
                .addContainerGap(459, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        insercaoGenero.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        Generos genero = new Generos();
        genero.setGENERO_ID(Integer.parseInt(jTextField1.getText()));
        genero.setDESCRICAO(jTextField5.getText());
        em.getTransaction().begin();
        em.persist(genero);
        em.getTransaction().commit();
        insercaoGenero.setVisible(false);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        //consulta
        findGenero.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        //find
        Generos genero = em.find(Generos.class, Integer.parseInt(jTextField2.getText()));
        jTextArea1.setText(genero.getDESCRICAO());
        findGenero.setVisible(false);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        //alter
        alterGenero.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        Generos genero = em.find(Generos.class, Integer.parseInt(jTextField3.getText()));

        em.getTransaction().begin();
        genero.setDESCRICAO(jTextField4.getText());
        em.getTransaction().commit();

        alterGenero.setVisible(false);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        //excluir
        Generos genero = em.find(Generos.class, Integer.parseInt(jTextField6.getText()));
        em.getTransaction().begin();
        em.remove(genero);
        em.getTransaction().commit();
        
        excludeGenero.setVisible(false);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        excludeGenero.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton16ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Janela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Janela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Janela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Janela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Janela().setVisible(true);
            }
        });
    }

    public Generos findGeneros(int id) {
        Generos genero = em.find(Generos.class, id);
        return genero;
    }

    public void finalize() {
        em.close();
        emf.close();

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog alterGenero;
    private javax.swing.JDialog excludeGenero;
    private javax.swing.JDialog findGenero;
    private javax.swing.JDialog insercaoGenero;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables
}
