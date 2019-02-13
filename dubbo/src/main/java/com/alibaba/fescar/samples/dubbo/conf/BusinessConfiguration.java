package com.alibaba.fescar.samples.dubbo.conf;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * ${DESCRIPTION}
 *
 * @author yangyi
 */
@Configuration
@ImportResource(locations = "classpath:spring/dubbo-business.xml")
public class BusinessConfiguration {
}
