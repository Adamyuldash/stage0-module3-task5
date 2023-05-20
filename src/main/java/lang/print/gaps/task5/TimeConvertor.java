package lang.print.gaps.task5;

import java.util.Scanner;

public class TimeConvertor {

    public void convert(float minutes) {
        Scanner minut = new Scanner(System.in);
        System.out.println("Minutni kirgiz");
        int num = minut.nextInt();
        int s = num * 60;
        System.out.println(s + " Sekund!");
    }
}
