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

        //określanie jak duża była różnica pomiędzy wylosowaną a zgadniętej

        int roznica = wpisanaliczba > wylosowanaliczba ? wpisanaliczba - wylosowanaliczba : wylosowanaliczba - wpisanaliczba;
        System.out.println("Pomyłka o: " + roznica);
        System.out.println("Wylosowaną liczbą było: "+wylosowanaliczba);

        roznica = roznica/10; //dzielenie całkoweite
        switch (roznica){
            case 0:
                System.out.println("Hacker");
                break;
            case 1:
                System.out.println("God");
                break;
            case 2:
                System.out.println("Pro");
                break;
            default:
                System.out.println("Noobek");
                break;
        }
    }
}