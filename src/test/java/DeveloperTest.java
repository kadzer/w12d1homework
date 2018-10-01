import org.junit.Before;
import org.junit.Test;
import techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {
    Developer developer;

    @Before
    public void setUp() throws Exception {
        developer = new Developer("David", "SG51245N", 30000.00);
    }
    @Test
    public void hasName() {
        assertEquals("David", developer.getName());
    }

    @Test
    public void hasNiNumber() {
        assertEquals("SG51245N", developer.getNinumber());
    }

    @Test
    public void canRaiseSalary() {
        developer.raiseSalary(1.01);
        assertEquals(30300.00, developer.getSalary(), 0.01);
    }

    @Test
    public void canGetBonus() {
        assertEquals(300, developer.payBonus(), 0.1);
    }
}
