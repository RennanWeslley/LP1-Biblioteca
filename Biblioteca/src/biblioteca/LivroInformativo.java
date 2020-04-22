package biblioteca;

public class LivroInformativo extends Livro {
    private String assunto;
    
    public LivroInformativo(String titulo, String autor, String nacionalidadeAutor, String autor2, 
            String nacionalidadeAutor2, String autor3, String nacionalidadeAutor3, String autor4, 
            String nacionalidadeAutor4, int qtdeEx, String lingua, String midia,
            String editora, String ano, String assunto) {
        super(titulo, autor, nacionalidadeAutor, autor2, nacionalidadeAutor2, autor3, nacionalidadeAutor3, 
            autor4, nacionalidadeAutor4, qtdeEx, lingua, midia, editora, ano);
        this.assunto = assunto;
    }
    
    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }
    
    public String getAssunto() {
        return assunto;
    }
    
    public String toString() {
        return super.toString() + "\nAssunto: " + assunto;
    }
}
