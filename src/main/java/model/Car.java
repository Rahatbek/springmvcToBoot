package model;

public class Car {
    private String mark;
    private String model;
    private int cost;

    public Car() {
    }

    public Car(String mark, String model, int cost) {
        this.mark = mark;
        this.model = model;
        this.cost = cost;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Car{" +
                "mark='" + mark + '\'' +
                ", model='" + model + '\'' +
                ", cost=" + cost +
                '}';
    }
}
