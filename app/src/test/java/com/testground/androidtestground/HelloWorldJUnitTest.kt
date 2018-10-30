package com.testground.androidtestground

import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert.assertThat
import org.junit.Test

class HelloWorldJUnitTest {

    @Test
    fun myTest() {
        assertThat("HelloWorld", CoreMatchers.equalTo("HelloWorld"))
    }
}