package com.example.myquizapp.screen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import com.example.myquizapp.R
import com.example.myquizapp.databinding.ActivityReportBinding
import com.example.myquizapp.model.ScienceModel
import com.github.mikephil.charting.data.PieData
import com.github.mikephil.charting.data.PieDataSet
import com.github.mikephil.charting.data.PieEntry

class ReportActivity : AppCompatActivity() {
    lateinit var binding: ActivityReportBinding
    lateinit var items: ScienceModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityReportBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.imgBack.setOnClickListener {
            finish()
        }

        items = intent.getSerializableExtra("extra_data") as ScienceModel

        binding.tvTitle.text = items.title

        var reportText = ""

        var correctAnswerCount = 0

        items.quizList.forEachIndexed { index, it ->
            if (it.answer != it.correctAnswer) {
                reportText += "${index + 1}.❌ Sizning javobingiz: ${it.answer}\n✅ Tog'ri javob: ${it.correctAnswer}\n"
            } else {
                correctAnswerCount++
                reportText += "${index + 1}, ✅ Tog'ri javob: ${it.correctAnswer}\n"

            }

        }

        binding.tvReport.text = reportText

        setupPieChart(correctAnswerCount, items.quizList.count())

    }



    fun setupPieChart(correctCount: Int, count: Int) {


        val pieEntries = arrayListOf<PieEntry>()


        pieEntries.add(PieEntry((count - correctCount).toFloat()))
        pieEntries.add(PieEntry(correctCount.toFloat()))

        binding.pieChart.animateXY(3000, 3000)

        val pieDataSet = PieDataSet(pieEntries, " NATIJA")
        pieDataSet.setColors(
            ContextCompat.getColor(this, R.color.colorRed),
            ContextCompat.getColor(this, R.color.colorGreen)
        )
        pieDataSet.sliceSpace = 3f
        val pieData = PieData(pieDataSet)
        pieData.setDrawValues(true)
        binding.pieChart.data = pieData

        binding.pieChart.holeRadius = 5f
        binding.pieChart.setBackgroundColor(ContextCompat.getColor(this, R.color.colorPrimaryDark))

    }


}
