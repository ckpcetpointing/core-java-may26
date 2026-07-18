package com.jsn.core.java.io;


import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Setter
@Getter
@Builder
public class Address implements Serializable {

    private String houseNo;
    private String line1;
    private String line2;

}
