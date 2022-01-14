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

    @Test
    public void ShallCreateABuildingWithIDAndResidents_BuildingShouldHaveAnArrayOfStrings()
    {
        String[] residents = {"Keric", "NichtKeric", "Wizany", "Joe", "Willi"};
        Building keric = new Building(3, residents);

        String[] kericHisResidents = keric.get_residents();

        for(int i = 0; i < residents.length; i++)
        {
            assertEquals(kericHisResidents[i], residents[i]);
        }
    }

    @Test
    public void ShallCreateABuildingWithIDAndResidentsAndAddNewResident_BuildingShouldHave1MoreResidentNow()
    {
        String[] residents = {"Keric", "NichtKeric", "Wizany", "Joe", "Willi"};
        Building keric = new Building(3, residents);

        keric.addResident("Bozo");

        String[] kericHisResidents = keric.get_residents();

        for(int i = 0; i < residents.length; i++)
        {
            assertEquals(kericHisResidents[i], residents[i]);
        }
        assertEquals(kericHisResidents[5], "Bozo");
    }


    @Test
    public void ShallCreateABuildingWithIDAndResidentsAndRemoveAResident_BuildingShouldHave1LessResidentNow()
    {
        String[] residents = {"Keric", "NichtKeric", "Wizany", "Joe", "Willi"};
        Building keric = new Building(3, residents);

        keric.removeResident("Joe");

        String[] kericHisResidents = keric.get_residents();

        assertEquals(kericHisResidents.length, 4);
    }

    @Test
    public void ShallCreateABuildingWithIDAndResidents_AddResidentShouldNotWork()
    {
        String[] residents = {"Keric", "NichtKeric", "Wizany", "Joe", "Willi"};
        Building keric = new Building(3, residents);

        keric.addResident("Keric");

        assertEquals(keric.numberOfResidents(), 5);
    }

    @Test
    public void ShallCreateABuildingWithIDAndResidents_RemoveResidentShouldNotWork()
    {
        String[] residents = {"Keric", "NichtKeric", "Wizany", "Joe", "Willi"};
        Building keric = new Building(3, residents);

        keric.removeResident("Gustav");

        assertEquals(keric.numberOfResidents(), 5);
    }
}
