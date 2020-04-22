package biblioteca;

import java.io.EOFException;
import java.io.IOException;
import java.util.LinkedList;

public class ArquivoLivros extends Arquivo {
    private LinkedList<Livro> lista = new LinkedList<>();
    
    public ArquivoLivros(String nome) {
        super(nome);
        super.setTipo("Livros");
    }
    
    public void ler() {
        boolean aindaTemArquivos = true;
        
        try{
            while(aindaTemArquivos)
                lista.add((Livro) input.readObject());
        }
        catch(EOFException e) {
            aindaTemArquivos = false;
        }
        catch(IOException e) {
            System.err.println("Erro durante leitura do arquivo dos livros.");
            System.exit(1);
        }
        catch(ClassNotFoundException e) {
            System.err.println("Falha durante leitura do arquivo dos livros - Obejto não encontrado.");
        }
        
        aindaTemArquivos = true;
    }
    
    public void gravar(LinkedList<Livro> lista) {
        try {
            for(Livro p : lista)
                output.writeObject(p);
        }
        catch(IOException e) {
            System.err.println("Erro durante gravação de dados no arquivo dos livros.");
        }
    }
    
    public LinkedList<Livro> getLista() {
        return lista;
    }
}