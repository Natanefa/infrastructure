package Infrastructure;

public class Author {
    public static String type;
    private String firstName;
    private String lastName;

    public Author(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        this.type = type;
    }

    public String getFirstName() {return firstName;}
    public void setFirstName(String firstName) {this.firstName = firstName;}
    public String getLastName() {return  lastName;}
    public void setLastName(String lastName) {this.lastName = lastName;}

    public static String getType() {return type;}
}
