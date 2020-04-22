package biblioteca;

import java.awt.Color;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;

public class CadastroLivros extends javax.swing.JInternalFrame {

    public CadastroLivros() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
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
        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jFormattedTextField2 = new javax.swing.JFormattedTextField();
        jFormattedTextField3 = new javax.swing.JFormattedTextField();
        jFormattedTextField4 = new javax.swing.JFormattedTextField();
        jFormattedTextField5 = new javax.swing.JFormattedTextField();
        jFormattedTextField6 = new javax.swing.JFormattedTextField();
        jFormattedTextField7 = new javax.swing.JFormattedTextField();
        jFormattedTextField8 = new javax.swing.JFormattedTextField();
        jButton1 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jFormattedTextField9 = new javax.swing.JFormattedTextField();
        jLabel13 = new javax.swing.JLabel();
        jFormattedTextField10 = new javax.swing.JFormattedTextField();
        jLabel14 = new javax.swing.JLabel();
        jFormattedTextField11 = new javax.swing.JFormattedTextField();
        jLabel15 = new javax.swing.JLabel();
        jFormattedTextField12 = new javax.swing.JFormattedTextField();
        jLabel16 = new javax.swing.JLabel();
        jFormattedTextField13 = new javax.swing.JFormattedTextField();
        jLabel17 = new javax.swing.JLabel();
        jFormattedTextField14 = new javax.swing.JFormattedTextField();
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

