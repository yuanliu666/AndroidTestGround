package com.testground.androidtestground

import android.support.v7.widget.AppCompatButton
import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert.assertThat
import org.junit.Assert.assertNotNull
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.Robolectric
import org.robolectric.RobolectricTestRunner


@RunWith(RobolectricTestRunner::class)
class ButtonActivityRobolectricTest {

    @Test
    fun testButtonClick() {
        val activity = Robolectric.setupActivity(ButtonActivity::class.java)
        assertNotNull(activity)
        val btn = activity.findViewById(R.id.btn_sample) as AppCompatButton
        assertThat(btn.text.toString(), CoreMatchers.equalTo(activity.getString(R.string.button_txt)))
        btn.performClick()
        assertThat(btn.text.toString(), CoreMatchers.equalTo(activity.getString(R.string.button_txt_clicked)))
    }
}