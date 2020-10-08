package com.iqbooster.app.ui.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.iqbooster.app.R
import com.iqbooster.app.data.model.Data
import kotlinx.android.synthetic.main.item_layout.view.*

class MainAdapter(private val userslist: ArrayList<Data>) :
    RecyclerView.Adapter<MainAdapter.DataViewHolder>() {

    class DataViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bindListItem(user: Data) {
            itemView.apply {
                textViewUserName.text = user.employee_name
                textViewUserEmail.text = user.employee_salary
                Glide.with(imageViewAvatar.context)
                    .load(user.profile_image)
                    .into(imageViewAvatar)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DataViewHolder =
        DataViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_layout, parent, false)
        )

    override fun onBindViewHolder(holder: DataViewHolder, position: Int) {
        holder.bindListItem(userslist[position])
    }

    override fun getItemCount(): Int =
        userslist.size

    fun addUsers(users: List<Data>) {
        this.userslist.apply {
            clear()
            addAll(users)
        }

    }

}