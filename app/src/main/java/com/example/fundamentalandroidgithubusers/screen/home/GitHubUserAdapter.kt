package com.example.fundamentalandroidgithubusers.screen.home

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.example.fundamentalandroidgithubusers.R
import com.example.fundamentalandroidgithubusers.model.GitHubUser

class GitHubUserAdapter internal constructor(private val context: Context) : BaseAdapter() {
    internal var users = arrayListOf<GitHubUser>()

    override fun getCount(): Int = users.size

    override fun getItem(position: Int): Any = users[position]

    override fun getItemId(position: Int): Long = position.toLong()

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var itemView = convertView
        if (itemView == null) {
            itemView = LayoutInflater.from(context).inflate(R.layout.user_list_item, parent, false)
        }

        val viewHolder = ViewHolder(itemView as View)

        val user = getItem(position) as GitHubUser
        viewHolder.bind(user)
        return itemView
    }

    private inner class ViewHolder(view: View) {
        private val textName: TextView = view.findViewById(R.id.text_name)
        private val textUsername: TextView = view.findViewById(R.id.text_username)
        private val imageAvatar: ImageView = view.findViewById(R.id.image_avatar)

        fun bind(user: GitHubUser) {
            textName.text = user.name
            textUsername.text = user.username
            imageAvatar.setImageResource(
                context.resources.getIdentifier(
                    user.avatar,
                    "drawable",
                    context.packageName
                )
            )
        }
    }
}