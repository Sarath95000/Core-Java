package narrowing;

public class Narrow {
    public static void main(String[] args){
        int number =10;
        double number2 = number,d=25.5385;
        int number3 = (int)number2;
        System.out.println("Int           : "+number);
        System.out.println("Double        : "+number2);
        System.out.println("Converted int        : "+number3);
    }
}
/*
    Narrowing Casting
    Double -> Float -> Long -> Int -> Char -> Short -> Byte
*/