
package OnTapJava;
public class BangCuuChuong {
    
    public static void main(String[] args) {
        // int number = 10; 

        // FOR
       /*  for(int i = 0 ; i <= 10 ; i ++) {
            System.out.println("4 x " + i + " = " + (4 * i ));
            System.out.printf("%d x %d = %d %n", number, i, number * i);
            System.out.printf("%d x %d = %d %s %n", number, i, number * i, "--");
        } */
        
        // WHILE

/*         int j = 1;
        while (j <= 10) {
            System.out.printf("%d x %d = %d %n", number, j, number * j);
            j++;
        } */

        // DO WHILE

/*         int g = 1;
        do {
            System.out.printf("%d x %d = %d %n", number, g, number * g);
            g++;
        } while (g <= 10); */

        // IN BANG CUU CHUONG CAO : 1 - 9;
        for (int i = 0; i <= 9; ++i) {
         System.out.println("Bang cuu chuong " + i);
         int number = i;
            for (int j = 0; j <= 9; ++j) {
                System.out.printf("%d x %d = %d%n", number, j, number*j);
            }
        }
    }
}

/* 
    Tham khảo tài liệu numberformat.html của oracle
*/