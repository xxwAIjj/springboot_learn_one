package lxw.example.springboot_learn_one;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootLearnOneApplication {

    public static void main(String[] args) {
        System.out.println("工程启动");
        SpringApplication.run(SpringbootLearnOneApplication.class, args);
    }

}
