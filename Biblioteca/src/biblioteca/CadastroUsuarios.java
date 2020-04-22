package biblioteca;

import java.awt.Color;
import javax.swing.JOptionPane;

public class CadastroUsuarios extends javax.swing.JInternalFrame {

    public CadastroUsuarios() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jPasswordField2 = new javax.swing.JPasswordField();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel10 = new javax.swing.JLabel();
        jPasswordField3 = new javax.swing.JPasswordField();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();

        setClosable(true);
        setMaximizable(true);
        setResizable(true);

        jLabel1.setText("Nome:");

        jLabel2.setText("Rua:");

        jLabel4.setText("Cep:");

        jLabel5.setText("Complemento:");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jLabel6.setText("Tipo:");

        jRadioButton1.setText("Aluno");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        jRadioButton2.setText("Professor");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        jRadioButton3.setText("Funcionário");
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });

        jLabel7.setText("jLabel7");

        jLabel8.setText("Número Casa/Apt:");

        jPasswordField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jPasswordField1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jPasswordField1FocusLost(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jButton1.setText("Cadastrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setText("Apelido:");

        jLabel9.setText("Senha:");

        jCheckBox1.setText("Exibir Senha");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        jLabel10.setText("Confirmar Senha:");

        jFormattedTextField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jFormattedTextField1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jFormattedTextField1FocusLost(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jRadioButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel8)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPasswordField1)
                                    .addComponent(jScrollPane1)
                                    .addComponent(jTextField4)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(jFormattedTextField1))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10))
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField1)
                            .addComponent(jTextField2)
                            .addComponent(jTextField5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPasswordField2, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCheckBox1)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jPasswordField3))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jPasswordField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jPasswordField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jFormattedTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jLabel5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jRadioButton2)
                    .addComponent(jRadioButton3)
                    .addComponent(jRadioButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(13, 13, 13)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        if(jCheckBox1.isSelected())
        jPasswordField2.setEchoChar('\u0000');
        else
        jPasswordField2.setEchoChar('*');
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    //Método executado caso o botão "Cadastrar" seja pressionado.
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        checaCampos();
        //Verificando se todos os campos de texto estão preenchidos.
        if(!(jTextField1.equals("") || jTextField2.getText().equals("") || jFormattedTextField1.getText().equals("")
            || jTextField4.getText().equals("") || jTextField5.getText().equals("") ||
            jPasswordField1.getText().equals("") || jPasswordField2.getText().equals("") || 
            jPasswordField3.getText().equals(""))) {
            if(jPasswordField2.getText().equals(jPasswordField3.getText())) {
                if(!Sistema.checaApelido(jTextField5.getText())) {
                    try{
                        Sistema.checaNum(jFormattedTextField1.getText());//Verifica se alguma letra foi digitada no campo CEP.
                        Sistema.checaNum(jTextField4.getText());//Verifica se alguma letra foi digitada no campo Nº CASA/APT.
                        Sistema.checaInt(Double.parseDouble(jFormattedTextField1.getText()));//Verifica se o número digitado no campo CEP é inteiro e positivo.
                        Sistema.checaInt(Double.parseDouble(jTextField4.getText()));//Verifica se o número digitado no campo Nº CASA/APT é inteiro e positivo.
                        
                        if(jRadioButton1.isSelected()) {
                            Sistema.checaNum(jPasswordField1.getText());//Verifica se alguma letra foi digitada no campo MATRÍCULA.
                            Sistema.checaInt(Double.parseDouble(jPasswordField1.getText()));//Verifica se o número digitado no campo MATRÍCULA é inteiro e positivo.
                        }
                    }
                    catch(NumberFormatException e) {
                        JOptionPane.showMessageDialog(CadastroUsuarios.this, "Um dos ou os dois campos Número da casa e CEP, "
                            + "foi preenchido com letras. Digite novamente com números apenas.", "Oops!!", JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                    catch(NumeroInteiroException e) {
                        JOptionPane.showMessageDialog(CadastroUsuarios.this, e.getMessage() + " Preencha os campos ANO e QTDE EXEMPLARES corretamente.",
                            "Oops!!", JOptionPane.ERROR_MESSAGE);
                        return;
                    }

                    //Iniciando o objeto de acordo com o tipo escolhido.
                    if(jRadioButton1.isSelected())
                        //Verifica se a matrícula digitada já está em uso.
                        if(!Sistema.checaMatr(jPasswordField1.getText()))
                            Sistema.cadastraUsuario(new Aluno(jTextField1.getText(), jTextField5.getText(), jPasswordField2.getText(),
                                jTextField2.getText(), jTextField4.getText(), jFormattedTextField1.getText(), jTextArea1.getText(),
                                jPasswordField1.getText()));
                        else {
                            JOptionPane.showMessageDialog(CadastroUsuarios.this, "Matrícula já em uso.",
                            "Oops!!", JOptionPane.ERROR_MESSAGE);
                            return;
                        }

                    else if(jRadioButton2.isSelected())
                        Sistema.cadastraUsuario(new Professor(jTextField1.getText(), jTextField5.getText(), jPasswordField2.getText(),
                           jTextField2.getText(), jTextField4.getText(), jFormattedTextField1.getText(), jTextArea1.getText(),
                           jPasswordField1.getText()));

                    else if(jRadioButton3.isSelected())
                    //Verificando se a Senha Master foi digitada corretamente.
                        if(!(jPasswordField1.getText().equals(UsuarioMaster.getSenhaMaster()))) {
                            JOptionPane.showMessageDialog(CadastroUsuarios.this, "Senha Master incorreta.",
                            "Oops!!", JOptionPane.ERROR_MESSAGE);
                            return;
                        }
                        else
                            Sistema.cadastraUsuario(new Funcionario(jTextField1.getText(), jTextField2.getText(), 
                                jTextField4.getText(), jFormattedTextField1.getText(), jTextArea1.getText()));

                    JOptionPane.showMessageDialog(CadastroUsuarios.this, "Usuário cadastrado com sucesso.",
                        "Done!!", JOptionPane.INFORMATION_MESSAGE);

                    zeraCampos();
                }
                else {
                    JOptionPane.showMessageDialog(CadastroUsuarios.this, "Apelido já cadastrado, tente com outro diferente.",
                        "Oops!!", JOptionPane.ERROR_MESSAGE);
                    setaCampos();
                }
            }
            else {
                JOptionPane.showMessageDialog(CadastroUsuarios.this, "As senhas não conferem, tente novamente.",
                    "Oops!!", JOptionPane.ERROR_MESSAGE); 
                setaCampos();
            }
        }
        else {
            JOptionPane.showMessageDialog(CadastroUsuarios.this, "Preencha todos os campos!",
                "Oops!!", JOptionPane.ERROR_MESSAGE); 
            setaCampos();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
        jTextField5.setEnabled(false);
        jPasswordField2.setEnabled(false);
        jPasswordField2.setText("");
        jPasswordField3.setEnabled(false);
        jPasswordField3.setText("");
        jCheckBox1.setEnabled(false);
        jCheckBox1.setSelected(false);
        jLabel7.setText("Senha Master:");
        jPasswordField1.setText("");
        jPasswordField1.setForeground(Color.black);
        //Setando o EchoChar para o padrão novamente.
        jPasswordField1.setEchoChar('*');
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        jTextField5.setEnabled(true);
        jPasswordField2.setEnabled(true);
        jPasswordField3.setEnabled(true);
        jCheckBox1.setEnabled(true);
        jLabel7.setText("Área:");
        jPasswordField1.setText("");
        jPasswordField1.setForeground(Color.black);
        //Seta o EchoChar que vem como padrão '*' para o character número zero da tabela ASCII.
        jPasswordField1.setEchoChar('\u0000');
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        jTextField5.setEnabled(true);
        jPasswordField2.setEnabled(true);
        jPasswordField3.setEnabled(true);
        jCheckBox1.setEnabled(true);
        jLabel7.setText("Matrícula:");
        jPasswordField1.setText("Digite apenas números");
        jPasswordField1.setForeground(Color.gray);
        //Seta o EchoChar que vem como padrão '*' para o character número zero da tabela ASCII.
        jPasswordField1.setEchoChar('\u0000');
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jPasswordField1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordField1FocusGained
        if(jRadioButton1.isSelected())
            if(jPasswordField1.getText().equals("Digite apenas números")) {
                jPasswordField1.setText("");
                jPasswordField1.setForeground(Color.black);
            }
    }//GEN-LAST:event_jPasswordField1FocusGained

    private void jPasswordField1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordField1FocusLost
        if(jRadioButton1.isSelected())
            if(jPasswordField1.getText().equals("")) {
                jPasswordField1.setText("Digite apenas números");
                jPasswordField1.setForeground(Color.gray);
            }
    }//GEN-LAST:event_jPasswordField1FocusLost

    private void jFormattedTextField1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jFormattedTextField1FocusGained
        if(jFormattedTextField1.getText().equals("Ex: 58057410")) {
            jFormattedTextField1.setText("");
            jFormattedTextField1.setForeground(Color.black);
        }
    }//GEN-LAST:event_jFormattedTextField1FocusGained

    private void jFormattedTextField1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jFormattedTextField1FocusLost
        if(jFormattedTextField1.getText().equals("")) {
            jFormattedTextField1.setText("Ex: 58057410");
            jFormattedTextField1.setForeground(Color.gray);
        }
    }//GEN-LAST:event_jFormattedTextField1FocusLost
    
    //Método que zera todos os campos de texto.
    public void zeraCampos() {
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField4.setText("");
        jTextField5.setText("");
        jTextArea1.setText("");
        jPasswordField2.setText("");
        jPasswordField3.setText("");
        
        jFormattedTextField1.setText("Ex: 58057410");
        jFormattedTextField1.setForeground(Color.gray);
        
        if(jRadioButton1.isSelected()) {
            jPasswordField1.setText("Digite apenas números");
            jPasswordField1.setForeground(Color.gray);
        }
        else {
            jPasswordField1.setText("");
            jPasswordField1.setForeground(Color.black);
        }
    }
    
    public void setaCampos() {
        if(jRadioButton1.isSelected() && jPasswordField1.getText().equals("")) {
            jPasswordField1.setText("Digite apenas números");
            jPasswordField1.setForeground(Color.gray);
        }
        
        if(jFormattedTextField1.getText().equals("")) {
            jFormattedTextField1.setText("Ex: 58057410");
            jFormattedTextField1.setForeground(Color.gray);
        }
    }
    
    public void checaCampos() {
        if(jRadioButton1.isSelected() && jPasswordField1.getText().equals("Digite apenas números"))
            jPasswordField1.setText("");
        
        if(jFormattedTextField1.getText().equals("Ex: 58057410"))
            jFormattedTextField1.setText("");
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JPasswordField jPasswordField3;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables
    
    //Método que Adiciona os jRadioButtos no ButtonGroup e seta o visual "default" do InternalFrame.
    public void controle() {
        buttonGroup1.add(jRadioButton1);
        buttonGroup1.add(jRadioButton2);
        buttonGroup1.add(jRadioButton3);
        
        jRadioButton1.setSelected(true);
        jLabel7.setText("Matrícula:");
        jPasswordField1.setEchoChar('\u0000');
        
        zeraCampos();
    }
}
