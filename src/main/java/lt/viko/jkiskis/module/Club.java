package lt.viko.jkiskis.module;

import javax.xml.bind.annotation.*;
import java.util.List;

@XmlRootElement(name = "club")
@XmlAccessorType(XmlAccessType.FIELD)
public class Club
{
    private String clubName;
    private String clubAddress;
    private int clubTelephone;
    @XmlElementWrapper(name = "employees")
    @XmlElement(name = "employee")
    private List<Employee> employees;

    public void setClubName(String clubName)
    {
        this.clubName=clubName;
    }
    public String getClubName()
    {
        return clubName;
    }
    public void setClubAddress(String clubAddress)
    {
        this.clubAddress=clubAddress;
    }
    public String getClubAddress()
    {
        return clubAddress;
    }
    public void setClubTelephone(int clubTelephone)
    {
        this.clubTelephone=clubTelephone;
    }

    public int getClubTelephone()
    {
        return clubTelephone;
    }

    public void setEmployees(List<Employee> employees)
    {
        this.employees=employees;
    }
    public List<Employee> getEmployees()
    {
        return employees;
    }
}
