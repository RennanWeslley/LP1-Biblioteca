package biblioteca;

public class LivroAcademico extends Livro {
    private String area;
    
    public LivroAcademico(String titulo, String autor, String nacionalidadeAutor, String autor2, 
            String nacionalidadeAutor2, String autor3, String nacionalidadeAutor3, String autor4, 
            String nacionalidadeAutor4, int qtdeEx, String lingua, String midia, String editora, 
            String ano, String area) {
        super(titulo, autor, nacionalidadeAutor, autor2, nacionalidadeAutor2, autor3, nacionalidadeAutor3, 
            autor4, nacionalidadeAutor4, qtdeEx, lingua, midia, editora, ano);
        this.area = area;
    }
    
    public void setArea(String area) {
        this.area = area;
    }
    
    public String getArea() {
        return area;
    }
    
    public String toString() {
        return super.toString() + "\nArea: " + area;
    }
}
