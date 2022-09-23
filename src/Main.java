import java.util.Scanner;

public class Main {
    static void pattern(int number) {

        if (number > 0) {
            System.out.println(number + " ");
            pattern(number - 5);
        }

        System.out.println(number + " ");

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen Bir Sayı Girniz = ");
        int nmbr = input.nextInt();
        pattern(nmbr);

    }
}
