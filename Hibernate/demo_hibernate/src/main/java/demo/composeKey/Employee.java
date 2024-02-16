package demo.composeKey;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

@Entity
@IdClass(EmployeePK.class)
public class Employee {
    private static final long serialVersionUID = 1L;

    @Id
    private String firstName;

    @Id
    private String lastName;
    private Integer height;

    public Employee() {
    }
@Id
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    @Id
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }
}
