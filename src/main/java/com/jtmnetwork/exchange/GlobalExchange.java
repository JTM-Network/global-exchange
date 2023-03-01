package com.jtmnetwork.exchange;

import com.google.inject.Injector;
import com.jtm.framework.Framework;

import java.util.Arrays;

public class GlobalExchange extends Framework {

    private Injector sub;

    public GlobalExchange() {
        super(false, false, false);
    }

    @Override
    public void setup() {
        sub = injector(Arrays.asList());
    }

    @Override
    public void init() {

    }

    @Override
    public void enable() {

    }

    @Override
    public void disable() {

    }
}