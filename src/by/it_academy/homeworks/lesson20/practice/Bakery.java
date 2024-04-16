package by.it_academy.homeworks.lesson20.practice;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;

public class Bakery {
    private BlockingQueue<Pie> pies = new LinkedBlockingDeque<>(5);
    public void put(Pie newPie) throws InterruptedException {
        pies.put(newPie);
        System.out.println("We put new pie:" + newPie.getName() + " with id:" + newPie.getId());
    }
    //а разве это не в main все будет происходить?
    public Pie get() throws InterruptedException {
        Pie pie = pies.take();
        System.out.println("We take pie" + pie.getName() + " from queue with id:" + pie.getId());
        return pie;
    }
}
