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
    @Before
    public void setUp() throws Exception{
        TaxiFee = new TaxiMeter();
    }
		// no wait time
    @Test
    public void should_return_6_when_distance_is_1_km() throws Exception {
        assertEquals(6.0,TaxiFee.calculateTaxiFee(1,0));
    }
		@Test
    public void should_return_6_when_distance_is_2_km() throws Exception {
        assertEquals(6.0,TaxiFee.calculateTaxiFee(2,0));
    }
		@Test
    public void should_return_6_when_any_distance_less_than_2km() throws Exception {
        assertEquals(6.0,TaxiFee.calculateTaxiFee(1.5,0));
    }
		@Test
}
