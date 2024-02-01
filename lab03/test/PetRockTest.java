import org.junit.*;
import org.junit.rules.Timeout;
import org.junit.runners.model.TestTimedOutException;


import static org.junit.Assert.*;

public class PetRockTest {
    private PetRock rocky;
    private org.junit.Assert Assert;

    @Rule
    public Timeout globalTimeout = Timeout.seconds(10);

    @Before
    public void myTestSetUp() throws Exception {
        rocky = new PetRock("Rocky");
    }

    @Test
    public void getName() throws Exception {
        Assert.assertEquals("Rocky", rocky.getName());
    }

    @Test
    public void testUnHappyToStart() throws Exception {
        Assert.assertFalse(rocky.isHappy());
    }
    @Test
    public void testHappyAfterPlay() throws Exception {
        rocky.playWithRock();
        Assert.assertTrue(rocky.isHappy());
    }

    @Ignore ("Exception throwing now yet defined")
    @Test (expected = IllegalStateException.class)
    public void nameFail() throws Exception {
        rocky.getHappyMessage();
    }

    @Test
    public void name() throws Exception {
        rocky.playWithRock();
        String msg = rocky.getHappyMessage();
        assertEquals("I'm happy!", msg);
    }

    @Test
    public void testFavNum() throws Exception {
        assertEquals(42, rocky.getFavNumber());
    }

    @Test (expected = IllegalArgumentException.class)
    public void emptyNameFail() throws Exception {
        new PetRock("");
    }

    @Test (timeout=100)
    public void waitForHappyTimeout() throws Exception {
        rocky.waitTillHappy();
    }

    @Test
    public void testMass() throws Exception {
        rocky.setMassInGrams(100.0);
        assertNotSame(100.0, rocky.getMassInGrams());
        assertEquals(100.0, rocky.getMassInGrams(), 0.001);
    }

    @Test
    public void testToString() {
        String expected = "PetRock{name='Rocky', happy=false, favNumber=42, massInGrams=0.0}";
        assertEquals(expected, rocky.toString());
    }
}