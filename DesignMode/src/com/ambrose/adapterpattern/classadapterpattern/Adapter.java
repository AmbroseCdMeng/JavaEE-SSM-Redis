package com.ambrose.adapterpattern.classadapterpattern;

public class Adapter extends Source implements Targetable {
    @Override
    public void runOnEdge() {
        System.out.println("Edge 浏览器完美运行");
    }

    @Override
    public void runOnFirefox() {
        System.out.println("Firefox 浏览器完美运行");
    }
}
