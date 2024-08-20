package com.example.checkedtextviewexample

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.CheckedTextView

class CustomAdapter(private val context: Context, private val items: List<String>) : BaseAdapter() {

    private val checkedStates = BooleanArray(items.size)

    override fun getCount(): Int = items.size

    override fun getItem(position: Int): Any = items[position]

    override fun getItemId(position: Int): Long = position.toLong()

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val view: View
        val viewHolder: ViewHolder

        if (convertView == null) {
            view = LayoutInflater.from(context).inflate(R.layout.list_item, parent, false)
            viewHolder = ViewHolder(view.findViewById(R.id.checkedTextView))
            view.tag = viewHolder
        } else {
            view = convertView
            viewHolder = view.tag as ViewHolder
        }

        viewHolder.checkedTextView.text = items[position]
        viewHolder.checkedTextView.isChecked = checkedStates[position]

        return view
    }

    fun toggleItemChecked(position: Int) {
        checkedStates[position] = !checkedStates[position]
        notifyDataSetChanged()
    }

    fun getCheckedItems(): List<String> {
        return items.filterIndexed { index, _ -> checkedStates[index] }
    }

    private class ViewHolder(val checkedTextView: CheckedTextView)
}
