import com.wj.service.DiConfig;
import com.wj.service.UseFunctionService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @program: wj_springBoot
 * @description: appMain
 * @author: wj
 * @create: 2021-09-08 16:17
 **/
public class AppMain {

    public static void main(String[] args){
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(DiConfig.class);
        UseFunctionService bean = context.getBean(UseFunctionService.class);
        String wj = bean.sayHelloWord("WJ");
        System.out.println(wj);
    }

}
