package edu.temple.inclassuiacvitivity

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

class TextSizeAdapter(_context: Context, _textSize: Array<Int>) : BaseAdapter() {
    private val context = _context
    private val textSize = _textSize

    override fun getCount(): Int {
       return textSize.size
    }

    override fun getItem(position: Int): Any {
        return textSize[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val textView = TextView(context)
        textView.text = textSize[position].toString()
        textView.textSize = textSize[position].toFloat()
        textView.setPadding(5,10,0,10)
        return textView
    }

}