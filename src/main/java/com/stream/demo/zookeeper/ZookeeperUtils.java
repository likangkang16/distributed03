package com.stream.demo.zookeeper;

import org.apache.curator.framework.CuratorFramework;
import org.apache.curator.framework.CuratorFrameworkFactory;
import org.apache.curator.retry.RetryOneTime;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @ClassName ZookeeperUtils
 * @Description //TODO
 * @Author lkk
 * Date 2023/04/14/17:01
 * @Version 1.0
 **/
@Component
public class ZookeeperUtils implements ApplicationRunner {

    private String connectPath ="127.0.0.1:2181";
    private CuratorFramework curatorFramewor;


    private void initZookeeperClient(){

        RetryOneTime retryOneTime =new RetryOneTime(3);
        curatorFramewor =
                CuratorFrameworkFactory.builder().connectString(connectPath).retryPolicy(retryOneTime).build();
        curatorFramewor.sync();
    }

    public CuratorFramework zookeeperClient(){
        return curatorFramewor;
    }


    public Object getZookeeperNodeDate () throws Exception {
        List<String> list = curatorFramewor.getChildren().forPath("/test");
        byte[] bytes = curatorFramewor.getData().forPath(list.get(0));
        String resut =new String(bytes,"UTF-8");
        return resut;
    }


    public void zookeeperListener(){
        curatorFramewor.getCuratorListenable().addListener(new CuratorListenerZookeeper());
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        initZookeeperClient();
        zookeeperListener();
    }
}
