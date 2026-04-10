
package classes;

/**
 *
 * @author Vitor
 */
public class Tecnico {
    private String nome;
    private String nacionalidade;
    private int anoNascimento;

    public Tecnico(String nome, String nacionalidade, int anoNascimento) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.anoNascimento = anoNascimento;
    }
    
    public Tecnico(Tecnico outro){
        this.nome = outro.getNome();
        this.nacionalidade = outro.getNacionalidade();
        this.anoNascimento = outro.getAnoNascimento();
    }
    
    public void copiar(Tecnico outro){
        this.nome = outro.getNome();
        this.nacionalidade = outro.getNacionalidade();
        this.anoNascimento = outro.getAnoNascimento();
    }
    
    @Override
    public String toString() {
        return "Tecnico{" + "nome=" + nome + ", nacionalidade=" + nacionalidade + ", anoNascimento=" + anoNascimento + '}';
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }
    
    
}
