package com.gfg;

public interface IPerson{
    default int getAge() {
        return 10;
    }
}
