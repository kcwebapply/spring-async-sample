package sample.async;


import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

@Service
@Async
public class CityRace {

    public void kcRun() throws InterruptedException {
        System.out.println("kc start running!! ");
        System.out.println("kc run on " + Thread.currentThread().getName());
        TimeUnit.SECONDS.sleep(3);
        System.out.println("kc got half goal!!");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("kc got goal!!!");
    }

    public void taroRun() throws InterruptedException{
        System.out.println("taro start running!!");
        System.out.println("taro run on " + Thread.currentThread().getName());
        TimeUnit.SECONDS.sleep(2);
        System.out.println("taro got half goal!!");
        TimeUnit.SECONDS.sleep(4);
        System.out.println("taro got goal!!!");
    }
}
