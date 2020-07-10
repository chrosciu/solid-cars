package com.chrosciu.liskov;

import lombok.experimental.Delegate;

public class Bicycle implements Nameable {
    @Delegate
    private final BaseNameable baseNameable = new BaseNameable();
}
