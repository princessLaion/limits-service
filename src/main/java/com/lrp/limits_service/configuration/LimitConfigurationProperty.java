package com.lrp.limits_service.configuration;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties (prefix = "limits-service")
@Getter
@Setter
public class LimitConfigurationProperty {
    private int minVal;
    private int maxVal;
}
