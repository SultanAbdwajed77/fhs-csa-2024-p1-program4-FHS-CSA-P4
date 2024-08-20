public class Program4 {

    public static void main(String[] args) {
        // Declare Variables
        int num1 = 475;
        int num2 = 821;
        int num3 = 369;
        int num4 = 562;
        int sum = 0;
        double average = 0.0;

        // Create Scanner
        Scanner numScanner = new Scanner(System.in);

        // Ask for user input
        System.out.println("Enter the first number: ");
        num1 = numScanner.nextInt();

        System.out.println("Enter the second number: ");
        num2 = numScanner.nextInt();

        System.out.println("Enter the third number: ");
        num3 = numScanner.nextInt();

        System.out.println("Enter the fourth number: ");
        num4 = numScanner.nextInt();

        // Calculate sum
        sum = num1 + num2 + num3 + num4;

        // Calculate average
        average = sum / 4.0;

        // Print results
        System.out.println("\nThe sum of the four numbers IS  " + sum);
        System.out.println("\nThe average of the four numbers IS  " + average);

        // Close Scanner
        numScanner.close();
    }
}
