public class DesignTask12 {    
    public boolean before(int m1, int d1, int m2, int d2) {
        if(m1<m2) {
            return true;
        }else if(m1==m2 && d1<d2) {
            return true;
        }else{
            return false;
        }
    }
}