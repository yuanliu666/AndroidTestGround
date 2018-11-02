package com.testground.androidtestground

import android.support.test.espresso.Espresso.onView
import android.support.test.espresso.action.ViewActions.click
import android.support.test.espresso.assertion.ViewAssertions.matches
import android.support.test.espresso.matcher.ViewMatchers.withId
import android.support.test.espresso.matcher.ViewMatchers.withText
import android.support.test.rule.ActivityTestRule
import android.support.test.runner.AndroidJUnit4
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class ButtonActivityEspressoTest {

    @JvmField
    @Rule
    var activityRule: ActivityTestRule<ButtonActivity> = ActivityTestRule(
        ButtonActivity::class.java
    )

    @Test
    fun testButtonClick() {
        onView(withId(R.id.btn_sample))
            .check(matches(withText(R.string.button_txt)))
        onView(withId(R.id.btn_sample))
            .perform(click())
        onView(withId(R.id.btn_sample))
            .check(matches(withText(R.string.button_txt_clicked)))
    }
}