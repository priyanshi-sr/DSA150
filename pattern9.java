package S150J;

public class pattern9 {
    public static void main(String[] args) {
        int n = 5;
        int space = 5;
        int rows = 1;
        int star = 1;
        while(rows<=n){
        // space
        int i = space;
        while(i>0){
            System.out.print("  ");
            i--;
        }
        //star
        int j = 0;
        while(j<star){
            System.out.print("* ");
            j++;
        }
        //star
        int k = 2;
        while(k<=star){
            System.out.print("* ");
            k++;
        }
        // rows prep
        System.out.println();
        rows++;
        star++;
        space--;
    

        }

    }
}
