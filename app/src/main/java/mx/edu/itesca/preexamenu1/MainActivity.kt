package mx.edu.itesca.preexamenu1

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val inputC = findViewById<EditText>(R.id.etC)
        val inputF = findViewById<EditText>(R.id.etF)

        val botonC = findViewById<Button>(R.id.btnGC)
        val botonF = findViewById<Button>(R.id.btnGF)

        botonC.setOnClickListener {
            val inF = inputF.text.toString().toDoubleOrNull()
            if (inF != null) {
                inputC.setText(((inF - 32) / 1.8).toString())
            } else {
                inputC.setText("ERROR: °F not found")
            }
        }

        botonF.setOnClickListener {
            val inC = inputC.text.toString().toDoubleOrNull()
            if (inC != null) {
                inputF.setText((inC * 1.8 + 32).toString())
            } else {
                inputF.setText("ERROR: °C not found")
            }
        }
    }
}