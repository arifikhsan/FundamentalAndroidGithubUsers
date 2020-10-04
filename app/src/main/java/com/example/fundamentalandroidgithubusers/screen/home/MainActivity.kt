package com.example.fundamentalandroidgithubusers.screen.home

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.AdapterView
import android.widget.ListView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.fundamentalandroidgithubusers.R
import com.example.fundamentalandroidgithubusers.UserRepository
import com.example.fundamentalandroidgithubusers.screen.detail.DetailActivity

class MainActivity : AppCompatActivity() {

    private val repository: UserRepository = UserRepository()
    private val users = repository.getUsers()
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
        adapter.users = users

        listView.onItemClickListener = AdapterView.OnItemClickListener { _, _, position, _ ->
//            Toast.makeText(this@MainActivity, users[position].name, Toast.LENGTH_SHORT).show()

            val moveObject = Intent(this, DetailActivity::class.java)
            moveObject.putExtra(DetailActivity.EXTRA_USER, users[position])
            startActivity(moveObject)
        }
    }

}