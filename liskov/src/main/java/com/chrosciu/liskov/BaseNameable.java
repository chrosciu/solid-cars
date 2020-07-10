package com.chrosciu.liskov;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public final class BaseNameable implements Nameable {
    private String name;
}
