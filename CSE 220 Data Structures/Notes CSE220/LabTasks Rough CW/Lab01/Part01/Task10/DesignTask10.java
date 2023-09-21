public class DesignTask10 {   
    public String season(int m, int d) {
        if(m<3){
            return "Winter";
        }
        else if(m==3&&d<=15) {
            return "Winter";
        }
        else if(m<6) {
            return "Spring";
        }
        else if(m==6&&d<=15){
            return "Spring";
        }
        else if(m<9){
            return "Summer";
        }
        else if(m==9&&d<=15) {
            return "Summer";
        }
        else if(m<12) {
            return "Fall";
        }
        else if(m==12&&d<=15) {
            return "Fall";
        }
        else{
            return "Winter";
        }        
    }
}