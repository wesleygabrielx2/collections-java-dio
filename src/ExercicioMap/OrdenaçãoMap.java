package ExercicioMap;

import java.util.*;

/* Dado as seguintes informações sobre meus livros favoritos e seus autores,
crie um dicionario e ordene este dicionário:
exibindo (nome Autor - nome Livro)

Autor = Adams , Douglas - Livro = nome : O mochileiro das galaxias
Autor = Tolkien - Livro = nome : O Senhor dos anéis
Autor = C. S. Lewis - Livro = nome : As Cronicas de Narnia
 */
public class OrdenaçãoMap {
    public static void main(String[] args) {
        System.out.println("Ordem aleatoria: ");
        Map<String, Livro> meusLivros = new HashMap<>(){{
           put(" Adams, Douglas", new Livro("O mochileiro das galaxias",248));
           put(" Tolkien", new Livro("O Senhor dos Aneis",645));
           put(" C. S. Lewis", new Livro("As Cronicas de Narnia",457));
        }};
        for (Map.Entry<String, Livro> livro : meusLivros.entrySet())
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());

        System.out.println("Ordem Inserçao: ");
        Map<String, Livro> meusLivros1 = new LinkedHashMap<>(){{
            put(" Adams, Douglas", new Livro("O mochileiro das galaxias",248));
            put(" Tolkien", new Livro("O Senhor dos Aneis",645));
            put(" C. S. Lewis", new Livro("As Cronicas de Narnia",457));
        }};
        for (Map.Entry<String, Livro> livro : meusLivros1.entrySet())
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());

        System.out.println("Ordem alfabetica: ");
        Map<String, Livro> meusLivros2 = new TreeMap<>(meusLivros1);
        for (Map.Entry<String, Livro> livro : meusLivros2.entrySet())
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());

        System.out.println("Ordem Alfabetica nomes dos livros: ");
        Set<Map.Entry<String, Livro>> meusLivros3 = new TreeSet<>( new ComparatorNome());
        meusLivros3.addAll(meusLivros.entrySet());
        for (Map.Entry<String, Livro> livro : meusLivros3)
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());

    }
}
