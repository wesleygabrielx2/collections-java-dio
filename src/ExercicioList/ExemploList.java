package ExercicioList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ExemploList {
    public static void main(String[] args) {
        System.out.println("Crie a sua primeira lista");
        List<Double> notas = new ArrayList<Double>();
        notas.add(10.0);
        notas.add(3.4);
        notas.add(9.8);
        notas.add(5.0);
        notas.add(2.5);
        notas.add(1.0);
        notas.add(0.0);
        System.out.println(notas);

        /*System.out.println("Exiba a aposição da nota 5: " + notas.indexOf(5d));

        System.out.println("Adicione a nota 8 na posição 4:");
        notas.add(4,8d);
        System.out.println(notas);

        System.out.println("Substitua a nota 5 pela nota 6 :");
        notas.set(notas.indexOf(5d),6d );
        System.out.println(notas);

        System.out.println("Confira se a nota 5 esta dentro da lista: " + notas.contains(5d));

        System.out.println("Exiba a terceira nota adicionada:" + notas.get(3));

        System.out.println("Exiba a menor nota: " + Collections.min(notas));
        System.out.println("Exiba a maior nota: " + Collections.max(notas));


        Iterator<Double> iterator = notas.iterator();
        double soma = 0d;

        while (iterator.hasNext()){
            Double next = iterator.next();
            soma+= next;
        }
        System.out.println("Exiba a soma dos valores: " + soma);

        System.out.println("Exiba a media das notas: " + (soma/notas.size()));

        System.out.println("Remova a nota 0: ");
        notas.remove(0d);

        System.out.println("Remova a nota  na posiçao 0: ");
        notas.remove(0);*/

        System.out.println("Remova as notas menores que 7 e exiba a lista: ");
        Iterator<Double> iterator1 = notas.iterator();
        while (iterator1.hasNext()){
            Double next = iterator1.next();
            if(next < 7 ) iterator1.remove();
        }
        System.out.println(notas);

        System.out.println("Apague toda a lista: ");
        notas.clear();
        System.out.println(notas);

        System.out.println("Confira se a lista esta vazia: " + notas.isEmpty() );


    }
}
