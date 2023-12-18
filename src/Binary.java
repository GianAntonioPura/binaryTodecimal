import java.util.Scanner;

public class Binary {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci una stringa binaria: ");
        String Binary = scanner.nextLine();

        //int decimalValue = 0;
        int decimalValue = Bynary(Binary);

        System.out.println("Valore decimale: " + decimalValue);
        scanner.close();
    }
    public static int Bynary(String binaryString) {
        int decimaValue = 0;
        int len = binaryString.length();

       for (int i=0; i < len; i++) {
            int digit = Character.getNumericValue(binaryString.charAt(i));
            int power = len - i - 1;
            decimaValue = decimaValue + (int) (digit * Math.pow(2, power));
        }
        return decimaValue;
    }
}
