package pl.kurs.homework.task2.model;

import java.util.Objects;

public class GraphicsCard {
    private int busWidthMbit;
    private int vramSize;
    private String model;
    private String producer;

    public GraphicsCard(int busWidthMbit, int vramSize, String model, String producer) {
        this.busWidthMbit = busWidthMbit;
        this.vramSize = vramSize;
        this.model = model;
        this.producer = producer;
    }

    public int getBusWidthMbit() {
        return busWidthMbit;
    }

    public void setBusWidthMbit(int busWidthMbit) {
        this.busWidthMbit = busWidthMbit;
    }

    public int getVramSize() {
        return vramSize;
    }

    public void setVramSize(int vramSize) {
        this.vramSize = vramSize;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GraphicsCard that = (GraphicsCard) o;
        return busWidthMbit == that.busWidthMbit && vramSize == that.vramSize && Objects.equals(model, that.model) && Objects.equals(producer, that.producer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(busWidthMbit, vramSize, model, producer);
    }

    @Override
    public String toString() {
        return "Graphics card: [" + producer + "], model: [" + model + "], VRAM: [" + vramSize +
                " GB], graphics bus size: [" + busWidthMbit + " Mbit]";
    }
}
