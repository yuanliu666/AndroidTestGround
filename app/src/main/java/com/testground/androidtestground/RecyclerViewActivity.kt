package com.testground.androidtestground

import android.os.Bundle
import android.support.annotation.VisibleForTesting
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView

class RecyclerViewActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recyclerview)

        initRecyclerView()
    }

    private fun initRecyclerView() {
        findViewById<RecyclerView>(R.id.rv).apply {
            setHasFixedSize(true)
            layoutManager = LinearLayoutManager(this@RecyclerViewActivity)
            adapter = SampleAdapter(generateTestList())
        }
    }

    private fun generateTestList(): List<String> {
        val ret = mutableListOf<String>()
        for (i in 0 until 10000) {
            ret.add(i.toString())
        }
        return ret.toList()
    }

    @VisibleForTesting
    class SampleAdapter(private val dataList: List<String>) :
        RecyclerView.Adapter<SampleAdapter.MyViewHolder>() {

        class MyViewHolder(val textView: TextView) : RecyclerView.ViewHolder(textView)

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SampleAdapter.MyViewHolder {
            val textView = LayoutInflater.from(parent.context)
                .inflate(R.layout.row_sample, parent, false) as TextView
            return MyViewHolder(textView)
        }

        override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
            holder.textView.text = dataList[position]
        }

        override fun getItemCount() = dataList.size
    }
}