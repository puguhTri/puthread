package com.pu;

public class NewThread implements Runnable {

    private String name;

    NumberGenerator numberGenerator;

    public NewThread(String name, NumberGenerator numberGenerator) {
        this.name = name;
        this.numberGenerator = numberGenerator;
    }

    public void run() {
        //System.out.println(name + ": Hello");
        //do this
        try {
            callGenerator();

            Thread.sleep(250);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private void callGenerator() {
        synchronized (numberGenerator) {
            for (int i = 1; i <= 3; i++) {
                System.out.println(name + ":::"  + numberGenerator.randomNumber());
            }
        }


    }
}
