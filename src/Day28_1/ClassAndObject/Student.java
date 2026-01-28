package Day28_1.ClassAndObject;

public class Student {
    private String name;
    private int id;
    private int units;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
        this.units = 0;
    }

    public String getName() {
        return name;
    }

    public int getID() {
        return id;
    }

    public int getUnits() {
        return units;
    }

    public void incrementUnits(int units) {
        this.units += units;
    }

    public boolean hasEnoughUnits() {
        return this.units >= 180;
    }

    @Override
    public String toString() {
        return name + " (#" + id + ")";
    }
}