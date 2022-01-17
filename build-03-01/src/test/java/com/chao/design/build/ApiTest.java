package com.chao.design.build;

import org.junit.Test;
import sun.font.Decoration;

import java.math.BigDecimal;

public class ApiTest {

    @Test
    public void test_DecorationPackageController() {
        DecorationPackageController decorationPackageController = new DecorationPackageController();

        System.out.println(decorationPackageController.getMatterList(new BigDecimal("132.52"), 1));

        System.out.println(decorationPackageController.getMatterList(new BigDecimal("98.25"),2));

        System.out.println(decorationPackageController.getMatterList(new BigDecimal("85.43"),3));

    }
}
