package com.example.fundamentalandroidgithubusers

import com.example.fundamentalandroidgithubusers.model.GitHubUser

class UserRepository {
    public fun getUsers(): ArrayList<GitHubUser> {
        return arrayListOf(
            GitHubUser("sdf", "name", "avatar", "company", "location", 12, 23, 34),
            GitHubUser("username", "name", "avatar", "company", "location", 12, 23, 34),
            GitHubUser("username", "name", "avatar", "company", "location", 12, 23, 34),
            GitHubUser("username", "name", "avatar", "company", "location", 12, 23, 34),
            GitHubUser("username", "name", "avatar", "company", "location", 12, 23, 34),
            GitHubUser("username", "name", "avatar", "company", "location", 12, 23, 34),
            GitHubUser("username", "name", "avatar", "company", "location", 12, 23, 34),
            GitHubUser("username", "name", "avatar", "company", "location", 12, 23, 34),
            GitHubUser("username", "name", "avatar", "company", "location", 12, 23, 34),
            GitHubUser("username", "name", "avatar", "company", "location", 12, 23, 34),
        )
    }
}