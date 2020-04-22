package biblioteca;

public class Professor extends Usuario {
    private String area;
    private String apelido;
    private String senha;
    
    public Professor(String nome, String apelido, String senha, String rua, String numeroCasa, String cep, String complemento, String area) {
        super(nome, rua, numeroCasa, cep, complemento);
        this.apelido = apelido;
        this.senha = senha;
        this.area = area;
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
    
    public void setArea(String area) {
        this.area = area;
    }
    
    public String getArea() {
        return area;
    }
    
    public String toString() {
        return super.toString() + "\nÁrea: " + area + "Apelido: " + apelido;
    }
}
