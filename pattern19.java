package S150J;

public class pattern19 {
    public static void main(String[] args) {
        int n = 7;
        int star = n/2 + 1;
        int row = 1;
        int space = -1;
        while(row<=n){
            // star
            int i = 0;
            while( i<=star){
                System.out.print("* ");
                i++;
            }
            // space
            int j = 1;
            while(j <= space){
                System.out.print("  ");
                j++;
            }
              // star
            int k = 0;
            while( k<=star){
                System.out.print("* ");
                k++;
            }
            //mirror
            if (row <=n/2 +1){
                star--;
                space+=2;
            }
            else{
                star ++;
                space -=2;
            }
            row ++;
            System.out.println();
        }

    }
}
