import org.junit.Assert;
import org.junit.Test;

public class MoneyUtilTest {

    @Test
    public void MoneyTest() {
        String money = MoneyUtil.format(1000.0);
        Assert.assertEquals("$1000.00", money);
    }
    @Test
    public void negativeMoneyTest() {
        String money = MoneyUtil.format(-1000.0);
        Assert.assertEquals("-$1000.00", money);
    }

    @Test
    public void EuroMoneyTest() {
        String money = MoneyUtil.format(-1000.0,    "€");

        Assert.assertEquals("-€1000.00", money);

    }
    @Test(expected = IllegalArgumentException.class)
    public void notNullExceptionMoneyTest() {
         MoneyUtil.format(-1000.0,    null);



    }
}
