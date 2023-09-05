import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //losowanie sześciu liczb

        //wylosowane liczby zapiszemy w tablicy
        //tablica w Javie może zawierać tylko typy proste

        System.out.println("Witamy, wylosujemy 6 liczb");
        int wylosowane [] = new int[6];
        for (int i =0; i <wylosowane.length;i++){
            wylosowane[i] = (int)(Math.random()*100+1);
            System.out.println(wylosowane[i]);
        }

    }

}


