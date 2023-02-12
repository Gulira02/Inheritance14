public class Information {
    private String instructorName;
    private String certificate;
    private String directions;//направления
    private String address;
    private int contacts;

    public Information(String instructorName, String certificate, String directions, String address, int contacts) {
        this.instructorName = instructorName;
        this.certificate = certificate;
        this.directions = directions;
        this.address = address;
        this.contacts = contacts;
    }

    public String getInstructorName() {
        return instructorName;
    }

    public void setInstructorName(String instructorName) {
        this.instructorName = instructorName;
    }

    public String getCertificate() {
        return certificate;
    }

    public void setCertificate(String certificate) {
        this.certificate = certificate;
    }

    public String getDirections() {
        return directions;
    }

    public void setDirections(String directions) {
        this.directions = directions;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getContacts() {
        return contacts;
    }

    public void setContacts(int contacts) {
        this.contacts = contacts;
    }

    @Override
    public String toString() {
        return "Information{" +
                "instructorName:  " + instructorName + '\'' +
                ", certificate:   " + certificate + '\'' +
                ", directions:    " + directions + '\'' +
                ", address:      " + address + '\'' +
                ", contacts:    " + contacts +
                '}';
    }
}
