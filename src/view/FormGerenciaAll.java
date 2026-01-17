package view;

//NetBeans Ver 25.
//Arthur Gabriel Teotonio Stellato R.A:A2766949 ADS 2025/2
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.*;
import model.dao.ProdutoDAO;

public class FormGerenciaAll extends javax.swing.JDialog {

    private static FormGerenciaAll gerenciaAllUnico;

    private FormGerenciaAll() {
        initComponents();
    }

    //MÉTODO SINGLETON
    public static FormGerenciaAll getCerenciaAll() {

        if (gerenciaAllUnico == null) {
            gerenciaAllUnico = new FormGerenciaAll();
        }
        return gerenciaAllUnico;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btVoltarMenu = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaProc = new javax.swing.JTable();
        btBuscaLike = new javax.swing.JButton();
        cxBuscaLike = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Gerenciamento de Processadores");
        setAlwaysOnTop(true);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                formPropertyChange(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        btVoltarMenu.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btVoltarMenu.setText("Voltar Menu");
        btVoltarMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVoltarMenuActionPerformed(evt);
            }
        });

        tabelaProc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "MARCA", "MODELO", "ANO", "PREÇO", "GARANTIA"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaProc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaProcMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaProc);

        btBuscaLike.setText("Buscar");
        btBuscaLike.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBuscaLikeActionPerformed(evt);
            }
        });

        cxBuscaLike.setText("Busca Por Marca");
        cxBuscaLike.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cxBuscaLikeMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Busca Por Marca");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 738, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(btVoltarMenu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cxBuscaLike, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btBuscaLike, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btBuscaLike)
                    .addComponent(cxBuscaLike, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(btVoltarMenu))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btVoltarMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltarMenuActionPerformed
        sair();
    }//GEN-LAST:event_btVoltarMenuActionPerformed

    private void formPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_formPropertyChange

    }//GEN-LAST:event_formPropertyChange

    private void tabelaProcMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaProcMouseClicked

    }//GEN-LAST:event_tabelaProcMouseClicked

    private void btBuscaLikeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscaLikeActionPerformed
   
        listarTabForLike(cxBuscaLike.getText().toUpperCase());
    }//GEN-LAST:event_btBuscaLikeActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        listarTab();
    }//GEN-LAST:event_formWindowActivated

    private void cxBuscaLikeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cxBuscaLikeMouseClicked
        cxBuscaLike.setText("");
    }//GEN-LAST:event_cxBuscaLikeMouseClicked

    public void listarTab(){     
        DefaultTableModel modelo = (DefaultTableModel) tabelaProc.getModel();
        modelo.setNumRows(0);
        
            ProdutoDAO pdao = new ProdutoDAO();
        
             for (Produto p : pdao.readAll()) {
            modelo.addRow(new Object []{p.getClass().getSimpleName(),p.getMarca(), p.getModelo(), p.getAno(),               
                p.getPreco(), p.getDataGarantia()});
        }
    }
    
    public void listarTabForLike(String marca){     
        DefaultTableModel modelo = (DefaultTableModel) tabelaProc.getModel();
        modelo.setNumRows(0);
        ProdutoDAO pdao = new ProdutoDAO();
        
             for (Produto p : pdao.buscaLike(marca)) {
            modelo.addRow(new Object []{p.getClass().getSimpleName(),p.getMarca(), p.getModelo(), p.getAno(),               
                p.getPreco(), p.getDataGarantia()});
        }
    }
    
    public void sair() {
        int resp = JOptionPane.showConfirmDialog(
                null,
                "Deseja fechar o Relatório?",
                "Saindo",
                JOptionPane.YES_NO_CANCEL_OPTION
        );
        if (resp == 0) {
            this.dispose();
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btBuscaLike;
    private javax.swing.JButton btVoltarMenu;
    private javax.swing.JTextField cxBuscaLike;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelaProc;
    // End of variables declaration//GEN-END:variables
}
