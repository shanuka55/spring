package lk.ijse.spring.pojo;

import org.springframework.stereotype.Component;

@Component
public class SpringBean {
    public SpringBean(){
        System.out.println("Spring Bean Object Created : Instantiated");
    }

    public void test(){
        System.out.println("Spring Bean Text Mothod Invoked");
    }
}
