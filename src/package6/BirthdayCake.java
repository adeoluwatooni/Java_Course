package package6;

public class BirthdayCake extends Cake{
    int candles;


    // Constructor to set the flavor
    public BirthdayCake(String flavor){
        this.setFlavor(flavor);
    };

    public int getCandles(){
        return candles;
    };

    public void setCandles(int candleNo){
        this.candles = candleNo;
    }

}
