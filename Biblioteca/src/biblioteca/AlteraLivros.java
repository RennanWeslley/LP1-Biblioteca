package biblioteca;

import java.util.LinkedList;
import javax.swing.JOptionPane;

public class AlteraLivros extends javax.swing.JInternalFrame {

    public AlteraLivros() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jRadioButton5 = new javax.swing.JRadioButton();
        jRadioButton6 = new javax.swing.JRadioButton();
        jRadioButton7 = new javax.swing.JRadioButton();
        jRadioButton8 = new javax.swing.JRadioButton();
        jLabel11 = new javax.swing.JLabel();
        jRadioButton2 = new javax.swing.JRadioButton();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox1 = new javax.swing.JComboBox<>();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jFormattedTextField2 = new javax.swing.JFormattedTextField();
        jFormattedTextField3 = new javax.swing.JFormattedTextField();
        jFormattedTextField4 = new javax.swing.JFormattedTextField();
        jFormattedTextField5 = new javax.swing.JFormattedTextField();
        jFormattedTextField6 = new javax.swing.JFormattedTextField();
        jFormattedTextField7 = new javax.swing.JFormattedTextField();
        jFormattedTextField8 = new javax.swing.JFormattedTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jFormattedTextField9 = new javax.swing.JFormattedTextField();
        jCheckBox1 = new javax.swing.JCheckBox();
        jRadioButton9 = new javax.swing.JRadioButton();
        jRadioButton10 = new javax.swing.JRadioButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jFormattedTextField10 = new javax.swing.JFormattedTextField();
        jFormattedTextField11 = new javax.swing.JFormattedTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jFormattedTextField12 = new javax.swing.JFormattedTextField();
        jLabel18 = new javax.swing.JLabel();
        jFormattedTextField13 = new javax.swing.JFormattedTextField();
        jLabel19 = new javax.swing.JLabel();
        jFormattedTextField14 = new javax.swing.JFormattedTextField();
        jLabel20 = new javax.swing.JLabel();
        jFormattedTextField15 = new javax.swing.JFormattedTextField();
        jPanel2 = new javax.swing.JPanel();

        setClosable(true);
        setMaximizable(true);
        setResizable(true);

        jLabel1.setText("Título: ");

        jLabel2.setText("Autor:");

        jLabel5.setText("Mídia:");

        jLabel6.setText("Editora:");

        jLabel7.setText("Ano:");

        jLabel3.setText("Idioma:");

        jLabel4.setText("Qtde. Exemplares:");

        jRadioButton5.setText("Física");

        jRadioButton6.setText("Digital");

        jRadioButton7.setText("Áudio");

        jRadioButton8.setText("Áudio/Visual");

        jLabel11.setText("Nacionalidade:");

