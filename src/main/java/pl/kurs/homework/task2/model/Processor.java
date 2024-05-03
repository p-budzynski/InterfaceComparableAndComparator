package pl.kurs.homework.task2.model;

import java.util.Objects;

public class Processor {
    private String producer;
    private String model;
    private int clockSpeed;
    private int numberOfCores;
    private int nmTechnology;

    public Processor(String producer, String model, int clockSpeed, int numberOfCores, int nmTechnology) {
        this.producer = producer;
        this.model = model;
        this.clockSpeed = clockSpeed;
        this.numberOfCores = numberOfCores;
        this.nmTechnology = nmTechnology;
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

    public int getClockSpeed() {
        return clockSpeed;
    }

    public void setClockSpeed(int clockSpeed) {
        this.clockSpeed = clockSpeed;
    }

    public int getNumberOfCores() {
        return numberOfCores;
    }

    public void setNumberOfCores(int numberOfCores) {
        this.numberOfCores = numberOfCores;
    }

    public int getNmTechnology() {
        return nmTechnology;
    }

    public void setNmTechnology(int nmTechnology) {
        this.nmTechnology = nmTechnology;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Processor processor = (Processor) o;
        return clockSpeed == processor.clockSpeed && numberOfCores == processor.numberOfCores && nmTechnology == processor.nmTechnology && Objects.equals(producer, processor.producer) && Objects.equals(model, processor.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(producer, model, clockSpeed, numberOfCores, nmTechnology);
    }

    @Override
    public String toString() {
        return "Processor: [" + producer + "], model: [" + model + "], CPU clock speed: [" + clockSpeed + " MHz], number cores: [" +
                numberOfCores + "], technology process: [" + nmTechnology + " nm]";
    }
}
