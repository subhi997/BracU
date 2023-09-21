public class DesignTask11 {   
    public boolean allDigitsOdd(int x){
        while (x!=0) {
            if((x%10)%2==0){
                return false;
            }
            x/=10;
        }
        return true;
    }
}