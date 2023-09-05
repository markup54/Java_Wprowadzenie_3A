import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Pierwszy program w Javie");
        System.out.println("wylosowanie jednej liczby z zakresu od 1 do 100");
        int wylosowana = (int) (Math.random() * 100 + 1);//Math.random() losowanie z zakresu <0,1)

        //System.out.println(wylosowana);
        //pozwalamy na 10 krotne zgadywanie

            System.out.println("podaj liczbę całkowitą z zakresu 1,100");
            Scanner klawiatura = new Scanner(System.in);
            int wpisana;
            wpisana = klawiatura.nextInt();
            while (wpisana != wylosowana) {
                if(wpisana<wylosowana)
                    System.out.println("Za mało wpisz więcej");
                else
                    System.out.println("za dużo wpisz mniej");
                System.out.println("Podaj kolejną liczbę");
                wpisana = klawiatura.nextInt();
            }
        }

        }


