package com.jsn.core.java.thread.sync;

import org.apache.commons.lang3.time.StopWatch;

public class SynBlockDemo {

    public static void main(String[] args) {

        StopWatch stopWatch = new StopWatch();
        stopWatch.start();

        WarService warService = new WarService();
        Thread airForceThread = new Thread(new WarPreparationTask("AirForce-1", warService));
        Thread navyThread = new Thread(new WarPreparationTask("Navy-1", warService));
        airForceThread.start();
        navyThread.start();

        while (airForceThread.isAlive() || navyThread.isAlive()) {
        }
        stopWatch.stop();
        //Total execution time
        System.out.println("Total execution time: " + stopWatch.getTime()/1000 + " seconds");
    }
}


class WarPreparationTask implements Runnable {

    private String taskName;
    private WarService warService;

    public WarPreparationTask(String taskName, WarService warService) {
        this.taskName = taskName;
        this.warService = warService;
    }

    @Override
    public void run() {
        warService.attack(taskName);
    }


}
