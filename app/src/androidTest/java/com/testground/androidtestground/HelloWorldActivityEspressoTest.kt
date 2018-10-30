package com.testground.androidtestground

import android.support.test.runner.AndroidJUnit4
import org.junit.Rule
import org.junit.runner.RunWith
import android.support.test.rule.ActivityTestRule
import org.junit.Test
import android.support.test.espresso.Espresso.onView
import android.support.test.espresso.assertion.ViewAssertions.matches
import android.support.test.espresso.matcher.ViewMatchers.withId
import android.support.test.espresso.matcher.ViewMatchers.withText

@RunWith(AndroidJUnit4::class)
class HelloWorldActivityEspressoTest {

    @JvmField
    @Rule
    var activityRule: ActivityTestRule<HelloWorldActivity> = ActivityTestRule(
        HelloWorldActivity::class.java
    )

    @Test
    fun testAssertHelloText() {
        onView(withId(R.id.tv_hello_world))
            .check(matches(withText("Hello World!")))
    }
}