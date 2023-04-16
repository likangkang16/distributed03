//package com.stream.demo.kafka;
//
//import com.stream.demo.mode.User;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.stereotype.Component;
//
//import java.util.concurrent.BlockingDeque;
//import java.util.concurrent.LinkedBlockingDeque;
//import java.util.function.Supplier;
//
///**
// * @ClassName KafkaUtils
// * @Description //TODO
// * @Author lkk
// * Date 2023/04/14/17:00
// * @Version 1.0
// **/
//@Configuration
//public class KafkaUtils {
//
//   private static BlockingDeque<User> blockingDeque =new LinkedBlockingDeque();
//
//
//
//   @Bean
//   public Supplier<User> test01(){
//     return ()->blockingDeque.poll();
//   }
//
//
//   public void sendKakfaInfo(){
//      blockingDeque.offer(new User("李无","12"));
//   }
//}
