package basic.LR3.model;

public class University {
    private String name;
    private Human rector;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Human getRector() {
        return rector;
    }

    public void setRector(Human rector) {
        this.rector = rector;
    }

    public University() {

    }

    public University(String name) {
        this.name = name;
    }

    public University(Human rector) {
        this.rector = rector;
    }

}