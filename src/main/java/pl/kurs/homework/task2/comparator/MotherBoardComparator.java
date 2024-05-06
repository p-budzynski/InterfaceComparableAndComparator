package pl.kurs.homework.task2.comparator;

import pl.kurs.homework.task2.model.Computer;
import pl.kurs.homework.task2.model.Motherboard;

import java.util.Comparator;

public class MotherBoardComparator implements Comparator<Computer> {
    @Override
    public int compare(Computer o1, Computer o2) {
        Motherboard motherboard1 = o1.getMotherboard();
        Motherboard motherboard2 = o2.getMotherboard();
        int result = motherboard1.getProducer().compareTo(motherboard2.getProducer());
        if (result == 0) {
            result = motherboard1.getModel().compareTo(motherboard2.getModel());
        }
        if (result == 0) {
            result = motherboard1.getSocket().compareTo(motherboard2.getSocket());
        }
        if (result == 0) {
            result = Integer.compare(motherboard1.getNumberMemorySlots(), motherboard2.getNumberMemorySlots());
        }
        return result;
    }
}
