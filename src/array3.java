public class array3 {
    public static void main(String[] args) {
        char array[] = {'R', 'a', 'k', 's', 'h', 'a', 'p', 'm'};
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        array[6] = 'C';
        for (int i = 0; i < array.length; i++) {
            System.out.print(array);
        }
    }

}