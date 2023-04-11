
package visao;

import javax.swing.JOptionPane;
import modelos.*;

public class TelaTeste extends javax.swing.JFrame {

    //Instanciação de objetos
    Livro objLivro = null;
    Cd disco = null;
    Tv eletronico = null;
    Notebook informatica = null;

    public TelaTeste() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton_Teste = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea_Saida = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton_Teste.setText("Teste");
        jButton_Teste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_TesteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(196, Short.MAX_VALUE)
                .addComponent(jButton_Teste, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(194, 194, 194))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jButton_Teste)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        jTextArea_Saida.setColumns(20);
        jTextArea_Saida.setRows(5);
        jScrollPane1.setViewportView(jTextArea_Saida);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 547, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_TesteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_TesteActionPerformed
        try {
            // TODO add your handling code here:

            // Livro
            objLivro = new Livro(100, 100, "java", "fulano", "fulaninho", "qualquer", 1995);
            String saida = "-----Produtos----- \n \n";
            saida += "Codigo do Produto: " + objLivro.getCodigo() + "\n";
            saida += "Tipo: " + objLivro.obterTipoDoProduto() + "\n";
            saida += "--- Descrição do produto ---\n" + objLivro.obterDescricaoCompletaDoproduto() + "\n";
            saida += "Preço: R$ " + objLivro.obterPrecoDeVendaDoProduto();
            saida += "\n--------------------------------------------------------------------------- \n";

            //Cd
            disco = new Cd("Rock in roll try", "AC/DC", "Dave Evans", "Rock", 101, 200);
            saida += "Codigo do Produto: " + disco.getCodigo() + "\n";
            saida += "Tipo: " + disco.obterTipoDoProduto() + "\n";
            saida += "--- Descrição do produto ---\n" + disco.obterDescricaoCompletaDoproduto() + "\n";
            saida += "Preço: R$ " + disco.obterPrecoDeVendaDoProduto();
            saida += "\n--------------------------------------------------------------------------- \n";

            //Tv
            eletronico = new Tv(102, 1999, "50NANO75SQA", "LG", "WebOs", 32);
            saida += "Codigo do Produto: " + eletronico.getCodigo() + "\n";
            saida += "Tipo: " + eletronico.obterTipoDoProduto() + "\n";
            saida += "--- Descrição do produto ---\n" + eletronico.obterDescricaoCompletaDoproduto() + "\n";
            saida += "Preço: R$ " + eletronico.obterPrecoDeVendaDoProduto();
            saida += "\n--------------------------------------------------------------------------- \n";

            //Notebook
            informatica = new Notebook("Ace", "Notebook Nitro 5 AN515-44-R4KA", 8, 256, "AMD Ryzen R7-4800H–Octa Core",
                    (float) 15.5, "Windows 11", 103, 4999);
            saida += "Codigo do Produto: " + informatica.getCodigo() + "\n";
            saida += "Tipo: " + informatica.obterTipoDoProduto() + "\n";
            saida += "--- Descrição do produto ---\n" + informatica.obterDescricaoCompletaDoproduto() + "\n";
            saida += "Preço: R$ " + informatica.obterPrecoDeVendaDoProduto();

            //Saida
            jTextArea_Saida.setText(saida);
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(this, erro.getMessage());
        }
    }//GEN-LAST:event_jButton_TesteActionPerformed

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
            java.util.logging.Logger.getLogger(TelaTeste.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaTeste.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaTeste.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaTeste.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaTeste().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Teste;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea_Saida;
    // End of variables declaration//GEN-END:variables
}
