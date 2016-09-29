package mx.iteso.decorator;

public abstract class Taco {
    public static final int MINI = 0;
    public static final int REGULAR = 1;
    public static final int MEGA = 2;

    public int size;

    public String description = "Any Taco";
    public String getDescription(){
        return description;
    }
    public abstract double cost();
}
