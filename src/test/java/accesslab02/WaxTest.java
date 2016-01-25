package accesslab02;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by lucky on 1/25/16.
 */
public class WaxTest {

    @Test
    public void WaxTester(){
        Wax wax1 = new Wax(Color.YELLOW,Variety.STANDARD);

        Wax wax2 = new Wax(Color.GREEN, Variety.EXTRA);

        Wax wax3 = new Wax(Color.BLUE, Variety.SPECIAL);

        assertEquals(wax1.color,wax1.getColor());
        assertEquals(wax1.variety,wax1.getVariety());

        assertEquals(wax2.color,wax2.getColor());
        assertEquals(wax2.variety,wax2.getVariety());

        assertEquals(wax3.color,wax3.getColor());
        assertEquals(wax3.variety,wax3.getVariety());
    }

}
