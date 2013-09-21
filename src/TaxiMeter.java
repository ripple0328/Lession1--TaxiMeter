/**
 * Created with IntelliJ IDEA.
 * User: qingbo
 * Date: 13-9-21
 * Time: PM8:54
 * To change this template use File | Settings | File Templates.
 */
public class TaxiMeter {
		public static final double FLAG_KM = 2.0;
    public static final double PER_PRICE = 0.8;
    public static final double FLAG_PRICE = 6.0;
    public static final double PER_WAIT_PRICE = 0.25;
    public static final double  BASE_KM = 8.0;
    public static final double  LONG_DISTANCE_EXTRA_FEE = 0.5;
		public static final double PRECISION = 0.001;

    static public double distanceFee(double distance){
				double distanceFee = 0;
				if (distance <  (FLAG_KM + PRECISION)) {
						distanceFee = FLAG_PRICE;
				} else if (distance < (BASE_KM + PRECISION)){
						distanceFee  = FLAG_PRICE + (distance - FLAG_KM)* PER_PRICE;
				} else {
						distanceFee = FLAG_PRICE + (distance - FLAG_KM)* (PER_PRICE * (1 + LONG_DISTANCE_EXTRA_FEE));
				}
				return distanceFee;
    }
		static public int round(double rawTaxiFee){
				return (int) Math.round(rawTaxiFee);
		}

		static public double waitFee(double minute){
				return minute * PER_WAIT_PRICE;
		}

		static public int TotalFee(double distance,double waitTime) {
				return round(distanceFee(distance) + waitFee(waitTime));
		}

}
