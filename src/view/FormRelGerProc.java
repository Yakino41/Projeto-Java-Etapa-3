package view;

//NetBeans Ver 25.
//Arthur Gabriel Teotonio Stellato R.A:A2766949 ADS 2025/2
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.dao.ProdutoDAO;
import modelo.*;

public class FormRelGerProc extends javax.swing.JFrame {
    
    private static FormRelGerProc formRelGerProcUnic;
    
    private FormRelGerProc() {
        initComponents();
    }
    
    //MÉTODO SINGLETON
    public static FormRelGerProc geraFormRelGerProc(){
        
        if(formRelGerProcUnic == null){
            formRelGerProcUnic = new FormRelGerProc();      
        }
        return formRelGerProcUnic;
    }
    
    public void selectTabPlacaM(){
        
        String valLinTab = "";
        
        int posLin = tabelaProc.getSelectedRow();
        
        for(int col = 0; col < tabelaProc.getColumnCount(); col++){
            valLinTab += tabelaProc.getModel().getValueAt(posLin, col).toString();
            
            if(col+1 < tabelaProc.getColumnCount()){
                  valLinTab += " - ";          
            }

        }
         
        JOptionPane.showMessageDialog(
                null,
                "Linha Consultada "+posLin+"Informações: "+valLinTab,
                "Consulta de Tabela",
                1
        );
    
    }
    
    public void listarTab(){

        DefaultTableModel modelo = (DefaultTableModel) tabelaProc.getModel();
        modelo.setRowCount(0);
        ProdutoDAO pdao = new ProdutoDAO();
       
        for(Processador proc : pdao.read()){
            
            if (proc != null) {
                modelo.addRow(new Object []{proc.getMarca(), proc.getModelo(), proc.getAno(),
                    proc.getPreco(), proc.getDataGarantia()});
            }
        }
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaProc = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Relatório Geral Dos Processadores");
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 879, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tabelaProcMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaProcMouseClicked
        selectTabPlacaM();
    }//GEN-LAST:event_tabelaProcMouseClicked

    private void formPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_formPropertyChange
        
    }//GEN-LAST:event_formPropertyChange

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        listarTab();
    }//GEN-LAST:event_formWindowActivated

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelaProc;
    // End of variables declaration//GEN-END:variables
}
