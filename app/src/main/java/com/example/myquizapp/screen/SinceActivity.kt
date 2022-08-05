package com.example.myquizapp.screen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.myquizapp.R
import com.example.myquizapp.databinding.ActivitySiencesBinding
import com.example.myquizapp.model.QuizModel
import com.example.myquizapp.model.ScienceModel
import com.example.myquizapp.view.SciencesAdapter
import com.example.myquizapp.view.SciencesAdapterCallback

class SiencesActivity : AppCompatActivity() {
    lateinit var binding: ActivitySiencesBinding
    val sciences = listOf(
        ScienceModel(
            "Matematika", listOf(
                QuizModel(
                    "2 ning 10 chi darajasi nechchiga teng?",
                    null,
                    "512",
                    "676",
                    "1024",
                    "2048",
                    "C"
                ),
                QuizModel("300 ni 20 dan bir qismi?", null, "15", "18", "20", "30", "A"),
                QuizModel(
                    "19 ning kvadrati nechchiga teng?",
                    null,
                    "231",
                    "349",
                    "361",
                    "441",
                    "C"
                ),
                QuizModel(
                    "e ning taqribiy qiymati nechchiga teng?",
                    null,
                    "2,6",
                    "3,14",
                    "2,7",
                    "2,3",
                    "C"
                ),
                QuizModel(
                    "Ikki nisbatning tengligi nima deb ataladi?",
                    null,
                    "Proportsiya",
                    "Ko'p had",
                    "Aksioma",
                    "Teorema",
                    "A"
                ),
                QuizModel(
                    "Ehtimollar nazariyasi asoschsi kim?",
                    null,
                    "Isaak Nyuton",
                    "Paskal",
                    "A.Eynshteyn",
                    "S.Rebert",
                    "D"
                ),
                QuizModel(
                    "Logarifm 3 asosga kora  243 nechchiga teng?",
                    null,
                    "5",
                    "3",
                    "7",
                    "2",
                    "A"
                ),
                QuizModel(
                    "Aksioma bu?",
                    null,
                    "Tenglamaning bir turi",
                    "Isbot talab qilmaydigan tasdiq",
                    "Noto'g'ri xulosa",
                    "Teorema",
                    "B"
                ),
                QuizModel(
                    "Katta yoki kichik belgisini matematika ga kim kiritgan?",
                    null,
                    "P.Rudolf",
                    "V.Gaus",
                    "L.Galua",
                    "P.Buge",
                    "D"
                )
            )
        ),
        ScienceModel(
            "Eng yoki Birinchi", listOf(
                QuizModel(
                    "Yerdan quyoshgacha bo'lgan masofa",
                    R.drawable.img6,
                    "206.000.265 km",
                    "150.000.000 km",
                    "142.000.000 km",
                    "210.000.000 km",
                    "B"
                ),
                QuizModel(
                    "Dunyodagi eng baland sharshara?",
                    R.drawable.img4,
                    "Anxel",
                    "Missipi",
                    "Igiasu",
                    "Niagara",
                    "D"
                ),
                QuizModel(
                    "Dunyodagi eng katta sahro",
                    R.drawable.img1,
                    "Takramatang",
                    "Jua",
                    "Kolin",
                    "Serota",
                    "A"
                ),
                QuizModel(
                    "Hozirda dunyodagi eng baland inshoat qaysi davlatda joylashgn?",
                    null,
                    "Birlashgan Arab Amirligi",
                    "AQSh",
                    "Yaponiya",
                    "Xitoy",
                    "A"
                ),
                QuizModel(
                    "Eng katta okean?",
                    null,
                    "Atlantika okeani",
                    "Hind okeani",
                    "Tinch okeani",
                    "Shimoliy muz okeani",
                    "C"
                ),
                QuizModel(
                    "Yer sayyorasining yuzi nechchi mln km.kv?",
                    null,
                    "600",
                    "510",
                    "430",
                    "740",
                    "B"
                ),
                QuizModel(
                    "Toshkent teleminorasi qachon bunyod etilgan",
                    null,
                    "1980-yil",
                    "1991-yil",
                    "1956-yil",
                    "To'g'ri javob yo'q",
                    "C"
                ),
                QuizModel(
                    "Titanikning birinchi va oxirgi sayohati qachon sodir bo'lgan ",
                    null,
                    "!924-yil",
                    "1912-yil",
                    "1908-yil",
                    "1917-yil",
                    "B"
                ),
                QuizModel(
                    "Dunyodagi eng katta sharshara",
                    R.drawable.img2,
                    "Igiasu",
                    "Missipi",
                    "Tufang",
                    "Niagara",
                    "A"
                ),
                QuizModel("Eng uzun daryo?", null, "Anxel", "Amazonka", "Nil", "Volga", "C"),
                QuizModel(
                    "Birinchi Radio aloqa !897-yilda kim tamonidan ixtiro qilingan?",
                    null,
                    "R.Rezorfort",
                    "U.Tomson",
                    "P.Kyuri",
                    "D.Xans",
                    "A"
                )
            )
        ),
        ScienceModel(
            "Tarix", listOf(
                QuizModel(
                    "Turkiston GENERAL-GUBERNATORLIGI nechi yilda tashkil etilgan?",
                    null,
                    "1905-yilda",
                    "1914-yilda",
                    "1908-yilda",
                    "1913-yilda",
                    "C"
                ),
                QuizModel(
                    "Ikkinchi jahon urushi qachon boshlangan?",
                    null,
                    "1939-yil",
                    "1914-yilda",
                    "1940-yilda",
                    "1941-yilda",
                    "C"
                ),
                QuizModel(
                    "Birinchi Jadid maktabi qachon ochilgan?",
                    null,
                    "1900-yilda",
                    "1923-yilda",
                    "1911-yilda",
                    "1936-yilda",
                    "B"
                ),
                QuizModel(
                    "Buyuk chekinish qaysi?",
                    null,
                    "Rus armiyasi",
                    "Fransuz armiyasi",
                    "Italia armiyasi",
                    "Ingliz armiyasi",
                    "A"
                ),
                QuizModel(
                    "Fransiya-Prussiya urusi qachon sodir bo'lgan?",
                    null,
                    "1765-yilda",
                    "1754-yilda",
                    "1713-yilda",
                    "1785-yilda",
                    "D"
                )
            )
        )
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySiencesBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.imgBack.setOnClickListener {
            finish()
        }
        binding.recycler.layoutManager = LinearLayoutManager(this)
        binding.recycler.adapter = SciencesAdapter(sciences, object : SciencesAdapterCallback {
            override fun onClick(item: ScienceModel) {
                val intent = Intent(this@SiencesActivity, QuizActivity::class.java)
                intent.putExtra("extra", item)
                startActivity(intent)
            }
        })
    }
}