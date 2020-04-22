package biblioteca;

public class LivroEntretenimento extends Livro {
   private String genero;
   
   public LivroEntretenimento(String titulo, String autor, String nacionalidadeAutor, String autor2, 
            String nacionalidadeAutor2, String autor3, String nacionalidadeAutor3, String autor4, 
            String nacionalidadeAutor4, int qtdeEx, String lingua, String midia,
            String editora, String ano, String genero) {
        super(titulo, autor, nacionalidadeAutor, autor2, nacionalidadeAutor2, autor3, nacionalidadeAutor3, 
            autor4, nacionalidadeAutor4, qtdeEx, lingua, midia, editora, ano);
        this.genero = genero;
    }
   
   public void setGenero(String genero) {
       this.genero = genero;
   }
   
   public String getGenero() {
       return genero;
   }
   
   public String toString() {
        return super.toString() + "\nGenero: " + genero;
    }
}
