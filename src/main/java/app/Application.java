package app;

import app.config.AppConfig;
import app.model.AnimalsCage;
import app.model.Cat;
import app.model.Dog;
import app.model.Timer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        for (int i = 0; i < 5; i++) {
            AnimalsCage bean =
                    applicationContext.getBean(AnimalsCage.class);
            bean.whatAnimalSay();
        }
        Cat cat = applicationContext.getBean("cat", Cat.class);
        cat.toString();
        Dog dog = applicationContext.getBean("dog", Dog.class);
        dog.toString();
        Timer timer = applicationContext.getBean("timer", Timer.class);
        timer.getTime();
    }

}
