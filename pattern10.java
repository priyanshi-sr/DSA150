package S150J;

public class pattern10 {
    public static void main(String[] args) {
        int n = 5;
        int space = 0;
        int rows = 1;
        int star = 5;
        while(rows<=n){
        // space
        int i = 0;
        while(i<space){
            System.out.print("  ");
            i++;
        }
        //star
        int j = 0;
        while(j<star){
            System.out.print("* ");
            j++;
        }
        //star
        int k = 1;
        while(k<star){
            System.out.print("* ");
            k++;
        }
        // rows prep
        System.out.println();
        rows++;
        star--;
        space++;
    

        }

    }
}