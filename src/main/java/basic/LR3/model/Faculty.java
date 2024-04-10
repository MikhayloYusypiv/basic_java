package basic.LR3.model;

public class Faculty {
    private String name;
    private Human decan;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Human getDecan() {
        return decan;
    }

    public void setDecan(Human decan) {
        this.decan = decan;
    }

    public Faculty() {

    }
    public Faculty(String name) {
        this.name = name;
    }

    public Faculty(Human decan) {
        this.decan = decan;
    }

}