package lucasssales.com.caraoucoroa

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_resultado.*

class Resultado : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado)

        //val dados : Bundle = intent.extras
        val resultado = intent.extras.get("resultado")


        if(resultado == 0){
            moeda.setImageResource(R.drawable.moeda_coroa)
        }

        voltar.setOnClickListener { finish() }
    }
}
