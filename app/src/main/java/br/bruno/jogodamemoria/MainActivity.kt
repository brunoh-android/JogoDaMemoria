package br.bruno.jogodamemoria

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.ImageView
import br.bruno.jogodamemoria.R.drawable.*

class MainActivity : AppCompatActivity() {

    lateinit var card1: ImageView
    lateinit var card2: ImageView
    lateinit var card3: ImageView
    lateinit var card4: ImageView
    lateinit var card5: ImageView
    lateinit var card6: ImageView
    lateinit var card7: ImageView
    lateinit var card8: ImageView
    lateinit var card9: ImageView
    lateinit var card10: ImageView
    lateinit var card11: ImageView
    lateinit var card12: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.linear_layout)

        supportActionBar?.hide()
        loadComponents()


    }

    override fun onResume() {
        super.onResume()
        gerenciarCards()

    }

    fun gerenciarCards() {

        var listaNomes = mutableListOf(
            candy, castle, cauldron,
            frank, mummy, pumpkin, candy, castle, cauldron,
            frank, mummy, pumpkin
        )

        var cards = arrayOf(
            card1, card2, card3,
            card4, card5, card6,
            card7, card8, card9,
            card10, card11, card12
        )

        listaNomes.shuffle()
        for (i in 0..11) {
            cards[i].setOnClickListener {
                cards[i].setImageResource(listaNomes[i])
            }

        }
    }

    fun loadComponents() {
        card1 = findViewById(R.id.card1)
        card2 = findViewById(R.id.card2)
        card3 = findViewById(R.id.card3)
        card4 = findViewById(R.id.card4)
        card5 = findViewById(R.id.card5)
        card6 = findViewById(R.id.card6)
        card7 = findViewById(R.id.card7)
        card8 = findViewById(R.id.card8)
        card9 = findViewById(R.id.card9)
        card10 = findViewById(R.id.card10)
        card11 = findViewById(R.id.card11)
        card12 = findViewById(R.id.card12)
    }
}






