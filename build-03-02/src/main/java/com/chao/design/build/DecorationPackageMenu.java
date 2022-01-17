package com.chao.design.build;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class DecorationPackageMenu implements IMenu {

    private List<Matter> list = new ArrayList<Matter>();
    private BigDecimal price = BigDecimal.ZERO;

    private BigDecimal area;
    private String grade;

    public DecorationPackageMenu(Double area, String grade) {
        this.area = new BigDecimal(area);
        this.grade = grade;
    }

    public IMenu appendCeiling(Matter matter) {
        list.add(matter);
        price = price.add(area.multiply(new BigDecimal("0.2")).multiply(matter.price()));
        return this;
    }

    public IMenu appendCoat(Matter matter) {
        return null;
    }

    public IMenu appendFloor(Matter matter) {
        return null;
    }

    public IMenu appendTile(Matter matter) {
        return null;
    }

    public String getDetail() {
        return null;
    }
}
