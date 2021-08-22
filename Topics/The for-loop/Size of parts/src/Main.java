import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int kol = scanner.nextInt();
        int brak = 0;
        int normal = 0;
        int dodelat = 0;

        for (int i = 0; i < kol; i++) {
            int temp = scanner.nextInt();
            if (temp == 1) dodelat++;
            else if (temp == 0) normal ++;
            else if(temp == -1) brak ++;

        }
        System.out.println(normal + " " + dodelat + " " + brak);

    }
}