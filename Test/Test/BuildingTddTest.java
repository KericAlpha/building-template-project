/*----------------------------------------------------------
 *                HTBLA-Leonding / Class: 3CHIF
 * ---------------------------------------------------------
 * Author:            Ajdin Keric
 * ----------------------------------------------------------
 * Description:
 * ----------------------------------------------------------
 */


package Test;
import BuildingTdd.Building;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BuildingTddTest {

    @Test
    public void ShallCreateABuildingWithIDAndResident_BuildingShouldNotBeNull()
    {
        Building willi = new Building(1, "willi");

        assertNotNull(willi);
    }

    @Test
    public void ShallCreateABuildingWithIDAndResident_BuildingShouldHaveIDAndResident()
    {
        Building joe = new Building(26, "joe");

        assertEquals(joe.get_id(), 26);
        assertEquals(joe.get_resident(), "joe");
    }
}
