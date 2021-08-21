package com.company.strategy;

public class ImageStorage {
    public ImageStorage() {
    }

    public void store(String filename, Compressor compressor, Filter filter) {
        compressor.compress(filename);
        filter.apply(filename);
    }
}
