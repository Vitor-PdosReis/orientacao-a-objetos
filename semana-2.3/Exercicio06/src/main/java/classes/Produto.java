
package classes;

/**
 *
 * @author Vitor
 */
public class Produto {
    private String codigo;
    private String nome;
    private int quantidadeEmEstoque;

    public Produto() {
        this.codigo = "";
        this.nome = "";
        this.quantidadeEmEstoque = 0;
    }
    
    public Produto(Produto outro){
        this.codigo = outro.getCodigo();
        this.nome = outro.getNome();
        this.quantidadeEmEstoque = outro.getQuantidadeEmEstoque();
    }
    
    public Produto(String codigo, String nome, int quantidadeEmEstoque) {
        this.codigo = codigo;
        this.nome = nome;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }
    
    public void copiar (Produto outro){
        this.codigo = outro.getCodigo();
        this.nome = outro.getNome();
        this.quantidadeEmEstoque = outro.getQuantidadeEmEstoque();
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public int getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setQuantidadeEmEstoque(int quantidadeEmEstoque) {
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    

    @Override
    public String toString() {
        return "Produto{" +
                "codigo= " + codigo +
                ", nome= " + nome +
                ", quantidadeEmEstoque= " + quantidadeEmEstoque +
                '}';
    }
}
