package accesslab02;

import org.junit.Test;

import static junit.framework.Assert.assertTrue;
import static junit.framework.TestCase.assertEquals;

/**
 * Created by lucky on 1/25/16.
 */
public class WaxSelectorTest {

    @Test
    public void selectWaxTest() {

        Wax wax1 = WaxSelector.selectWax(50,"Powder");
        Wax wax2 = WaxSelector.selectWax(22,"Powder");
        Wax wax3 = WaxSelector.selectWax(35,"crusty");
        Wax wax4 = WaxSelector.selectWax(10,"firm");
        Wax wax5 = WaxSelector.selectWax(0,"powder");

        assertTrue(wax1.getColor() == Color.YELLOW && wax1.getVariety() == Variety.STANDARD);

        assertTrue(wax2.getColor() == Color.BLUE && wax2.getVariety() == Variety.SPECIAL);

        assertTrue(wax3.getColor() == Color.RED && wax3.getVariety() == Variety.EXTRA);


        assertTrue(wax4.getColor() == Color.GREEN && wax4.getVariety() == Variety.STANDARD);
        assertTrue(wax5.getColor() == Color.WHITE && wax5.getVariety() == Variety.STANDARD);


    }


}
