package sky.pro;

public class Author {
    private String surName;
    private String firstName;
    public  Author(String surName,String firstName) {
        this.surName =surName;
        this.firstName=firstName;
          }
    public String getSurName() {
        return this.surName;

    }
    public String getFirstName() {
        return this.firstName;

    }

}
