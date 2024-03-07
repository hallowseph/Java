package lab1;

/**
 *
 * @author xxg8089
 */
public class Binary {
    public static void main(String[] args) {
        int decimalNumber = 8; //replace with the desired decimal number
        String binaryForm = decimalToBinary(decimalNumber);
        System.out.println("Binary form of: " + decimalNumber
                            + " is: " + binaryForm);
    }
    public static String decimalToBinary(int number){
        if(number == 0){
            return "";
        }else{
            return decimalToBinary(number >> 1) + (number & 1);
        }
    }
}