        jFormattedTextField3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jFormattedTextField3FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jFormattedTextField3FocusLost(evt);
            }
        });

        jFormattedTextField5.setForeground(new java.awt.Color(197, 193, 189));
        jFormattedTextField5.setToolTipText("");
        jFormattedTextField5.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jFormattedTextField5FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jFormattedTextField5FocusLost(evt);
            }
        });

        jFormattedTextField6.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jFormattedTextField6FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jFormattedTextField6FocusLost(evt);
            }
        });

        jFormattedTextField7.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jFormattedTextField7FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jFormattedTextField7FocusLost(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jButton1.setText("Cadastrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel12.setText("2º Autor:");

        jLabel13.setText("2ª Nacionalidade:");

        jFormattedTextField10.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jFormattedTextField10FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jFormattedTextField10FocusLost(evt);
            }
        });

        jLabel14.setText("3º Autor:");

        jLabel15.setText("3ª Nacionalidade:");

        jFormattedTextField12.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jFormattedTextField12FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jFormattedTextField12FocusLost(evt);
            }
        });

        jLabel16.setText("4º Autor:");

        jLabel17.setText("4ª Nacionalidade:");

        jFormattedTextField14.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jFormattedTextField14FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jFormattedTextField14FocusLost(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3)
                            .addComponent(jLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jFormattedTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel13)
                                .addGap(13, 13, 13)
                                .addComponent(jFormattedTextField10))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jRadioButton5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jRadioButton6))
                                    .addComponent(jFormattedTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(13, 13, 13)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jRadioButton7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jRadioButton8)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(5, 5, 5)
                                        .addComponent(jLabel11)
                                        .addGap(30, 30, 30)
                                        .addComponent(jFormattedTextField3))))
                            .addComponent(jFormattedTextField1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jFormattedTextField6, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jFormattedTextField4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jFormattedTextField5))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jFormattedTextField7))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jFormattedTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18)
                                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 45, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jFormattedTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel15))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jFormattedTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel17)))
                        .addGap(13, 13, 13)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jFormattedTextField12)
                            .addComponent(jFormattedTextField14))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jFormattedTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(jFormattedTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel11))
                    .addComponent(jFormattedTextField3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13)
                    .addComponent(jFormattedTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFormattedTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15)
                    .addComponent(jFormattedTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFormattedTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jLabel17)
                    .addComponent(jFormattedTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFormattedTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jFormattedTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
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
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
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
    
    //Método executado caso o botão CADASTRAR seja pressionado.
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        checaCampos();        
        //Verificando se algum campo está em branco.
        if(!(jFormattedTextField1.getText().equals("") || jFormattedTextField7.getText().equals("") || 
                jFormattedTextField6.getText().equals("") || jFormattedTextField4.getText().equals("")
                || jFormattedTextField5.getText().equals("") || comboBoxEntAux() || comboBoxAcaAux())) {
            try {
                Sistema.checaNum(jFormattedTextField7.getText());//Verifica se alguma letra foi digitada no campo QTDE.
                Sistema.checaNum(jFormattedTextField5.getText());//Verifica se alguma letra foi digitada no campo ANO.
                Sistema.checaAno(jFormattedTextField5.getText());//Verifica se foi digitado um ano de 4 dígitos.
                Sistema.checaInt(Double.parseDouble(jFormattedTextField7.getText()));//Verifica se o número digitado no campo QTDE é inteiro e positivo.
                Sistema.checaInt(Double.parseDouble(jFormattedTextField5.getText()));//Verifica se o número digitado no campo ANO é inteiro e positivo.
            }
            catch(NumberFormatException e) {
                JOptionPane.showMessageDialog(CadastroLivros.this, "Valor inválido, apenas números "
                        + "são permitidos no campo quantidade, digite novamente com números desta vez.", 
                        "Oops!!", JOptionPane.ERROR_MESSAGE);
                return;
            }
            catch(NumeroInteiroException e) {
                JOptionPane.showMessageDialog(CadastroLivros.this, e.getMessage() + " Preencha os campos ANO e QTDE EXEMPLARES corretamente.",
                        "Oops!!", JOptionPane.ERROR_MESSAGE);

                return;
            }
            catch(AnoException e) {
                JOptionPane.showMessageDialog(CadastroLivros.this, e.getMessage(), "Oops!!", 
                            JOptionPane.ERROR_MESSAGE);
                return;
            }
            
            //Verifica a validez os campos dos AUTORES e suas NACIONALIDADES.
            if(checaAutores()) {
                    //AuxAutor verifica se os campos AUTOR e NACIONALIDADE estão preenchidos ao mesmo tempo.
                    if(auxAutor()) {
                        JOptionPane.showMessageDialog(CadastroLivros.this, "Preencha corretamente os atributos 1º autor", 
                                "Oops!!", JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                    if(auxAutor2()) {
                        JOptionPane.showMessageDialog(CadastroLivros.this, "Preencha corretamente os atributos 2º autor", 
                                "Oops!!", JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                    if(auxAutor3()) {
                        JOptionPane.showMessageDialog(CadastroLivros.this, "Preencha corretamente os atributos 3º autor", 
                                "Oops!!", JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                    if(auxAutor4()) {
                        JOptionPane.showMessageDialog(CadastroLivros.this, "Preencha corretamente os atributos 4º autor", 
                                "Oops!!", JOptionPane.ERROR_MESSAGE);
                        return;
                    }

                    Livro livro = null; 

                    //Iniciando o objeto de acordo com o RadioButton selecionado.
                    if(jRadioButton3.isSelected())
                        livro = new LivroAcademico(jFormattedTextField1.getText(), jFormattedTextField2.getText(), jFormattedTextField3.getText(),
                                jFormattedTextField9.getText(), jFormattedTextField10.getText(), jFormattedTextField11.getText(),
                                jFormattedTextField12.getText(), jFormattedTextField13.getText(), jFormattedTextField14.getText(),
                                Integer.parseInt(jFormattedTextField7.getText()), jFormattedTextField6.getText(), radioButtonControl(), 
                                jFormattedTextField4.getText(), jFormattedTextField5.getText(), comboBoxAca());
                    else if(jRadioButton4.isSelected())
                        livro = new LivroEntretenimento(jFormattedTextField1.getText(), jFormattedTextField2.getText(), jFormattedTextField3.getText(),
                                jFormattedTextField9.getText(), jFormattedTextField10.getText(), jFormattedTextField11.getText(),
                                jFormattedTextField12.getText(), jFormattedTextField13.getText(), jFormattedTextField14.getText(), 
                                Integer.parseInt(jFormattedTextField7.getText()), jFormattedTextField6.getText(), radioButtonControl(), 
                                jFormattedTextField4.getText(), jFormattedTextField5.getText(), comboBoxEnt());
                    else if(jRadioButton1.isSelected())
                        livro = new LivroInformativo(jFormattedTextField1.getText(), jFormattedTextField2.getText(), jFormattedTextField3.getText(),
                                jFormattedTextField9.getText(), jFormattedTextField10.getText(), jFormattedTextField11.getText(),
                                jFormattedTextField12.getText(), jFormattedTextField13.getText(), jFormattedTextField14.getText(),
                                Integer.parseInt(jFormattedTextField7.getText()), jFormattedTextField6.getText(), radioButtonControl(), 
                                jFormattedTextField4.getText(), jFormattedTextField5.getText(), jFormattedTextField8.getText());
                    else if(jRadioButton2.isSelected())
                        livro = new LivroPeriodico(jFormattedTextField1.getText(), jFormattedTextField2.getText(), jFormattedTextField3.getText(),
                                jFormattedTextField9.getText(), jFormattedTextField10.getText(), jFormattedTextField11.getText(),
                                jFormattedTextField12.getText(), jFormattedTextField13.getText(), jFormattedTextField14.getText(),
                                Integer.parseInt(jFormattedTextField7.getText()), jFormattedTextField6.getText(), radioButtonControl(), 
                                jFormattedTextField4.getText(), jFormattedTextField5.getText(), jFormattedTextField8.getText());

                    //Verificando se o livro já estava cadastrado.
                    if(Sistema.checaIgualdade(livro)) {
                        //Caso esteja cadastrado, apenas incrementa a qtde de exemplares de acordo com o valor digitado pelo usuário.
                        Sistema.cadastraLivroIgual(Integer.parseInt(jFormattedTextField7.getText()),CadastroLivros.this);
                        zeraCampos();
                        return;
                    }
                    else
                        Sistema.cadastraLivro(livro);//Se não tiver cadastrado, o livro será criado.

                    JOptionPane.showMessageDialog(CadastroLivros.this, "Livro cadastrado com sucesso.", 
                            "Done!!", JOptionPane.INFORMATION_MESSAGE);

                    zeraCampos();
            }
            else {
                JOptionPane.showMessageDialog(CadastroLivros.this, "Preencha os campos AUTOR e NACIONALIDADE!!", "Oops!!", JOptionPane.ERROR_MESSAGE);
                setaCampos();
            }
        }
        else {
            JOptionPane.showMessageDialog(CadastroLivros.this, "Preencha todos os campos!!", "Oops!!", JOptionPane.ERROR_MESSAGE);
            setaCampos();
        }
        
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

    private void jFormattedTextField5FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jFormattedTextField5FocusGained
        if(jFormattedTextField5.getText().equals("Ex: 1994")) {
            jFormattedTextField5.setText("");
            jFormattedTextField5.setForeground(Color.black);
        }
    }//GEN-LAST:event_jFormattedTextField5FocusGained

    private void jFormattedTextField3FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jFormattedTextField3FocusGained
        if(jFormattedTextField3.getText().equals("Ex: Brasil")) {
            jFormattedTextField3.setText("");
            jFormattedTextField3.setForeground(Color.black);
        }
    }//GEN-LAST:event_jFormattedTextField3FocusGained

    private void jFormattedTextField10FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jFormattedTextField10FocusGained
        if(jFormattedTextField10.getText().equals("Ex: Itália")) {
            jFormattedTextField10.setText("");
            jFormattedTextField10.setForeground(Color.black);
        }
    }//GEN-LAST:event_jFormattedTextField10FocusGained

    private void jFormattedTextField12FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jFormattedTextField12FocusGained
        if(jFormattedTextField12.getText().equals("Ex: Inglaterra")) {
            jFormattedTextField12.setText("");
            jFormattedTextField12.setForeground(Color.black);
        }
    }//GEN-LAST:event_jFormattedTextField12FocusGained

    private void jFormattedTextField14FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jFormattedTextField14FocusGained
        if(jFormattedTextField14.getText().equals("Ex: Portugal")) {
            jFormattedTextField14.setText("");
            jFormattedTextField14.setForeground(Color.black);
        }
    }//GEN-LAST:event_jFormattedTextField14FocusGained

    private void jFormattedTextField6FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jFormattedTextField6FocusGained
        if(jFormattedTextField6.getText().equals("Ex: Português")) {
            jFormattedTextField6.setText("");
            jFormattedTextField6.setForeground(Color.black);
        }
    }//GEN-LAST:event_jFormattedTextField6FocusGained

    private void jFormattedTextField7FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jFormattedTextField7FocusGained
        if(jFormattedTextField7.getText().equals("Ex: 15")) {
            jFormattedTextField7.setText("");
            jFormattedTextField7.setForeground(Color.black);
        }
    }//GEN-LAST:event_jFormattedTextField7FocusGained

    private void jFormattedTextField3FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jFormattedTextField3FocusLost
        if(jFormattedTextField3.getText().equals("")) {
            jFormattedTextField3.setText("Ex: Brasil");
            jFormattedTextField3.setForeground(Color.gray);
        }
    }//GEN-LAST:event_jFormattedTextField3FocusLost
        
    private void jFormattedTextField6FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jFormattedTextField6FocusLost
        if(jFormattedTextField6.getText().equals("")) {
            jFormattedTextField6.setText("Ex: Português");
            jFormattedTextField6.setForeground(Color.gray);
        }
    }//GEN-LAST:event_jFormattedTextField6FocusLost

    private void jFormattedTextField5FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jFormattedTextField5FocusLost
        if(jFormattedTextField5.getText().equals("")) {
            jFormattedTextField5.setText("Ex: 1994");
            jFormattedTextField5.setForeground(Color.gray);
        }
    }//GEN-LAST:event_jFormattedTextField5FocusLost

    private void jFormattedTextField10FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jFormattedTextField10FocusLost
        if(jFormattedTextField10.getText().equals("")) {
            jFormattedTextField10.setText("Ex: Itália");
            jFormattedTextField10.setForeground(Color.gray);
        }
    }//GEN-LAST:event_jFormattedTextField10FocusLost

    private void jFormattedTextField12FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jFormattedTextField12FocusLost
        if(jFormattedTextField12.getText().equals("")) {
            jFormattedTextField12.setText("Ex: Inglaterra");
            jFormattedTextField12.setForeground(Color.gray);
        }
    }//GEN-LAST:event_jFormattedTextField12FocusLost

    private void jFormattedTextField14FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jFormattedTextField14FocusLost
        if(jFormattedTextField14.getText().equals("")) {
            jFormattedTextField14.setText("Ex: Portugal");
            jFormattedTextField14.setForeground(Color.gray);
        }
    }//GEN-LAST:event_jFormattedTextField14FocusLost

    private void jFormattedTextField7FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jFormattedTextField7FocusLost
        if(jFormattedTextField7.getText().equals("")) {
            jFormattedTextField7.setText("Ex: 15");
            jFormattedTextField7.setForeground(Color.gray);
        }
    }//GEN-LAST:event_jFormattedTextField7FocusLost
    
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
        jFormattedTextField4.setText("");
        jFormattedTextField8.setText("");
        jFormattedTextField9.setText("");
        jFormattedTextField11.setText("");
        jFormattedTextField13.setText("");
        
        jFormattedTextField3.setText("Ex: Brasil");
        jFormattedTextField3.setForeground(Color.gray);
        jFormattedTextField5.setText("Ex: 1994");
        jFormattedTextField5.setForeground(Color.gray);
        jFormattedTextField6.setText("Ex: Português");
        jFormattedTextField6.setForeground(Color.gray);
        jFormattedTextField7.setText("Ex: 15");
        jFormattedTextField7.setForeground(Color.gray);
        jFormattedTextField10.setText("Ex: Itália");
        jFormattedTextField10.setForeground(Color.gray);
        jFormattedTextField12.setText("Ex: Inglaterra");
        jFormattedTextField12.setForeground(Color.gray);
        jFormattedTextField14.setText("Ex: Portugal");
        jFormattedTextField14.setForeground(Color.gray);
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
        if(jRadioButton4.isSelected() && jComboBox1.getSelectedIndex() == 7 && jFormattedTextField8.getText().equals(""))
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
        if(jRadioButton3.isSelected() && jComboBox2.getSelectedIndex() == 9 && jFormattedTextField8.getText().equals(""))
            return true;
        else
            return false;
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
        if((!jFormattedTextField9.getText().equals("") && jFormattedTextField10.getText().equals("")) 
            || (jFormattedTextField9.getText().equals("") && !jFormattedTextField10.getText().equals("")))
            return true;
        else
            return false;
    }
    
    public boolean auxAutor3() {
        if((!jFormattedTextField11.getText().equals("") && jFormattedTextField12.getText().equals("")) 
            || (jFormattedTextField11.getText().equals("") && !jFormattedTextField12.getText().equals("")))
            return true;
        else
            return false;
    }
    
    public boolean auxAutor4() {
        if((!jFormattedTextField13.getText().equals("") && jFormattedTextField14.getText().equals("")) 
            || (jFormattedTextField13.getText().equals("") && !jFormattedTextField14.getText().equals("")))
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
        if(!jFormattedTextField9.getText().equals(""))
            num++;
        if(!jFormattedTextField11.getText().equals(""))
            num++;
        if(!jFormattedTextField13.getText().equals(""))
            num++;
        if(!jFormattedTextField3.getText().equals(""))
            num++;
        if(!jFormattedTextField10.getText().equals(""))
            num++;
        if(!jFormattedTextField12.getText().equals(""))
            num++;
        if(!jFormattedTextField14.getText().equals(""))
            num++;
        
        /*Por se tratar de um par (NOME e NACIONALIDADE do Autor), se os campos estiverem preenchidos corretamente,
        a soma sempre resultará em um número par. Porém, este número tem que ser diferente de zero, pois do contrário,
        siginifica que nenhum dos campos dos Autores foram preenchidos.*/
        if(num % 2 == 0 && num != 0)
            return true;
        else
            return false;
    }
    
    public void setaCampos() {
        if(jFormattedTextField3.getText().equals("")) {
            jFormattedTextField3.setText("Ex: Brasil");
            jFormattedTextField3.setForeground(Color.gray);
        }
        
        if(jFormattedTextField5.getText().equals("")) {
            jFormattedTextField5.setText("Ex: 1994");
            jFormattedTextField5.setForeground(Color.gray);
        }
        
        if(jFormattedTextField6.getText().equals("")) {
            jFormattedTextField6.setText("Ex: Português");
            jFormattedTextField6.setForeground(Color.gray);
        }
        
        if(jFormattedTextField7.getText().equals("")) {
            jFormattedTextField7.setText("Ex: 15");
            jFormattedTextField7.setForeground(Color.gray);
        }
        
        if(jFormattedTextField10.getText().equals("")) {
            jFormattedTextField10.setText("Ex: Itália");
            jFormattedTextField10.setForeground(Color.gray);
        }
        
        if(jFormattedTextField12.getText().equals("")) {
            jFormattedTextField12.setText("Ex: Inglaterra");
            jFormattedTextField12.setForeground(Color.gray);
        }
        
        if(jFormattedTextField14.getText().equals("")) {
            jFormattedTextField14.setText("Ex: Portugal");
            jFormattedTextField14.setForeground(Color.gray);
        }
    }
    
    public void checaCampos() {
        if(jFormattedTextField3.getText().equals("Ex: Brasil"))
            jFormattedTextField3.setText("");
        
        if(jFormattedTextField5.getText().equals("Ex: 1994"))
            jFormattedTextField5.setText("");
        
        if(jFormattedTextField6.getText().equals("Ex: Português"))
            jFormattedTextField6.setText("");
        
        if(jFormattedTextField7.getText().equals("Ex: 15"))
            jFormattedTextField7.setText("");
        
        if(jFormattedTextField10.getText().equals("Ex: Itália"))
            jFormattedTextField10.setText("");
        
        if(jFormattedTextField12.getText().equals("Ex: Inglaterra"))
            jFormattedTextField12.setText("");
        
        if(jFormattedTextField14.getText().equals("Ex: Portugal"))
            jFormattedTextField14.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JFormattedTextField jFormattedTextField10;
    private javax.swing.JFormattedTextField jFormattedTextField11;
    private javax.swing.JFormattedTextField jFormattedTextField12;
    private javax.swing.JFormattedTextField jFormattedTextField13;
    private javax.swing.JFormattedTextField jFormattedTextField14;
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
    private javax.swing.JLabel jLabel2;
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
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JRadioButton jRadioButton7;
    private javax.swing.JRadioButton jRadioButton8;
    // End of variables declaration//GEN-END:variables

    /*Método que seta o visual "default" do InternalFrame por nós escolhido. 
    ButtonGroup garante que apenas um RadioButton esteja marcado.*/
    public void controle() {
        buttonGroup1.add(jRadioButton3);
        buttonGroup1.add(jRadioButton4);
        buttonGroup1.add(jRadioButton1);
        buttonGroup1.add(jRadioButton2);
        
        buttonGroup2.add(jRadioButton5);
        buttonGroup2.add(jRadioButton6);
        buttonGroup2.add(jRadioButton7);
        buttonGroup2.add(jRadioButton8);
        
        jRadioButton3.setSelected(true);
        jLabel10.setText("Outro:");
        jComboBox2.setVisible(true);
        jFormattedTextField8.setEnabled(false);
        
        jRadioButton5.setSelected(true);
        jComboBox1.setVisible(false);
        jLabel9.setVisible(true);
        jLabel9.setText("Área:");
        
        zeraCampos();
    }    
}
