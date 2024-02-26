import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    static boolean isPalindrom(int number) {
        int temp = number, reverseNumber = 0, lastNumber;

        while (temp != 0) {
            lastNumber = temp % 10;
            reverseNumber = (reverseNumber * 10) + lastNumber;
            temp /= 10;
        }

        if(number == reverseNumber){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        int number;
        Scanner input = new Scanner(System.in);

        System.out.print("Bir sayı giriniz : ");
        number = input.nextInt();

        System.out.println(isPalindrom(number));
    }
}