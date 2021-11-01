package com.example.footballteamlogoquiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_select_league.*

class SelectLeagueActivity : AppCompatActivity(), View.OnClickListener {

    private var player: String = " "

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_select_league)

        iv_bundesliga.setOnClickListener(this)
        iv_mix.setOnClickListener(this)
        iv_laliga.setOnClickListener(this)
        iv_seriea.setOnClickListener(this)
        iv_ligue1.setOnClickListener(this)
        iv_premierleague.setOnClickListener(this)

        player = intent.getStringExtra("player").toString()
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.iv_mix -> {
                val intent = Intent(this, QuestionQuizActivity::class.java)
                intent.putExtra("player", player)
                intent.putExtra("league", "mix")
                startActivity(intent)
                finish()
            }
            R.id.iv_bundesliga -> {
                val intent = Intent(this, QuestionQuizActivity::class.java)
                intent.putExtra("player", player)
                intent.putExtra("league", "bundesliga")
                startActivity(intent)
                finish()
            }
            R.id.iv_laliga -> {
                val intent = Intent(this, QuestionQuizActivity::class.java)
                intent.putExtra("player", player)
                intent.putExtra("league", "laliga")
                startActivity(intent)
                finish()
            }
            R.id.iv_ligue1 -> {
                val intent = Intent(this, QuestionQuizActivity::class.java)
                intent.putExtra("player", player)
                intent.putExtra("league", "ligue1")
                startActivity(intent)
                finish()
            }
            R.id.iv_premierleague -> {
                val intent = Intent(this, QuestionQuizActivity::class.java)
                intent.putExtra("player", player)
                intent.putExtra("league", "premierleague")
                startActivity(intent)
                finish()
            }
            R.id.iv_seriea -> {
                val intent = Intent(this, QuestionQuizActivity::class.java)
                intent.putExtra("player", player)
                intent.putExtra("league", "seriea")
                startActivity(intent)
                finish()
            }
        }
    }
}