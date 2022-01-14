/*----------------------------------------------------------
 *                HTBLA-Leonding / Class: 3CHIF
 * ---------------------------------------------------------
 * Author:            Ajdin Keric
 * ----------------------------------------------------------
 * Description:
 * ----------------------------------------------------------
 */


package BuildingTdd;

public class Building {
    private int _id;
    private String _resident;

    public Building(int id, String resident)
    {
        _id = id;
        _resident = resident;
    }

    public int get_id() {
        return _id;
    }

    public String get_resident() {
        return _resident;
    }
}
