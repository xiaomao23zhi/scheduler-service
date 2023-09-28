package com.meganote.scheduler.domain.constant;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum LoadBalancer {

    RANDOM("random"),
    ;

    private final String loadBalancer;
}
