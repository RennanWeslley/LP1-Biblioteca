package biblioteca;

import java.io.*;

public abstract class Arquivo {
    protected String nome;
    protected String tipo;
    protected ObjectInputStream input;
    protected ObjectOutputStream output;
    protected boolean arquivoVazio = false;
    
    public Arquivo(String nome) {
        this.nome = "c:/Users/Rennan Weslley/Documents/Biblioteca/" + nome;
    }
    
    public void setNome(String nome) {
        this.nome = "c:/Users/Rennan Weslley/Documents/Biblioteca/" + nome;
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public String setTipo() {
        return tipo;
    }
    
    public void abrirLer() {
        try {
            System.out.println(nome);
            input = new ObjectInputStream(new FileInputStream(nome));
            /*Setando para FALSE novamente, caso não, 
            ARQUIVOVAZIO ficaria sempre TRUE se o programa tentasse acessar o arquivo vazio mesmo que só uma vez.*/
            arquivoVazio = false;
        }
        catch(EOFException e) {
            arquivoVazio = true;
        }
        catch(IOException e) {
            System.err.println("Falha durante abertura para leitura do arquivo dos " + tipo + ".");
            System.exit(1);
        }
    }
    
    public void fechaLer() {
        try {
            input.close();
        }
        catch(IOException e) {
            System.err.println("Falha no fechamento do arquivo dos " + tipo + " durante leitura.");
        }
    }
    
    public void abrirGravar() {
        try {
            output = new ObjectOutputStream(new FileOutputStream(nome));
        }
        catch(IOException e) {
            System.err.println("Falha ao abrir arquivo dos" + tipo + " para gravação.");
        }
    }
    
    public void fechaGravar() {
        try {
            output.flush();
            output.close();
        }
        catch(IOException e) {
            System.err.println("Falha no fechamento do arquivo dos" + tipo + " durante gravação.");
        }
    }
    
    public boolean getVazio() {
        return arquivoVazio;
    }
    
}
