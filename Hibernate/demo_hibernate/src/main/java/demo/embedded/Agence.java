package demo.embedded;

import javax.persistence.Embedded;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Agence {
    @EmbeddedId
    private AgenceId id;
    private String address;

    public Agence() {
    }

    public Agence(AgenceId id, String address) {
        this.id = id;
        this.address = address;
    }
@Id
    public AgenceId getId() {
        return id;
    }

    public void setId(AgenceId id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
