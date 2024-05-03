package pl.kurs.homework.task2.model;

import java.util.Objects;

public class Motherboard {
    private String socket;
    private String producer;
    private String model;
    private int numberMemorySlots;

    public Motherboard(String producer, String model, String socket, int numberMemorySlots) {
        this.producer = producer;
        this.model = model;
        this.socket = socket;
        this.numberMemorySlots = numberMemorySlots;
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

    public String getSocket() {
        return socket;
    }

    public void setSocket(String socket) {
        this.socket = socket;
    }

    public int getNumberMemorySlots() {
        return numberMemorySlots;
    }

    public void setNumberMemorySlots(int numberMemorySlots) {
        this.numberMemorySlots = numberMemorySlots;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Motherboard that = (Motherboard) o;
        return numberMemorySlots == that.numberMemorySlots && Objects.equals(producer, that.producer) && Objects.equals(model, that.model) && Objects.equals(socket, that.socket);
    }

    @Override
    public int hashCode() {
        return Objects.hash(producer, model, socket, numberMemorySlots);
    }

    @Override
    public String toString() {
        return "Mother board: [" + producer + "], model: [" + model + "], socket: [" + socket + "], number memory slots: [" + numberMemorySlots + "]";
    }
}
