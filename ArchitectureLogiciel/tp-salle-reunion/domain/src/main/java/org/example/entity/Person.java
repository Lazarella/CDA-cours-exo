package org.example.entity;

public class Person {
    private long id;
    private String firstName;
    private String lastName;
    private String userId;
    private String userPassword;
    private boolean isAdmin;
    public Person(Builder builder){
        this.setId(builder.id);
        this.setFirstName(builder.firstName);
        this.setLastName(builder.lastName);
        this.setUserId(builder.userId);
        this.setUserPassword((builder.userPassword));
        this.setAdmin(builder.isAdmin);
    }

    public static class Builder {
        private long id;
        private String firstName;
        private String lastName;
        private String userId;
        private String userPassword;
        private boolean isAdmin;

        public Builder id(long id) {
            this.id = id;
            return this;
        }

        public Builder firstName(String firstName) {
            this.firstName = lastName;
            return this;
        }public Builder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder userId(String userId) {
            this.userId = userId;
            return this;
        }

        public Builder userPassword(String userPassword) {
            this.userPassword = userPassword;
            return this;
        }

        public Builder isAdmin(boolean isAdmin) {
            this.isAdmin = isAdmin;
            return this;
        }

        public Person build() {
            return new Person(this);
        }
    }
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public void setAdmin(boolean admin) {
        isAdmin = admin;
    }
}

