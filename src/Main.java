import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        // not hesaplama
        // değişken tanımı
        int math,physics,biology,english,chemistry;

        Scanner input = new Scanner(System.in);
        //kullanıcıdan veri alma
        System.out.print("math grade:");
        math = input.nextInt();

        System.out.print("biology grade:");
        biology = input.nextInt();

        System.out.print("english grade:");
        english = input.nextInt();

        System.out.print("chemistry grade:");
        chemistry =input.nextInt();
        //sonuç
        int total = math+biology+english+chemistry;
        double result = total/4.0;

        System.out.print("result: "+ result);



    }
}