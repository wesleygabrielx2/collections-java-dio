package ExercicioSet;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

//Adicionando Series a uma lista.

public class ExemploOrdenacaoSet {
    public static void main(String[] args) {
        System.out.println("--\tOrdem aleatória\t--");
        Set<Serie> minhasSeries = new HashSet<>(){{
            add(new Serie("got","fantasia",60));
            add(new Serie("dark","drama",60));
            add(new Serie("how i meet your mother","comédia",30));
        }};
        for (Serie serie: minhasSeries) System.out.println(serie.getNome() + "-" +
                serie.getGenero() + "-" + serie.getTempoEpisodio());

        System.out.println("--\tOrdem natural (TempoEpisodio)\t--");
        Set<Serie> minhasSeries2 = new TreeSet<>(minhasSeries);
        for (Serie serie: minhasSeries2) System.out.println(serie.getNome() + "-" +
                serie.getGenero() + "-" + serie.getTempoEpisodio());

        System.out.println("--\tOrdem Nome/Gênero/TempoEpisodio\t--");
        Set<Serie> minhasSeries3 = new TreeSet<>(new ComparatorNomeGeneroTempoEpisodio());
        minhasSeries3.addAll(minhasSeries);
        for (Serie serie: minhasSeries3) System.out.println(serie.getNome() + "-" +
                serie.getGenero() + "-" + serie.getTempoEpisodio());


    }
}


