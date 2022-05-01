package lt.viko.jkiskis.module;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "client")
public class Client
{
    private String name;
    private String lastname;
    private boolean membership;

    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public String getLastname()
    {
        return lastname;
    }
    public void setLastname(String lastname)
    {
        this.lastname=lastname;
    }
    public boolean getMembership()
    {
        return membership;
    }
    public void setMembership(boolean membership)
    {
        this.membership=membership;
    }

    @Override
    public String toString()
    {
        return "Client name: " + name + " lastName: " + lastname + " Membership: " + membership;
    }

}
