package com.lrp.limits_service.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Limits {
    private int minimum;
    private int maximum;
}
