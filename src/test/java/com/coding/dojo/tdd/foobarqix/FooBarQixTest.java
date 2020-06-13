package com.coding.dojo.tdd.foobarqix;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class FooBarQixTest {

    FooBarQix fooBarQix;

    @BeforeEach
    public void init() {
        fooBarQix = new FooBarQix();
    }


    @Test
    public void test_compute_1() {
        final String s = "1";

        String result = fooBarQix.compute(s);

        assertThat(result).isEqualTo("1");

    }

    @Test
    public void test_compute_3() {

        String s = "3";

        String result = fooBarQix.compute(s);

        assertThat(result).isEqualTo("FooFoo");

    }

    @Test
    public void test_compute_13() {

        String s = "13";

        String result = fooBarQix.compute(s);

        assertThat(result).isEqualTo("Foo");

    }

    @Test
    public void test_compute_15() {

        String s = "15";

        String result = fooBarQix.compute(s);

        assertThat(result).isEqualTo("FooBarBar");

    }

    @Test
    public void test_compute_6() {

        String s = "6";

        String result = fooBarQix.compute(s);

        assertThat(result).isEqualTo("Foo");

    }

    @Test
    public void test_compute_7() {

        String s = "7";

        String result = fooBarQix.compute(s);

        assertThat(result).isEqualTo("QixQix");

    }

    @Test
    public void test_compute_51() {

        String s = "51";

        String result = fooBarQix.compute(s);

        assertThat(result).isEqualTo("FooBar");

    }

    @Test
    public void test_compute_53() {

        String s = "53";

        String result = fooBarQix.compute(s);

        assertThat(result).isEqualTo("BarFoo");

    }

//    @Test
//    public void test_compute_33() {
//
//        String s = "33";
//
//        String result = fooBarQix.compute(s);
//
//        assertThat(result).isEqualTo("FooFooFoo");
//
//    }

}