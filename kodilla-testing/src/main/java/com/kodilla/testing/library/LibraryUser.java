package com.kodilla.testing.library;

public class LibraryUser {

    private String firstname;
    private String lastname;
    private String pesselId;

    public LibraryUser(String firstname, String lastname, String pesselId) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.pesselId = pesselId;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getPesselId() {
        return pesselId;
    }

    public void setPesselId(String pesselId) {
        this.pesselId = pesselId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LibraryUser that = (LibraryUser) o;

        if (!firstname.equals(that.firstname)) return false;
        if (!lastname.equals(that.lastname)) return false;
        return pesselId.equals(that.pesselId);
    }

    @Override
    public int hashCode() {
        int result = firstname.hashCode();
        result = 31 * result + lastname.hashCode();
        result = 31 * result + pesselId.hashCode();
        return result;
    }
}

