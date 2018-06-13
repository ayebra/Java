package estructuracapi;


public class PRACapi {

    public static double intereses (int money, int time){
        
        if ( time ==1){
            return money*1.12;
        }
        else{
            return (money*1.12)+ ((intereses(time-1, money)*1.12));
    }

    }
}