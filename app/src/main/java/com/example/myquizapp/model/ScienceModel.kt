package com.example.myquizapp.model

import java.io.Serializable

data class ScienceModel(
    val title: String,
    val quizList: List<QuizModel>
) : Serializable

data class QuizModel(
    val title: String,
    val image: Int?,
    val ansverA: String,
    val ansverB: String,
    val ansverC: String,
    val ansverD: String,
    var correctAnswer: String,
    var answer: String = " "
) : Serializable