package S150J;

public class pattern17 {
    public static void main(String[] args) {
        int n = 7;
        int row = 1;
        int star = n/2;
        int space = 1;
        while(row <=n){
            //star
            int i = 1;
            while(i <= star) {
                System.out.print("* ");
                i++;
            }
            //space
            int j = 1;
            while(j <= space){
                System.out.print("  `");
                j++;
            }
            //star
            int k = 1;
            while(k <= star) {
                System.out.print("* ");
                k++;
        }
        // mirror condition
        if (row <= n/2){ //before the spacing
            star--;
            space += 2;
        }
        else{  // after the spacing
            star++;
            space -= 2;

        }
        row ++;
        System.out.println();
        }
    }
}