        jRadioButton2.setText("Periódico");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        jComboBox2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Matemática", "Física", "Biologia", "História", "Geografia", "Informática", "Inglês", "Português", "Espanhol", "Outro" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        jComboBox1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ação", "Aventura", "Contos", "Drama", "Romance", "Horror ", "Humor", "Outro" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jRadioButton4.setText("Entretenimento");
        jRadioButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton4ActionPerformed(evt);
            }
        });

        jRadioButton1.setText("Informativo");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        jRadioButton3.setText("Acadêmico");
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });

        jLabel8.setText("Tipo:");

        jLabel9.setText("Gênero:");

        jLabel10.setText("Outro:");

        jButton1.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jButton1.setText("Aplicar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jButton2.setText("Consultar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel12.setText("Remover");

        jLabel13.setText("Qtde. à Excluir:");

        jCheckBox1.setText("Todos");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        jRadioButton9.setText("Alterar");
        jRadioButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton9ActionPerformed(evt);
            }
        });

        jRadioButton10.setText("Remover");
        jRadioButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton10ActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel14.setText("Escolha a Opção:");

        jLabel15.setText("2º Autor:");

        jLabel16.setText("2ª Nacionalidade:");

        jLabel17.setText("3º Autor:");

        jLabel18.setText("3ª Nacionalidade:");

        jLabel19.setText("4º Autor:");

        jLabel20.setText("4ª Nacionalidade:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(114, 114, 114))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jFormattedTextField8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jRadioButton9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jRadioButton10)
                                .addContainerGap())))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 282, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jFormattedTextField4)
                                            .addComponent(jFormattedTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel4)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jFormattedTextField7))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel7)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jFormattedTextField5))))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jRadioButton5)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jRadioButton6)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jRadioButton7)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jRadioButton8))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jFormattedTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jFormattedTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jFormattedTextField1, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jRadioButton3)
                                        .addGap(13, 13, 13)
                                        .addComponent(jRadioButton4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jRadioButton1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jRadioButton2))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel13)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jFormattedTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jCheckBox1)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel19))
                                        .addGap(5, 5, 5)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jFormattedTextField12, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
                                            .addComponent(jFormattedTextField14)
                                            .addComponent(jFormattedTextField10)))
                                    .addComponent(jLabel15))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel18)
                                    .addComponent(jLabel16)
                                    .addComponent(jLabel20))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jFormattedTextField13, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                                    .addComponent(jFormattedTextField11)
                                    .addComponent(jFormattedTextField15))))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jFormattedTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jFormattedTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(jFormattedTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jFormattedTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFormattedTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jFormattedTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFormattedTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(jFormattedTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFormattedTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton5)
                    .addComponent(jRadioButton6)
                    .addComponent(jRadioButton7)
                    .addComponent(jRadioButton8)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jFormattedTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFormattedTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jFormattedTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jFormattedTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jRadioButton3)
                    .addComponent(jRadioButton4)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jFormattedTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(jRadioButton9)
                    .addComponent(jRadioButton10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jFormattedTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(314, 314, 314))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //Modificando a aparência do Internal Frame de acordo com o jRadioButton escolhido.
    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
        jLabel10.setText("Outro:");
        jFormattedTextField8.setEnabled(false);
        jFormattedTextField8.setText("");
        jLabel9.setVisible(true);
        jLabel9.setText("Área:");
        jComboBox1.setVisible(false);
        jComboBox2.setVisible(true);
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void jRadioButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton4ActionPerformed
        jLabel10.setText("Outro:");
        jFormattedTextField8.setEnabled(false);
        jFormattedTextField8.setText("");
        jLabel9.setVisible(true);
        jLabel9.setText("Gênero:");
        jComboBox1.setVisible(true);
        jComboBox2.setVisible(false);
    }//GEN-LAST:event_jRadioButton4ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        jLabel10.setText("Assunto:");
        jFormattedTextField8.setEnabled(true);
        jFormattedTextField8.setText("");
        jLabel9.setVisible(false);
        jComboBox1.setVisible(false);
        jComboBox2.setVisible(false);
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        jLabel10.setText("Area:");
        jFormattedTextField8.setEnabled(true);
        jFormattedTextField8.setText("");
        jLabel9.setVisible(false);
        jComboBox1.setVisible(false);
        jComboBox2.setVisible(false);
    }//GEN-LAST:event_jRadioButton2ActionPerformed
    //Fim da modificação da aparência do InternalFrame.
    
    //Método executado caso o botão APLICAR seja pressionado.
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        
        //Verificando se algum campo está em branco.
        if(!(jFormattedTextField1.getText().equals("") || jFormattedTextField2.getText().equals("") || jFormattedTextField3.getText().equals("")
                || jFormattedTextField7.getText().equals("") || jFormattedTextField6.getText().equals("") || jFormattedTextField4.getText().equals("")
                || jFormattedTextField5.getText().equals("") || comboBoxEntAux() || comboBoxAcaAux())) {
            //Se o RadioButton ALTERAR estiver marcado..
            if(jRadioButton9.isSelected()) {
                try {
                    Sistema.checaNum(jFormattedTextField7.getText());//Verifica se alguma letra foi digitada no campo QTDE.
                    Sistema.checaNum(jFormattedTextField5.getText());//Verifica se alguma letra foi digitada no campo ANO.
                    Sistema.checaAno(jFormattedTextField5.getText());//Verifica se foi digitado um ano de 4 dígitos.
                    Sistema.checaInt(Double.parseDouble(jFormattedTextField7.getText()));//Verifica se o número digitado no campo QTDE é inteiro e positivo.
                    Sistema.checaInt(Double.parseDouble(jFormattedTextField5.getText()));//Verifica se o número digitado no campo ANO é inteiro e positivo.
                }
                catch(NumberFormatException e) {
                    JOptionPane.showMessageDialog(AlteraLivros.this, "Valor inválido, apenas números "
                            + "são permitidos no campo quantidade, digite novamente com números desta vez.", 
                            "Oops!!", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                catch(NumeroInteiroException e) {
                    JOptionPane.showMessageDialog(AlteraLivros.this, e.getMessage() + " Preencha os campos ANO e QTDE EXEMPLARES corretamente.",
                            "Oops!!", JOptionPane.ERROR_MESSAGE);

                    return;
                }
                catch(AnoException e) {
                    JOptionPane.showMessageDialog(AlteraLivros.this, e.getMessage(), "Oops!!", 
                            JOptionPane.ERROR_MESSAGE);
                    return;
                }
                if(checaAutores()) {
                    //AuxAutor verifica se os campos AUTOR e NACIONALIDADE estão preenchidos ao mesmo tempo.
                    if(auxAutor()) {
                        JOptionPane.showMessageDialog(AlteraLivros.this, "Preencha corretamente os atributos 1º autor", 
                                "Oops!!", JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                    if(auxAutor2()) {
                        JOptionPane.showMessageDialog(AlteraLivros.this, "Preencha corretamente os atributos 2º autor", 
                                "Oops!!", JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                    if(auxAutor3()) {
                        JOptionPane.showMessageDialog(AlteraLivros.this, "Preencha corretamente os atributos 3º autor", 
                                "Oops!!", JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                    if(auxAutor4()) {
                        JOptionPane.showMessageDialog(AlteraLivros.this, "Preencha corretamente os atributos 4º autor", 
                                "Oops!!", JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                    
                    Livro livro = null;
                    //Iniciando o objeto de acordo com o RadioButton selecionado.
                    if(jRadioButton3.isSelected())
                        livro = new LivroAcademico(jFormattedTextField1.getText(), jFormattedTextField2.getText(), jFormattedTextField3.getText(),
                                jFormattedTextField10.getText(), jFormattedTextField11.getText(), jFormattedTextField12.getText(),
                                jFormattedTextField13.getText(), jFormattedTextField14.getText(), jFormattedTextField15.getText(),
                                Integer.parseInt(jFormattedTextField7.getText()), jFormattedTextField6.getText(), radioButtonControl(), 
                                jFormattedTextField4.getText(), jFormattedTextField5.getText(), comboBoxAca());
                    else if(jRadioButton4.isSelected())
                        livro = new LivroEntretenimento(jFormattedTextField1.getText(), jFormattedTextField2.getText(), jFormattedTextField3.getText(),
                                jFormattedTextField10.getText(), jFormattedTextField11.getText(), jFormattedTextField12.getText(),
                                jFormattedTextField13.getText(), jFormattedTextField14.getText(), jFormattedTextField15.getText(),
                                Integer.parseInt(jFormattedTextField7.getText()), jFormattedTextField6.getText(), radioButtonControl(), 
                                jFormattedTextField4.getText(), jFormattedTextField5.getText(), comboBoxEnt());
                    else if(jRadioButton1.isSelected())
                        livro = new LivroInformativo(jFormattedTextField1.getText(), jFormattedTextField2.getText(), jFormattedTextField3.getText(),
                                jFormattedTextField10.getText(), jFormattedTextField11.getText(), jFormattedTextField12.getText(),
                                jFormattedTextField13.getText(), jFormattedTextField14.getText(), jFormattedTextField15.getText(),
                                Integer.parseInt(jFormattedTextField7.getText()), jFormattedTextField6.getText(), radioButtonControl(), 
                                jFormattedTextField4.getText(), jFormattedTextField5.getText(), jFormattedTextField8.getText());
                    else if(jRadioButton2.isSelected())
                        livro = new LivroPeriodico(jFormattedTextField1.getText(), jFormattedTextField2.getText(), jFormattedTextField3.getText(),
                                jFormattedTextField10.getText(), jFormattedTextField11.getText(), jFormattedTextField12.getText(),
                                jFormattedTextField13.getText(), jFormattedTextField14.getText(), jFormattedTextField15.getText(),
                                Integer.parseInt(jFormattedTextField7.getText()), jFormattedTextField6.getText(), radioButtonControl(), 
                                jFormattedTextField4.getText(), jFormattedTextField5.getText(), jFormattedTextField8.getText());
                    
                    if(Sistema.checaIgualdade(livro)) {
                        //Caso esteja cadastrado, apenas incrementa a qtde de exemplares de acordo com o valor digitado pelo usuário.
                        Sistema.removeLivroAux();
                        Sistema.cadastraLivroIgual(Integer.parseInt(jFormattedTextField7.getText()),AlteraLivros.this);
                        zeraCampos();
                        controle();
                        return;
                    }
                    
                    Sistema.alteraLivro(livro);
                    
                    JOptionPane.showMessageDialog(AlteraLivros.this, "Livro alterado com sucesso.", 
                            "Done!!", JOptionPane.INFORMATION_MESSAGE);

                    zeraCampos();
                    controle();
                }
                else 
                    JOptionPane.showMessageDialog(AlteraLivros.this, "Preencha os campos AUTOR e NACIONALIDADE!!", "Oops!!", JOptionPane.ERROR_MESSAGE);
            }
            //Se o RadioButton REMOVER estiver marcado
            else if(jRadioButton10.isSelected()) {
                if(!(jFormattedTextField9.getText().equals("") && !jCheckBox1.isSelected())) {
                    if(jCheckBox1.isSelected()) {
                        //Se estiver marcada, remove o livro diretamente do LinkedList livro.
                        Sistema.removeLivro();
                        JOptionPane.showMessageDialog(AlteraLivros.this, "Todos os exemplares foram removidos com sucesso.",
                            "Done!!", JOptionPane.INFORMATION_MESSAGE);
                        controle();
                    }
                    else {
                        //Se a CheckBox não tiver marcada, veirifica se o texto digitado em EXEMPLARES À REMOVER é um inteiro positivo.
                        try {
                            Sistema.checaNum(jFormattedTextField9.getText());//Verifica se alguma letra foi digitada no campo EXEMPLARES À REMOVER.
                            Sistema.checaInt(Double.parseDouble(jFormattedTextField9.getText()));//Verifica se o número digitado no campo EXEMPLARES À REMOVER é inteiro e positivo.
                        }
                        catch(NumberFormatException e) {
                            JOptionPane.showMessageDialog(AlteraLivros.this, "Valor inválido, apenas números "
                                    + "são permitidos no campo quantidade, digite novamente com números desta vez.", 
                                    "Oops!!", JOptionPane.ERROR_MESSAGE);
                            return;
                        }
                        catch(NumeroInteiroException e) {
                            JOptionPane.showMessageDialog(AlteraLivros.this, e.getMessage() + " Preencha o campo EXEMPLARES À REMOVER corretamente.",
                                    "Oops!!", JOptionPane.ERROR_MESSAGE);

                            return;
                        }

                        //Se o valor digitado for menor que a quantidade de exemplares do livro, apenas decrementa-se a Qtde.
                        if(Integer.parseInt(jFormattedTextField9.getText()) < livro.get(Sistema.j).getQtde()) {
                            if(Integer.parseInt(jFormattedTextField9.getText()) < 0)
                                JOptionPane.showMessageDialog(AlteraLivros.this, "Digite um valor maior do que ZERO e menor do que"
                                        + " (" + livro.get(Sistema.j).getQtde() + ").", "Oops!!", JOptionPane.ERROR_MESSAGE);
                            livro.get(Sistema.j).setQtde(livro.get(Sistema.j).getQtde() - Integer.parseInt(jFormattedTextField9.getText()));
                            JOptionPane.showMessageDialog(AlteraLivros.this, jFormattedTextField9.getText() + " exemplares foram removidos com sucesso.",
                                    "Done!!", JOptionPane.INFORMATION_MESSAGE);
                            controle();
                        }
                        //Se o valor for igual à Qtde de livros, remove-se o livro diretamente do LinkedList livro.
                        else if(Integer.parseInt(jFormattedTextField9.getText()) == livro.get(Sistema.j).getQtde()) {
                            Sistema.removeLivro();
                            JOptionPane.showMessageDialog(AlteraLivros.this, "Todos os exemplares foram removidos com sucesso.",
                                    "Done!!", JOptionPane.INFORMATION_MESSAGE);
                            controle();
                        }
                        //Se o valor for maior que a Qtde de livros, exibe-se a mensagem de erro e aborta o método.
                        else if(Integer.parseInt(jFormattedTextField9.getText()) > livro.get(Sistema.j).getQtde())
                            JOptionPane.showMessageDialog(AlteraLivros.this, "Digite um valor menor ou igual à quantidade "
                                    + "de exemplares do livro. (" + livro.get(Sistema.j).getQtde() + ").",
                                    "Oops!!", JOptionPane.ERROR_MESSAGE);
                    }
                    zeraCampos();
                    controle();
                }
                else
                    JOptionPane.showMessageDialog(AlteraLivros.this, "Preencha o campo QTDE. À EXCLUIR!", "Oops!!", JOptionPane.ERROR_MESSAGE);
            }
        }
        else
            JOptionPane.showMessageDialog(AlteraLivros.this, "Preencha todos os campos!!", "Oops!!", JOptionPane.ERROR_MESSAGE);
        
    }//GEN-LAST:event_jButton1ActionPerformed
    
    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        //Se o campo OUTRO do ComboBox for selecionado, o Campo de Texto número 11 fica editável.
        if(jComboBox1.getSelectedIndex() == 7)
            jFormattedTextField8.setEnabled(true);
        else {
            jFormattedTextField8.setEnabled(false);
            jFormattedTextField8.setText("");
        }
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        //Se o campo OUTRO do ComboBox for selecionado, o Campo de Text número 11 fica editável.
        if(jComboBox2.getSelectedIndex() == 9)
            jFormattedTextField8.setEnabled(true);
        else {
            jFormattedTextField8.setEnabled(false);
            jFormattedTextField8.setText("");
        }
    }//GEN-LAST:event_jComboBox2ActionPerformed

    //Método executado caso o botão CONSULTAR seja pressionado.
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        //Verifica se algum dos campos necessários está vazio.
        if(!(jFormattedTextField1.getText().equals("") || jFormattedTextField2.getText().equals("") || jFormattedTextField4.getText().equals("")
                || jFormattedTextField5.getText().equals("") || jFormattedTextField6.getText().equals(""))) {
            try {
                    Sistema.checaNum(jFormattedTextField5.getText());//Verifica se alguma letra foi digitada no campo QTDE.
                    Sistema.checaInt(Double.parseDouble(jFormattedTextField5.getText()));//Verifica se o número digitado no campo QTDE é inteiro e positivo.
                }
            catch(NumberFormatException e) {
                    JOptionPane.showMessageDialog(AlteraLivros.this, "Valor inválido, apenas números "
                            + "são permitidos no campo quantidade, digite novamente com números desta vez.", 
                            "Oops!!", JOptionPane.ERROR_MESSAGE);
                    return;
            }
            catch(NumeroInteiroException e) {
                    JOptionPane.showMessageDialog(AlteraLivros.this, e.getMessage() + " Preencha os campos ANO e QTDE EXEMPLARES corretamente.",
                            "Oops!!", JOptionPane.ERROR_MESSAGE);

                    return;
            }
            
            //Verifica se algum livro foi encontrado.
            if(Sistema.consultaAltera(jFormattedTextField1.getText(), jFormattedTextField2.getText(), jFormattedTextField10.getText(),
                    jFormattedTextField12.getText(), jFormattedTextField14.getText(), jFormattedTextField4.getText(), 
                    jFormattedTextField5.getText(), jFormattedTextField6.getText())) {
                setaCampos(true); //Deixando os campos editáveis.
                exibeCampos(livro.get(Sistema.j)); //Setando o texto dos TextFields com as informações do livro encontrado.
                jButton2.setEnabled(false); //Desabilitando botão ALTERAR.
                
                JOptionPane.showMessageDialog(AlteraLivros.this, "Livro encontrado!!", "Done!!", JOptionPane.INFORMATION_MESSAGE);
            }
            else
                JOptionPane.showMessageDialog(AlteraLivros.this, "Nenhum livro foi encontrado, verifique se as "
                        + "informações estão corretas.", "Oops!!", JOptionPane.ERROR_MESSAGE);
        }
        else
            JOptionPane.showMessageDialog(AlteraLivros.this, "Preencha TODOS os campos editáveis.", "Oops!!", JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        //Verificando se a CheckBox TODOS está marcada.
        if(jCheckBox1.isSelected()) {
            jFormattedTextField9.setEnabled(false);
            jFormattedTextField9.setText("");
        }
        else {
            jFormattedTextField9.setEnabled(true);
            jFormattedTextField9.setText("");
        }
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jRadioButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton10ActionPerformed
        jFormattedTextField9.setEnabled(true);
        jCheckBox1.setEnabled(true);
    }//GEN-LAST:event_jRadioButton10ActionPerformed

    private void jRadioButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton9ActionPerformed
        jFormattedTextField9.setEnabled(false);
        jFormattedTextField9.setText("");
        jCheckBox1.setEnabled(false);
        jCheckBox1.setSelected(false);
    }//GEN-LAST:event_jRadioButton9ActionPerformed
    
    //Método usado para pegar o texto do jRadioButton selecionado pelo usuário, para iniciar o objeto.
    public String radioButtonControl() {
        javax.swing.JRadioButton jButton = null;
        
        if(jRadioButton5.isSelected())
            jButton = jRadioButton5;
        else if(jRadioButton6.isSelected())
            jButton = jRadioButton6;
        else if(jRadioButton7.isSelected())
            jButton = jRadioButton7;
        else if(jRadioButton8.isSelected())
            jButton = jRadioButton8;
        
        return jButton.getText();
    }
    
    //Apaga o texto de todos os TextFields.
    public void zeraCampos() {
        jFormattedTextField1.setText("");
        jFormattedTextField2.setText("");
        jFormattedTextField3.setText("");
        jFormattedTextField4.setText("");
        jFormattedTextField5.setText("");
        jFormattedTextField6.setText("");
        jFormattedTextField7.setText("");
        jFormattedTextField8.setText("");
        jFormattedTextField9.setText("");
        jFormattedTextField10.setText("");
        jFormattedTextField11.setText("");
        jFormattedTextField12.setText("");
        jFormattedTextField13.setText("");
        jFormattedTextField14.setText("");
        jFormattedTextField15.setText("");
    }
    
    //Método que verifica se o campo AUTOR e o campo NACIONALIDADE está respectivamente preenchido.
    public boolean auxAutor() {
        if((jFormattedTextField2.getText().equals("") && jFormattedTextField3.getText().equals("")) 
            || (jFormattedTextField2.getText().equals("") && !jFormattedTextField3.getText().equals("")))
            return true;
        else
            return false;
    }
    
    public boolean auxAutor2() {
        if((!jFormattedTextField10.getText().equals("") && jFormattedTextField11.getText().equals("")) 
            || (jFormattedTextField10.getText().equals("") && !jFormattedTextField11.getText().equals("")))
            return true;
        else
            return false;
    }
    
    public boolean auxAutor3() {
        if((!jFormattedTextField12.getText().equals("") && jFormattedTextField13.getText().equals("")) 
            || (jFormattedTextField12.getText().equals("") && !jFormattedTextField13.getText().equals("")))
            return true;
        else
            return false;
    }
    
    public boolean auxAutor4() {
        if((!jFormattedTextField14.getText().equals("") && jFormattedTextField15.getText().equals("")) 
            || (jFormattedTextField14.getText().equals("") && !jFormattedTextField15.getText().equals("")))
            return true;
        else
            return false;
    }
    //FIM DOS AUXAUTOR.
    
    //Método que verifica se os campos AUTOR e NACIONALIDADE estão preenchidos.
    public boolean checaAutores() {
        int num = 0;
        
        if(!jFormattedTextField2.getText().equals(""))
            num++;
        if(!jFormattedTextField10.getText().equals(""))
            num++;
        if(!jFormattedTextField12.getText().equals(""))
            num++;
        if(!jFormattedTextField14.getText().equals(""))
            num++;
        if(!jFormattedTextField3.getText().equals(""))
            num++;
        if(!jFormattedTextField11.getText().equals(""))
            num++;
        if(!jFormattedTextField13.getText().equals(""))
            num++;
        if(!jFormattedTextField15.getText().equals(""))
            num++;
        
        /*Por se tratar de um par (NOME e NACIONALIDADE do Autor), se os campos estiverem preenchidos corretamente,
        a soma sempre resultará em um número par. Porém, este número tem que ser diferente de zero, pois do contrário,
        siginifica que nenhum dos campos dos Autores foram preenchidos.*/
        if(num % 2 == 0 && num != 0)
            return true;
        else
            return false;
    }
    
    //Retorna a string de acordo com a opção escolhida no ComboBox, para iniciar o objeto.
    public String comboBoxEnt() {
        String texto = null;
        
        if(jComboBox1.getSelectedIndex() == 0)
            texto = "Ação";
        else if(jComboBox1.getSelectedIndex() == 1)
            texto = "Aventura";
        else if(jComboBox1.getSelectedIndex() == 2)
            texto = "Contos";
        else if(jComboBox1.getSelectedIndex() == 3)
            texto = "Drama";
        else if(jComboBox1.getSelectedIndex() == 4)
            texto = "Romance";
        else if(jComboBox1.getSelectedIndex() == 5)
            texto = "Horror";
        else if(jComboBox1.getSelectedIndex() == 6)
            texto = "Humor";
        else if(jComboBox1.getSelectedIndex() == 7)
            texto = jFormattedTextField8.getText();
        
        return texto;
    }
    
    /*Método utilizado para impedir que o usuário deixe o campo em branco, 
    caso tenha escolhido a opção OUTRO do ComboBox.*/
    public boolean comboBoxEntAux() {
        if(jComboBox1.getSelectedIndex() == 7 && jFormattedTextField8.getText().equals(""))
            return true;
        else
            return false;
    }
    
    //Retorna a string de acordo com a opção escolhida no ComboBox, para iniciar o objeto.
    public String comboBoxAca() {
        String texto = null;
        
        if(jComboBox2.getSelectedIndex() == 0)
            texto = "Matemática";
        else if(jComboBox2.getSelectedIndex() == 1)
            texto = "Física";
        else if(jComboBox2.getSelectedIndex() == 2)
            texto = "Biologia";
        else if(jComboBox2.getSelectedIndex() == 3)
            texto = "História";
        else if(jComboBox2.getSelectedIndex() == 4)
            texto = "Geografia";
        else if(jComboBox2.getSelectedIndex() == 5)
            texto = "Informática";
        else if(jComboBox2.getSelectedIndex() == 6)
            texto = "Inglês";
        else if(jComboBox2.getSelectedIndex() == 7)
            texto = "Português";
        else if(jComboBox2.getSelectedIndex() == 8)
            texto = "Espanhol";
        else if(jComboBox2.getSelectedIndex() == 9)
            texto = jFormattedTextField8.getText();
        
        return texto;
    }
    
    /*Método utilizado para impedir que o usuário deixe o campo em branco, 
    caso tenha escolhido a opção OUTRO do ComboBox.*/
    public boolean comboBoxAcaAux() {
        if(jComboBox2.getSelectedIndex() == 9 && jFormattedTextField8.getText().equals(""))
            return true;
        else
            return false;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JFormattedTextField jFormattedTextField10;
    private javax.swing.JFormattedTextField jFormattedTextField11;
    private javax.swing.JFormattedTextField jFormattedTextField12;
    private javax.swing.JFormattedTextField jFormattedTextField13;
    private javax.swing.JFormattedTextField jFormattedTextField14;
    private javax.swing.JFormattedTextField jFormattedTextField15;
    private javax.swing.JFormattedTextField jFormattedTextField2;
    private javax.swing.JFormattedTextField jFormattedTextField3;
    private javax.swing.JFormattedTextField jFormattedTextField4;
    private javax.swing.JFormattedTextField jFormattedTextField5;
    private javax.swing.JFormattedTextField jFormattedTextField6;
    private javax.swing.JFormattedTextField jFormattedTextField7;
    private javax.swing.JFormattedTextField jFormattedTextField8;
    private javax.swing.JFormattedTextField jFormattedTextField9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton10;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JRadioButton jRadioButton7;
    private javax.swing.JRadioButton jRadioButton8;
    private javax.swing.JRadioButton jRadioButton9;
    // End of variables declaration//GEN-END:variables
    private LinkedList<Livro> livro = Sistema.getLivros();
    
    //Método que seta os componentes visuais de acordo com as informações do Livro encontrado na Consulta.
    public void exibeCampos(Livro l) {
        buttonGroup1.add(jRadioButton3);
        buttonGroup1.add(jRadioButton4);
        buttonGroup1.add(jRadioButton1);
        buttonGroup1.add(jRadioButton2);
        
        buttonGroup2.add(jRadioButton5);
        buttonGroup2.add(jRadioButton6);
        buttonGroup2.add(jRadioButton7);
        buttonGroup2.add(jRadioButton8);
        
        buttonGroup3.add(jRadioButton9);
        buttonGroup3.add(jRadioButton10);
        
        jFormattedTextField3.setText(l.getNacionalidadeAutor());
        jFormattedTextField11.setText(l.getNacionalidadeAutor2());
        jFormattedTextField13.setText(l.getNacionalidadeAutor3());
        jFormattedTextField15.setText(l.getNacionalidadeAutor4());
        jFormattedTextField7.setText(Integer.toString(l.getQtde()));
        
        setaMidia(l); //Selecionando o jRadioButton de acordo com a mídia do Livro.
        
        //Selecionando o jRadioButton do tipo do livro e a opção do ComboBox de acordo com seu escopo.
        if(l instanceof LivroEntretenimento) {
            jRadioButton4.setSelected(true);
            jComboBox1.setVisible(true);
            jComboBox2.setVisible(false);
            entretenimentoExibeCampos(Sistema.getEscopo(l));
            return;
        }
        else if(l instanceof LivroAcademico) {
            jRadioButton3.setSelected(true);
            jComboBox1.setVisible(false);
            jComboBox2.setVisible(true);
            academicoExibeCampos(Sistema.getEscopo(l));
            return;
        }
        else if(l instanceof LivroInformativo || l instanceof LivroPeriodico) {
            jRadioButton1.setSelected(true);
            jComboBox1.setVisible(false);
            jComboBox2.setVisible(false);
            jFormattedTextField8.setText(Sistema.getEscopo(l));
            jFormattedTextField8.setEnabled(true);
            return;
        }
    }
    
    //Método que seleciona o ComboBox do LivroEntretenimento de acordo com seu Gênero.
    public void entretenimentoExibeCampos(String s) {
        if(s.equals("Ação")) {
            jComboBox1.setSelectedIndex(0);
            return;
        }
        else if(s.equals("Aventura")) {
            jComboBox1.setSelectedIndex(1);
            return;
        }
        else if(s.equals("Contos")) {
            jComboBox1.setSelectedIndex(2);
            return;
        }
        else if(s.equals("Drama")) {
            jComboBox1.setSelectedIndex(3);
            return;
        }
        else if(s.equals("Romance")) {
            jComboBox1.setSelectedIndex(4);
            return;
        }
        else if(s.equals("Horror")) {
            jComboBox1.setSelectedIndex(5);
            return;
        }
        else if(s.equals("Humor")) {
            jComboBox1.setSelectedIndex(6);    
            return;
        }
        
        //Chegar até aqui é sinal de que o Gênero do livro é OUTRO.
        jComboBox1.setSelectedIndex(7);
        jFormattedTextField8.setText(s);
        jFormattedTextField8.setEnabled(true);
    }
    
    //Método que seleciona o ComboBox do LivroAcademico de acordo com sua Área.
    public void academicoExibeCampos(String s) {
        if(s.equals("Matemática")) {
            jComboBox2.setSelectedIndex(0);
            return;
        }
        else if(s.equals("Física")) {
            jComboBox2.setSelectedIndex(1);
            return;
        }
        else if(s.equals("Biologia")) {
            jComboBox2.setSelectedIndex(2);
            return;
        }
        else if(s.equals("História")) {
            jComboBox2.setSelectedIndex(3);
            return;
        }
        else if(s.equals("Geografia")) {
            jComboBox2.setSelectedIndex(4);
            return;
        }
        else if(s.equals("Informática")) {
            jComboBox2.setSelectedIndex(5);
            return;
        }
        else if(s.equals("Inglês")) {
            jComboBox2.setSelectedIndex(6);    
            return;
        }
        else if(s.equals("Português")) {
            jComboBox2.setSelectedIndex(7);    
            return;
        }
        else if(s.equals("Espanhol")) {
            jComboBox2.setSelectedIndex(8);    
            return;
        }
        
        //Chegar até aqui é sinal de que a Área do livro é OUTRO.
        jComboBox2.setSelectedIndex(9);
        jFormattedTextField8.setText(s);
        jFormattedTextField8.setEnabled(true);
    }
    
    //Método que seleciona o jRadioButton MÍDIA de acordo com a mídia do Livro.
    public void setaMidia(Livro l) {
        if(l.getMidia().equals("Física")) {
            jRadioButton5.setSelected(true);
            return;
        }
        else if(l.getMidia().equals("Digital")) {
            jRadioButton6.setSelected(true);
            return;
        }
        else if(l.getMidia().equals("Áudio")) {
            jRadioButton7.setSelected(true);
            return;
        }
        else if(l.getMidia().equals("Áudio/Visual")) {
            jRadioButton8.setSelected(true);
            return;
        }
    }
    
    //Método que seta todos os campos abaixo de acordo com o valor booleano passado no parâmetro.
    public void setaCampos(boolean a) {
        jFormattedTextField3.setEnabled(a);
        jFormattedTextField7.setEnabled(a);
        jFormattedTextField8.setEnabled(a);
        jFormattedTextField11.setEnabled(a);
        jFormattedTextField13.setEnabled(a);
        jFormattedTextField15.setEnabled(a);
        jRadioButton1.setEnabled(a);
        jRadioButton2.setEnabled(a);
        jRadioButton3.setEnabled(a);
        jRadioButton3.setSelected(a);
        jRadioButton4.setEnabled(a);
        jRadioButton5.setEnabled(a);
        jRadioButton6.setEnabled(a);
        jRadioButton7.setEnabled(a);
        jRadioButton8.setEnabled(a);
        jComboBox1.setVisible(a);
        jComboBox2.setEnabled(a);
        jButton1.setEnabled(a);
    }
    
    /*Método que seta o visual "default" do InternalFrame por nós escolhido. 
    ButtonGroup garante que apenas um RadioButton esteja marcado.*/
    public void controle() {
        jButton2.setEnabled(true);
        jRadioButton9.setSelected(true);
        jFormattedTextField9.setEnabled(false);
        jCheckBox1.setSelected(false);
        jCheckBox1.setEnabled(false);
        setaCampos(false);
    }
    
}
