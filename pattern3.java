package S150J;

public class pattern3 {
    public static void main(String[] args) {
        int n = 5;
        int star = 0;
        int space = n-1;
        int row = 1;
        // space
        while (row <=n ){
                    int i = 0;
        while(i <= space){
            System.out.print("  ");
            i++;
        }//star
        int j = 0;
        while(j <= star){
            System.out.print("* ");
            j++;
        }//row prep
        System.out.println();
        star++;
        space--;
        row++;
        }


    }    
}
