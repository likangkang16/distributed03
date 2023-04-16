package com.stream.demo.zookeeper;

import org.apache.curator.framework.CuratorFramework;
import org.apache.curator.framework.api.CuratorEvent;
import org.apache.curator.framework.api.CuratorEventType;
import org.apache.curator.framework.api.CuratorListener;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.web.client.RestTemplate;

/**
 * @ClassName CuratorListenerZookeeper
 * @Description //TODO
 * @Author lkk
 * Date 2023/04/16/16:57
 * @Version 1.0
 **/
public class CuratorListenerZookeeper implements CuratorListener {

    @Override
    public void eventReceived(CuratorFramework curatorFramework, CuratorEvent curatorEvent) throws Exception {
        CuratorEventType type = curatorEvent.getType();
        switch (type){
            case CREATE:
                RestTemplate restTemplate =new RestTemplate();
                String url = new String(curatorEvent.getData(),"UTF-8");
                HttpEntity<Object> httpEntity = new HttpEntity<>("ssss");
                restTemplate.exchange(url, HttpMethod.POST,httpEntity,Object.class);
                break;
            default:
                break;
        }
    }
}
