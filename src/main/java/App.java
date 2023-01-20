import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld hw1 = (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld hw2 = (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println("Does hw1 equal hw2? " + ( hw1 == hw2));

        Cat cat1 = (Cat) applicationContext.getBean("cat");
        Cat cat2 = (Cat) applicationContext.getBean("cat");
        System.out.println("Does cat1 equal cat2? " + ( cat1 == cat2));

    }
}