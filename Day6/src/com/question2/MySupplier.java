package com.question2;

import java.util.function.Supplier;

public class MySupplier implements Supplier {

    @Override
    public Object get() {

        return new Student (12,"geeta",400);
    }

}
