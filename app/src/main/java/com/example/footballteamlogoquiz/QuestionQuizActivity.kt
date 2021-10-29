package com.example.footballteamlogoquiz

import android.content.Intent
import android.graphics.Color
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_question_quiz.*

class QuestionQuizActivity : AppCompatActivity(), View.OnClickListener {

    private var mCurpos: Int = 1
    private var mQuestionList: ArrayList<Question>? = null
    private var mSelectedOptionPosition: Int = 0
    private var mCorrects: Int = 0
    private var player: String = ""
    private var league: String = ""


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question_quiz)

        league = intent.getStringExtra("league").toString()
        player = intent.getStringExtra("player").toString()


        if (intent.getStringExtra("league").toString() == "laliga"){
            mQuestionList = Constants.getSpainQuestions()
        }

        setQuestion()

        tv_option_one.setOnClickListener(this)
        tv_option_two.setOnClickListener(this)
        tv_option_three.setOnClickListener(this)
        tv_option_four.setOnClickListener(this)

        btn_submit.setOnClickListener(this)
    }

    private fun setQuestion() {
        val question = mQuestionList!![mCurpos - 1]

        defaultOptionsView()

        btn_submit.text = "SUBMIT"

        progressBar.progress = mCurpos
        tv_progress.text = "$mCurpos" + "/" + progressBar.max

        tv_question.text = question!!.question
        iv_image.setImageResource(question.image)
        tv_option_one.text = question.optionOne
        tv_option_two.text = question.optionTwo
        tv_option_three.text = question.optionThree
        tv_option_four.text = question.optionFour
        player = intent.getStringExtra("player").toString()
    }

    private fun defaultOptionsView() {
        val options = ArrayList<TextView>()
        options.add(0, tv_option_one)
        options.add(1, tv_option_two)
        options.add(2, tv_option_three)
        options.add(3, tv_option_four)

        for (option in options) {
            option.setTextColor(Color.parseColor("#000000"))
            option.typeface = Typeface.DEFAULT
            option.setBackgroundColor(Color.parseColor("#CFCFCF"))

        }
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.tv_option_one -> {
                if (btn_submit.text.toString() == "SUBMIT") {
                    selectedOptionView(tv_option_one, 1)
                }
                else {
                    Toast.makeText(
                        this,
                        "You cannot change your answer now!",
                        Toast.LENGTH_SHORT
                    ).show()
                }
            }
            R.id.tv_option_two -> {
                if (btn_submit.text.toString() == "SUBMIT") {
                    selectedOptionView(tv_option_two, 2)
                }
                else {
                    Toast.makeText(
                        this,
                        "You cannot change your answer now!",
                        Toast.LENGTH_SHORT
                    ).show()
                }
            }
            R.id.tv_option_three -> {
                if (btn_submit.text.toString() == "SUBMIT") {
                    selectedOptionView(tv_option_three, 3)
                }
                else {
                    Toast.makeText(
                        this,
                        "You cannot change your answer now!",
                        Toast.LENGTH_SHORT
                    ).show()
                }
            }
            R.id.tv_option_four -> {
                if (btn_submit.text.toString() == "SUBMIT") {
                    selectedOptionView(tv_option_four, 4)
                }
                else {
                    Toast.makeText(
                        this,
                        "You cannot change your answer now!",
                        Toast.LENGTH_SHORT
                    ).show()
                }
            }
            R.id.btn_submit -> {
                if (mSelectedOptionPosition == 0) {
                    mCurpos++

                    when {
                        mCurpos <= mQuestionList!!.size -> {
                            setQuestion()
                        }
                        else -> {
                            Toast.makeText(
                                this,
                                "You have completed the quiz!",
                                Toast.LENGTH_SHORT
                            ).show()
                            val intent = Intent(this, ResultActivity::class.java)
                            intent.putExtra("score", mCorrects)
                            intent.putExtra("player", player)
                            intent.putExtra("league", league)
                            startActivity(intent)
                            finish()
                        }
                    }
                } else {
                    val question = mQuestionList?.get(mCurpos - 1)
                    if (question!!.correctAnswer != mSelectedOptionPosition) {
                        answerView(mSelectedOptionPosition, false)
                    } else {
                        mCorrects++
                    }
                    answerView(question.correctAnswer, true)

                    if (mCurpos == mQuestionList!!.size) {
                        btn_submit.text = "FINISH"
                    } else {
                        btn_submit.text = "NEXT ROUND"
                    }
                    mSelectedOptionPosition = 0
                }
            }
        }
    }

    private fun answerView(answer: Int, Check: Boolean) {
        when (answer) {
            1 -> {
                if (Check)
                    tv_option_one.setBackgroundColor(Color.parseColor("#45DE4C"))
                else
                    tv_option_one.setBackgroundColor(Color.parseColor("#DE4554"))
            }
            2 -> {
                if (Check)
                    tv_option_two.setBackgroundColor(Color.parseColor("#45DE4C"))
                else
                    tv_option_two.setBackgroundColor(Color.parseColor("#DE4554"))
            }
            3 -> {
                if (Check)
                    tv_option_three.setBackgroundColor(Color.parseColor("#45DE4C"))
                else
                    tv_option_three.setBackgroundColor(Color.parseColor("#DE4554"))
            }
            4 -> {
                if (Check)
                    tv_option_four.setBackgroundColor(Color.parseColor("#45DE4C"))
                else
                    tv_option_four.setBackgroundColor(Color.parseColor("#DE4554"))
            }
        }
    }

    private fun selectedOptionView(tv: TextView, selectedOptNum: Int) {
        defaultOptionsView()
        mSelectedOptionPosition = selectedOptNum
        tv.setTextColor(Color.parseColor("#000000"))
        tv.setTypeface(tv.typeface, Typeface.BOLD)
        tv.setBackgroundColor(Color.parseColor("#A1BFF0"))
    }
}