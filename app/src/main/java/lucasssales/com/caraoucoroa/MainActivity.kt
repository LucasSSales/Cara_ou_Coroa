package lucasssales.com.caraoucoroa

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        jogar.setOnClickListener {
            val intent = Intent(applicationContext, Resultado::class.java)
            val result = Random().nextInt(2)
            //envio de dados dessa activity para proxima
            intent.putExtra("resultado", result)
            startActivity(intent)
        }
    }


}
