public class Admin extends User {
    private int privilegeLevel;

    public Admin(int id, String name, int privilegeLevel) {
        super(id, name);
        this.privilegeLevel = privilegeLevel;
    }

    public int getPrivilegeLevel() { 
return privilegeLevel; 
}
    public void setPrivilegeLevel(int privilegeLevel) {
this.privilegeLevel = privilegeLevel; 
}
    public void displayInfo() {
        System.out.println("Admin: " + getName() + " (Privilege: " + privilegeLevel + ")");
    }
}
