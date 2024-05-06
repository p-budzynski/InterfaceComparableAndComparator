package pl.kurs.homework.task2.comparator;

import pl.kurs.homework.task2.model.Computer;
import pl.kurs.homework.task2.model.GraphicsCard;

import java.util.Comparator;

public class GraphicCardComparator implements Comparator<Computer> {

    @Override
    public int compare(Computer o1, Computer o2) {
        GraphicsCard graphicsCard1 = o1.getGraphicsCard();
        GraphicsCard graphicsCard2 = o2.getGraphicsCard();
        int result = graphicsCard1.getProducer().compareTo(graphicsCard2.getProducer());
        if (result == 0) {
            result = graphicsCard1.getModel().compareTo(graphicsCard2.getModel());
        }
        if (result == 0) {
            result = Integer.compare(graphicsCard2.getVramSize(), graphicsCard1.getVramSize());
        }
        if (result == 0) {
            result = Integer.compare(graphicsCard2.getBusWidthMbit(), graphicsCard1.getBusWidthMbit());
        }
        return result;
    }
}
