package lt.viko.jkiskis.module;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "employee")
public class Employee
{
    private String name;
    private String lastname;
    private int telephone;
    private String position;

    private List <Client> clientList;

    public void setName(String name)
    {
        this.name=name;
    }
    public String getName()
    {
        return name;
    }
    public void setLastname(String lastname)
    {
        this.lastname=lastname;
    }
    public String getLastname()
    {
        return lastname;
    }
    public void setTelephone(int telephone)
    {
        this.telephone=telephone;
    }
    public int getTelephone()
    {
        return telephone;
    }
    public void setPosition(String position)
    {
        this.position=position;
    }
    public String getPosition()
    {
        return position;
    }

    public void setClientList(List <Client> clientList)
    {
        this.clientList=clientList;
    }
    public List<Client> getClientList()
    {
        return clientList;
    }


}
