package pe.edu.cibertec.t1feigngrupo3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class T1FeignGrupo3Application {

    public static void main(String[] args) {
        SpringApplication.run(T1FeignGrupo3Application.class, args);
    }

}