package com.example.fundamentalandroidgithubusers.screen.home

import android.os.Bundle
import android.util.Log
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity
import com.example.fundamentalandroidgithubusers.R
import com.example.fundamentalandroidgithubusers.UserRepository

class MainActivity : AppCompatActivity() {

    private val names = arrayOf("aa", "bb", "cc")
    private val repository: UserRepository = UserRepository()
    private lateinit var adapter: GitHubUserAdapter

    companion object {
        const val TAG = "MainActivity"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listView = findViewById<ListView>(R.id.list_users)
        adapter = GitHubUserAdapter(this)
        listView.adapter = adapter
        adapter.users = repository.getUsers()
    }

}