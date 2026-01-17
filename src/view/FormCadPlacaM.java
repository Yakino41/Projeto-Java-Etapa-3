package view;

//NetBeans Ver 25.
//Arthur Gabriel Teotonio Stellato R.A:A2766949 ADS 2025/2
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import static javax.swing.JOptionPane.QUESTION_MESSAGE;
import javax.swing.table.DefaultTableModel;
import model.dao.ProdutoDAO;
import modelo.*;

public class FormCadPlacaM extends javax.swing.JDialog {

    private PlacaMae placaM;

    private static FormCadPlacaM cadPlacaMUnico;

    private FormCadPlacaM() {
        initComponents();
    }

    //MÉTODO SINGLETON
    public static FormCadPlacaM getCadPlacaM() {

        if (cadPlacaMUnico == null) {
            cadPlacaMUnico = new FormCadPlacaM();
        }
        return cadPlacaMUnico;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rtMarca = new javax.swing.JLabel();
        rtModelo = new javax.swing.JLabel();
        rtAno = new javax.swing.JLabel();
        rtPreco = new javax.swing.JLabel();
        rtNumMemoria = new javax.swing.JLabel();
        rtGerMemRam = new javax.swing.JLabel();
        rtPciCompativel = new javax.swing.JLabel();
        rtTamanho = new javax.swing.JLabel();
        rtGarantia = new javax.swing.JLabel();
        cxMarca = new javax.swing.JTextField();
        cxModelo = new javax.swing.JTextField();
        cxAno = new javax.swing.JTextField();
        cxPreco = new javax.swing.JTextField();
        cxNumMemoria = new javax.swing.JTextField();
        cxGerMemRam = new javax.swing.JTextField();
        cxPciCompativel = new javax.swing.JTextField();
        cxTamanho = new javax.swing.JTextField();
        cxGarantia = new javax.swing.JTextField();
        btCadastrarPlacaM = new javax.swing.JButton();
        btAlterarPlacaM = new javax.swing.JButton();
        btRelPlacaM = new javax.swing.JButton();
        btVoltarMenu = new javax.swing.JButton();
        btConsultarPlacaM = new javax.swing.JButton();
        btLimpar = new javax.swing.JButton();
        btRemoverPlacaM = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaPlacaM = new javax.swing.JTable();
        btBuscaLike = new javax.swing.JButton();
        cxBuscaLike = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Gerenciamento de Placas Mãe");
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

        rtMarca.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        rtMarca.setText("Marca");

        rtModelo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        rtModelo.setText("Modelo");

        rtAno.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        rtAno.setText("Ano");

        rtPreco.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        rtPreco.setText("Preço");

        rtNumMemoria.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        rtNumMemoria.setText("Canais De Memoria");

        rtGerMemRam.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        rtGerMemRam.setText("Geração De Slot  De Memoria");

        rtPciCompativel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        rtPciCompativel.setText("Versão PCI Compativel");

        rtTamanho.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        rtTamanho.setText("Formato Da Placa Mãe");

        rtGarantia.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        rtGarantia.setText("Duração da Garantia");

        cxMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxMarcaActionPerformed(evt);
            }
        });

        cxModelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxModeloActionPerformed(evt);
            }
        });

        cxAno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxAnoActionPerformed(evt);
            }
        });

        cxPreco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxPrecoActionPerformed(evt);
            }
        });

        cxNumMemoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxNumMemoriaActionPerformed(evt);
            }
        });

        cxGerMemRam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxGerMemRamActionPerformed(evt);
            }
        });

        cxPciCompativel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxPciCompativelActionPerformed(evt);
            }
        });

        cxTamanho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxTamanhoActionPerformed(evt);
            }
        });

        cxGarantia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxGarantiaActionPerformed(evt);
            }
        });

        btCadastrarPlacaM.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btCadastrarPlacaM.setText("Cadastrar PlacaMãe");
        btCadastrarPlacaM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastrarPlacaMActionPerformed(evt);
            }
        });

        btAlterarPlacaM.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btAlterarPlacaM.setText("Alterar PlacaMãe");
        btAlterarPlacaM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAlterarPlacaMActionPerformed(evt);
            }
        });

        btRelPlacaM.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btRelPlacaM.setText("Exibir Relatorio Geral das Placas Mãe");
        btRelPlacaM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRelPlacaMActionPerformed(evt);
            }
        });

        btVoltarMenu.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btVoltarMenu.setText("Voltar Menu");
        btVoltarMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVoltarMenuActionPerformed(evt);
            }
        });

        btConsultarPlacaM.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btConsultarPlacaM.setText("Consultar PlacaMãe");
        btConsultarPlacaM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConsultarPlacaMActionPerformed(evt);
            }
        });

        btLimpar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btLimpar.setText("Limpar Campos");
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });

        btRemoverPlacaM.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btRemoverPlacaM.setText("Excluir Placa Mãe");
        btRemoverPlacaM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRemoverPlacaMActionPerformed(evt);
            }
        });

        tabelaPlacaM.setModel(new javax.swing.table.DefaultTableModel(
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
        tabelaPlacaM.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaPlacaMMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaPlacaM);

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
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rtMarca)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cxMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rtAno)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cxAno, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rtPreco)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cxPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rtModelo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cxModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(91, 91, 91)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rtPciCompativel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cxPciCompativel))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rtGerMemRam)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cxGerMemRam, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rtTamanho)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cxTamanho))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rtGarantia)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cxGarantia))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(rtNumMemoria)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cxNumMemoria, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btLimpar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btVoltarMenu))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btCadastrarPlacaM)
                            .addComponent(btAlterarPlacaM, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btConsultarPlacaM, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btRemoverPlacaM, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btRelPlacaM)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cxBuscaLike, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btBuscaLike, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rtMarca)
                            .addComponent(cxMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rtModelo)
                            .addComponent(cxModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rtAno)
                            .addComponent(cxAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rtPreco)
                            .addComponent(cxPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rtNumMemoria)
                            .addComponent(cxNumMemoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rtGerMemRam)
                            .addComponent(cxGerMemRam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rtPciCompativel)
                            .addComponent(cxPciCompativel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rtTamanho)
                            .addComponent(cxTamanho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rtGarantia)
                            .addComponent(cxGarantia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btCadastrarPlacaM)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btAlterarPlacaM))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btConsultarPlacaM)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btRemoverPlacaM)
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btVoltarMenu)
                            .addComponent(btLimpar))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btBuscaLike)
                    .addComponent(cxBuscaLike, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(btRelPlacaM))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cxMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxMarcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxMarcaActionPerformed

    private void cxModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxModeloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxModeloActionPerformed

    private void cxAnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxAnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxAnoActionPerformed

    private void cxPrecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxPrecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxPrecoActionPerformed

    private void cxNumMemoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxNumMemoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxNumMemoriaActionPerformed

    private void cxGerMemRamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxGerMemRamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxGerMemRamActionPerformed

    private void cxPciCompativelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxPciCompativelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxPciCompativelActionPerformed

    private void cxTamanhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxTamanhoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxTamanhoActionPerformed

    private void cxGarantiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxGarantiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxGarantiaActionPerformed

    private void btCadastrarPlacaMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarPlacaMActionPerformed
        cadastrarPlacaM();
    }//GEN-LAST:event_btCadastrarPlacaMActionPerformed

    private void btConsultarPlacaMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsultarPlacaMActionPerformed
        consultarPlacaM();
    }//GEN-LAST:event_btConsultarPlacaMActionPerformed

    private void btVoltarMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltarMenuActionPerformed
        sair();
    }//GEN-LAST:event_btVoltarMenuActionPerformed

    private void btAlterarPlacaMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAlterarPlacaMActionPerformed
        alterarPlacaM();
    }//GEN-LAST:event_btAlterarPlacaMActionPerformed

    private void btRelPlacaMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRelPlacaMActionPerformed
        FormRelGerPlacaM.geraFormRelGerPlacaM().setVisible(true);
    }//GEN-LAST:event_btRelPlacaMActionPerformed

    private void formPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_formPropertyChange

    }//GEN-LAST:event_formPropertyChange

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        limpa();
    }//GEN-LAST:event_btLimparActionPerformed

    private void btRemoverPlacaMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRemoverPlacaMActionPerformed
        excluirPlacaM();
    }//GEN-LAST:event_btRemoverPlacaMActionPerformed

    private void tabelaPlacaMMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaPlacaMMouseClicked
        selectTabPlacaM();
    }//GEN-LAST:event_tabelaPlacaMMouseClicked

    private void btBuscaLikeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscaLikeActionPerformed
         listarTabForLike(cxBuscaLike.getText().toUpperCase());
    }//GEN-LAST:event_btBuscaLikeActionPerformed

    private void cxBuscaLikeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cxBuscaLikeMouseClicked
        cxBuscaLike.setText("");
    }//GEN-LAST:event_cxBuscaLikeMouseClicked

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        listarTab();
    }//GEN-LAST:event_formWindowActivated

    public void selectTabPlacaM(){
        
        String valLinTab = "";
        
        int posLin = tabelaPlacaM.getSelectedRow();
        
        for(int col = 0; col < tabelaPlacaM.getColumnCount(); col++){
            valLinTab += tabelaPlacaM.getModel().getValueAt(posLin, col).toString();
            
            if(col+1 < tabelaPlacaM.getColumnCount()){
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

        DefaultTableModel modelo = (DefaultTableModel) tabelaPlacaM.getModel();
        modelo.setRowCount(0);
        ProdutoDAO pdao = new ProdutoDAO();
       
        for(PlacaMae placaM : pdao.readPlacaM()){
            
            if (placaM != null) {
                modelo.addRow(new Object []{placaM.getMarca(), placaM.getModelo(), placaM.getAno(),
                    placaM.getPreco(), placaM.getDataGarantia()});
            }
        }
    }
    
    public void listarTabForLike(String marca){     
        DefaultTableModel modelo = (DefaultTableModel) tabelaPlacaM.getModel();
        modelo.setNumRows(0);
            ProdutoDAO pdao = new ProdutoDAO();
        
            for(Produto proc : pdao.buscaLike(marca)){
            
                modelo.addRow(new Object []{proc.getMarca(), proc.getModelo(), proc.getAno(),
                    proc.getPreco(), proc.getDataGarantia()});
        }
    }
    
    public void sair() {
        int resp = JOptionPane.showConfirmDialog(
                null,
                "Deseja fechar o Cadastro?",
                "Saindo",
                JOptionPane.YES_NO_CANCEL_OPTION
        );
        if (resp == 0) {
            this.dispose();
        }
    }

    public void limpa() {
        cxMarca.setText("");
        cxModelo.setText("");
        cxPreco.setText("");
        cxAno.setText("");
        cxNumMemoria.setText("");
        cxGerMemRam.setText("");
        cxPciCompativel.setText("");
        cxTamanho.setText("");
        cxGarantia.setText("");
        cxMarca.requestFocus();
    }

    public void cadastrarPlacaM() {

        placaM = new PlacaMae();
        ProdutoDAO dao = new ProdutoDAO();

        try {
            placaM.setMarca(cxMarca.getText());
        } catch (ProcInvException pie) {
            JOptionPane.showMessageDialog(
                    null,
                    pie.getMessage(),
                    "ERRO",
                    ERROR_MESSAGE
            );
        } catch (PlacaVidInvException pvid) {
            JOptionPane.showMessageDialog(
                    null,
                    pvid.getMessage(),
                    "ERRO",
                    ERROR_MESSAGE
            );
        } catch (PlacaMaeInvException pmie) {
            JOptionPane.showMessageDialog(
                    null,
                    pmie.getMessage(),
                    "ERRO",
                    ERROR_MESSAGE
            );
            cxMarca.setText("");
            cxMarca.requestFocus();
            return;
        }

        try {
            placaM.setModelo(cxModelo.getText());
        } catch (ProcModInvException pmie) {
            JOptionPane.showMessageDialog(null,
                    pmie.getMessage(),
                    "ERRO",
                    ERROR_MESSAGE
            );
        }

        try {
            placaM.setAno(Integer.parseInt(cxAno.getText()));
        } catch (AnoInvException aie) {
            JOptionPane.showMessageDialog(
                    null,
                    aie.getMessage(),
                    "ERRO",
                    ERROR_MESSAGE
            );
            cxAno.setText("");
            cxAno.requestFocus();
            return;
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(
                    null,
                    "[ERRO] Por Favor digite um numero inteiro EX: 2015",
                    "ERRO",
                    ERROR_MESSAGE
            );
            cxAno.setText("");
            cxAno.requestFocus();
            return;
        }

        try {
            placaM.setPreco(Float.parseFloat(cxPreco.getText()));
        } catch (PrecoInvException pie) {
            JOptionPane.showMessageDialog(
                    null,
                    pie.getMessage(),
                    "ERRO",
                    ERROR_MESSAGE
            );
            cxPreco.setText("");
            cxPreco.requestFocus();
            return;
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(
                    null,
                    "[ERRO] Por Favor digite um numero inteiro EX: 2015",
                    "ERRO",
                    ERROR_MESSAGE
            );
            cxPreco.setText("");
            cxPreco.requestFocus();
            return;
        }

        try {
            placaM.setNumMemoria(Integer.parseInt(cxNumMemoria.getText()));
        } catch (NumMemoriaException nmie) {
            JOptionPane.showMessageDialog(
                    null,
                    nmie.getMessage(),
                    "ERRO",
                    ERROR_MESSAGE
            );
            cxNumMemoria.setText("");
            cxNumMemoria.requestFocus();
            return;
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(
                    null,
                    "[ERRO] Por Favor digite um numero inteiro.",
                    "ERRO",
                    ERROR_MESSAGE
            );
            cxNumMemoria.setText("");
            cxNumMemoria.requestFocus();
            return;
        }

        try {
            placaM.setGerMemRam(cxGerMemRam.getText());
        } catch (GerMemRamException gmre) {
            JOptionPane.showMessageDialog(
                    null,
                    gmre.getMessage(),
                    "ERRO",
                    ERROR_MESSAGE
            );
            cxGerMemRam.setText("");
            cxGerMemRam.requestFocus();
            return;
        }

        try {
            placaM.setPciCompativel(Float.parseFloat(cxPciCompativel.getText()));
        } catch (PciCompInvException pcie) {
            JOptionPane.showMessageDialog(
                    null,
                    pcie.getMessage(),
                    "ERRO",
                    ERROR_MESSAGE
            );
            cxPciCompativel.setText("");
            cxPciCompativel.requestFocus();
            return;
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(
                    null,
                    "[ERRO]Por Favor Digite um numero Fatorial Exemplo: 5.0",
                    "ERRO",
                    ERROR_MESSAGE
            );
            cxPciCompativel.setText("");
            cxPciCompativel.requestFocus();
            return;
        }

        try {
            placaM.setTamanho(cxTamanho.getText());
        } catch (TamanhoInvException tie) {
            JOptionPane.showMessageDialog(
                    null,
                    tie.getMessage(),
                    "ERRO",
                    ERROR_MESSAGE
            );
            cxTamanho.setText("");
            cxTamanho.requestFocus();
            return;
        }

        placaM.setDataGarantia(cxGarantia.getText());

        JOptionPane.showMessageDialog(
                null,
                "Placa Mãe Cadastrada Com Sucesso!",
                "Cadastro de Placa Mãe",
                1
        );

        dao.createPlacaM(placaM);
        limpa();
    }

    public void alterarPlacaM() {
        ProdutoDAO dao = new ProdutoDAO();

        try {
            placaM.setMarca(cxMarca.getText());
        } catch (ProcInvException pie) {
            JOptionPane.showMessageDialog(
                    null,
                    pie.getMessage(),
                    "ERRO",
                    ERROR_MESSAGE
            );
        } catch (PlacaVidInvException pvid) {
            JOptionPane.showMessageDialog(
                    null,
                    pvid.getMessage(),
                    "ERRO",
                    ERROR_MESSAGE
            );
        } catch (PlacaMaeInvException pmie) {
            JOptionPane.showMessageDialog(
                    null,
                    pmie.getMessage(),
                    "ERRO",
                    ERROR_MESSAGE
            );
            cxMarca.setText("");
            cxMarca.requestFocus();
            return;
        }

        try {
            placaM.setModelo(cxModelo.getText());
        } catch (ProcModInvException pmie) {
            JOptionPane.showMessageDialog(null,
                    pmie.getMessage(),
                    "ERRO",
                    ERROR_MESSAGE
            );
        }

        try {
            placaM.setAno(Integer.parseInt(cxAno.getText()));
        } catch (AnoInvException aie) {
            JOptionPane.showMessageDialog(
                    null,
                    aie.getMessage(),
                    "ERRO",
                    ERROR_MESSAGE
            );
            cxAno.setText("");
            cxAno.requestFocus();
            return;
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(
                    null,
                    "[ERRO] Por Favor digite um numero inteiro EX: 2015",
                    "ERRO",
                    ERROR_MESSAGE
            );
            cxAno.setText("");
            cxAno.requestFocus();
            return;
        }

        try {
            placaM.setPreco(Float.parseFloat(cxPreco.getText()));
        } catch (PrecoInvException pie) {
            JOptionPane.showMessageDialog(
                    null,
                    pie.getMessage(),
                    "ERRO",
                    ERROR_MESSAGE
            );
            cxPreco.setText("");
            cxPreco.requestFocus();
            return;
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(
                    null,
                    "[ERRO] Por Favor digite um numero inteiro EX: 2015",
                    "ERRO",
                    ERROR_MESSAGE
            );
            cxPreco.setText("");
            cxPreco.requestFocus();
            return;
        }

        try {
            placaM.setNumMemoria(Integer.parseInt(cxNumMemoria.getText()));
        } catch (NumMemoriaException nmie) {
            JOptionPane.showMessageDialog(
                    null,
                    nmie.getMessage(),
                    "ERRO",
                    ERROR_MESSAGE
            );
            cxNumMemoria.setText("");
            cxNumMemoria.requestFocus();
            return;
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(
                    null,
                    "[ERRO] Por Favor digite um numero inteiro.",
                    "ERRO",
                    ERROR_MESSAGE
            );
            cxNumMemoria.setText("");
            cxNumMemoria.requestFocus();
            return;
        }

        try {
            placaM.setGerMemRam(cxGerMemRam.getText());
        } catch (GerMemRamException gmre) {
            JOptionPane.showMessageDialog(
                    null,
                    gmre.getMessage(),
                    "ERRO",
                    ERROR_MESSAGE
            );
            cxGerMemRam.setText("");
            cxGerMemRam.requestFocus();
            return;
        }

        try {
            placaM.setPciCompativel(Float.parseFloat(cxPciCompativel.getText()));
        } catch (PciCompInvException pcie) {
            JOptionPane.showMessageDialog(
                    null,
                    pcie.getMessage(),
                    "ERRO",
                    ERROR_MESSAGE
            );
            cxPciCompativel.setText("");
            cxPciCompativel.requestFocus();
            return;
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(
                    null,
                    "[ERRO]Por Favor Digite um numero Fatorial Exemplo: 5.0",
                    "ERRO",
                    ERROR_MESSAGE
            );
            cxPciCompativel.setText("");
            cxPciCompativel.requestFocus();
            return;
        }

        try {
            placaM.setTamanho(cxTamanho.getText());
        } catch (TamanhoInvException tie) {
            JOptionPane.showMessageDialog(
                    null,
                    tie.getMessage(),
                    "ERRO",
                    ERROR_MESSAGE
            );
            cxTamanho.setText("");
            cxTamanho.requestFocus();
            return;
        }

        placaM.setDataGarantia(cxGarantia.getText());

        String marcaAntiga = cxMarca.getText();
        String modeloAntigo = cxModelo.getText();

        int confirmacao = JOptionPane.showConfirmDialog(
                null,
                "Tem certeza que deseja alterar esta PlacaDeVideo?",
                "Confirmação de Remoção",
                JOptionPane.YES_NO_OPTION
        );

        if (confirmacao != JOptionPane.YES_OPTION) {
            return;
        }

        dao.updatePlacaM(placaM, marcaAntiga, modeloAntigo);

    }

    public void consultarPlacaM() {
        ProdutoDAO dao = new ProdutoDAO();
        String marca = cxMarca.getText().toUpperCase();
        String modelo = cxModelo.getText().toUpperCase();

        try {
            placaM = dao.consPlacaM(marca, modelo);
            if (placaM != null) {
                cxModelo.setText(placaM.getModelo());
                cxMarca.setText(placaM.getMarca());
                cxAno.setText(Integer.toString((int) placaM.getAno()));
                cxPreco.setText(Float.toString((float) placaM.getPreco()));
                cxNumMemoria.setText(Integer.toString((int) placaM.getNumMemoria()));
                cxGerMemRam.setText(placaM.getGerMemRam());
                cxPciCompativel.setText(Float.toString(placaM.getPciCompativel()));
                cxTamanho.setText(placaM.getTamanho());
                cxGarantia.setText(placaM.getDataGarantia());
                JOptionPane.showMessageDialog(
                        null,
                        "Verifique As Informaçoes",
                        "Consulta De Placa Mãe",
                        QUESTION_MESSAGE
                );
            } else {
                JOptionPane.showMessageDialog(
                        null,
                        "Não há um Placa Mãe registrado com essa Marca e Modelo",
                        "PlacaMãe inexistente",
                        0
                );
                limpa();
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(
                    null,
                    ex.getMessage(),
                    "ERRO",
                    JOptionPane.ERROR_MESSAGE
            );
        }
    }

    public void excluirPlacaM() {
        String marca = cxMarca.getText().toUpperCase();
        String modelo = cxModelo.getText().toUpperCase();
        ProdutoDAO dao = new ProdutoDAO();

        if (marca.trim().isEmpty() || modelo.trim().isEmpty()) {
            JOptionPane.showMessageDialog(
                    null,
                    "Para remover, preencha a Marca e o Modelo.",
                    "Dados Incompletos",
                    JOptionPane.WARNING_MESSAGE
            );
            return;
        }

        int confirmacao = JOptionPane.showConfirmDialog(
                null,
                "Tem certeza que deseja remover esta Placa Mãe\nMarca: " + placaM.getMarca() + "\nModelo: " + placaM.getModelo(),
                "Confirmação de Remoção",
                JOptionPane.YES_NO_OPTION
        );

        if (confirmacao != JOptionPane.YES_OPTION) {
            return;
        }

        if (placaM != null) {
            JOptionPane.showMessageDialog(
                    null,
                    "Placa Mãe removida com sucesso!",
                    "Sucesso",
                    JOptionPane.INFORMATION_MESSAGE
            );
            dao.removePlacaM(placaM);
            limpa();
        } else {
            JOptionPane.showMessageDialog(
                    null,
                    "Nenhuma Placa Mãe encontrada com a Marca e Modelo informados.",
                    "Placa Mãe Inexistente",
                    JOptionPane.ERROR_MESSAGE
            );
        }

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAlterarPlacaM;
    private javax.swing.JButton btBuscaLike;
    private javax.swing.JButton btCadastrarPlacaM;
    private javax.swing.JButton btConsultarPlacaM;
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btRelPlacaM;
    private javax.swing.JButton btRemoverPlacaM;
    private javax.swing.JButton btVoltarMenu;
    private javax.swing.JTextField cxAno;
    private javax.swing.JTextField cxBuscaLike;
    private javax.swing.JTextField cxGarantia;
    private javax.swing.JTextField cxGerMemRam;
    private javax.swing.JTextField cxMarca;
    private javax.swing.JTextField cxModelo;
    private javax.swing.JTextField cxNumMemoria;
    private javax.swing.JTextField cxPciCompativel;
    private javax.swing.JTextField cxPreco;
    private javax.swing.JTextField cxTamanho;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel rtAno;
    private javax.swing.JLabel rtGarantia;
    private javax.swing.JLabel rtGerMemRam;
    private javax.swing.JLabel rtMarca;
    private javax.swing.JLabel rtModelo;
    private javax.swing.JLabel rtNumMemoria;
    private javax.swing.JLabel rtPciCompativel;
    private javax.swing.JLabel rtPreco;
    private javax.swing.JLabel rtTamanho;
    private javax.swing.JTable tabelaPlacaM;
    // End of variables declaration//GEN-END:variables
}
