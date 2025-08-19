package JavaBasicFundamental;

public class TypeCastingConversion {
    public static void main(String[] args) {
//        implicit and explicit conversion
//          explicit conversion = this involves casting to the data type to you intended converting to .
//         while implicit is direct conversion

        int a = 100;

        // explicit conversion (type casting)

        byte k = (byte) a;
        System.out.println(k);

        //implicit (direct conversion)
        float f = 5.6f;
        double t = f;
        System.out.println(t);
    }
}
