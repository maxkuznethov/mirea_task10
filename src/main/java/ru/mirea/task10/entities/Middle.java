package ru.mirea.task10.entities;

import org.springframework.stereotype.Component;
import ru.mirea.task10.Programmer;

@Component
public class Middle implements Programmer {
    @Override
    public void doCoding() {
        System.out.println("Make average code");
    }
}
