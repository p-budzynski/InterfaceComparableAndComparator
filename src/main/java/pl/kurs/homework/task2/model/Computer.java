package pl.kurs.homework.task2.model;

import java.util.Objects;

public class Computer {
    private Motherboard motherboard;
    private Processor processor;
    private HardDrive hardDrive;
    private RandomAccessMemory ram;
    private GraphicsCard graphicsCard;

    public Computer(Motherboard motherboard, Processor processor, HardDrive hardDrive, RandomAccessMemory ram, GraphicsCard graphicsCard) {
        this.motherboard = motherboard;
        this.processor = processor;
        this.hardDrive = hardDrive;
        this.ram = ram;
        this.graphicsCard = graphicsCard;
    }

    public Motherboard getMotherboard() {
        return motherboard;
    }

    public void setMotherboard(Motherboard motherboard) {
        this.motherboard = motherboard;
    }

    public Processor getProcessor() {
        return processor;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    public HardDrive getHardDrive() {
        return hardDrive;
    }

    public void setHardDrive(HardDrive hardDrive) {
        this.hardDrive = hardDrive;
    }

    public RandomAccessMemory getRam() {
        return ram;
    }

    public void setRam(RandomAccessMemory ram) {
        this.ram = ram;
    }

    public GraphicsCard getGraphicsCard() {
        return graphicsCard;
    }

    public void setGraphicsCard(GraphicsCard graphicsCard) {
        this.graphicsCard = graphicsCard;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Computer computer = (Computer) o;
        return Objects.equals(motherboard, computer.motherboard) && Objects.equals(processor, computer.processor) && Objects.equals(hardDrive, computer.hardDrive) && Objects.equals(ram, computer.ram) && Objects.equals(graphicsCard, computer.graphicsCard);
    }

    @Override
    public int hashCode() {
        return Objects.hash(motherboard, processor, hardDrive, ram, graphicsCard);
    }


}
