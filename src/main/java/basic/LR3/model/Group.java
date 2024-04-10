package basic.LR3.model;

public class Group {
    private String name;
    private Human head;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Human getHead() {
        return head;
    }

    public void setHead(Human head) {
        this.head = head;
    }

    public Group() {

    }
    public Group(String name) {
        this.name = name;
    }

    public Group(Human head) {
        this.head = head;
    }
}