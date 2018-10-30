package com.testground.androidtestground

import org.hamcrest.CoreMatchers.equalTo
import org.junit.Test
import org.junit.runner.RunWith
import android.widget.TextView
import org.robolectric.Robolectric
import org.hamcrest.MatcherAssert.assertThat
import org.robolectric.RobolectricTestRunner


@RunWith(RobolectricTestRunner::class)
class HelloWorldActivityRobolectricTest {

    @Test
    @Throws(Exception::class)
    fun testAssertHelloText() {
        val activity = Robolectric.setupActivity(HelloWorldActivity::class.java)
        val textView = activity.findViewById(R.id.tv_hello_world) as TextView
        assertThat(textView.text.toString(), equalTo("Hello World!"))
    }
}