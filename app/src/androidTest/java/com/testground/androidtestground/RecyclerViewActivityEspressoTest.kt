package com.testground.androidtestground

import android.support.test.espresso.Espresso.onView
import android.support.test.espresso.assertion.ViewAssertions.matches
import android.support.test.espresso.contrib.RecyclerViewActions
import android.support.test.espresso.matcher.ViewMatchers.*
import android.support.test.rule.ActivityTestRule
import android.support.test.runner.AndroidJUnit4
import com.testground.androidtestground.util.EspressoTestsMatchers.withRecyclerView
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class RecyclerViewActivityEspressoTest {

    @JvmField
    @Rule
    var activityRule: ActivityTestRule<RecyclerViewActivity> = ActivityTestRule(
        RecyclerViewActivity::class.java
    )

    @Test
    fun testRecyclerView() {
        onView(withId(R.id.rv)).check(matches(isDisplayed()))
        for (i in 0 until 4) {
            onView(withRecyclerView(R.id.rv).atPosition(i))
                .check(matches(withText("$i")))
        }
        var testCount = 10
        while (testCount > 0) {
            val rdm = (0 until 10000).random()
            onView(withId(R.id.rv)).perform(
                RecyclerViewActions.scrollToPosition<RecyclerViewActivity.SampleAdapter.MyViewHolder>(rdm)
            )
            onView(withRecyclerView(R.id.rv).atPositionOnView(rdm, R.id.tv))
                .check(matches(withText("$rdm")))
            testCount--
        }
    }
}