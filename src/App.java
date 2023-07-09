import java.util.Scanner;

public class App {

    static int exponentiate(int base, int exponent)
    {   
        if(exponent == 0)
            return 1;
        int result = base * exponentiate(base, exponent-1);
        return result;
    }
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter base in integers: ");
        int base = input.nextInt();
        System.out.println("Enter exponent integers: ");
        int exponent = input.nextInt();
        System.out.println(exponentiate(base, exponent));
    }
}
