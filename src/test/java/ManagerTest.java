import Management.Manager;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {
    Manager manager;

    @Before
    public void setUp() throws Exception {
        manager = new Manager("Mike", "SG51244N", 32000.00, "R&D");
    }

    @Test
    public void hasName() {
        assertEquals("Mike", manager.getName());
    }

    @Test
    public void hasNiNumber() {
        assertEquals("SG51244N", manager.getNinumber());
    }

    @Test
    public void canRaiseSalary() {
        manager.raiseSalary(1.01);
        assertEquals(32320.00, manager.getSalary(), 0.01);
    }

    @Test
    public void canGetBonus() {
        assertEquals(320, manager.payBonus(), 0.1);
    }
}
