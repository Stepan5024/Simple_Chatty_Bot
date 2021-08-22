//put imports you need here

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Deque<String> guestStack = new ArrayDeque<>();

        while (scanner.hasNext()) {
            guestStack.push(scanner.next());
        }

        guestStack.forEach(System.out::println);
    }
}