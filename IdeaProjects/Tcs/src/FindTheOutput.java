import java.util.Arrays;

public class FindTheOutput {
    public static void main(String[] args) {
     int[] array = {2,3,4};
     bytes(array);
     System.out.println(Arrays.toString(array));
     System.out.println(array[0]);
    }
    public static void bytes(int[] array){
        array[0] = 10;
    }

}
