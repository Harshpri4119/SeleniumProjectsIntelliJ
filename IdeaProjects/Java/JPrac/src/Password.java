import java.util.Random;

public class Password {
    public static void main(String[] args) {
     System.out.print(generatePassword());
    }
    private static char[] generatePassword() {
        String capitalLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String smallLetters = "abcdefghijklmnopqrstuvwxyz";

        String numbers = "1234567890";
        String specialCharacters = "!@#$";
        String combinedChar = capitalLetters + smallLetters + numbers + specialCharacters;

        Random random = new Random();
        char[] password = new char[12];

        password[0] = capitalLetters.charAt(random.nextInt(capitalLetters.length()));
        password[1] = smallLetters.charAt(random.nextInt(smallLetters.length()));
        password[2] = numbers.charAt(random.nextInt(numbers.length()));
        password[3] = specialCharacters.charAt(random.nextInt(specialCharacters.length()));

        for (int i = 4; i< 12; i++){
            password[i] = combinedChar.charAt(random.nextInt(combinedChar.length()));
        }
        return password;
    }
}
