package day06.array01;

public class ArrayApp1 {
    public static void main(String[] args) {
        int n = 26;
        char[] alphabet = new char[n];

        for (int i = 0; i < n; i++) {
            alphabet[i] = (char) (i + 65);
        }

        for (int i = 0; i < n; i++) {
            System.out.printf("%c ", alphabet[i]);
        }
    }
}
