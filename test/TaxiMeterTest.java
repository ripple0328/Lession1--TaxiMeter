import org.junit.Before;
import org.junit.Test;
import static junit.framework.Assert.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * User: qingbo
 * Date: 13-9-21
 * Time: PM9:51
 * To change this template use File | Settings | File Templates.
 */
public class TaxiMeterTest {

    public TaxiMeter TaxiFee;
		public static final double PRECISION = 0.001;
		
    @Before
    public void setUp() throws Exception{
        TaxiFee = new TaxiMeter();
    }
		// Flat price no wait time
    @Test
    public void should_return_6_when_distance_is_1_km() throws Exception {
        assertEquals(6,TaxiFee.distanceFee(1),PRECISION);
    }
		@Test
    public void should_return_6_when_distance_is_2_km() throws Exception {
        assertEquals(6,TaxiFee.distanceFee(2),PRECISION);
    }
		@Test
    public void should_return_6_when_any_distance_less_than_2km() throws Exception {
        assertEquals(6,TaxiFee.distanceFee(1.5),PRECISION);
    }
		// 2-8km no wait times
		@Test
    public void should_return_6_point_8_when_distance_is_3km() throws Exception {
        assertEquals(6.8,TaxiFee.distanceFee(3),PRECISION);
    }
		// greater than 8km no wait time 
		@Test
    public void should_return_10_point_8_when_distance_is_8km() throws Exception {
        assertEquals(10.8,TaxiFee.distanceFee(8),PRECISION);
    }

		@Test
    public void should_return_8_when_distance_is_10km() throws Exception {
        assertEquals(15.6,TaxiFee.distanceFee(10),PRECISION);
    }

		// rount price
		@Test
		public void should_round_fee() throws Exception {
        assertEquals(6,TaxiFee.round(6.4));
				assertEquals(7,TaxiFee.round(6.5));
    }

		// wait time
		@Test
		public void waitTimeFee() throws Exception {
				assertEquals(1,TaxiFee.waitFee(4),PRECISION);
		}

		// integrate test
		
		
}
