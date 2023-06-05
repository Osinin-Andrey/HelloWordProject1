package by.osinin.classwork.lesson19;

import java.util.concurrent.Callable;

public class MyCallable implements Callable<String> { //что бы вернул строчку
    @Override
    public String call() throws Exception {
        return "Hello"; //что бы вернул хелло
    }
}
