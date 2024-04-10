package basic.LR3.model;

public class Department {
    private String name;
    private Human chair;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Human getChair() {
        return chair;
    }

    public void setChair(Human chair) {
        this.chair = chair;
    }

    public Department() {

    }
    public Department(String name) {
        this.name = name;
    }

    public Department(Human chair) {
        this.chair = chair;
    }
}