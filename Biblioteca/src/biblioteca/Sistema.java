/*
* Universidade Federal da Paraíba - UFPB
*
* Linguagem de Programação I - LP I
* Profa.: Daniela Coelho Batista Guedes Pereira
*
* Cadastro dos Livros de Biblioteca Universitária - Projeto nº 3
*
* Finalizado em: 20 de Novembro de 2016
*
* Autores : Rennan Weslley da Silva Costa            - 11515025
*           Joanderson de Souza Marinho              - 11517103
*           Manoel Cleonaldo Mendes Pereira Sobrinho - 11510431
*           Gabriel Torres da Nóbrega                - 11512448
*
* Modificado em: 22 de Novembro de 2016
*/

package biblioteca;

import java.awt.Component;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class Sistema extends javax.swing.JFrame {

    public Sistema() {
        arquivoLivros.abrirLer(); //Abre o arquivo dos Livros para leitura.
        //Verifica se o arquivo está vazio, caso não, executa o código dentro do IF.
        if(!arquivoLivros.getVazio()) {
            arquivoLivros.ler(); //Ler o arquivo dos Livros.
            arquivoLivros.fechaLer(); //Fecha o arquivo dos Livros.
            livro = arquivoLivros.getLista(); //Iguala o LinkedList LIVROS à coleção resultante do arquivo.
        }
        else
            JOptionPane.showMessageDialog(Sistema.this, "Arquivo vazio, nenhum livro ainda foi cadastrado."); 
        
        arquivoUsuarios.abrirLer(); //Abre o arquivo dos Usuários para leitura.
        //Verifica se o arquivo está vazio, caso não, executa o código dentro do IF.
        if(!arquivoUsuarios.getVazio()) {
            arquivoUsuarios.ler(); //Ler o arquivo dos Usuários.
            arquivoUsuarios.fechaLer(); //Fecha o arquivo dos Usuários.
            usuario = arquivoUsuarios.getLista(); //Iguala o LinkedList USUARIOS à coleção resultante do arquivo.
        }
        else
            JOptionPane.showMessageDialog(Sistema.this, "Arquivo vazio, nenhum usuário ainda foi cadastrado.");  
            
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/biblioteca/imagens/menu.jpeg"))); // NOI18N
        jMenu1.setText("Opções");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/biblioteca/imagens/livrosss.png"))); // NOI18N
        jMenuItem1.setText("Cadastrar Livro");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/biblioteca/imagens/usuario.png"))); // NOI18N
        jMenuItem2.setText("Cadastrar Usuário");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/biblioteca/imagens/ab.png"))); // NOI18N
        jMenuItem3.setText("Listar Livros");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/biblioteca/imagens/lupaa.png"))); // NOI18N
        jMenu2.setText("Consultar Livro");
        jMenu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu2ActionPerformed(evt);
            }
        });

        jMenuItem5.setText("Consulta por Título");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem5);

        jMenu3.setText("Consulta Autor");

        jMenuItem10.setText("Consulta por Nome");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem10);

        jMenuItem11.setText("Consulta por Nacionalidade");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem11);

        jMenu2.add(jMenu3);

        jMenuItem4.setText("Consulta por Área");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenu1.add(jMenu2);

        jMenuItem8.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/biblioteca/imagens/disketttt.png"))); // NOI18N
        jMenuItem8.setText("Alterar/Remover Livro");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem8);

        jMenuItem6.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/biblioteca/imagens/fgdfgdfgdfff.png"))); // NOI18N
        jMenuItem6.setText("Alugar/Devolver Livro");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem6);

        jMenuItem7.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/biblioteca/imagens/sairsair.png"))); // NOI18N
        jMenuItem7.setText("Sair");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem7);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 928, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 548, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        CadastroLivros cadastra = new CadastroLivros();
        jDesktopPane1.add(cadastra);
        cadastra.controle();
        cadastra.pack();
        cadastra.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu2ActionPerformed

    }//GEN-LAST:event_jMenu2ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        Sistema.limpaHash(); //Garante que o HashMap aux não trabalhe com resíduos de outras operações.
        ConsultaTitulo consultaNome = new ConsultaTitulo();
        jDesktopPane1.add(consultaNome);
        consultaNome.pack();
        consultaNome.setVisible(true);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        CadastroUsuarios cadastroUsr = new CadastroUsuarios();
        jDesktopPane1.add(cadastroUsr);
        cadastroUsr.pack();
        cadastroUsr.controle();
        cadastroUsr.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        ListarLivros lista = new ListarLivros();
        jDesktopPane1.add(lista);
        lista.pack();
        lista.controle();
        lista.setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        limpaHash(); //Garante que o HashMap aux não trabalhe com resíduos de outras operações.
        ConsultaArea consulta = new ConsultaArea();
        jDesktopPane1.add(consulta);
        consulta.pack();
        consulta.controle();
        consulta.setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    //Método executado ao apertar no MenuItem SAIR.
    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        //INÍCIO DA GRAVAÇÂO DO ARQUIVO DOS LIVROS
        arquivoLivros.abrirGravar(); //Abrindo arquivo dos livros para gravação.
        arquivoLivros.gravar(livro); //Gravando os dados do LinkedList LIVROS no arquivo dos livros.
        arquivoLivros.fechaGravar(); //Fechando o arquivo.
        //FIM DA GRAVAÇÂO DO ARQUIVO DOS LIVROS
        
        //INÍCIO DA GRAVAÇÂO DO ARQUIVO DOS USUÁRIOS
        arquivoUsuarios.abrirGravar(); //Abrindo arquivo dos usuários para gravação.
        arquivoUsuarios.gravar(usuario); //Gravando os dados do LinkedList USUARIOS no arquivo dos usuários.
        arquivoUsuarios.fechaGravar(); //Fechando o arquivo.
        //FIM DA GRAVAÇÂO DO ARQUIVO DOS USUÁRIOS
        
        System.exit(0); //Finalizando o programa (Matando o processo).
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    //Método executado ao apertar no "X" para fechar o programa.
    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        //INÍCIO DA GRAVAÇÂO DO ARQUIVO DOS LIVROS
        arquivoLivros.abrirGravar(); //Abrindo arquivo dos livros para gravação.
        arquivoLivros.gravar(livro); //Gravando os dados do LinkedList LIVROS no arquivo dos livros.
        arquivoLivros.fechaGravar(); //Fechando o arquivo.
        //FIM DA GRAVAÇÂO DO ARQUIVO DOS LIVROS
        
        //INÍCIO DA GRAVAÇÂO DO ARQUIVO DOS USUÁRIOS
        arquivoUsuarios.abrirGravar(); //Abrindo arquivo dos usuários para gravação.
        arquivoUsuarios.gravar(usuario); //Gravando os dados do LinkedList USUARIOS no arquivo dos usuários.
        arquivoUsuarios.fechaGravar(); //Fechando o arquivo.
        //FIM DA GRAVAÇÂO DO ARQUIVO DOS USUÁRIOS
        
        System.exit(0); //Finalizando o programa (Matando o processo).
    }//GEN-LAST:event_formWindowClosing

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        AlteraLivros altera = new AlteraLivros();
        jDesktopPane1.add(altera);
        altera.pack();
        altera.setVisible(true);
        altera.controle();
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
        Sistema.limpaHash(); //Garante que o HashMap aux não trabalhe com resíduos de outras operações.
        ConsultaNacionalidade consulta = new ConsultaNacionalidade();
        jDesktopPane1.add(consulta);
        consulta.pack();
        consulta.setVisible(true);
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        Sistema.limpaHash(); //Garante que o HashMap aux não trabalhe com resíduos de outras operações.
        ConsultaAutor consultaAutor = new ConsultaAutor();
        jDesktopPane1.add(consultaAutor);
        consultaAutor.pack();
        consultaAutor.setVisible(true); 
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        AlugaLivro aluga = new AlugaLivro();
        jDesktopPane1.add(aluga);
        aluga.pack();
        aluga.controle();
        aluga.setVisible(true);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

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
            java.util.logging.Logger.getLogger(Sistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sistema().setVisible(true);
            }
        });
    }
    
    // -- MÉTODOS CHAMADOS NO CADASTRALIVROS --
    //Verifica se os livros são iguais.
    public static boolean checaIgualdade(Livro a) {
        Livro b;
        for(int i = 0; i < livro.size(); i++) {
            b = livro.get(i);
            //Verificando se os atributos dos livros estão iguais.
            if(a.getTitulo().equalsIgnoreCase(b.getTitulo()) && a.getAutor().equalsIgnoreCase(b.getAutor()) && 
                    a.getNacionalidadeAutor().equals(b.getNacionalidadeAutor()) && a.getAutor2().equalsIgnoreCase(b.getAutor2()) && 
                    a.getNacionalidadeAutor2().equals(b.getNacionalidadeAutor2()) && a.getAutor3().equalsIgnoreCase(b.getAutor3()) && 
                    a.getNacionalidadeAutor3().equals(b.getNacionalidadeAutor3()) && a.getAutor4().equalsIgnoreCase(b.getAutor4()) && 
                    a.getNacionalidadeAutor4().equals(b.getNacionalidadeAutor4()) && a.getIdioma().equalsIgnoreCase(b.getIdioma()) 
                    && a.getMidia().equalsIgnoreCase(b.getMidia()) && a.getEditora().equalsIgnoreCase(b.getEditora()) 
                    && a.getAno().equalsIgnoreCase(b.getAno()) && getEscopo(a).equalsIgnoreCase(getEscopo(b)) 
                    && getClasse(a).equalsIgnoreCase(getClasse(b))) {
                j = i; //Igualando o J à posição do livro encontrado.
                return true;
            }
            
        }
        
        return false;
    }
    
    //Caso os livros sejam diferentes, o método apenas adiciona o livro no LinkedList livro.
    public static void cadastraLivro(Livro l) {
        if(l != null) 
            livro.add(l);
    }
    
    //Caso os livros sejam iguais, o método apenas soma o valor digitado pelo usuário com a quantidade já pré-definida de exemplares do livro.
    public static void cadastraLivroIgual(int num, Component a) {
        int op = JOptionPane.showConfirmDialog(a, "Livro já cadastrado, deseja incrementar a quantidade de exemplares?");
        
        if(op == JOptionPane.YES_OPTION) {
            livro.get(j).setQtde(livro.get(j).getQtde() + num);
            JOptionPane.showMessageDialog(a, "Cadastrado com sucesso, agora com " + livro.get(j).getQtde() + " exemplares.",
                "Oops!!", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    // -- FIM DOS MÉTODOS CHAMADOS NO CADASTRALIVROS --
    
    
    // -- MÉTODOS CHAMADOS NO CADASTRAUSUARIO --
    //Método que verifica se o Apelido desejado pelo Usuário já não está em uso. 
    public static boolean checaApelido(String apelido) {
        Aluno auxA;
        Professor auxP;
        
        for(Usuario u : usuario)
            if(!(u instanceof Funcionario)) {
                if(u instanceof Aluno) {
                    auxA = (Aluno) u;
                    if(apelido.equalsIgnoreCase(auxA.getApelido()))
                        return true;
                }
                else if(u instanceof Professor) {
                    auxP = (Professor) u;
                    if(apelido.equalsIgnoreCase(auxP.getApelido()))
                        return true;
                }
            }
        //Chegar até aqui significa que nenhum Apelido igual foi encontrado.
        return false;
    }
    
    //Método que verifica se a matrícula do aluno já não está em uso.
    public static boolean checaMatr(String matr) {
        Aluno auxU;
        for(Usuario u : usuario)
            if(u instanceof Aluno) {
                auxU = (Aluno) u;
                if(matr.equals(auxU.getMatr()))
                    return true;
            }
        //Chegar até aqui siginifica que nenhuma matrícula igual foi encontrada.
        return false;
    }
    
    //Adiciona Usuario no LinkedList usuario.
    public static void cadastraUsuario(Usuario u) {
        if(u != null)
            usuario.add(u);
    }
    // -- FIM DOS MÉTODOS CHAMADOS NO CADASTRAUSUARIOS --
    
    // -- MÉTODOS CHAMDOS NO LISTARLIVROS
    public static void ordenaLivros(DefaultListModel model) {
        LinkedList<String> lOrdenado = new LinkedList<>();
        
        for(Livro l : livro)
            lOrdenado.add(l.getTitulo());
        
        Collections.sort(lOrdenado);

        for(String s : lOrdenado)
            model.addElement(s);
    }
    // -- FIM DOS MÉTODOS CHAMDOS NO LISTARLIVROS
    
    
    // -- MÉTODOS CHAMADOS NO CONSULTATITULO --
    //Método que percorre o LinkedList livro comparando o seu Título.
    public static void consultaTitulo(String s, javax.swing.JList<String> lista, ConsultaTitulo c) {
        DefaultListModel modelo = new DefaultListModel();
        lista.setModel(modelo);
        j = 0; //No caso de consulta, o J precisa sempre iniciar em ZERO, ele vai representar o item selecionado no model.
                
        for(int i = 0; i < livro.size(); i++)
            //Compara o título dos Livros.
            if(s.equalsIgnoreCase(livro.get(i).getTitulo())) {
                modelo.addElement(livro.get(i).getTitulo()); //Adicionando item no modelo da jList.
                aux.put(j, i); //Adicionando o valor de J e o de I no HashMap AUX.
                j++;
            }
        
        //Se j é igual à ZERO, ou seja, em nenhum momento ele foi incrementado (não entrou no if).
        if(j == 0)
            JOptionPane.showMessageDialog(c, "Nenhum Livro foi encontrado.", 
                "Oops!!", JOptionPane.ERROR_MESSAGE);
    }
    // -- FIM DOS MÉTODOS CHAMADOS NO CONSULTATITULO --
    
    
    // -- MÉTODOS CHAMADOS NO CONSULTAAUTOR --
    //Método que percorre o LinkedList livro comparando o(s) seu(s) Autor(es).
    public static void consultaAutor(String s, javax.swing.JList<String> lista, ConsultaAutor c) {
        DefaultListModel modelo = new DefaultListModel();
        lista.setModel(modelo);
        j = 0; //No caso de consulta, o J precisa sempre iniciar em ZERO, ele vai representar o item selecionado no model.
                
        for(int i = 0; i < livro.size(); i++)
            //Compara os Autores dos Livros.
            if(s.equalsIgnoreCase(livro.get(i).getAutor()) || s.equalsIgnoreCase(livro.get(i).getAutor2())
                    || s.equalsIgnoreCase(livro.get(i).getAutor3()) || s.equalsIgnoreCase(livro.get(i).getAutor4())) {
                modelo.addElement(livro.get(i).getTitulo()); //Adicionando item no modelo da jList.
                aux.put(j, i); //Adicionando o valor de J e o de I no HashMap AUX.
                j++;
            }
        
        //Se j é igual à ZERO, ou seja, em nenhum momento ele foi incrementado (não entrou no if).
        if(j == 0)
            JOptionPane.showMessageDialog(c, "Nenhum Livro foi encontrado.", 
                "Oops!!", JOptionPane.ERROR_MESSAGE);
    }
    // -- FIM DOS MÉTODOS CHAMADOS NO CONSULTAAUTOR --
    
    
    // -- MÉTODOS CHAMADOS NO CONSULTANACIONALIDADE --
    //Método que percorre o LinkedList livro comparando a Nacionalidade do(s) seu(s) Autor(es).
    public static void consultaNacionalidade(String s, javax.swing.JList<String> lista, ConsultaNacionalidade c) {
        DefaultListModel modelo = new DefaultListModel();
        lista.setModel(modelo);
        j = 0; //No caso de consulta, o J precisa sempre iniciar em ZERO, ele vai representar o item selecionado no model.
                
        for(int i = 0; i < livro.size(); i++)
            //Compara a Nacionalidade dos Autores dos Livros.
            if(s.equalsIgnoreCase(livro.get(i).getNacionalidadeAutor()) || s.equalsIgnoreCase(livro.get(i).getNacionalidadeAutor2())
                    || s.equalsIgnoreCase(livro.get(i).getNacionalidadeAutor3()) || s.equalsIgnoreCase(livro.get(i).getNacionalidadeAutor4())) {
                modelo.addElement(livro.get(i).getTitulo()); //Adicionando item no modelo da jList.
                aux.put(j, i); //Adicionando o valor de J e o de I no HashMap AUX.
                j++;
            }
        
        //Se j é igual à ZERO, ou seja, em nenhum momento ele foi incrementado (não entrou no if).
        if(j == 0)
            JOptionPane.showMessageDialog(c, "Nenhum Livro foi encontrado.", 
                "Oops!!", JOptionPane.ERROR_MESSAGE);
    }
    // -- FIM DOS MÉTODOS CHAMADOS NO CONSULTANACIONALIDADE --
    
    
    // -- MÉTODOS CHAMADOS NO CONSULTAAREA --
    //Método que percorre o LinkedList livro comparando o seu Escopo.
    public static void consultaArea(String s, javax.swing.JList<String> lista, ConsultaArea c) {
        DefaultListModel modelo = new DefaultListModel();
        lista.setModel(modelo);
        j = 0; //No caso de consulta, o J precisa sempre iniciar em ZERO, ele vai representar o item selecionado no model.
                
        for(int i = 0; i < livro.size(); i++)
            //Compara o escopo que o livro abrange.
            if(s.equalsIgnoreCase(getEscopo(livro.get(i)))) {
                modelo.addElement(livro.get(i).getTitulo()); //Adicionando item no modelo da jList.
                aux.put(j, i);
                j++;
            }
        
        //Se j é igual à ZERO, ou seja, em nenhum momento ele foi incrementado (não entrou no if).
        if(j == 0)
            JOptionPane.showMessageDialog(c, "Nenhum Livro foi encontrado.", 
                "Oops!!", JOptionPane.ERROR_MESSAGE);
    }
    // -- FIM DOS MÉTODOS CHAMADOS NO CONSULTAAREA --
    
    
    // -- MÉTODOS CHAMADOS NO ALTERALIVRO --
    //Método que pesquisa e compara as informações dadas por parâmetro com os livros já cadastrados. Chamado em AlteraLivros.
    public static boolean consultaAltera(String titulo, String autor, String autor2, String autor3, String autor4,
            String editora, String ano, String idioma) {
        for(int i = 0; i < livro.size(); i++) {
            if(titulo.equalsIgnoreCase(livro.get(i).getTitulo()) && autor.equalsIgnoreCase(livro.get(i).getAutor())
                    && autor2.equalsIgnoreCase(livro.get(i).getAutor2()) && autor3.equalsIgnoreCase(livro.get(i).getAutor3())
                    && autor4.equalsIgnoreCase(livro.get(i).getAutor4()) && ano.equalsIgnoreCase(livro.get(i).getAno()) && 
                    idioma.equalsIgnoreCase(livro.get(i).getIdioma())) {
                j = i; //Iguala o J à posição do livro encontrado.
                Sistema.i = j;
                return true;
            }
        }
        
        return false;
    }
    
    //Método que altera o livro. Remove o livro anterior e então adiciona o alterado na mesma posição.
    public static void alteraLivro(Livro l) {
        livro.remove(j); //Remove o livro do LinkedList LIVRO na posição J.
        livro.add(j, l); //Adiciona o livro, passado por parâmetro, na posição J.
    }
    
    //Método que remove o livro do LinkedList livro, e o seu título do TreeSet livroOrdenado.
    public static void removeLivro() {
        livro.remove(j);
    }
    
    public static void removeLivroAux() {
        livro.remove(i);
    }
    // -- FIM DOS MÉTODOS CHAMADOS NO ALTERALIVRO --
    
    
    // -- MÉTODOS CHAMADOS NO ALUGALIVRO --
    //Método que pesquisa o livro no LinkedList LIVRO.
    public static boolean consultaAluga(String titulo, String autor, String autor2, String autor3, String autor4,
            String editora, String ano, String idioma) {
        for(int i = 0; i < livro.size(); i++)
            if(titulo.equalsIgnoreCase(livro.get(i).getTitulo()) && autor.equalsIgnoreCase(livro.get(i).getAutor()) 
                   && autor2.equalsIgnoreCase(livro.get(i).getAutor2()) && editora.equalsIgnoreCase(livro.get(i).getEditora()) 
                   && autor3.equalsIgnoreCase(livro.get(i).getAutor3()) && ano.equalsIgnoreCase(livro.get(i).getAno())
                   && autor4.equalsIgnoreCase(livro.get(i).getAutor4()) && idioma.equalsIgnoreCase(livro.get(i).getIdioma())) {
                j = i; //Iguala o J à posição do livro encotrado.
                return true;
            }
        //Chegar até aqui siginifica que nenhum livro foi encontrado.
        return false;
    }
    
    //Método que checa a combinação entre um determinado apelido e senha.
    public static boolean checaUsuario(String apelido, String senha) {
        Aluno auxA;
        Professor auxP;
        for(int i = 0; i < usuario.size(); i++)
            if(!(usuario.get(i) instanceof Funcionario))
                if(usuario.get(i) instanceof Aluno) {
                    auxA = (Aluno) usuario.get(i);
                    if(apelido.equals(auxA.getApelido()) && senha.equals(auxA.getSenha())) {
                        Sistema.i = i; //Igualando o I à posição do Usuário encontrada.
                        return true;
                    }
                }
                else if(usuario.get(i) instanceof Professor) {
                    auxP = (Professor) usuario.get(i);
                    if(apelido.equals(auxP.getApelido()) && senha.equals(auxP.getSenha())) {
                        Sistema.i = i; //Igualando o I à posição do Usuário encontrada.
                        return true;
                    }
                }
        
        //Chegar até aqui siginifica que nenhuma combinação foi encontrada.
        return false;
    }
    
    //Método que aluga um determinado livro.
    public static void alugaLivro() throws SemLivroException {
            usuario.get(i).alugaLivro(livro.get(j));
    }
    
    //Método que devolve o livro alugado.
    public static void devolveLivro() throws SemAlugadoException {
            usuario.get(i).devolveLivro(livro.get(j));
    }
    //FIM DOS MÉTODOS CHAMADOS NO ALUGALIVRO    
    
    //MÉTDOS GENÉRICOS
    //Método que retorna o LinkedList livro.
    public static LinkedList<Livro> getLivros() {
        return livro;
    }
    
    //Método que retorna o HashMap aux.
    public static HashMap<Integer, Integer> getHash() {
        return aux;
    }
    
    //Método para limpar o HashMap aux.
    public static void limpaHash() {
        aux.clear();
    }
    
    //Método para verificar se no campo onde requer números foi digitado algum caractere.
    public static void checaNum(String c) throws NumberFormatException {
        char p;
        
        for(int i = 0; i < c.length(); i++) {
            p = c.charAt(i);
            
            if(Character.isLetter(p))
                throw new NumberFormatException();
        }
    }
    
    //Método que checa se o números digitado é um inteiro positivo. (NumeroInteiroException é uma exceção criada por nós)
    public static void checaInt(double num) throws NumeroInteiroException {
        int aux = (int) num;
        
        if(!(aux == num && aux > 0))
            throw new NumeroInteiroException("Apenas números inteiros e positivos são permitidos.");
    }
    
    public static void checaAno(String s) throws AnoException {
        int ano = Integer.parseInt(s);
        
        if(ano > 9999 || ano < 1000)
            throw new AnoException("Digite um ano válido!");
    }
    
    /*Método utilizado para pegar a área que o livro abrange (Método para economizar linhas 
    e não fazer comaparações desnecessárias).*/
    public static String getEscopo(Livro l) {
        String s = null;
        
        if(l instanceof LivroEntretenimento) {
            LivroEntretenimento auxL = (LivroEntretenimento) l;
            s = auxL.getGenero();
        }
        else if(l instanceof LivroAcademico) {
            LivroAcademico auxL = (LivroAcademico) l;
            s = auxL.getArea();
        }
        else if(l instanceof LivroInformativo) {
            LivroInformativo auxL = (LivroInformativo) l;
            s = auxL.getAssunto();
        }
        else if(l instanceof LivroPeriodico) {
            LivroPeriodico auxL = (LivroPeriodico) l;
            s = auxL.getArea();
        }
        
        return s;
    }
    
    /*Método utilizado para pegar uma String equivalente ao nome da classe em que o Livro pertence. 
    (Serve para evitar de fazer comparações desnecessárias e também para economizar linhas de código).*/
    public static String getClasse(Livro l) {
        String s = null;
        
        if(l instanceof LivroEntretenimento) 
            s = "LivroEntretenimento";
        
        else if(l instanceof LivroAcademico) 
            s = "LivroAcademico";
        
        else if(l instanceof LivroInformativo) 
            s = "LivroInformativo";
        
        else if(l instanceof LivroPeriodico) 
            s = "LivroPeriodico";
        
        return s;
    }
    // -- FIM DOS MÉTODOS GENÉRICOS --

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    // End of variables declaration//GEN-END:variables
    private ArquivoLivros arquivoLivros = new ArquivoLivros("livros.ser");
    private static LinkedList<Livro> livro = new LinkedList<>();
    public static int j; //Variável usada como controle no cadastro de livros iguais, alteração e na remoção de um livro (Representa a posição do Livro na Coleção).
    public static int i; //Variável usada como controle ao Alugar ou Devolver um livro.
    private ArquivoUsuarios arquivoUsuarios = new ArquivoUsuarios("usuarios.ser");
    private static LinkedList<Usuario> usuario = new LinkedList<>();
    private static HashMap<Integer, Integer> aux = new HashMap<>(); //Coleção que serve para armazenar e retornar a posição do livro a ser exibido o toString() ao seu título ser clicado em um jList.
}
