package com.rtaylor02.junit5_bdd_first_step.junit;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Customer {
    private String name;
    private boolean isVip;
}
