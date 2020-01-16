
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        HelloMom obj = (HelloMom) context.getBean("helloWorld");
        obj.printMessage();
        System.out.println("Hello World");
        System.out.println("HELLO AGAIN");
    }
}
