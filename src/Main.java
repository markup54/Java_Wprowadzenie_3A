import java.util.*;

public class Main {

    private static Set<Integer> wylosuj(){
        System.out.println("Losowanie 6 liczb do listy");
        HashSet<Integer> wylosowaneLiczby = new HashSet<>();
        while(wylosowaneLiczby.size()<6){
            int liczbaLosowana = (int)(Math.random()*100+1);
            wylosowaneLiczby.add(liczbaLosowana);
        }
        return wylosowaneLiczby;
    }
    private static List<Integer> wczytaj(){
        List<Integer> wczytaneLiczby = new ArrayList<>();
        Scanner klawiatura = new Scanner(System.in);
        for(int i =1 ; i <7;i++){
            System.out.println("Podaj "+i+" liczbę");
            int liczbaWpisana  = klawiatura.nextInt();
            while(wczytaneLiczby.contains(liczbaWpisana)){
                System.out.println("Podaj inną liczbę");
                liczbaWpisana  = klawiatura.nextInt();
            }
            wczytaneLiczby.add(liczbaWpisana);
        }
        return wczytaneLiczby;
    }
    private static List<Integer> podsumuj(Set<Integer> wylosowaneLiczby, List<Integer>wczytaneLiczby){
        List<Integer> trafione = new LinkedList<>();
        for(Integer wylosowana : wylosowaneLiczby){
            if(wczytaneLiczby.contains(wylosowana)){
                trafione.add(wylosowana);
            }
        }
        return trafione;
    }
    public static void main(String[] args) {

        Set<Integer> wylosowaneLiczby;
        wylosowaneLiczby = wylosuj();
        System.out.println("Wylosowane Liczby"+ wylosowaneLiczby);
        //wczytywanie 6 liczb z klawiatury bez powtórzeń
        List<Integer> wczytaneLiczby = wczytaj();
        System.out.println("Wczytane liczby "+wczytaneLiczby);

        //trafione
        List<Integer> trafione = podsumuj(wylosowaneLiczby,wczytaneLiczby);
        System.out.println("Trafione liczby "+trafione);
     }

}


