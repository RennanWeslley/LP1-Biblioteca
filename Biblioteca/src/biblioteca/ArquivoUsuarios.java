package biblioteca;

import java.io.EOFException;
import java.io.IOException;
import java.util.LinkedList;

public class ArquivoUsuarios extends Arquivo {
    private LinkedList<Usuario> lista = new LinkedList<>();
    
    public ArquivoUsuarios(String nome) {
        super(nome);
        super.setTipo("Usuários");
    }
    
    public void ler() {
        boolean aindaTemArquivos = true;
        
        try{
            while(aindaTemArquivos)
                lista.add((Usuario) input.readObject());
        }
        catch(EOFException e) {
            aindaTemArquivos = false;
        }
        catch(IOException e) {
            System.err.println("Erro durante leitura do arquivo dos Usuários.");
            System.exit(1);
        }
        catch(ClassNotFoundException e) {
            System.err.println("Falha durante leitura do arquivo dos Usuários - Obejto não encontrado.");
        }
        
        aindaTemArquivos = true;
    }
    
    public void gravar(LinkedList<Usuario> lista) {
        try {
            for(Usuario u : lista)
                output.writeObject(u);
        }
        catch(IOException e) {
            System.err.println("Erro durante gravação de dados no arquivo dos Usuários.");
        }
    }
    
    public LinkedList<Usuario> getLista() {
        return lista;
    }
}