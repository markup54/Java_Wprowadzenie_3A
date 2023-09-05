import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //losowanie sześciu liczb

        //wylosowane liczby zapiszemy w tablicy
        //tablica w Javie może zawierać typy proste i złożone
        //tablica nie może zmieniać rozmiaru w trakcie działania programu

        System.out.println("Witamy, wylosujemy 6 liczb");
        int wylosowane [] = new int[6];
        for (int i =0; i <wylosowane.length;i++){
            wylosowane[i] = (int)(Math.random()*100+1);
            System.out.println(wylosowane[i]);
        }
        //losowanie liczb do kolekcji
        /*
        kolekcje:
        listy - ArrayList, LinkedList elementy uporządkowane, indeksowane, mogą się powtarzać
        set - HashSet, elementy najczęściej nieindeksowane, nieuporządkowany, nie mogą się powtarzać

         */
        System.out.println("Losowanie 5 liczb do listy");
        ArrayList<Integer> wylosowaneLiczby = new ArrayList<Integer>();
        Integer liczba; // typ złożony liczba to obiekt ma metody
        int liczba2;//typ prosty liczba2 nie ma metod to tylko zmienna

        while(wylosowaneLiczby.size()<6){
            int liczbaLosowana = (int)(Math.random()*100+1);
            wylosowaneLiczby.add(liczbaLosowana);
        }
        System.out.println("Wylosowane Liczby"+ wylosowaneLiczby);

    }

}


