package echeverria.reynaldo.calculadora

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main_calculadora.*

class MainCalculadora : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_calculadora)

        val etiqueta1: TextView = findViewById(R.id.campo1)as TextView
        val etiqueta2: TextView = findViewById(R.id.campo2)as TextView
        val uno: Button = findViewById(R.id.uno) as Button
        val dos: Button = findViewById(R.id.dos) as Button
        val tres: Button = findViewById(R.id.tres) as Button
        val cuatro: Button = findViewById(R.id.cuatro) as Button
        val cinco: Button = findViewById(R.id.cinco) as Button
        val seis: Button = findViewById(R.id.seis) as Button
        val siete: Button = findViewById(R.id.siete) as Button
        val ocho: Button = findViewById(R.id.ocho) as Button
        val nueve: Button = findViewById(R.id.nueve) as Button
        val cero: Button = findViewById(R.id.cero) as Button
        val result: Button = findViewById(R.id.result) as Button
        val borrar: Button = findViewById(R.id.borrar) as Button
        val mult: Button = findViewById(R.id.multiplicacion) as Button
        val div: Button = findViewById(R.id.division) as Button
        val sum: Button = findViewById(R.id.suma) as Button
        val rest: Button = findViewById(R.id.resta) as Button


        fun unirCadena(cadena: String){


            campo1.append(cadena)


        }


        uno.setOnClickListener {

            unirCadena("1")
        }

        dos.setOnClickListener {
            unirCadena("2")

        }
        tres.setOnClickListener {
            unirCadena("3")
        }
        cuatro.setOnClickListener {
            unirCadena("4")
        }
        cinco.setOnClickListener {
            unirCadena("5")
        }
        seis.setOnClickListener {
            unirCadena("6")
        }
        siete.setOnClickListener {
            unirCadena("7")
        }
        ocho.setOnClickListener {
            unirCadena("8")
        }
        nueve.setOnClickListener {
            unirCadena("9")
        }

        cero.setOnClickListener {
            unirCadena("0")
        }

        mult.setOnClickListener {
            unirCadena("*")
            campo2.text = campo1.text
            campo1.text = "0"
        }

        div.setOnClickListener{
            unirCadena("/")
            campo2.text = campo1.text
            campo1.text = "0"


        }

        sum.setOnClickListener{
            unirCadena("+")
            campo2.text = campo1.text
            campo1.text = "0"


        }

        rest.setOnClickListener{
            unirCadena("-")
            campo2.text = campo1.text
            campo1.text = "0"


        }

        borrar.setOnClickListener{
            campo1.text=""
            campo2.text = ""
        }

        result.setOnClickListener{
           var result :Double = 0.0

            if(campo2.text.toString().contains("*")){
                var op = campo2.text.toString().removeSuffix("*")
                result = op.toDouble() * campo1.text.toString().toDouble()
                campo1.setText(result.toString())
                campo2.setText("")
            }

            if(campo2.text.toString().contains("+")){
                var op = campo2.text.toString().removeSuffix("+")
                result = op.toDouble() + campo1.text.toString().toDouble()
                campo1.setText(result.toString())
                campo2.setText("")
            }

            if(campo2.text.toString().contains("/")){
                var op = campo2.text.toString().removeSuffix("/")
                result = op.toDouble() / campo1.text.toString().toDouble()
                campo1.setText(result.toString())
                campo2.setText("")
            }

            if(campo2.text.toString().contains("-")){
                var op = campo2.text.toString().removeSuffix("-")
                result = op.toDouble() - campo1.text.toString().toDouble()
                campo1.setText(result.toString())
                campo2.setText("")
            }
        }



    }
}
