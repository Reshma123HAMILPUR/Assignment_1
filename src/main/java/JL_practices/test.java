package JL_practices;

public class test {

    int  display(){
        return 10;
    }

    public static void main(String[] args) {
        System.out.println("start");

        test t = new test();
       int result= t.display();
        System.out.println(result);
        System.out.println("end");
    }

}

