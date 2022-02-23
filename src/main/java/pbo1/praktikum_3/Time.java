package pbo1.praktikum_3;

/**
 *
 * @author G.Kristha
 * Program by : Gerardus Kristha_215314004
 */
public class Time {
    private double second;
    private double minute;
    private double hour;
    
    public void setSecond(double second){
        this.second=second;
    }
    public double getSecond(){
        return second;
    }
    public void setMinute(double minute){
        this.minute=minute;
    }
    public double getMinute(){
        return minute;
    }
    public void setHour(double hour){
        this.hour=hour;
    }
    public double getHour(){
        return hour;
    }
    
    public String toString(){
    return "Hour\t\t:"+getHour()
            +"Minute\t\t:"+getMinute()
            +"Second\t\t:"+getSecond();
    }        
}
