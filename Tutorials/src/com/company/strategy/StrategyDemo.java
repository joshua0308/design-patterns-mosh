package com.company.strategy;

public class StrategyDemo {
    public static void show() {
        var imageStorage = new ImageStorage();
        imageStorage.store(
                "a",
                new JpegCompressor(),
                new BlackAndWhiteFilter()
        );
        imageStorage.store(
                "b",
                new PngCompressor(),
                new BlackAndWhiteFilter()
        );
    }
}
