package view;

//NetBeans Ver 25.
//Arthur Gabriel Teotonio Stellato R.A:A2766949 ADS 2025/2
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import static javax.swing.JOptionPane.QUESTION_MESSAGE;
import javax.swing.table.DefaultTableModel;
import modelo.*;
import model.dao.ProdutoDAO;

public class FormCadProc extends javax.swing.JDialog {

    private static FormCadProc cadProcUnico;
    private Processador proc;

    private FormCadProc() {
        initComponents();
    }

    //MÉTODO SINGLETON
    public static FormCadProc getCadProc() {

        if (cadProcUnico == null) {
            cadProcUnico = new FormCadProc();
        }
        return cadProcUnico;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rtMarca = new javax.swing.JLabel();
        rtModelo = new javax.swing.JLabel();
        rtAno = new javax.swing.JLabel();
        rtPreco = new javax.swing.JLabel();
        rtSocket = new javax.swing.JLabel();
        rtNucleo = new javax.swing.JLabel();
        rtThreads = new javax.swing.JLabel();
        rtFreqBase = new javax.swing.JLabel();
        rtFreqMax = new javax.swing.JLabel();
        rtGarantia = new javax.swing.JLabel();
        cxMarca = new javax.swing.JTextField();
        cxModelo = new javax.swing.JTextField();
        cxAno = new javax.swing.JTextField();
        cxPreco = new javax.swing.JTextField();
        cxSocket = new javax.swing.JTextField();
        cxNucleo = new javax.swing.JTextField();
        cxThreads = new javax.swing.JTextField();
        cxFreqBase = new javax.swing.JTextField();
        cxFreqMax = new javax.swing.JTextField();
        cxGarantia = new javax.swing.JTextField();
        btCadastrar = new javax.swing.JButton();
        btAlterar = new javax.swing.JButton();
        btRelProc = new javax.swing.JButton();
        btConsultar = new javax.swing.JButton();
        btVoltarMenu = new javax.swing.JButton();
        btRemover = new javax.swing.JButton();
        btLimpar = new javax.swing.JButton();
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

        rtMarca.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        rtMarca.setText("Marca");

        rtModelo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        rtModelo.setText("Modelo");

        rtAno.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        rtAno.setText("Ano");

        rtPreco.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        rtPreco.setText("Preço");

        rtSocket.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        rtSocket.setText("Socket");

        rtNucleo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        rtNucleo.setText("Nucleos");

        rtThreads.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        rtThreads.setText("Threads");

        rtFreqBase.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        rtFreqBase.setText("Frequencia Base");

        rtFreqMax.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        rtFreqMax.setText("Frequencia Máxima");

        rtGarantia.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        rtGarantia.setText("Duração Garantia");

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

        cxSocket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxSocketActionPerformed(evt);
            }
        });

        cxNucleo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxNucleoActionPerformed(evt);
            }
        });

        cxThreads.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxThreadsActionPerformed(evt);
            }
        });

        cxFreqBase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxFreqBaseActionPerformed(evt);
            }
        });

        cxFreqMax.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxFreqMaxActionPerformed(evt);
            }
        });

        cxGarantia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxGarantiaActionPerformed(evt);
            }
        });

        btCadastrar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btCadastrar.setText("Cadastrar Processador");
        btCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastrarActionPerformed(evt);
            }
        });

        btAlterar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btAlterar.setText("Alterar Processador");
        btAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAlterarActionPerformed(evt);
            }
        });

        btRelProc.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btRelProc.setText("Exibir Relatorio Geral dos Processadores");
        btRelProc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRelProcActionPerformed(evt);
            }
        });

        btConsultar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btConsultar.setText("Consultar Processador");
        btConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConsultarActionPerformed(evt);
            }
        });

        btVoltarMenu.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btVoltarMenu.setText("Voltar Menu");
        btVoltarMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVoltarMenuActionPerformed(evt);
            }
        });

        btRemover.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btRemover.setText("Remover Processador");
        btRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRemoverActionPerformed(evt);
            }
        });

        btLimpar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btLimpar.setText("Limpar Campos");
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
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
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btAlterar)
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
                        .addComponent(cxModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(rtNucleo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cxNucleo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btLimpar)
                    .addComponent(btRelProc)
                    .addComponent(btCadastrar))
                .addGap(184, 184, 184)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(71, 71, 71)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btRemover, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btConsultar)))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(124, 124, 124)
                            .addComponent(btVoltarMenu))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(rtFreqBase)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cxFreqBase))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(rtThreads)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cxThreads))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(rtFreqMax)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cxFreqMax))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(rtSocket)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cxSocket))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(rtGarantia)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cxGarantia, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cxBuscaLike, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btBuscaLike, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rtThreads)
                            .addComponent(cxThreads, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rtFreqBase)
                            .addComponent(cxFreqBase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rtFreqMax)
                            .addComponent(cxFreqMax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rtSocket)
                            .addComponent(cxSocket, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rtGarantia)
                            .addComponent(cxGarantia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btRemover)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btConsultar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btVoltarMenu)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btBuscaLike)
                            .addComponent(cxBuscaLike, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rtMarca)
                            .addComponent(cxMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rtModelo)
                            .addComponent(cxModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rtAno)
                            .addComponent(cxAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rtPreco)
                            .addComponent(cxPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rtNucleo)
                            .addComponent(cxNucleo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btCadastrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btAlterar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btLimpar)
                        .addGap(7, 7, 7)
                        .addComponent(btRelProc)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void cxSocketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxSocketActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxSocketActionPerformed

    private void cxNucleoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxNucleoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxNucleoActionPerformed

    private void cxThreadsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxThreadsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxThreadsActionPerformed

    private void cxFreqBaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxFreqBaseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxFreqBaseActionPerformed

    private void cxFreqMaxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxFreqMaxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxFreqMaxActionPerformed

    private void cxGarantiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxGarantiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxGarantiaActionPerformed

    private void btCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarActionPerformed
        cadastrar();
    }//GEN-LAST:event_btCadastrarActionPerformed

    private void btConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsultarActionPerformed
        consultar();
    }//GEN-LAST:event_btConsultarActionPerformed

    private void btVoltarMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltarMenuActionPerformed
        sair();
    }//GEN-LAST:event_btVoltarMenuActionPerformed

    private void btAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAlterarActionPerformed
        alterar();
    }//GEN-LAST:event_btAlterarActionPerformed

    private void btRelProcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRelProcActionPerformed
        FormRelGerProc.geraFormRelGerProc().setVisible(true);
    }//GEN-LAST:event_btRelProcActionPerformed

    private void formPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_formPropertyChange

    }//GEN-LAST:event_formPropertyChange

    private void btRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRemoverActionPerformed
        excluir();
    }//GEN-LAST:event_btRemoverActionPerformed

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        limpa();
    }//GEN-LAST:event_btLimparActionPerformed

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
        
            for(Processador proc : pdao.read()){
            
                modelo.addRow(new Object []{proc.getMarca(), proc.getModelo(), proc.getAno(),
                    proc.getPreco(), proc.getDataGarantia()});
        } 
    }
    
    public void listarTabForLike(String marca){     
        DefaultTableModel modelo = (DefaultTableModel) tabelaProc.getModel();
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
        cxSocket.setText("");
        cxNucleo.setText("");
        cxThreads.setText("");
        cxFreqBase.setText("");
        cxFreqMax.setText("");
        cxGarantia.setText("");
        cxMarca.requestFocus();
    }

    public void cadastrar() {

        proc = new Processador();
        ProdutoDAO dao = new ProdutoDAO();

        try {
            proc.setMarca(cxMarca.getText());
        } catch (ProcInvException pie) {
            JOptionPane.showMessageDialog(
                    null,
                    pie.getMessage(),
                    "ERRO",
                    ERROR_MESSAGE
            );
            cxMarca.setText("");
            cxMarca.requestFocus();
            return;
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
        }

        try {
            proc.setModelo(cxModelo.getText());
        } catch (ProcModInvException pmie) {
            JOptionPane.showMessageDialog(
                    null,
                    pmie.getMessage(),
                    "ERRO",
                    ERROR_MESSAGE
            );
            cxModelo.setText("");
            cxModelo.requestFocus();
            return;
        }

        try {
            proc.setAno(Integer.parseInt(cxAno.getText()));
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
            proc.setPreco(Float.parseFloat(cxPreco.getText()));
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
            proc.setSocketCompativel(cxSocket.getText());
        } catch (SocketCompInvException scie) {
            JOptionPane.showMessageDialog(
                    null,
                    scie.getMessage(),
                    "ERRO",
                    ERROR_MESSAGE
            );
            cxSocket.setText("");
            cxSocket.requestFocus();
            return;
        }

        try {
            proc.setNucleo(Integer.parseInt(cxNucleo.getText()));
        } catch (NucleoInvException nie) {
            JOptionPane.showMessageDialog(
                    null,
                    nie.getMessage(),
                    "ERRO",
                    ERROR_MESSAGE
            );
            cxNucleo.setText("");
            cxNucleo.requestFocus();
            return;
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(
                    null,
                    "[ERRO] Por Favor digite um numero inteiro.",
                    "ERRO",
                    ERROR_MESSAGE
            );
            cxNucleo.setText("");
            cxNucleo.requestFocus();
            return;
        }

        try {
            proc.setThreads(Integer.parseInt(cxThreads.getText()));
        } catch (ThreadsInvException tie) {
            JOptionPane.showMessageDialog(
                    null,
                    tie.getMessage(),
                    "ERRO",
                    ERROR_MESSAGE
            );
            cxThreads.setText("");
            cxThreads.requestFocus();
            return;
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(
                    null,
                    "[ERRO] Por Favor digite um numero inteiro.",
                    "ERRO",
                    ERROR_MESSAGE
            );
            cxThreads.setText("");
            cxThreads.requestFocus();
            return;
        }

        try {
            proc.setFreqBase(Float.parseFloat(cxFreqBase.getText()));
        } catch (FreqBaseInvException fbie) {
            JOptionPane.showMessageDialog(
                    null,
                    fbie.getMessage(),
                    "ERRO",
                    ERROR_MESSAGE
            );
            cxFreqBase.setText("");
            cxFreqBase.requestFocus();
            return;
        }

        try {
            proc.setFreqMax(Float.parseFloat(cxFreqMax.getText()));
        } catch (FreqMaxInvException fmie) {
            JOptionPane.showMessageDialog(
                    null,
                    fmie.getMessage(),
                    "ERRO",
                    ERROR_MESSAGE
            );
            cxFreqMax.setText("");
            cxFreqMax.requestFocus();
            return;
        }

        proc.setDataGarantia(cxGarantia.getText());

        dao.createProc(proc);
        limpa();
    }

    public void alterar() {

        proc = new Processador();
        ProdutoDAO dao = new ProdutoDAO();

        try {
            proc.setMarca(cxMarca.getText());
        } catch (ProcInvException pie) {
            JOptionPane.showMessageDialog(
                    null,
                    pie.getMessage(),
                    "ERRO",
                    ERROR_MESSAGE
            );
            cxMarca.setText("");
            cxMarca.requestFocus();
            return;
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
        }

        try {
            proc.setModelo(cxModelo.getText());
        } catch (ProcModInvException pmie) {
            JOptionPane.showMessageDialog(
                    null,
                    pmie.getMessage(),
                    "ERRO",
                    ERROR_MESSAGE
            );
            cxModelo.setText("");
            cxModelo.requestFocus();
            return;
        }

        try {
            proc.setAno(Integer.parseInt(cxAno.getText()));
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
            proc.setPreco(Float.parseFloat(cxPreco.getText()));
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
            proc.setSocketCompativel(cxSocket.getText());
        } catch (SocketCompInvException scie) {
            JOptionPane.showMessageDialog(
                    null,
                    scie.getMessage(),
                    "ERRO",
                    ERROR_MESSAGE
            );
            cxSocket.setText("");
            cxSocket.requestFocus();
            return;
        }

        try {
            proc.setNucleo(Integer.parseInt(cxNucleo.getText()));
        } catch (NucleoInvException nie) {
            JOptionPane.showMessageDialog(
                    null,
                    nie.getMessage(),
                    "ERRO",
                    ERROR_MESSAGE
            );
            cxNucleo.setText("");
            cxNucleo.requestFocus();
            return;
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(
                    null,
                    "[ERRO] Por Favor digite um numero inteiro.",
                    "ERRO",
                    ERROR_MESSAGE
            );
            cxNucleo.setText("");
            cxNucleo.requestFocus();
            return;
        }

        try {
            proc.setThreads(Integer.parseInt(cxThreads.getText()));
        } catch (ThreadsInvException tie) {
            JOptionPane.showMessageDialog(
                    null,
                    tie.getMessage(),
                    "ERRO",
                    ERROR_MESSAGE
            );
            cxThreads.setText("");
            cxThreads.requestFocus();
            return;
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(
                    null,
                    "[ERRO] Por Favor digite um numero inteiro.",
                    "ERRO",
                    ERROR_MESSAGE
            );
            cxThreads.setText("");
            cxThreads.requestFocus();
            return;
        }

        try {
            proc.setFreqBase(Float.parseFloat(cxFreqBase.getText()));
        } catch (FreqBaseInvException fbie) {
            JOptionPane.showMessageDialog(
                    null,
                    fbie.getMessage(),
                    "ERRO",
                    ERROR_MESSAGE
            );
            cxFreqBase.setText("");
            cxFreqBase.requestFocus();
            return;
        }

        try {
            proc.setFreqMax(Float.parseFloat(cxFreqMax.getText()));
        } catch (FreqMaxInvException fmie) {
            JOptionPane.showMessageDialog(
                    null,
                    fmie.getMessage(),
                    "ERRO",
                    ERROR_MESSAGE
            );
            cxFreqMax.setText("");
            cxFreqMax.requestFocus();
            return;
        }

        proc.setDataGarantia(cxGarantia.getText());

        String marcaAntiga = cxMarca.getText();
        String modeloAntigo = cxModelo.getText();

        dao.updateProc(proc, marcaAntiga, modeloAntigo);
        limpa();
    }

    public void consultar() {
        ProdutoDAO dao = new ProdutoDAO();

        String marca = cxMarca.getText().toUpperCase();
        String modelo = cxModelo.getText().toUpperCase();

        try {
            proc = dao.consProc(marca, modelo);

            if (proc != null) {
                cxModelo.setText(proc.getModelo());
                cxMarca.setText(proc.getMarca());
                cxAno.setText(Integer.toString(proc.getAno()));
                cxPreco.setText(Float.toString(proc.getPreco()));
                cxSocket.setText(proc.getSocketCompativel());
                cxNucleo.setText(Integer.toString(proc.getNucleo()));
                cxThreads.setText(Integer.toString(proc.getThreads()));
                cxFreqBase.setText(Float.toString(proc.getFreqBase()));
                cxFreqMax.setText(Float.toString(proc.getFreqMax()));
                cxGarantia.setText(proc.getDataGarantia());

                JOptionPane.showMessageDialog(
                        null,
                        "Verifique as informações",
                        "Consulta de Processador",
                        JOptionPane.QUESTION_MESSAGE
                );
            } else {
                JOptionPane.showMessageDialog(
                        null,
                        "Não há um Processador registrado com essa Marca e Modelo",
                        "Processador inexistente",
                        JOptionPane.INFORMATION_MESSAGE
                );
                limpa();
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(
                    null,
                    e.getMessage(),
                    "ERRO",
                    JOptionPane.ERROR_MESSAGE
            );
        }
    }

    public void excluir() {
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
                "Tem certeza que deseja remover este processador\nMarca: " + proc.getMarca() + "\nModelo: " + proc.getModelo(),
                "Confirmação de Remoção",
                JOptionPane.YES_NO_OPTION
        );

        if (confirmacao != JOptionPane.YES_OPTION) {
            return;
        }

        proc = new Processador();
        try {
            proc.setMarca(marca);
        } catch (ProcInvException pie) {
            JOptionPane.showMessageDialog(
                    null,
                    pie.getMessage(),
                    "ERRO",
                    0
            );
            cxMarca.setText("");
            cxMarca.requestFocus();
            return;
        } catch (PlacaVidInvException pvie) {
            JOptionPane.showMessageDialog(
                    null,
                    pvie.getMessage(),
                    "ERRO",
                    0
            );
        } catch (PlacaMaeInvException pmie) {
            JOptionPane.showMessageDialog(
                    null,
                    pmie.getMessage(),
                    "ERRO",
                    0
            );
        }

        try {
            proc.setModelo(modelo);
        } catch (ProcModInvException pmie) {
            JOptionPane.showMessageDialog(
                    null,
                    pmie.getMessage(),
                    "ERRO",
                    0
            );
            cxModelo.setText("");
            cxModelo.requestFocus();
            return;
        }

        if (proc != null) {
            JOptionPane.showMessageDialog(
                    null,
                    "Processador removido com sucesso!",
                    "Sucesso",
                    JOptionPane.INFORMATION_MESSAGE
            );
            dao.removeProc(proc);
            limpa();
        } else {
            JOptionPane.showMessageDialog(
                    null,
                    "Nenhum processador encontrado com a Marca e Modelo informados.",
                    "Processador Inexistente",
                    JOptionPane.ERROR_MESSAGE
            );
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAlterar;
    private javax.swing.JButton btBuscaLike;
    private javax.swing.JButton btCadastrar;
    private javax.swing.JButton btConsultar;
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btRelProc;
    private javax.swing.JButton btRemover;
    private javax.swing.JButton btVoltarMenu;
    private javax.swing.JTextField cxAno;
    private javax.swing.JTextField cxBuscaLike;
    private javax.swing.JTextField cxFreqBase;
    private javax.swing.JTextField cxFreqMax;
    private javax.swing.JTextField cxGarantia;
    private javax.swing.JTextField cxMarca;
    private javax.swing.JTextField cxModelo;
    private javax.swing.JTextField cxNucleo;
    private javax.swing.JTextField cxPreco;
    private javax.swing.JTextField cxSocket;
    private javax.swing.JTextField cxThreads;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel rtAno;
    private javax.swing.JLabel rtFreqBase;
    private javax.swing.JLabel rtFreqMax;
    private javax.swing.JLabel rtGarantia;
    private javax.swing.JLabel rtMarca;
    private javax.swing.JLabel rtModelo;
    private javax.swing.JLabel rtNucleo;
    private javax.swing.JLabel rtPreco;
    private javax.swing.JLabel rtSocket;
    private javax.swing.JLabel rtThreads;
    private javax.swing.JTable tabelaProc;
    // End of variables declaration//GEN-END:variables
}
