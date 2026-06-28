package com.jsn.core.java.clone;


import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Curtain {

    private String color;
    private String material;
    private int length;
    private int width;
    private String pattern;
    private boolean isBlackout;
    private String brand;
    private double price;

  /*  public Curtain getClone() {
        Curtain clonedCurtain = new Curtain();
        clonedCurtain.setColor(this.color);
        clonedCurtain.setMaterial(this.material);
        clonedCurtain.setLength(this.length);
        clonedCurtain.setWidth(this.width);
        clonedCurtain.setPattern(this.pattern);
        clonedCurtain.setBlackout(this.isBlackout);
        clonedCurtain.setBrand(this.brand);
        clonedCurtain.setPrice(this.price);
        return clonedCurtain;
    }*/

   public Curtain getClone() {
        return new Curtain(material, color, length, width, pattern, isBlackout, brand, price);
    }
}
