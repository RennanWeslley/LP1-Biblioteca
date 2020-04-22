package biblioteca;

import static biblioteca.Sistema.getClasse;
import static biblioteca.Sistema.getEscopo;
import java.io.Serializable;
import java.util.LinkedList;

public abstract class Usuario implements Serializable {
    protected String nome;
    protected String rua;
    protected String numeroCasa;
    protected String cep;
    protected String complemento;
    protected int cod;
    protected int alugados;
    protected LinkedList<Livro> livrosAlugados = new LinkedList<>();
    private static int aux = 0;
    
    public Usuario(String nome, String rua, String numeroCasa, String cep, String complemento) {
        this.nome = nome;
        this.rua = rua;
        this.numeroCasa = numeroCasa;
        this.cep = cep;
        this.complemento = complemento;
        alugados = 0;
        cod = aux++;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setRua(String rua) {
        this.rua = rua;
    }
    
    public String getRua() {
        return rua;
    }
    
    public void setNum(String numeroCasa) {
        this.numeroCasa = numeroCasa;
    }
    
    public String getNum() {
        return numeroCasa;
    }
    
    public void setCep() {
        this.cep = cep;
    }
    
    public String getCep() {
        return cep;
    }
    
    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }
    
    public String getComplemento() {
        return complemento;
    }
    
    public int getCod() {
        return cod;
    }
    
    public void alugaLivro(Livro l) throws SemLivroException {
        //Limite de livro alugado por usuário = 3, por nós estipulado.
        if(alugados < 3) {
            l.setAlugado();
            livrosAlugados.add(l);
            alugados++;
        }
    }
    
    public String getLivrosAlugados() {
        String livros = "Títulos: ";
        
        for(int i = 0; i < livrosAlugados.size(); i++) {
            if(!((i+1) >= livrosAlugados.size()))
                livros += livrosAlugados.get(i).getTitulo() + ", ";
            else
                livros += livrosAlugados.get(i).getTitulo() + ".";
        }
        
        return livros;
    }
    
    public int getAlugados() {
        return alugados;
    }
    
    public void devolveLivro(Livro l) throws SemAlugadoException {
        if(alugados > 0) {
            Livro b;
            Livro a;
            for(int i = 0; i < livrosAlugados.size(); i++) {
                b = livrosAlugados.get(i);
                a = l;
                //Checa a igualdade dos livros.
                if(a.getTitulo().equalsIgnoreCase(b.getTitulo()) && a.getAutor().equalsIgnoreCase(b.getAutor()) && 
                    a.getNacionalidadeAutor().equals(b.getNacionalidadeAutor()) && a.getAutor2().equalsIgnoreCase(b.getAutor2()) && 
                    a.getNacionalidadeAutor2().equals(b.getNacionalidadeAutor2()) && a.getAutor3().equalsIgnoreCase(b.getAutor3()) && 
                    a.getNacionalidadeAutor3().equals(b.getNacionalidadeAutor3()) && a.getAutor4().equalsIgnoreCase(b.getAutor4()) && 
                    a.getNacionalidadeAutor4().equals(b.getNacionalidadeAutor4()) && a.getIdioma().equalsIgnoreCase(b.getIdioma()) 
                    && a.getMidia().equalsIgnoreCase(b.getMidia()) && a.getEditora().equalsIgnoreCase(b.getEditora()) 
                    && a.getAno().equalsIgnoreCase(b.getAno()) && getEscopo(a).equalsIgnoreCase(getEscopo(b)) 
                    && getClasse(a).equalsIgnoreCase(getClasse(b))) {
                    l.setDevolve();
                    livrosAlugados.remove(i);
                    alugados--;
                }
            }
        }
        else
            throw new SemAlugadoException("Esse usuário não alugou nenhum livro.");
    }
    
    public String toString() {
        return "Nome: " + nome + "   Código: " + cod + "\nRua: " + rua + "   Cep: " + cep +
                "\nNúmero da Casa: " + numeroCasa + "   Complemento: " + complemento;
    }
}
