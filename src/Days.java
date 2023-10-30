import java.util.ArrayList;
import java.util.Scanner;

public class Days {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter month");
        int month = scan.nextInt();
        System.out.println("Enter year");
        int year = scan.nextInt();
        int days = switch (month) {
            case 2 -> {
                if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
                yield 29;
                else
                yield 28;
            }
            case 4, 6, 9, 11 -> 30;
            default -> 31;
        };
       System.out.println(days);
}
}