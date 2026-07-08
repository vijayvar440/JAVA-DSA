public class dec_bi {
    public static void decimalToBinary(int decimal) {
        // If decimal number is 0, print 0
        if (decimal == 0) {
            System.out.println("Binary: 0");
            return;
        }

        // Array to store binary digits
        int[] binary = new int[32];
        int index = 0;

        // Convert decimal to binary by dividing by 2
        while (decimal > 0) {
            binary[index++] = decimal % 2;
            decimal = decimal / 2;
        }

        // Print binary number in reverse order
        System.out.print("Binary: ");
        for (int i = index - 1; i >= 0; i--) {
            System.out.print(binary[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Test the conversion
        int decimal = 25;  // You can change this number
        System.out.println("Decimal: " + decimal);
        decimalToBinary(decimal);
    }
}