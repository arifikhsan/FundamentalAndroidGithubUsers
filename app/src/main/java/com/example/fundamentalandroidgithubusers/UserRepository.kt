package com.example.fundamentalandroidgithubusers

import com.example.fundamentalandroidgithubusers.model.GitHubUser

class UserRepository {
    fun getUsers(): ArrayList<GitHubUser> {
        return arrayListOf(
            GitHubUser(
                "JakeWharton",
                "Jake Wharton",
                "user1",
                "Google, Inc.",
                "Pittsburgh, PA, USA",
                102,
                56995,
                12
            ),
            GitHubUser(
                "amitshekhariitbhu",
                "AMIT SHEKHAR",
                "user2",
                "@MindOrksOpenSource",
                "New Delhi, India",
                37,
                5153,
                2
            ),
            GitHubUser(
                "romainguy",
                "Romain Guy",
                "user3",
                "Google",
                "California",
                9,
                7972,
                0
            ),
            GitHubUser(
                "chrisbanes",
                "Chris Banes",
                "user4",
                "@google working on @android",
                "Sydney, Australia",
                30,
                14725,
                1
            ),
            GitHubUser(
                "tipsy",
                "David",
                "user5",
                "Working Group Two",
                "Trondheim, Norway",
                56,
                788,
                0
            ),
            GitHubUser(
                "ravi8x",
                "nameRavi Tamada",
                "user6",
                "AndroidHive | Droid5",
                "India",
                28,
                18628,
                3
            ),
            GitHubUser(
                "jasoet",
                "Deny Prasetyo",
                "user7",
                "@gojek-engineering",
                "Kotagede, Yogyakarta, Indonesia",
                44,
                277,
                39
            ),
            GitHubUser(
                "budioktaviyan",
                "Budi Oktaviyan",
                "user8",
                "@KotlinID",
                "Jakarta, Indonesia",
                110,
                178,
                23
            ),
            GitHubUser(
                "hendisantika",
                "Hendi Santika",
                "user9",
                "@JVMDeveloperID @KotlinID @IDDevOps",
                "Bojongsoang - Bandung Jawa Barat",
                1064,
                428,
                61
            ),
            GitHubUser(
                "sidiqpermana",
                "Sidiq Permana",
                "user10",
                "Nusantara Beta Studio",
                "Jakarta Indonesia",
                65,
                465,
                10
            ),
        )
    }
}