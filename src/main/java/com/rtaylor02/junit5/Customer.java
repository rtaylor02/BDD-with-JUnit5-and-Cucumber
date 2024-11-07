package com.rtaylor02.junit5;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Customer {
    private String name;
    private boolean isVip;
}
