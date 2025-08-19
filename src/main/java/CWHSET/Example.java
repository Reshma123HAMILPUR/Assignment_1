package CWHSET;

public class Example {

    int findSquare(int n)
    {
        return n*n+n;
    }

    public static void main(String[] args) {
        Example e = new Example();
        int answer = e. findSquare(6);
        System.out.println(answer);

        System.out.println(e.findSquare(9));
    }
}