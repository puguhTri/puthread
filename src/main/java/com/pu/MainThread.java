package com.pu;

public class MainThread {

    public static void main(String[] args) {

        NumberGenerator numberGenerator = new NumberGenerator(100, 300);

        for (int i = 1; i <= 5; i++) {
            NewThread newThread = new NewThread(String.valueOf(i), numberGenerator);
            Thread thread = new Thread(newThread);
            thread.start();
        }
    }
}
