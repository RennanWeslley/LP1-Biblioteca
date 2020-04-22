package biblioteca;

public class Aluno extends Usuario {
    private String matr;
    private String apelido;
    private String senha;
    
    public Aluno(String nome, String apelido, String senha, String rua, String numeroCasa, String cep, String complemento, String matr) {
        super(nome, rua, numeroCasa, cep, complemento);
        this.apelido = apelido;
        this.senha = senha;
        this.matr = matr;
    }
    
    public void setApelido(String apelido) {
        this.apelido = apelido;
    }
    
    public String getApelido() {
        return apelido;
    }
    
    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    public String getSenha() {
        return senha;
    }
    
    public void setMatr(String matr) {
        this.matr = matr;
    }
    
    public String getMatr() {
        return matr;
    }
    
    public String toString() {
        return super.toString() + "\nMatrícula: " + matr + "Apelido: " + apelido;
    }
}
