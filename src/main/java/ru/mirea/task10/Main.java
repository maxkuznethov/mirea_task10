package ru.mirea.task10;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.mirea.task10.entities.Junior;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("ru.mirea.task10.entities");

        Programmer programmer = context.getBean(args[0],Programmer.class);
        programmer.doCoding();
    }
}
