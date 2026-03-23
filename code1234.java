public class code1234 {
    public static int binCoeff(int n,int r) {
        int fact_n=factorial(n);
        int fact_r=factorial(r);
        int fact_nmr=factorial(n-r);
        int binCoeff=fact_n/(fact_r*fact_nmr);
        return binCoeff;
    }

        public static void main(String args[]){
            System.out.println(factorial(7,5));

        }
        
    }
    
}
