package OYBEK;

import java.util.Scanner;

import static java.lang.System.in;

public class Main {

    public static void main(String[] args) {
	// So`zda biz tanlagan harf borligini tekshirish

        Scanner scanner = new Scanner(in);
        System.out.print("So`zni kiriting: ");
        String str = scanner.nextLine();

        if (str.contains("a")) {
            System.out.println("a harfi bor");
        }else {
            System.out.println(str);
        }
    }
}
