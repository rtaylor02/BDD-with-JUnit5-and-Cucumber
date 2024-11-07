package com.rtaylor02.bdd_cucumber;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Customer {
    private String name;
    private boolean isVip;
}
