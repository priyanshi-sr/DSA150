package S150J;

public class pattern27 {
        public static void main(String[] args) {
            int n = 5;
            int space = n-1;
            int rows = 1;
            int star = 1;
            while(rows<=n){
            // space
            int i = 1;
            while(i<=space){
                System.out.print("  ");
                i++;
            }
            //value
            int val = 1;
            int j = 1;
            while(j<=2*star -1){
                System.out.print(val +" ");
                //mirror
                if(j < rows){
                    val++;
                }else{
                val--;
            }
            j++;
        }
        // rows prep
        System.out.println();
        rows++;
        star++;
        space--;
    }
        
    
            
    
        }

}
        

