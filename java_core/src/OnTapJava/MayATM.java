package OnTapJava;

import java.text.DecimalFormat;
import java.util.Scanner;

/* 
    Hello everybody my name kenny's.
    I come from Phu Yen Province.
    Hello everybody today we will practice the exercise Java ATM
*/
public class MayATM {
    public static void main(String[] args) {
        /*
         * 450.000 50.000 (9) = 9 200.000 (2) + 50.000 (1) = 3 200.000 (1) + 100.000 (2)
         * + 50.000 (1) = 4 --------------------------------------------- Các mệnh giá
         * tiền trong máy ATM
         * 
         */

        System.out.println("1500000");
        DecimalFormat formatter = new DecimalFormat("#,###");
        // System.out.println(formatter.format(1500000));

        int money = 0;

        final int FIVE_HUNDRED_THOUSAND = 500000;
        final int TWO_HUNDRED_THOUSAND = 200000;
        final int ONE_HUNDRED_THOUSAND = 100000;
        final int FIFTY_THOUSAND = 50000;
        final int TWEENTY_THOUSAND = 20000;
        final int TEN_THOUSAND = 10000;

        int fiveHundredThousand = 0;
        int twoHundredThousand = 0;
        int oneHundredThousand = 0;
        int fiftyThousand = 0;
        int tweentyThousand = 0;
        int tenThousand = 0;

        /* so tien chia het cho 10.000 */
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Your's money must div 10000.");
            System.out.println("Your's money : ");
            money = sc.nextInt();
        } while (money % 10000 != 0);
        sc.close(); // Note : When you initialize the scanner object.You need to close it it after
                    // use.

        /*
         * Algrothium : Tham Mang/ .... Output : 450000 200000 (2) and 50000(1)
         * 
         */
        // 500000
        if (money >= FIVE_HUNDRED_THOUSAND) {
            fiveHundredThousand = money / FIVE_HUNDRED_THOUSAND; // so to tien menh gia 500000
            money = money % FIVE_HUNDRED_THOUSAND; // Cập nhật lại số tiến sau khi trích các tờ tiền 500000 ra
            System.out.printf("Mệnh giá %s : %d %n", formatter.format(FIVE_HUNDRED_THOUSAND), fiveHundredThousand);
        }
        // 200000
        if (money >= TWO_HUNDRED_THOUSAND) {
            twoHundredThousand = money / TWO_HUNDRED_THOUSAND; // so to tien menh gia 500000
            money = money % TWO_HUNDRED_THOUSAND; // Cập nhật lại số tiến sau khi trích các tờ tiền 500000 ra
            System.out.printf("Mệnh giá %s : %d %n", formatter.format(TWO_HUNDRED_THOUSAND), twoHundredThousand);
        }
        // 100000
        if (money >= ONE_HUNDRED_THOUSAND) {
            oneHundredThousand = money / ONE_HUNDRED_THOUSAND; // so to tien menh gia 500000
            money = money % ONE_HUNDRED_THOUSAND; // Cập nhật lại số tiến sau khi trích các tờ tiền 500000 ra
            System.out.printf("Mệnh giá %s : %d %n", formatter.format(ONE_HUNDRED_THOUSAND), oneHundredThousand);
        }
        // 50000
        if (money >= FIFTY_THOUSAND) {
            fiftyThousand = money / FIFTY_THOUSAND; // so to tien menh gia 500000
            money = money % FIFTY_THOUSAND; // Cập nhật lại số tiến sau khi trích các tờ tiền 500000 ra
            System.out.printf("Mệnh giá %s : %d %n", formatter.format(FIFTY_THOUSAND), fiftyThousand);
        }
        // 20000
        if (money >= TWEENTY_THOUSAND) {
            tweentyThousand = money / TWEENTY_THOUSAND; // so to tien menh gia 500000
            money = money % TWEENTY_THOUSAND; // Cập nhật lại số tiến sau khi trích các tờ tiền 500000 ra
            System.out.printf("Mệnh giá %s : %d %n", formatter.format(TWEENTY_THOUSAND), tweentyThousand);
        }
        // 10000
        if (money >= TEN_THOUSAND) {
            tenThousand = money / TEN_THOUSAND; // so to tien menh gia 500000
            money = money % TEN_THOUSAND; // Cập nhật lại số tiến sau khi trích các tờ tiền 500000 ra
            System.out.printf("Mệnh giá %s : %d %n", formatter.format(ONE_HUNDRED_THOUSAND), tenThousand);
        }

    }
}