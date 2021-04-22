package com.monster.nacos;

import com.alibaba.nacos.api.config.annotation.NacosConfigurationProperties;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 描述
 *
 * @author monster
 * @version 1.0
 * @date 2021/04/22 16:40:18
 */
@SpringBootApplication
@NacosConfigurationProperties(dataId = "example",autoRefreshed = true)
public class NacosConfigApplication {
    public static void main(String[] args) {

    }
}
