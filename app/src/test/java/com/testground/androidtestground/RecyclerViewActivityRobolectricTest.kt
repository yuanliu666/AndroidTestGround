package com.testground.androidtestground

import android.support.v7.widget.RecyclerView
import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert.assertThat
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.Robolectric
import org.robolectric.RobolectricTestRunner

@RunWith(RobolectricTestRunner::class)
class RecyclerViewActivityRobolectricTest {

    @Test
    @Throws(Exception::class)
    fun testRecyclerViewItems() {
        val activity = Robolectric.setupActivity(RecyclerViewActivity::class.java)
        val recyclerView = activity.findViewById(R.id.rv) as RecyclerView?
        Assert.assertNotNull(recyclerView)
        var testCount = 10
        while (testCount > 0) {
            val rdm = (0 until 10000).random()
            assertThat(
                (recyclerView?.findViewHolderForAdapterPosition(rdm) as? RecyclerViewActivity.SampleAdapter.MyViewHolder)?.textView?.text.toString(),
                CoreMatchers.equalTo("$rdm")
            )
            testCount--
        }
    }
}