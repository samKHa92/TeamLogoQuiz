package com.example.footballteamlogoquiz

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import kotlinx.android.synthetic.main.activity_result.*
import kotlinx.android.synthetic.main.activity_select_league.*
import android.graphics.BitmapFactory


class ResultActivity : AppCompatActivity(), View.OnClickListener {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        tv_player.text = intent.getStringExtra("player") +": "
        if (intent.getStringExtra("league").toString() == "laliga") {
            tv_score.text = intent.getIntExtra("score", 0).toString() + "/20"

            val fnm = "laliga"

            val PACKAGE_NAME = applicationContext.packageName
            val imgId = resources.getIdentifier("$PACKAGE_NAME:drawable/$fnm", null, null)
            println("IMG ID :: $imgId")
            println("PACKAGE_NAME :: $PACKAGE_NAME")
            iv_league.setImageBitmap(BitmapFactory.decodeResource(resources, imgId))
        }
        if (intent.getStringExtra("league").toString() == "seriea") {
            tv_score.text = intent.getIntExtra("score", 0).toString() + "/20"

            val fnm = "seriea"

            val PACKAGE_NAME = applicationContext.packageName
            val imgId = resources.getIdentifier("$PACKAGE_NAME:drawable/$fnm", null, null)
            println("IMG ID :: $imgId")
            println("PACKAGE_NAME :: $PACKAGE_NAME")
            iv_league.setImageBitmap(BitmapFactory.decodeResource(resources, imgId))
        }
        if (intent.getStringExtra("league").toString() == "ligue1") {
            tv_score.text = intent.getIntExtra("score", 0).toString() + "/20"
            val fnm = "ligue1"

            val PACKAGE_NAME = applicationContext.packageName
            val imgId = resources.getIdentifier("$PACKAGE_NAME:drawable/$fnm", null, null)
            println("IMG ID :: $imgId")
            println("PACKAGE_NAME :: $PACKAGE_NAME")
            iv_league.setImageBitmap(BitmapFactory.decodeResource(resources, imgId))
        }
        if (intent.getStringExtra("league").toString() == "premierleague") {
            tv_score.text = intent.getIntExtra("score", 0).toString() + "/20"
            val fnm = "premierleague"

            val PACKAGE_NAME = applicationContext.packageName
            val imgId = resources.getIdentifier("$PACKAGE_NAME:drawable/$fnm", null, null)
            println("IMG ID :: $imgId")
            println("PACKAGE_NAME :: $PACKAGE_NAME")
            iv_league.setImageBitmap(BitmapFactory.decodeResource(resources, imgId))
        }
        if (intent.getStringExtra("league").toString() == "bundesliga") {
            tv_score.text = intent.getIntExtra("score", 0).toString() + "/18"
            val fnm = "bundesliga"

            val PACKAGE_NAME = applicationContext.packageName
            val imgId = resources.getIdentifier("$PACKAGE_NAME:drawable/$fnm", null, null)
            println("IMG ID :: $imgId")
            println("PACKAGE_NAME :: $PACKAGE_NAME")
            iv_league.setImageBitmap(BitmapFactory.decodeResource(resources, imgId))
        }
        if (intent.getStringExtra("league").toString() == "mix") {
            tv_score.text = intent.getIntExtra("score", 0).toString() + "/100"
            val fnm = "mix"

            val PACKAGE_NAME = applicationContext.packageName
            val imgId = resources.getIdentifier("$PACKAGE_NAME:drawable/$fnm", null, null)
            println("IMG ID :: $imgId")
            println("PACKAGE_NAME :: $PACKAGE_NAME")
            iv_league.setImageBitmap(BitmapFactory.decodeResource(resources, imgId))
        }

        btn_restart.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
        finish()
    }
}