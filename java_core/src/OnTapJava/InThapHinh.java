package OnTapJava;

public class InThapHinh {
    public static void main(final String[] args) {
        /* int number = 1;                             // cho i = 1

        System.out.println("Hinh 1");   
                                          
        while (number <= 5) {                       // Khi i = 1 <= 5 thỏa mãn điều kiện ( tương tự với các i tiếp theo)
            for (int i = 0; i <= number; i++) {     // Vòng lặp for khi i = 1
                System.out.print("* ");
            }
            System.out.println();
            number++;
        } */

        /* System.out.println("Hinh 2");

        while (number >= 1) {                       // Khi i = 1 <= 5 thỏa mãn điều kiện ( tương tự với các i tiếp theo)
            for (int i = 0; i <= number; i++) {      // Vòng lặp for khi i = 1
                System.out.print("* ");
            }
            System.out.println();
            number--;
        } */

       /*  System.out.println("Hinh 3");

        while (number <= 5) {
                                                         // Khi i = 1 <= 5 thỏa mãn điều kiện ( tương tự với các i tiếp theo)
            for (int i = 0; i <= 5 - number; i++) {      // Vòng lặp for khi i = 1
                System.out.print(" ");
            }
            for (int i = 0; i < number; i++) {
                System.out.print("* ");
            }      
            System.out.println();
            number++;
        } */

        /* System.out.println("Hinh 4");
        //int number = 5
        while (number >= 1) {
                                                         // Khi i = 1 <= 5 thỏa mãn điều kiện ( tương tự với các i tiếp theo)
            for (int i = 0; i <= 5 - number; i++) {      // Vòng lặp for khi i = 1
                System.out.print(" ");
            }
            for (int i = 0; i < number; i++) {
                System.out.print("* ");
            }      
            System.out.println();
            number--;
        } */

       /*  int number = 1;
        System.out.println("Hinh 5");   
                                          
        while (number <= 5) {                       
            for (int i = 1; i <= number; i++) {     
                System.out.print(+i+" ");
            }
            System.out.println();
            number++;
        } */

       /*  System.out.println("Hinh 6");   
        int number = 5;                                  
        while (number >= 1) {                       
            for (int i = 1; i <= 5 - number; i++) {     
                System.out.print(+i+" ");
            }
            System.out.println();
            number++;
        } */

        
       /*  final int LENGTH = 16 ;
        int number = 1;
        while (number <= LENGTH) {
            for (int i = 1; i <= LENGTH; i++) {
                if(i >= 2 && i <= ( LENGTH - 1 ) && number >= 2 && number <= (LENGTH - 1)) {
                    System.out.print("  ");
                }else {
                    System.out.print("* ");
                }
            }
            System.out.println();
            number++;
        } */

        // Bài này khá dễ, chủ yếu là luyện tư duy phân tích. Có thể xem video hướng dẫn tại share.zendvn.com

/* 
        line = space + charactor    |   
        1    = 3        1           | HEIGHT - lines = space
        2    = 2        3           | 2*lines -1     = charactor 
        3    = 1        5           |
        4    = 0        7           |

*/
        final int HEIGHT = 4;
        String result    = "";
        String record    = "";
        String space     = "";
        String character = "";
        int line = 1;
        while (line <= HEIGHT) {
            space     = "";
            character = "";
            for (int s = 1; s <= HEIGHT - line; s++) space += " ";
            for (int c = 1; c <= 2 * line - 1; c++) character  += "*";

            record = space + character + "\n";
            result += record;
            line++;
        }
        System.out.println(result);
    }
}