package com.gof.gof23;

import com.google.common.base.Stopwatch;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class Gof23Application {

    public static void main(String[] args) {
        Stopwatch stopwatch = Stopwatch.createStarted();
        SpringApplication.run(Gof23Application.class, args);
        log.info("项目启动耗时：{}",stopwatch.elapsed().getSeconds());
    }

}
