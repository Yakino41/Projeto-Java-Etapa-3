package view;

//NetBeans Ver 25.
//Arthur Gabriel Teotonio Stellato R.A:A2766949 ADS 2025/2
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import javax.swing.table.DefaultTableModel;
import modelo.*;
import model.dao.ProdutoDAO;

public class FormCadPlacaV extends javax.swing.JDialog {

    private PlacaDeVideo placaV;

    private static FormCadPlacaV cadPlacaVUnico;

    private FormCadPlacaV() {
        initComponents();
    }

    //MÉTODO SINGLETON
    public static FormCadPlacaV getCadPlacaV() {

        if (cadPlacaVUnico == null) {
            cadPlacaVUnico = new FormCadPlacaV();
        }
        return cadPlacaVUnico;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rtMarca = new javax.swing.JLabel();
        rtModelo = new javax.swing.JLabel();
        rtAno = new javax.swing.JLabel();
        rtPreco = new javax.swing.JLabel();
        rtMemoria = new javax.swing.JLabel();
        rtVeloVram = new javax.swing.JLabel();
        rtTipoMemoria = new javax.swing.JLabel();
        rtNumPci = new javax.swing.JLabel();
        rtSaidaVideo = new javax.swing.JLabel();
        rtGarantia = new javax.swing.JLabel();
        rtComprimento = new javax.swing.JLabel();
        rtLargura = new javax.swing.JLabel();
        rtEspessura = new javax.swing.JLabel();
        cxMarca = new javax.swing.JTextField();
        cxModelo = new javax.swing.JTextField();
        cxAno = new javax.swing.JTextField();
        cxPreco = new javax.swing.JTextField();
        cxMemoria = new javax.swing.JTextField();
        cxVeloVram = new javax.swing.JTextField();
        cxTipoRam = new javax.swing.JTextField();
        cxNumPci = new javax.swing.JTextField();
        cxSaidaVideo = new javax.swing.JTextField();
        cxGarantia = new javax.swing.JTextField();
        cxComprimento = new javax.swing.JTextField();
        cxLargura = new javax.swing.JTextField();
        cxEspessura = new javax.swing.JTextField();
        btCadastrarPlacaV = new javax.swing.JButton();
        btAlterarPlacaV = new javax.swing.JButton();
        btRelPlacaV = new javax.swing.JButton();
        btVoltarMenu = new javax.swing.JButton();
        btConsultarPlacaV = new javax.swing.JButton();
        btRemoverPlacaV = new javax.swing.JButton();
        btLimpar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaPlacaV = new javax.swing.JTable();
        btBuscaLike = new javax.swing.JButton();
        cxBuscaLike = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Gerenciamento de Placas De Video");
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

        rtMemoria.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        rtMemoria.setText("Quantidade de Memoria");

        rtVeloVram.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        rtVeloVram.setText("Velocidade Da Memoria");

        rtTipoMemoria.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        rtTipoMemoria.setText("Geração da Memoria");

        rtNumPci.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        rtNumPci.setText("Geração PCI");

        rtSaidaVideo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        rtSaidaVideo.setText("Saidas de Video");

        rtGarantia.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        rtGarantia.setText("Duração Garantia");

        rtComprimento.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        rtComprimento.setText("Comprimento");

        rtLargura.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        rtLargura.setText("Largura");

        rtEspessura.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        rtEspessura.setText("Espessura");

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

        cxMemoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxMemoriaActionPerformed(evt);
            }
        });

        cxVeloVram.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxVeloVramActionPerformed(evt);
            }
        });

        cxTipoRam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxTipoRamActionPerformed(evt);
            }
        });

        cxNumPci.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxNumPciActionPerformed(evt);
            }
        });

        cxSaidaVideo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxSaidaVideoActionPerformed(evt);
            }
        });

        cxGarantia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxGarantiaActionPerformed(evt);
            }
        });

        cxComprimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxComprimentoActionPerformed(evt);
            }
        });

        btCadastrarPlacaV.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btCadastrarPlacaV.setText("Cadastrar PlacaDeVideo");
        btCadastrarPlacaV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastrarPlacaVActionPerformed(evt);
            }
        });

        btAlterarPlacaV.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btAlterarPlacaV.setText("Alterar PlacaDeVideo");
        btAlterarPlacaV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAlterarPlacaVActionPerformed(evt);
            }
        });

        btRelPlacaV.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btRelPlacaV.setText("Exibir Relatorio Geral das Placas De Videos");
        btRelPlacaV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRelPlacaVActionPerformed(evt);
            }
        });

        btVoltarMenu.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btVoltarMenu.setText("Voltar Menu");
        btVoltarMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVoltarMenuActionPerformed(evt);
            }
        });

        btConsultarPlacaV.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btConsultarPlacaV.setText("Consultar PlacaDeVideo");
        btConsultarPlacaV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConsultarPlacaVActionPerformed(evt);
            }
        });

        btRemoverPlacaV.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btRemoverPlacaV.setText("Excluir Placa De Video");
        btRemoverPlacaV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRemoverPlacaVActionPerformed(evt);
            }
        });

        btLimpar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btLimpar.setText("Limpar Campos");
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });

        tabelaPlacaV.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
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
        tabelaPlacaV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaPlacaVMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaPlacaV);

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
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
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(rtTipoMemoria)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(cxTipoRam))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(rtVeloVram)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(cxVeloVram, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rtNumPci)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cxNumPci, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rtSaidaVideo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cxSaidaVideo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rtComprimento)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cxComprimento))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rtGarantia)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cxGarantia, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rtEspessura)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cxEspessura))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rtLargura)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cxLargura))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btAlterarPlacaV, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btCadastrarPlacaV)
                            .addComponent(rtMemoria)
                            .addComponent(btLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(44, 439, Short.MAX_VALUE)
                                .addComponent(btVoltarMenu))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btConsultarPlacaV, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btRemoverPlacaV, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cxMemoria, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(btRelPlacaV)
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
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
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
                                    .addComponent(cxPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(rtVeloVram)
                                    .addComponent(cxVeloVram, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(rtTipoMemoria)
                                    .addComponent(cxTipoRam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(rtNumPci)
                                    .addComponent(cxNumPci, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(rtSaidaVideo)
                                    .addComponent(cxSaidaVideo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rtMemoria)
                            .addComponent(cxMemoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rtComprimento)
                            .addComponent(cxComprimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rtLargura, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cxLargura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rtEspessura, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cxEspessura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rtGarantia)
                            .addComponent(cxGarantia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btCadastrarPlacaV)
                    .addComponent(btConsultarPlacaV))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btAlterarPlacaV)
                    .addComponent(btRemoverPlacaV))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btVoltarMenu)
                    .addComponent(btLimpar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btRelPlacaV)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btBuscaLike)
                        .addComponent(cxBuscaLike, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1)))
                .addGap(21, 21, 21)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
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

    private void cxMemoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxMemoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxMemoriaActionPerformed

    private void cxVeloVramActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxVeloVramActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxVeloVramActionPerformed

    private void cxTipoRamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxTipoRamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxTipoRamActionPerformed

    private void cxNumPciActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxNumPciActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxNumPciActionPerformed

    private void cxSaidaVideoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxSaidaVideoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxSaidaVideoActionPerformed

    private void cxGarantiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxGarantiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxGarantiaActionPerformed

    private void btCadastrarPlacaVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarPlacaVActionPerformed
        cadastrarPlacaV();
    }//GEN-LAST:event_btCadastrarPlacaVActionPerformed

    private void btConsultarPlacaVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsultarPlacaVActionPerformed
        consultarPlacaV();
    }//GEN-LAST:event_btConsultarPlacaVActionPerformed

    private void btVoltarMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltarMenuActionPerformed
        sair();
    }//GEN-LAST:event_btVoltarMenuActionPerformed

    private void btAlterarPlacaVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAlterarPlacaVActionPerformed
        alterarPlacaV();
    }//GEN-LAST:event_btAlterarPlacaVActionPerformed

    private void btRelPlacaVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRelPlacaVActionPerformed
        FormRelGerPlacaV.geraFormRelGerPlacaV().setVisible(true);
    }//GEN-LAST:event_btRelPlacaVActionPerformed

    private void formPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_formPropertyChange

    }//GEN-LAST:event_formPropertyChange

    private void cxComprimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxComprimentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxComprimentoActionPerformed

    private void btRemoverPlacaVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRemoverPlacaVActionPerformed
        excluirPlacaV();
    }//GEN-LAST:event_btRemoverPlacaVActionPerformed

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        limpa();
    }//GEN-LAST:event_btLimparActionPerformed

    private void tabelaPlacaVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaPlacaVMouseClicked
        selectTabPlacaV();
    }//GEN-LAST:event_tabelaPlacaVMouseClicked

    private void btBuscaLikeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscaLikeActionPerformed

        listarTabForLike(cxBuscaLike.getText().toUpperCase());

    }//GEN-LAST:event_btBuscaLikeActionPerformed

    private void cxBuscaLikeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cxBuscaLikeMouseClicked
        cxBuscaLike.setText("");
    }//GEN-LAST:event_cxBuscaLikeMouseClicked

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        listarTab();
    }//GEN-LAST:event_formWindowActivated

    public void selectTabPlacaV(){
        
        String valLinTab = "";
        
        int posLin = tabelaPlacaV.getSelectedRow();
        
        for(int col = 0; col < tabelaPlacaV.getColumnCount(); col++){
            valLinTab += tabelaPlacaV.getModel().getValueAt(posLin, col).toString();
            
            if(col+1 <tabelaPlacaV.getColumnCount()){
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

        DefaultTableModel modelo = (DefaultTableModel) tabelaPlacaV.getModel();
        modelo.setNumRows(0);
        ProdutoDAO pdao = new ProdutoDAO();
       
        for(PlacaDeVideo placaV : pdao.readPlacaV()){
            
            if (placaV != null) {
                modelo.addRow(new Object []{placaV.getMarca(), placaV.getModelo(), placaV.getAno(),
                    placaV.getPreco(), placaV.getDataGarantia()});
            }
        }
    }
    
    public void listarTabForLike(String marca){     
        DefaultTableModel modelo = (DefaultTableModel) tabelaPlacaV.getModel();
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
        cxMemoria.setText("");
        cxVeloVram.setText("");
        cxTipoRam.setText("");
        cxNumPci.setText("");
        cxSaidaVideo.setText("");
        cxComprimento.setText("");
        cxEspessura.setText("");
        cxLargura.setText("");
        cxGarantia.setText("");
        cxMarca.requestFocus();
    }

    public void cadastrarPlacaV() {

        placaV = new PlacaDeVideo();
        ProdutoDAO dao = new ProdutoDAO();

        try {
            placaV.setMarca(cxMarca.getText());
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
            cxMarca.setText("");
            cxMarca.requestFocus();
            return;
        } catch (PlacaMaeInvException pmie) {
            JOptionPane.showMessageDialog(
                    null,
                    pmie.getMessage(),
                    "ERRO",
                    ERROR_MESSAGE
            );
        }

        try {
            placaV.setModelo(cxModelo.getText());
        } catch (ProcModInvException pmie) {
            JOptionPane.showMessageDialog(
                    null,
                    pmie.getMessage(),
                    "ERRO",
                    ERROR_MESSAGE
            );
        }

        try {
            placaV.setAno(Integer.parseInt(cxAno.getText()));
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
            placaV.setPreco(Float.parseFloat(cxPreco.getText()));
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
                    ERROR_MESSAGE);
            cxPreco.setText("");
            cxPreco.requestFocus();
            return;
        }

        try {
            placaV.setMemoria(Integer.parseInt(cxMemoria.getText()));
        } catch (MemoriaInvException mie) {
            JOptionPane.showMessageDialog(
                    null,
                    mie.getMessage(),
                    "ERRO",
                    ERROR_MESSAGE
            );
            cxMemoria.setText("");
            cxMemoria.requestFocus();
            return;
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(
                    null,
                    nfe.getMessage(),
                    "ERRO",
                    ERROR_MESSAGE
            );
            cxMemoria.setText("");
            cxMemoria.requestFocus();
            return;
        }

        try {
            placaV.setVeloVram(Float.parseFloat(cxVeloVram.getText()));
        } catch (VeloVramException vve) {
            JOptionPane.showMessageDialog(
                    null,
                    vve.getMessage(),
                    "ERRO",
                    ERROR_MESSAGE
            );
            cxVeloVram.setText("");
            cxVeloVram.requestFocus();
            return;
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(
                    null,
                    "Por Favor Digite um numero positivo.",
                    "ERRO",
                    ERROR_MESSAGE
            );
            cxVeloVram.setText("");
            cxVeloVram.requestFocus();
            return;
        }

        try {
            placaV.setTipoMemoria(cxTipoRam.getText());
        } catch (TipoMenInvException tmie) {
            JOptionPane.showMessageDialog(
                    null,
                    tmie.getMessage(),
                    "ERRO",
                    ERROR_MESSAGE
            );
            cxTipoRam.setText("");
            cxTipoRam.requestFocus();
            return;
        }

        try {
            placaV.setNumPci(Float.parseFloat(cxNumPci.getText()));
        } catch (NumPciException npe) {
            JOptionPane.showMessageDialog(
                    null,
                    npe.getMessage(),
                    "ERRO",
                    ERROR_MESSAGE
            );
            cxNumPci.setText("");
            cxNumPci.requestFocus();
            return;
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(
                    null,
                    "[ERRO]Por Favor Digite um numero Fatorial Exemplo: 5.0",
                    "ERRO",
                    ERROR_MESSAGE
            );
            cxNumPci.setText("");
            cxNumPci.requestFocus();
            return;
        }

        placaV.setSaidaVideo(cxNumPci.getText());

        try {
            placaV.getDime().setComprimento(Float.parseFloat(cxComprimento.getText()));
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(
                    null,
                    "[ERRO]Por Favor Digite um numero Flutuante EX: 333.1 = 33.11CM",
                    "ERRO",
                    ERROR_MESSAGE
            );
            cxComprimento.setText("");
            cxComprimento.requestFocus();
            return;
        }

        try {
            placaV.getDime().setLargura(Float.parseFloat(cxLargura.getText()));
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(
                    null,
                    "[ERRO]Por Favor Digite um numero Flutuante EX: 333.1 = 33.11CM",
                    "ERRO",
                    ERROR_MESSAGE
            );
            cxLargura.setText("");
            cxLargura.requestFocus();
            return;
        }

        try {
            placaV.getDime().setEspessura(Float.parseFloat(cxEspessura.getText()));
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(
                    null,
                    "[ERRO]Por Favor Digite um numero Flutuante EX: 333.1 = 33.11CM",
                    "ERRO",
                    ERROR_MESSAGE
            );
            cxEspessura.setText("");
            cxEspessura.requestFocus();
            return;
        }

        placaV.setDataGarantia(cxGarantia.getText());

        JOptionPane.showMessageDialog(
                null,
                "Placa De Video Cadastrada Com Sucesso!",
                "Cadastro de Placa De Video",
                1
        );

        dao.createPlacaV(placaV);
        limpa();
    }

    public void alterarPlacaV() {
        ProdutoDAO dao = new ProdutoDAO();

        try {
            placaV.setMarca(cxMarca.getText());
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
            cxMarca.setText("");
            cxMarca.requestFocus();
            return;
        } catch (PlacaMaeInvException pmie) {
            JOptionPane.showMessageDialog(
                    null,
                    pmie.getMessage(),
                    "ERRO",
                    ERROR_MESSAGE
            );
        }

        try {
            placaV.setModelo(cxModelo.getText());
        } catch (ProcModInvException pmie) {
            JOptionPane.showMessageDialog(
                    null,
                    pmie.getMessage(),
                    "ERRO",
                    ERROR_MESSAGE
            );
        }

        try {
            placaV.setAno(Integer.parseInt(cxAno.getText()));
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
            placaV.setPreco(Float.parseFloat(cxPreco.getText()));
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
                    ERROR_MESSAGE);
            cxPreco.setText("");
            cxPreco.requestFocus();
            return;
        }

        try {
            placaV.setMemoria(Integer.parseInt(cxMemoria.getText()));
        } catch (MemoriaInvException mie) {
            JOptionPane.showMessageDialog(
                    null,
                    mie.getMessage(),
                    "ERRO",
                    ERROR_MESSAGE
            );
            cxMemoria.setText("");
            cxMemoria.requestFocus();
            return;
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(
                    null,
                    nfe.getMessage(),
                    "ERRO",
                    ERROR_MESSAGE
            );
            cxMemoria.setText("");
            cxMemoria.requestFocus();
            return;
        }

        try {
            placaV.setVeloVram(Float.parseFloat(cxVeloVram.getText()));
        } catch (VeloVramException vve) {
            JOptionPane.showMessageDialog(
                    null,
                    vve.getMessage(),
                    "ERRO",
                    ERROR_MESSAGE
            );
            cxVeloVram.setText("");
            cxVeloVram.requestFocus();
            return;
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(
                    null,
                    "Por Favor Digite um numero positivo.",
                    "ERRO",
                    ERROR_MESSAGE
            );
            cxVeloVram.setText("");
            cxVeloVram.requestFocus();
            return;
        }

        try {
            placaV.setTipoMemoria(cxTipoRam.getText());
        } catch (TipoMenInvException tmie) {
            JOptionPane.showMessageDialog(
                    null,
                    tmie.getMessage(),
                    "ERRO",
                    ERROR_MESSAGE
            );
            cxTipoRam.setText("");
            cxTipoRam.requestFocus();
            return;
        }

        try {
            placaV.setNumPci(Float.parseFloat(cxNumPci.getText()));
        } catch (NumPciException npe) {
            JOptionPane.showMessageDialog(
                    null,
                    npe.getMessage(),
                    "ERRO",
                    ERROR_MESSAGE
            );
            cxNumPci.setText("");
            cxNumPci.requestFocus();
            return;
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(
                    null,
                    "[ERRO]Por Favor Digite um numero Fatorial Exemplo: 5.0",
                    "ERRO",
                    ERROR_MESSAGE
            );
            cxNumPci.setText("");
            cxNumPci.requestFocus();
            return;
        }

        placaV.setSaidaVideo(cxSaidaVideo.getText());

        try {
            placaV.getDime().setComprimento(Float.parseFloat(cxComprimento.getText()));
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(
                    null,
                    "[ERRO]Por Favor Digite um numero Flutuante EX: 333.1 = 33.11CM",
                    "ERRO",
                    ERROR_MESSAGE
            );
            cxComprimento.setText("");
            cxComprimento.requestFocus();
            return;
        }

        try {
            placaV.getDime().setLargura(Float.parseFloat(cxLargura.getText()));
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(
                    null,
                    "[ERRO]Por Favor Digite um numero Flutuante EX: 333.1 = 33.11CM",
                    "ERRO",
                    ERROR_MESSAGE
            );
            cxLargura.setText("");
            cxLargura.requestFocus();
            return;
        }

        try {
            placaV.getDime().setEspessura(Float.parseFloat(cxEspessura.getText()));
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(
                    null,
                    "[ERRO]Por Favor Digite um numero Flutuante EX: 333.1 = 33.11CM",
                    "ERRO",
                    ERROR_MESSAGE
            );
            cxEspessura.setText("");
            cxEspessura.requestFocus();
            return;
        }

        String marcaAntiga = cxMarca.getText();
        String modeloAntigo = cxModelo.getText();

        dao.updatePlacaV(placaV, marcaAntiga, modeloAntigo);
        limpa();

    }

    public void consultarPlacaV() {
        ProdutoDAO dao = new ProdutoDAO();
        String marca = cxMarca.getText().toUpperCase();
        String modelo = cxModelo.getText().toUpperCase();

        try {
            // NÃO crie o objeto antes
            placaV = dao.consPlacaV(marca, modelo);

            if (placaV != null) {
                cxModelo.setText(placaV.getModelo());
                cxMarca.setText(placaV.getMarca());
                cxAno.setText(Integer.toString(placaV.getAno()));
                cxPreco.setText(Float.toString(placaV.getPreco()));
                cxMemoria.setText(Integer.toString(placaV.getMemoria()));
                cxVeloVram.setText(Float.toString(placaV.getVeloVram()));
                cxTipoRam.setText(placaV.getTipoMemoria());
                cxNumPci.setText(Float.toString(placaV.getNumPci()));
                cxSaidaVideo.setText(placaV.getSaidaVideo());
                cxComprimento.setText(Float.toString(placaV.getDime().getComprimento()));
                cxLargura.setText(Float.toString(placaV.getDime().getLargura()));
                cxEspessura.setText(Float.toString(placaV.getDime().getEspessura()));
                cxGarantia.setText(placaV.getDataGarantia());

                JOptionPane.showMessageDialog(
                        null,
                        "Verifique as informações",
                        "Consulta de Placa de Vídeo",
                        JOptionPane.QUESTION_MESSAGE
                );
            } else {
                JOptionPane.showMessageDialog(
                        null,
                        "Não há uma Placa de Vídeo registrada com essa Marca e Modelo",
                        "Placa de Vídeo inexistente",
                        JOptionPane.WARNING_MESSAGE
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

    public void excluirPlacaV() {

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
                "Tem certeza que deseja remover esta Placa De Video\nMarca: " + placaV.getMarca() + "\nModelo: " + placaV.getModelo(), // Mensagem genérica
                "Confirmação de Remoção",
                JOptionPane.YES_NO_OPTION
        );

        if (confirmacao != JOptionPane.YES_OPTION) {
            return;
        }
        
        try {
            placaV.setMarca(marca.toLowerCase());
            placaV.setModelo(modelo.toUpperCase());
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

        if (placaV != null) {
            JOptionPane.showMessageDialog(
                    null,
                    "Placa De Video removida com sucesso!",
                    "Sucesso",
                    JOptionPane.INFORMATION_MESSAGE
            );
            dao.removePlacaV(placaV);
            limpa();
        } else {
            JOptionPane.showMessageDialog(
                    null,
                    "Nenhuma Placa De Video encontrada com a Marca e Modelo informados.",
                    "Placa De Video Inexistente",
                    JOptionPane.ERROR_MESSAGE
            );
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAlterarPlacaV;
    private javax.swing.JButton btBuscaLike;
    private javax.swing.JButton btCadastrarPlacaV;
    private javax.swing.JButton btConsultarPlacaV;
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btRelPlacaV;
    private javax.swing.JButton btRemoverPlacaV;
    private javax.swing.JButton btVoltarMenu;
    private javax.swing.JTextField cxAno;
    private javax.swing.JTextField cxBuscaLike;
    private javax.swing.JTextField cxComprimento;
    private javax.swing.JTextField cxEspessura;
    private javax.swing.JTextField cxGarantia;
    private javax.swing.JTextField cxLargura;
    private javax.swing.JTextField cxMarca;
    private javax.swing.JTextField cxMemoria;
    private javax.swing.JTextField cxModelo;
    private javax.swing.JTextField cxNumPci;
    private javax.swing.JTextField cxPreco;
    private javax.swing.JTextField cxSaidaVideo;
    private javax.swing.JTextField cxTipoRam;
    private javax.swing.JTextField cxVeloVram;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel rtAno;
    private javax.swing.JLabel rtComprimento;
    private javax.swing.JLabel rtEspessura;
    private javax.swing.JLabel rtGarantia;
    private javax.swing.JLabel rtLargura;
    private javax.swing.JLabel rtMarca;
    private javax.swing.JLabel rtMemoria;
    private javax.swing.JLabel rtModelo;
    private javax.swing.JLabel rtNumPci;
    private javax.swing.JLabel rtPreco;
    private javax.swing.JLabel rtSaidaVideo;
    private javax.swing.JLabel rtTipoMemoria;
    private javax.swing.JLabel rtVeloVram;
    private javax.swing.JTable tabelaPlacaV;
    // End of variables declaration//GEN-END:variables
}
