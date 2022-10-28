public class main_2b {
    public static void main(String[] args) {
        /* Задание 2 */
        System.out.print("\n\nИсходный массив: ");
        int[] arr = { 12, 11, 13, 5, 6 };
        for (int j : arr) System.out.print(j + " ");
        Sem02_InsersionSort.insersionSort(arr);
        System.out.print("\nОтсортированный массив: ");
        for (int j : arr) System.out.print(j + " ");
    }
    
}