package com.chao.design.build;

import com.chao.design.build.ceiling.LevelTwoCeiling;
import com.chao.design.build.coat.DuluxCoat;
import com.chao.design.build.floor.ShengXiangFloor;

/**
 * 建造者类负责构建的过程
 * 负责具体的各种组装
 */
public class Builder {

    public IMenu leveOne(Double area) {
        return new DecorationPackageMenu(area, "欧式豪华")
                .appendCeiling(new LevelTwoCeiling()).appendCoat(new DuluxCoat()).appendFloor(new ShengXiangFloor());
    }

    public IMenu levelTwo(Double area) {
        return null;
    }

    public IMenu levelThree(Double area) {
        return null;
    }
}
