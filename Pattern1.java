package S150J;

public class Pattern1 {
    public static void main(String[] args) {
        
        int n = 5;
        int row = 1;
        int star = n;
        while (row <= n) {
            // star
            int i = 1;
            while(i <= star){
                System.out.print("* ");
                i++;
            }
            row++;
            System.out.println();
        }
    }
}
