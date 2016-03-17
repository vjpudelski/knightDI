package knights;

import knights.config.KnightConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by vjpudelski on 3/10/16.
 */
public class KnightMain {
    public static void main(String[] args) throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(KnightConfig.class);
        Knight knight = ctx.getBean(Knight.class);
        knight.embarkOnQuest();

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("knight.xml");
        Knight knight1 = context.getBean(Knight.class);
        knight1.embarkOnQuest();
        context.close();
    }
}
