package pl.kurs.homework.task2.model;

import java.util.Objects;

public class RandomAccessMemory {
    private int sizeGB;
    private int frequencyMHz;
    private char ddrType;
    private String producer;
    private String model;

    public RandomAccessMemory(int sizeGB, int frequencyMHz, char ddrType, String producer, String model) {
        this.sizeGB = sizeGB;
        this.frequencyMHz = frequencyMHz;
        this.ddrType = ddrType;
        this.producer = producer;
        this.model = model;
    }

    public int getSizeGB() {
        return sizeGB;
    }

    public void setSizeGB(int sizeGB) {
        this.sizeGB = sizeGB;
    }

    public int getFrequencyMHz() {
        return frequencyMHz;
    }

    public void setFrequencyMHz(int frequencyMHz) {
        this.frequencyMHz = frequencyMHz;
    }

    public char getDdrType() {
        return ddrType;
    }

    public void setDdrType(char ddrType) {
        this.ddrType = ddrType;
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
        RandomAccessMemory that = (RandomAccessMemory) o;
        return sizeGB == that.sizeGB && frequencyMHz == that.frequencyMHz && ddrType == that.ddrType && Objects.equals(producer, that.producer) && Objects.equals(model, that.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sizeGB, frequencyMHz, ddrType, producer, model);
    }

    @Override
    public String toString() {
        return "RAM: [" + producer + "], model: [" + model + "], type: [DDR " + ddrType + "], RAM size: [" + sizeGB +
                " GB], frequency: [" + frequencyMHz + " MHz]";
    }
}
