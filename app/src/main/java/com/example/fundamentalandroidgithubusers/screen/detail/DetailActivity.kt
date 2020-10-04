package com.example.fundamentalandroidgithubusers.screen.detail

import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.NavUtils
import com.example.fundamentalandroidgithubusers.R
import com.example.fundamentalandroidgithubusers.model.GitHubUser
import kotlinx.android.synthetic.main.activity_detail.*

class DetailActivity : AppCompatActivity() {

    companion object {
        const val EXTRA_USER = "extra_user"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val user = intent.getParcelableExtra<GitHubUser>(EXTRA_USER)

        text_name.text = user?.name
        text_username.text = user?.username
        text_company.text = user?.company
        text_location.text = user?.location
        text_repository.text = user?.repository.toString()
        text_follower.text = user?.follower.toString()
        text_following.text = user?.following.toString()

        image_avatar.setImageResource(
            this.resources.getIdentifier(
                user?.avatar,
                "drawable",
                this.packageName
            )
        )

        actionBar?.setDisplayHomeAsUpEnabled(true)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            android.R.id.home -> {
                NavUtils.navigateUpFromSameTask(this)
                return true
            }
        }
        return super.onOptionsItemSelected(item)
    }
}