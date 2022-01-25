package array;

public class CharArray {
    public static void main(String[] args) {

        char[] Alpha = new char[26];
        char a = 'A';
        for (int i = 0; i<Alpha.length; i++){

            Alpha[i] = a++;
            System.out.println(Alpha[i]);


        }
    }
}
