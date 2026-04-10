package classes;

/**
 *
 * @author Vitor
 */
public class Produto {
    private String nome;
    private String categoria;
    private double preco;

    public Produto(){
        this.nome = "";
        this.categoria = "";
        this.preco = 0.0;
    }
    public Produto(String nome, String categoria, double preco) {
        this.nome = nome;
        this.categoria = categoria;
        this.preco = preco;
    }

    public Produto(Produto outro){
        this.nome = outro.getNome();
        this.categoria = outro.getCategoria();
        this.preco = outro.getPreco();
    }
    
    @Override
    public String toString() {
        return "Produto{" + "nome=" + nome + ", categoria=" + categoria + ", preco=" + preco + '}';
    }
    
    public void copiar(Produto outro){
        this.nome = outro.getNome();
        this.categoria = outro.getCategoria();
        this.preco = outro.getPreco();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    
}
