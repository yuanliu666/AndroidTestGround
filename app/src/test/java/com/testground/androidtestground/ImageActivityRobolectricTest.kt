package com.testground.androidtestground

import android.widget.ImageView
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.Robolectric
import org.robolectric.RobolectricTestRunner
import org.robolectric.Shadows


@RunWith(RobolectricTestRunner::class)
class ImageActivityRobolectricTest {

    @Test
    @Throws(Exception::class)
    fun testAssertSampleImage() {
        val activity = Robolectric.setupActivity(ImageActivity::class.java)
        val imageView = activity.findViewById(R.id.iv_sample) as ImageView
        val drawableResId = Shadows.shadowOf(imageView.drawable).createdFromResId
        assertThat(
            "error image drawable",
            R.drawable.img_sample,
            equalTo(drawableResId)
        )
    }
}