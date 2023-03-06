public class Student {
    private String name;
    private int id;
    private String status;
    
    public Student(String name, int id, String status) {
        this.name = name;
        this.id = id;
        this.status = status;
    }
    
    public String getName() {
        return name;
    }
    
    public int getID() {
        return id;
    }
    
    public String getStatus() {
        return status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }
}
