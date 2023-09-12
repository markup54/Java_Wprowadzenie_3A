import java.util.*;

public class Gra {
    private static Set<Integer> wylosowane = new HashSet<>();;
    private List<Integer> wczytane;
    private List<Integer> trafione;

    private void wylosuj(){
        System.out.println("Losowanie 6 liczb do listy");
        while(wylosowane.size()<6){
            int liczbaLosowana = (int)(Math.random()*100+1);
            wylosowane.add(liczbaLosowana);
        }
    }
    private void wczytaj(){
        wczytane = new ArrayList<>();
        Scanner klawiatura = new Scanner(System.in);
        for(int i =1 ; i <7;i++){
            System.out.println("Podaj "+i+" liczbę");
            int liczbaWpisana  = klawiatura.nextInt();
            while(wczytane.contains(liczbaWpisana)){
                System.out.println("Podaj inną liczbę");
                liczbaWpisana  = klawiatura.nextInt();
            }
            wczytane.add(liczbaWpisana);
        }
    }
    private void podsumuj(){
        trafione = new LinkedList<>();
        for(Integer wylosowana : wylosowane){
            if(wczytane.contains(wylosowana)){
                trafione.add(wylosowana);
            }
        }
    }

    public void zagraj(){
        wylosuj();
        wczytaj();
        podsumuj();
        System.out.println("Wczytano: "+wczytane);
        System.out.println("Wylosowano: "+wylosowane);
        System.out.println("TRafione: "+trafione);
    }
}
