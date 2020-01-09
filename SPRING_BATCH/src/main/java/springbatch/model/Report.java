package springbatch.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/*
* First of all we are reading CSV file into java object and then using JAXB to write it to xml file. Below is our model class with required JAXB annotations.
*
* Note that the model class fields should be same as defined in the spring batch mapper configuration i.e. property name="names" value="id,firstname,lastname,dob" in our case.
* */
@XmlRootElement(name = "record")
public class Report {

    private int id;
    private String firstName;
    private String lastName;
    private Date dob;

    @XmlAttribute(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @XmlElement(name = "firstname")
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @XmlElement(name = "lastname")
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @XmlElement(name = "dob")
    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    @Override
    public String toString() {
        return "Report [id=" + id + ", firstname=" + firstName + ", lastName=" + lastName + ", DateOfBirth=" + dob + "]";
    }

}
