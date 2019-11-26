package zadanie1;

import java.util.Scanner;

public class SeasonUtil {


     static String[] printSeason() {
        Scanner sc = new Scanner(System.in);
        Season season = null;

        System.out.println("Podaj nazwę pory roku: ");
        System.out.println("Do wyboru: " + " Wiosna, Lato, Jesień lub Zima");

        switch (sc.nextLine()) {
            case "Wiosna":
                season = Season.SPRING;
                String spr = season.getName();
                System.out.println(spr);
                break;
            case "Lato":
                season = Season.SUMMER;
                String sum = season.getName();
                System.out.println(sum);
                break;
            case "Jesień":
                season = Season.AUTUMN;
                String aut = season.getName();
                System.out.println(aut);
                break;
            case "Zima":
                season = Season.WINTER;
                String win = season.getName();
                System.out.println(win);
                break;
            default:
                sc.close();
        }
        return season.getMonths();
    }
}
