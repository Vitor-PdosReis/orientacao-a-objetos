
package classes;

/**
 *
 * @author Vitor
 */
public class Time {
    private String nome;
    private String cidade;
    private int anoFundacao;
    private Tecnico tecnico;

    public Time(String nome, String cidade, int anoFundacao, Tecnico tecnico) {
        this.nome = nome;
        this.cidade = cidade;
        this.anoFundacao = anoFundacao;
        this.tecnico = new Tecnico(tecnico);
    }

    public Time(String nome, String cidade, int anoFundacao) {
        this.nome = nome;
        this.cidade = cidade;
        this.anoFundacao = anoFundacao;
    }
    
    public Time(Time outro){
        this.nome = outro.getNome();
        this.cidade = outro.getCidade();
        this.anoFundacao = outro.getAnoFundacao();
        this.tecnico = new Tecnico(outro.getTecnico());
    }

    public void copiar(Time outro){
        this.nome = outro.getNome();
        this.cidade = outro.getCidade();
        this.anoFundacao = outro.getAnoFundacao();
        this.tecnico = new Tecnico(outro.getTecnico());
    }
    
    @Override
    public String toString() {
        return "Time{" + "nome=" + nome + ", cidade=" + cidade + ", anoFundacao=" + anoFundacao + ", tecnico=" + tecnico + '}';
    }
    
    public void escalarTecnico(Tecnico t){
        this.tecnico = new Tecnico(t);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public int getAnoFundacao() {
        return anoFundacao;
    }

    public void setAnoFundacao(int anoFundacao) {
        this.anoFundacao = anoFundacao;
    }

    public Tecnico getTecnico() {
        return new Tecnico(tecnico);
    }

    public void setTecnico(Tecnico tecnico) {
        this.tecnico = new Tecnico(tecnico);
    }
    
    
}
