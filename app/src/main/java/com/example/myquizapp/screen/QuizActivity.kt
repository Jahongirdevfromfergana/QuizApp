package com.example.myquizapp.screen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.myquizapp.R
import com.example.myquizapp.databinding.ActivityQuizBinding
import com.example.myquizapp.model.ScienceModel

class QuizActivity : AppCompatActivity() {
    lateinit var binding: ActivityQuizBinding

    lateinit var science: ScienceModel
    var index = 0
    var correctCount = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityQuizBinding.inflate(layoutInflater)
        setContentView(binding.root)


        science = intent.getSerializableExtra("extra") as ScienceModel
        binding.imgBack.setOnClickListener {
            finish()
        }

        binding.btnA.setOnClickListener {
            if (index <= science.quizList.size-1) {
                science.quizList[index].answer = "A"
                if (science.quizList[index].correctAnswer == "A") {
                    correctCount++
                }
            }
            index++
            setQuiz()
        }
        binding.btnB.setOnClickListener {
            if (index <= science.quizList.size-1) {
                science.quizList[index].answer = "B"
                if (science.quizList[index].correctAnswer == "B") {
                    correctCount++
                }
            }
            index++
            setQuiz()
        }
        binding.btnC.setOnClickListener {
            if (index <= science.quizList.size-1) {
                science.quizList[index].answer = "C"
                if (science.quizList[index].correctAnswer == "C") {
                    correctCount++
                }
            }
            index++
            setQuiz()
        }
        binding.btnD.setOnClickListener {
            if (index <= science.quizList.size-1) {
                science.quizList[index].answer = "D"
                if (science.quizList[index].correctAnswer == "D") {
                    correctCount++
                }
            }
            index++
            setQuiz()
        }
        setQuiz()
    }

    fun setQuiz() {
        if (index < science.quizList.count()) {
            val quiz = science.quizList[index]
            binding.tvQuiz.text = quiz.title


            if (quiz.image != null) {
                binding.imgQuiz.visibility = View.VISIBLE
                binding.imgQuiz.setImageResource(quiz.image)
            } else {
                binding.imgQuiz.visibility = View.GONE
            }
            binding.btnA.text = quiz.ansverA
            binding.btnB.text = quiz.ansverB
            binding.btnC.text = quiz.ansverC
            binding.btnD.text = quiz.ansverD
        } else {

            Toast.makeText(
                this,
                "Siz ${science.quizList.count()} ta savoldan ${correctCount} ta savolga to'g'ri javob berdingiz",
                Toast.LENGTH_LONG
            ).show()

            val intent = Intent(this, ReportActivity::class.java)
            intent.putExtra("extra_data", science)
            startActivity(intent)
        }
    }
}