import java.util.Scanner;

public class Main {
    static int sum(int a, int b) {
        int result = a + b;
        System.out.println("toplam: " + result);
        return result;
    }

    static int minus(int a, int b) {
        int result = a - b;
        System.out.println("fark: " + result);
        return result;
    }

    static int times(int a, int b) {
        int result = a * b;
        System.out.println("çarpım: " + result);
        return result;
    }

    static int divided(int a, int b) {
        if (b == 0) {
            System.out.println("2.sayı 0'dan farklı olmalıdır");
            return 0;
        }
        int result = a / b;
        System.out.println("bölüm: " + result);
        return result;
    }

    static int power(int a, int b) {
        int result = 1;
        for (int i = 1; i <= b; i++)
            result *= a;

        System.out.println("sonuç: " + result);
        return result;
    }

    static int mod(int a, int b) {
        int result = a % b;
        System.out.println("sonuç: " + result);
        return result;
    }

    static void calc(int a, int b) {
        System.out.println("çevresi: " + 2 * (a + b));
        System.out.println("alanı: " + (a * b));
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int select;
        String menu = "1- Toplama İşlemi \n"
                + "2-Çıkarma İşlemi \n"
                + "3-Çarpma İşlemi \n"
                + "4-Bölme İşlemi \n"
                + "5-Üslü Sayı Hesaplama \n"
                + "6-Mod Alma \n"
                + "7-Dikdörtgen Alan ve Çevre Hesabı \n"
                + "0-Çıkış Yap";
        System.out.println(menu);

        while (true) {
            System.out.println("bir işlem seçiniz: ");
            select = scan.nextInt();
            if (select == 0) {
                System.out.println("Bye Bye");
                break;
            }
            System.out.println("Bir sayı giriniz: ");
            int a = scan.nextInt();
            System.out.println("Bir sayı giriniz:");
            int b = scan.nextInt();
            switch (select) {
                case 1:
                    sum(a, b);
                    break;
                case 2:
                    minus(a, b);
                    break;
                case 3:
                    times(a, b);
                    break;
                case 4:
                    divided(a, b);
                    break;
                case 5:
                    power(a, b);
                    break;
                case 6:
                    mod(a, b);
                    break;
                case 7:
                    calc(a, b);
                    break;

                default:
                    System.out.println("geçersiz işlem girdiniz");
            }
        }
    }
}
