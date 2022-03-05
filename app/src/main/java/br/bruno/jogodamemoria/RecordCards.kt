package br.bruno.jogodamemoria

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class RecordCards : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_record_cards)

        supportActionBar?.hide()

        val myButton: Button = findViewById(R.id.bt01)

        myButton.setOnClickListener {
            IrMainActivity()
        }
    }

    private fun IrMainActivity(){
        val tela = Intent(this,MainActivity::class.java)
        startActivity(tela)
    }
}