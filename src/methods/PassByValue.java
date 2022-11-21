package methods;

public class PassByValue {
    static int number = 12;

    public static void main(String[] args) {

        int result = arttir();

        System.out.println("result : " + result); //13

        System.out.println("number : " + number); //12

    }
    public static int arttir() {
        return ++number;
    }

}
