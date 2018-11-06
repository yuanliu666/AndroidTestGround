package com.testground.androidtestground.util

import android.view.View
import org.hamcrest.Matcher

object EspressoTestsMatchers {

    fun withDrawable(resourceId: Int): Matcher<View> {
        return DrawableMatcher(resourceId)
    }

    fun noDrawable(): Matcher<View> {
        return DrawableMatcher(DrawableMatcher.EMPTY)
    }

    fun hasDrawable(): Matcher<View> {
        return DrawableMatcher(DrawableMatcher.ANY)
    }

    fun withRecyclerView(recyclerViewId: Int): RecyclerViewMatcher {
        return RecyclerViewMatcher(recyclerViewId)
    }
}