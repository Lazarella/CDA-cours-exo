package org.example.Library;

public class Borrow {
    private Person person;
    private String beginAt;
    private String endAt;

    public Borrow(Person person, String beginAt, String endAt) {
        this.person = person;
        this.beginAt = beginAt;
        this.endAt = endAt;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public String getBeginAt() {
        return beginAt;
    }

    public void setBeginAt(String beginAt) {
        this.beginAt = beginAt;
    }

    public String getEndAt() {
        return endAt;
    }

    public void setEndAt(String endAt) {
        this.endAt = endAt;
    }

    @Override
    public String toString() {
        return "Infos " +
                "person=" + person +
                ", beginAt='" + beginAt + '\'' +
                ", endAt='" + endAt + '\'' +
                '.';
    }
}
