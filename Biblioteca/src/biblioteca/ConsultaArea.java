package biblioteca;

import java.util.HashMap;
import java.util.LinkedList;
import javax.swing.JOptionPane;

public class ConsultaArea extends javax.swing.JInternalFrame {

    public ConsultaArea() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();

        setClosable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Consulta por gênero");
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameClosing(evt);
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        jComboBox1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ação", "Aventura", "Contos", "Drama", "Romance", "Horror ", "Humor", "Matemática", "Física", "Biologia", "História", "Geografia", "Informática", "Inglês", "Português", "Espanhol", "Outro" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("Consultar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel1.setText("Escolha o gênero:");

        jLabel2.setText("Outro:");

        jList1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jList1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField1)))))
                .addGap(48, 48, 48))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(128, 128, 128)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        jList1.removeAll(); //Remove os itens da lista.
        //Se o item "Outro" do ComboBox for escolhido, o Campo de Texto é habilitado à edição.
        if(jComboBox1.getSelectedIndex() == 16)
            jTextField1.setEnabled(true);
        else {
            jTextField1.setEnabled(false);
            jTextField1.setText("");
        }
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //Controle para que o usuário, ao selecionar a opção OUTROS, não deixe a caixa de texto em branco.
        if(!(jComboBox1.getSelectedIndex() == 16 && jTextField1.getText().equals("")))
            //Consulta e exibe o título dos livros.
            Sistema.consultaArea(comboBox(), jList1, ConsultaArea.this);
        else
            JOptionPane.showMessageDialog(ConsultaArea.this, "Preencha o campo OUTROS.", 
                    "Oops!!", JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jList1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList1MouseClicked
        int pos = jList1.getSelectedIndex(); //Posição que foi clicada no Model. (J do Sistema)
        JOptionPane.showMessageDialog(ConsultaArea.this, livro.get(aux.get(pos)).toString(), 
                "Done!!", JOptionPane.INFORMATION_MESSAGE); //Exibe o toString() do livro que foi clicado.
    }//GEN-LAST:event_jList1MouseClicked

    //Método executado quando o botão fechar(X) é pressionado.
    private void formInternalFrameClosing(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosing
        Sistema.limpaHash(); //Garante que o HashMap aux não trabalhe com resíduos de outras operações.
    }//GEN-LAST:event_formInternalFrameClosing

    //Retorna a string de escopo do livro.
    public String comboBox() {
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
            texto = "Matemática";
        else if(jComboBox1.getSelectedIndex() == 8)
            texto = "Física";
        else if(jComboBox1.getSelectedIndex() == 9)
            texto = "Biologia";
        else if(jComboBox1.getSelectedIndex() == 10)
            texto = "História";
        else if(jComboBox1.getSelectedIndex() == 11)
            texto = "Geografia";
        else if(jComboBox1.getSelectedIndex() == 12)
            texto = "Informática";
        else if(jComboBox1.getSelectedIndex() == 13)
            texto = "Inglês";
        else if(jComboBox1.getSelectedIndex() == 14)
            texto = "Português";
        else if(jComboBox1.getSelectedIndex() == 15)
            texto = "Espanhol";
        else if(jComboBox1.getSelectedIndex() == 16)
            texto = jTextField1.getText();
        
        return texto;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
    private LinkedList<Livro> livro = Sistema.getLivros();
    private HashMap<Integer, Integer> aux = Sistema.getHash();
    
    //Método que inicia o InternalFrame no modo "default" por nós escolhido.
    public void controle() {
        jComboBox1.setMaximumRowCount(8);//Setando o máximo de itens a aparecer no ComboBox para 8.
        jTextField1.setEnabled(false);
    }
}
