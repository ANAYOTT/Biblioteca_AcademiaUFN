// classe Livro
public class Livro 
{
    private String titulo; 
    private String autor;
    private String isbn;
    private boolean emprestado;
    
//método construtor 
    public Livro(String titulo, String autor, String isbn) 
    {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.emprestado = false;
    }

// método RESERVAR
    public boolean reservar() {
        if (!emprestado) {
            emprestado = true;
            return true; // Reserva bem-sucedida
        } else {
            return false; // Já emprestado, reserva falhou
        }
    }

 

    public void devolver() {
        emprestado = false;
    }

 

    public String getTitulo() {
        return titulo;
    }

 

    public String getIsbn() {
        return isbn;
    }

 

    public boolean isEmprestado() {
        return emprestado;
    }
}