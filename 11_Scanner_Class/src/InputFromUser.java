import java.util.Scanner;
public class InputFromUser {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int number1,number2,number3;
        System.out.print("Enter\nNumber1      : ");
        number1 = input.nextInt();
        System.out.print("Number2      : ");
        number2 = input.nextInt();
        number3 = (number1*number1)+(number2*number2)+(2*(number1*number2));
        System.out.print("Result      : "+number3);
    }
}
