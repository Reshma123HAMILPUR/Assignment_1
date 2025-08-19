package JavaBasicFundamental;

public class LogicalOperators {
    public static void main(String[] args){

        int x = 7;
        int y = 5;
        int a = 8;
        int b = 10;

        boolean result = x > y && a > b;
        System.out.println(result);

        boolean result1 = x > y || a < b;
        System.out.println(result1);

        boolean result3 = x> y != y > b;
        System.out.println(result3);

    }
}
