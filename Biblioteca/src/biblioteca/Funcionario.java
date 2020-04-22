package biblioteca;

public class Funcionario extends Usuario {
    public Funcionario(String nome, String rua, String numeroCasa, String cep, String complemento) {
        super(nome, rua, numeroCasa, cep, complemento);
    }
    
    public String toString() {
        return super.toString();
    }
}
