package OnTapJava;
public class BaiTapThucHanh {
    public static void main(final String[] args) {
        System.out.println("BAI TAP THUC HANH JAVA CO BAN");

        /* 
               *******
                    * 
                   *  
                  *      
                 *        
                *          
               ******* 
               

            line 1:  (7) *                            |       
            line 2: 5  spaceT + * |   spaceT = HEIGHT - line
            line 3: 4  spaceT + * |   characotr = 
            line 4: 3  spaceT + * |
            line 5: 2  spaceT + * |
            line 6: 1  spaceT + * |
            line 7: (7) *                             |
         */
/*         final int HEIGHT = 7;
        String result    = "";
        String record    = "";
        String space     = "";
        String character = "";
        int line = 1;

        while (line <= HEIGHT) {
            
            space     = "";
            character = "";
            for (int s = 1; s <= HEIGHT - line; s++) space += " ";
            for (int c = 2; c <= 2 * line - 1; c++) character = "*";
            record = space + character + "\n";
            result += record;
            line++;
        }
        for (int i = 1; i < HEIGHT; i++) {
            System.out.print("*");
        }
        System.out.print(result);
        for (int j = 1; j < HEIGHT; j++) {
            System.out.print("*");
        } */

        

        /* 
               *******
                * 
                 *  
                  *      
                   *        
                    *          
               ******* 
               

            line 1:  (7) *                                  
            line 2: 1 space + *   |  
            line 3: 2 space + *   |    space = line - 1
            line 4: 3 space + *   |
            line 5: 4 space + *   |
            line 6: 5 space + *   |
            line 7: (7) * 
         */

        final int HEIGHT = 7;
        String result    = "";
        String record    = "";
        String space     = "";
        String character = "";
        int line = 1;

        while (line <= HEIGHT) {
            
            space     = "";
            character = "";
            for (int s = 2; s <= line - 1; s++) space += " ";
            for (int c = 2; c <= 2 * line - 1; c++) character = "*";
            record = space + character + "\n";
            result += record;
            line++;
        }
        for (int i = 1; i < HEIGHT; i++) {
            System.out.print("*");
        }
        System.out.print(result);

        for (int j = 1; j < HEIGHT; j++) {
            System.out.print("*");
        }
        
    }
}