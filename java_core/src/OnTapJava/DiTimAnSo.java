package OnTapJava;

import java.util.Scanner;

public class DiTimAnSo {
    public static void main(String[] args) {
        final int MIN_NUMBER = 1;
        final int MAX_NUMBER = 100;
        int range = (MAX_NUMBER - MIN_NUMBER) + 1;
        int Score = 0;
        int Answer = 0;
        int yourNumber = 0;
            do {
            int secretNumer = (int)(Math.random() * range) + MIN_NUMBER;
    
            System.out.println(secretNumer);
            Scanner scanner = new Scanner(System.in);
            while(secretNumer != yourNumber ) {
                System.out.println("Your number (1 - 100) : ");
                yourNumber =  scanner.nextInt();
                
                if (yourNumber > secretNumer) {
                    System.out.println("Nhập số gì bự quá vậy bạn trẻ !");
                    Score++;
                } else if (yourNumber < secretNumer) {
                    System.out.println("Nhập số gì nhỏ quá vậy bạn trẻ !");
                    Score++;
                } else {
                    System.out.println("Wow, Bạn thật tuyệt vời !");
                    System.out.println("Đoán sai : " + Score + " lần.");
                    Score++;
                    System.out.println("Đoán đúng ở lần thứ : " + Score + " lần.");
                }
            }
            System.out.println("Muốn chơi tiếp không ? 1|0");
            Answer = scanner.nextInt();
            scanner.close();
        } while (Answer == 1);
        System.out.println("Chơi dở quán nên k muốn chơi tiếp chứ gì. Ta cười cho thúi mặt ! :))");
    }
}
    
