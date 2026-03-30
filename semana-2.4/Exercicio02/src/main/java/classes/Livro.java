/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author Vitor
 */
public class Livro {
    private String titulo;
    private String autor;
    private int paginas;
    public static String NomeDaBiblioteca = "IfSudeste";
    
    public Livro(){
        this.titulo = getTitulo();
        this.autor = getAutor();
        this.paginas = getPaginas();
    }
    
    public Livro(String titulo, String autor, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }
    
    public Livro(Livro outro){
        this.titulo = outro.getTitulo();
        this.autor = outro.getAutor();
        this.paginas = outro.getPaginas();
    }
    
    public void copiar(Livro outro) {
        this.titulo = outro.getTitulo();
        this.autor = outro.getAutor();
        this.paginas = outro.getPaginas();
    }
    
    public void AlterarBiblioteca(String nome){
        NomeDaBiblioteca = nome;
    }
    
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    @Override
    public String toString() {
        return "Livro{" + "titulo=" + titulo + ", autor=" + autor + ", paginas=" + paginas + '}';
    }

   
    
    
}
