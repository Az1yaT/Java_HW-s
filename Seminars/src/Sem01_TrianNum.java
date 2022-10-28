import java.util.Scanner;

public class Sem01_TrianNum {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println("Введите число N:");
        int input = n.nextInt();
        int tn = (input*(input+1)/2);
        System.out.println("Ответ: " + tn);
    }
}