package pl.kurs.homework.task2.model;

import java.util.Objects;

public class HardDrive {
    private String type;
    private int capacity;
    private String producer;
    private String model;

    public HardDrive(String type, int capacity, String producer, String model) {
        this.type = type;
        this.capacity = capacity;
        this.producer = producer;
        this.model = model;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HardDrive hardDrive = (HardDrive) o;
        return capacity == hardDrive.capacity && Objects.equals(type, hardDrive.type) && Objects.equals(producer, hardDrive.producer) && Objects.equals(model, hardDrive.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, capacity, producer, model);
    }

    @Override
    public String toString() {
        return "Hard drive: [" + producer + "], model: [" + model + "], type: [" + type + "], capacity: [" + capacity + " GB]";
    }
}
