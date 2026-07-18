package com.jsn.core.java.io;


import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Setter
@Getter
@Builder
public class Person implements Serializable {

    private Integer id;
    private String firstName;
    private String lastName;
    private Address address;
}
