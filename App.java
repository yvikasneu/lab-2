import java.util.*;


public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        List<Integer> array = new ArrayList<>();
        
        for (int i=0; i<n; i++) {
            array.add(scanner.nextInt());
        }
        
        int actionSize = scanner.nextInt();
        
        for (int i=0; i<actionSize; i++) {
            String operation = scanner.next();
            if (operation.equals("Insert")) {
                int index = scanner.nextInt();
                int value = scanner.nextInt();
                array.add(index, value);
            } else if (operation.equals("Delete")) {
                int index = scanner.nextInt();
                array.remove(index);
            }
        }
        
        scanner.close();
        
        for (int i : array) {
            System.out.print(i + " ");
        }
        
    }
}