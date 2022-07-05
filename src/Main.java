import java.util.Scanner;

public class Main {

    static int sum(int a, int b) {
        int result = a + b;

        System.out.println(result);
        return result;

    }

    static int minus(int a, int b) {
        int result = a - b;
        System.out.println(result);
        return result;
    }

    static int times(int a, int b) {
        int result = a * b;
        System.out.println(result);
        return result;
    }

    static int divide(int a, int b) {
        if(b==0){
            System.out.println("Tanimsiz sifirdan farkli deger giriniz.");

        }
        int result = a / b;
        System.out.println(result);
        return result;
    }
    static void power(int a,int b){
        int result=1;
        for(int i=1;i<=b;i++){

           result*=a;

        }System.out.println(result);

    }
    static void faktoriyel(int a){
        int result=1;
        for(int i=1;i<=a;i++){
            result*=i;
        }
        System.out.println(result);
    }

    static int mod(int a, int b) {
        int result = a % b;
        System.out.println(result);
        return result;
    }
    static int areaSqare(int a, int b){
        int area=a*b;
        System.out.println(area);
        return area;

    }static void cevre(int a, int b){
        int result=2*(a+b);
        System.out.println(result);
    }



    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String menu = "Yapilacak islemi seciniz." +
                "\n 1-Toplama islemi" + "\n " +
                "2-Çıkarma islemi\n " +
                "3-Carpma islemi \n " +
                "4-Bolme islemi\n " +
                "5-Us Hesaplama \n " +
                "6-Faktoriyel \n " +
                "7-Mod hesaplama \n " +
                "8-Dikdortgenin alainini hesaplama\n " +
                "9-Dikdörgenin cevresini hesaplama";
        System.out.println(menu);
        System.out.println("Lü" +
                "Lutfen işlem numarasini giiriniz: ");
        int select = input.nextInt();


        while (true) {

            System.out.println("ilk sayiyi giriniz a: ");
            int a = input.nextInt();

            System.out.println("ikinci sayiyi giriniz b: ");
            int b = input.nextInt();
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
                    divide(a, b);
                    break;
                case 5:
                    power(a,b);

                    break;
                case 6:
                    faktoriyel (5);
                    break;
                case 7:
                    mod(a,b);
                    break;
                case 8:
                    break;
                case 9:
                    break;
                default:
            }


        }
    }
}
