public class Main {
    //nazwa pliku taka jak nazwa klasy
    //zwyczajowo klasa z wielkiej litery
    /*public static void main(String[] args) {
        System.out.println("Hello world!");
    }

     */
    public static void main(String[] args) {
        /*
        brak dostępne w pakiecie
        public dostępne wszędzie
        private dostępne tylko w tej klasie
        protected dostępne w tej klasie w klasach dziedziczących dostępne w całym pakiecie
         */
        /*
        static metoda może być wywołana bez obiektu
         */
        System.out.println("Pierwszy program w Javie");
        System.out.println("wylosowanie jednej liczby z zakresu od 1 do 100");
        int wylosowana =(int) (Math.random()*100+1);//Math.random() losowanie z zakresu <0,1)
        //typy proste int,double,float, boolean,char
        //zmienne tych typów nie są obiektami
        //rzutowanie zawężające
        //z liczby która zajmuje więcej miejsca w pamięci liczbę zajmującą mniej miejsca w pamięci


        System.out.println(wylosowana);
    }
}