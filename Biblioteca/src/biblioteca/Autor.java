package biblioteca;

import java.io.Serializable;

public class Autor implements Serializable {
    private String nome;
    private String nacionalidade;
    
    public Autor(String nome, String nacionalidade) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }
    
    public String getNacionalidade() {
        return nacionalidade;
    }
}
