package biblioteca;

import java.io.Serializable;
import javax.swing.JOptionPane;

public abstract class Livro implements Serializable{
    protected String titulo;
    protected Autor autor;
    protected Autor autor2;
    protected Autor autor3;
    protected Autor autor4;
    protected int qtdeEx;
    protected String idioma;
    protected String midia;
    protected String editora;
    protected String ano;
    protected int alugado;
    
    public Livro(String titulo, String autor, String nacionalidadeAutor, String autor2, String nacionalidadeAutor2,
            String autor3, String nacionalidadeAutor3, String autor4, String nacionalidadeAutor4, int qtdeEx, 
            String idioma, String midia, String editora, String ano) {
        
        this.titulo = titulo;
        this.autor = new Autor(autor, nacionalidadeAutor);
        this.autor2 = new Autor(autor2, nacionalidadeAutor2);
        this.autor3 = new Autor(autor3, nacionalidadeAutor3);
        this.autor4 = new Autor(autor4, nacionalidadeAutor4);
        this.qtdeEx = qtdeEx;
        this.idioma = idioma;
        this.midia = midia;
        this.editora = editora;
        this.ano = ano;
        alugado = 0;
    }
    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    public String getTitulo() {
        return titulo;
    }
    
    public String getAutor() {
        return autor.getNome();
    }
    
    public String getNacionalidadeAutor() {
        return autor.getNacionalidade();
    }
    
    public String getAutor2() {
        return autor2.getNome();
    }
    
    public String getNacionalidadeAutor2() {
        return autor2.getNacionalidade();
    }
    
    public String getAutor3() {
        return autor3.getNome();
    }
    
    public String getNacionalidadeAutor3() {
        return autor3.getNacionalidade();
    }
    
    public String getAutor4() {
        return autor4.getNome();
    }
    
    public String getNacionalidadeAutor4() {
        return autor4.getNacionalidade();
    }
    
    public void setQtde(int qtdeEx) {
        this.qtdeEx = qtdeEx;
    }
    
    public int getQtde() {
        return qtdeEx;
    }
    
    public void setIdioma(String lingua) {
        this.idioma = lingua;
    }
    
    public String getIdioma() {
        return idioma;
    }
    
    public void setMidia(String midia) {
        this.midia = midia;
    }
    
    public String getMidia() {
        return midia;
    }
    
    public void setEditora(String editora) {
        this.editora = editora;
    }
    
    public String getEditora() {
        return editora;
    }
    
    public void setAno(String ano) {
        this.ano = ano;
    }
    
    public String getAno() {
        return ano;
    }
    
    public void setAlugado() throws SemLivroException {
        if(getDisponiveis() > 0)
            alugado++;
        else 
            throw new SemLivroException("Sem livros disponíveis."); 
    }
    
    public void setDevolve() {
        alugado--;
    }
    
    public int getAlugados() {
        return alugado;
    }
    
    public int getDisponiveis() {
        return qtdeEx - alugado;
    }
    
    //Retorna a quantidade de autores do livro.
    public int getAutores() {
        int autores = 0;
        
        if(!autor.getNome().equals(""))
            autores++;
        
        if(!autor2.getNome().equals(""))
            autores++;
        
        if(!autor3.getNome().equals(""))
            autores++;
        
        if(!autor4.getNome().equals(""))
            autores++;
        
        return autores;
    }
    
    public String toString() {
        String s = null;
        
        //Exibe o toString de acordo com a quantidade de autores do livro.
        if(getAutores() == 4)
            s = "Titulo: " + titulo + "\nAno: " + ano + "\nAutor(es): " + autor.getNome() + " ("  + autor.getNacionalidade() + ")\n                 " +
                    autor2.getNome() + " ("  + autor2.getNacionalidade() + ")\n                 " + autor3.getNome() + " ("  + autor3.getNacionalidade() + ")\n                 " +
                    autor4.getNome() + " ("  + autor4.getNacionalidade() + ")" + "\nExemplares: " + qtdeEx + " (" + getDisponiveis() + 
                    " Disponíveis)" + "\nEditora: " + editora + "\nIdioma: " + idioma + "\nMídia: " + midia; 
        else if(getAutores() == 3)
            s = "Titulo: " + titulo + "\nAno: " + ano + "\nAutor(es): " + autor.getNome() + " ("  + autor.getNacionalidade() + ")\n                 " +
                    autor2.getNome() + " ("  + autor2.getNacionalidade() + ")\n                 " + autor3.getNome() + " ("  + autor3.getNacionalidade() + ")" + 
                    "\nExemplares: " + qtdeEx + " (" + getDisponiveis() + " Disponíveis)" + "\nEditora: " + editora + "\nIdioma: " + idioma + 
                    "\nMídia: " + midia;
        else if(getAutores() == 2)
            s = "Titulo: " + titulo + "\nAno: " + ano + "\nAutor(es): " + autor.getNome() + " ("  + autor.getNacionalidade() + ")\n                 " +
                    autor2.getNome() + " ("  + autor2.getNacionalidade() + ")" + "\nExemplares: " + qtdeEx + " (" + getDisponiveis() + 
                    " Disponíveis)" + "\nEditora: " + editora + "\nIdioma: " + idioma + "\nMídia: " + midia;
        else if(getAutores() == 1)
            s = "Titulo: " + titulo + "\nAno: " + ano + "\nAutor(es): " + autor.getNome() + " ("  + autor.getNacionalidade() + ")" + 
                    "\nExemplares: " + qtdeEx + " (" + getDisponiveis() + " Disponíveis)" + "\nEditora: " + editora + "\nIdioma: " + 
                    idioma + "\nMídia: " + midia;
        
        return s;
    }
}
