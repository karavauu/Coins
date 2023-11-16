import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int NumberOfCoins = scanner.nextInt();
        int[] Coins = new int[NumberOfCoins];

        for (int i = 0; i < NumberOfCoins; i++) {
            Coins[i] = scanner.nextInt();
        }

        int Coins1 = 0;
        int Coins2 = 0;
        
        for (int i = 0; i < Coins.length; i++) {
            if (Coins[i] == 0) {
                Coins1 += 1;
            } else {
                Coins2 += 1;
            }
        }

        if (Coins1 < Coins2) {
            System.out.println(Coins1);
        } else if (Coins1 > Coins2) {
            System.out.println(Coins2);
        }
    }
}