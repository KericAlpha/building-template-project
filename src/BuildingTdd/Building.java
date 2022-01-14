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
    private String[] _residents;

    public Building(int id, String resident)
    {
        _id = id;
        _resident = resident;
    }

    public Building(int id, String[] residents)
    {
        _id = id;
        _residents = residents;
    }

    public int get_id() {
        return _id;
    }

    public String get_resident() {
        return _resident;
    }

    public String[] get_residents() {
        return _residents;
    }

    private void set_residents(String[] _residents) {
        this._residents = _residents;
    }

    public void addResident(String resident)
    {
        String[] moreResidents = new String[get_residents().length + 1];
        for(int i = 0; i < get_residents().length; i++)
        {
            moreResidents[i] = get_residents()[i];
        }
        moreResidents[get_residents().length] = resident;

        set_residents(moreResidents);
    }
}
