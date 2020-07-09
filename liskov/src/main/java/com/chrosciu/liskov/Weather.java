package com.chrosciu.liskov;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@Setter
public class Weather {
    private static Weather instance;
    private int temperature = 0;

    public static Weather getInstance() {
        if (null == instance) {
            instance = new Weather();
        }
        return instance;
    }
}
