package OnTapJava;

public class InThapHinh {
    public static void main(String[] args) {
        int number = 1;                             // cho i = 1
        while (number <= 5) {                       // Khi i = 1 <= 5 thỏa mãn điều kiện ( tương tự với các i tiếp theo)
            for (int i = 0; i <= number; i++) {      // Vòng lặp for khi i = 1
                System.out.print("| ");
            }
            System.out.println();
            number++;
        }

        System.out.println("Hinh 2");

        while (number >= 1) {                       // Khi i = 1 <= 5 thỏa mãn điều kiện ( tương tự với các i tiếp theo)
            for (int i = 0; i <= number; i++) {      // Vòng lặp for khi i = 1
                System.out.print("| ");
            }
            System.out.println();
            number--;
        }

        System.out.println("Hinh 3");

        while (number <= 5) {
            
                          
                                                 // Khi i = 1 <= 5 thỏa mãn điều kiện ( tương tự với các i tiếp theo)
            for (int i = 0; i <= 5 - number; i++) {      // Vòng lặp for khi i = 1
                System.out.print(" ");
            }
            for (int i = 0; i < number; i++) {
                System.out.print("*");
            }      
            System.out.println();
            number++;
        }

    }
}