package S150J;

public class pattern12 {
    public static void main(String[] args) {
        int n = 5;
        int stars = 1;
        int rows = 1;
        int space = n-1;
        while(rows<=n){
            //space
            int i = space;
            while(i>0){
                System.out.print("  ");
                i--;
            }//star
            int j = 0;
            while(j<stars){
                if (j % 2 == 0){
                    System.out.print("* ");
                }else{
                    System.out.print("! ");
                }
                j++;
            }
            //star
            // int k = 1;
            // while(k<stars){
            //     if (k % 2 == 0){
            //         System.out.print("* ");
            //     }else{
            //         System.out.print("! ");
            //     }
            //     k++;
            // }
            System.out.println();
            rows++;
            stars+=2;
            space--;

        }
    }
    
}
