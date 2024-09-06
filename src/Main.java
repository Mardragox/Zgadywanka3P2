import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        System.out.println("elo byniu");
        System.out.println("elo poter");

        int wylosowanaliczba = (int) (Math.random()*100+1);
        System.out.println(wylosowanaliczba);
        //rzutowanie
        /*
        typy protse przechowują tylko wartość
        logiczne boolean
        całkowite byte short int long
        rzeczuywiste float double
        znakowy char

        typy złożone obiekty własności i metody
        string integer kosc
        */
        System.out.println(wylosowanaliczba);


        //wyczytywanie z klawiatury

        Scanner klawiatura = new Scanner(System.in);
        System.out.println("Podaj Liczbę");
        int wpisanaliczba = klawiatura.nextInt();

        //instrukcja warunkowa
        if(wpisanaliczba == wylosowanaliczba) {
            System.out.println("Wygrana");
        }
        else{
            System.out.println("Przegrałeś");
        }


    }
}