// File: UserAdapter.kt
package com.example.sqliteexample

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.sqliteexample.databinding.UserItemBinding

class UserAdapter(private val userList: List<User>) : RecyclerView.Adapter<UserAdapter.UserViewHolder>() {

    inner class UserViewHolder(val binding: UserItemBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
        val binding = UserItemBinding.inflate(
            LayoutInflater.from(parent.context), parent, false
        )
        return UserViewHolder(binding)
    }

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
        with(holder.binding) {
            textViewUserId.text = "ID: ${userList[position].id}"
            textViewUserName.text = "Name: ${userList[position].name}"
            textViewUserAge.text = "Age: ${userList[position].age}"
        }
    }

    override fun getItemCount(): Int {
        return userList.size
    }
}
