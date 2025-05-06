import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        printAravindh(n);
    }

    static void printAravindh(int n) {
        if (n <= 0) return; 
        System.out.println("Aravindh");
        printAravindh(n - 1);
    }
}
