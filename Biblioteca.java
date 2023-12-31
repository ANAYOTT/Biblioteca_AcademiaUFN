import java.util.ArrayList;
import java.util.List;

 

public class Biblioteca {
    private List<Livro> catalogo;

 

    public Biblioteca() {
        catalogo =  new ArrayList<>();
    }

 

    public void adicionar_livro(Livro livro) {
        catalogo.add(livro);
    }

 

    public void remover_livro(String isbn) {
        catalogo.removeIf(livro -> livro.getIsbn().equals(isbn));
    }

 

    public List<Livro> buscar_por_titulo(String titulo) {
        List<Livro> livrosEncontrados = new ArrayList<>();
        for (Livro livro : catalogo) {
            if (livro.getTitulo().contains(titulo)) {
                livrosEncontrados.add(livro);
            }
        }
        return livrosEncontrados;
    }

 

    public boolean emprestar_livro(String isbn) {
        for (Livro livro : catalogo) {
            if (livro.getIsbn().equals(isbn)) {
                return livro.reservar();
            }
        }
        return false; // Livro não encontrado
    }

 

    public void devolver_livro(String isbn) {
        for (Livro livro : catalogo) {
            if (livro.getIsbn().equals(isbn)) {
                livro.devolver();
            }
        }
    }

 

    public List<Livro> listar_livros() {
        return catalogo;
    }
}