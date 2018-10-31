package com.testground.androidtestground

import android.support.test.espresso.Espresso.onView
import android.support.test.espresso.assertion.ViewAssertions.matches
import android.support.test.espresso.matcher.ViewMatchers.withId
import android.support.test.rule.ActivityTestRule
import android.support.test.runner.AndroidJUnit4
import com.testground.androidtestground.util.EspressoTestsMatchers.withDrawable
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class ImageActivityEspressoTest {

    @JvmField
    @Rule
    var activityRule: ActivityTestRule<ImageActivity> = ActivityTestRule(
        ImageActivity::class.java
    )

    @Test
    fun testAssertImageView() {
        onView(withId(R.id.iv_sample))
            .check(matches(withDrawable(R.drawable.img_sample)))
    }
}