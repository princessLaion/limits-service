package com.lrp.limits_service.controller;

import com.lrp.limits_service.configuration.LimitConfigurationProperty;
import com.lrp.limits_service.model.Limits;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
@RequiredArgsConstructor
public class LimitsController {

    private final LimitConfigurationProperty limitConfigurationProperty;

    @GetMapping("/limits")
    public Limits retrieveLimits() {
        return new Limits(
                limitConfigurationProperty.getMaxVal(),
                limitConfigurationProperty.getMinVal()
        );
    }
}
