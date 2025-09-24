public class User {
    private int id;
    private String name;

    public User(int id, String name) {
        super(); // calls Object constructor
        this.id = id;
        this.name = name;
    }

    public int getId() {
      return id;
    }
    public void setId(int id) {
      this.id = id; 
    }

    public String getName() {
      return name; 
    }
    public void setName(String name) {
      this.name = name;
    }

    public void displayInfo() {
        System.out.println("User: " + name + " (ID: " + id + ")");
    }
}
