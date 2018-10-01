import Management.Director;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {
    Director director;

    @Before
    public void setUp() throws Exception {
        director = new Director("Jabba", "SG51246N", 50000.00, "VIP", 250000.00);
    }
    @Test
    public void hasName() {
        assertEquals("Jabba", director.getName());
    }

    @Test
    public void hasBudget() {
        assertEquals(250000, director.getBudget(),0.01);
    }

    @Test
    public void hasNiNumber() {
        assertEquals("SG51246N", director.getNinumber());
    }

    @Test
    public void canRaiseSalary() {
        director.raiseSalary(1.01);
        assertEquals(50500.00, director.getSalary(), 0.01);
    }

    @Test
    public void canOnlyRaisePositive() {
        director.raiseSalary(-1.01);
        assertEquals(50500.00, director.getSalary(), 0.01);
    }

    @Test
    public void canGetBonus() {
        assertEquals(1000, director.payBonus(), 0.1);
    }

    @Test
    public void canSetName() {
        director.setName("Jabba The Hut");
        assertEquals("Jabba The Hut", director.getName());
    }

    @Test
    public void nameCannotBeBlank() {
        director.setName("");
        assertEquals("Jabba", director.getName());
    }
}
