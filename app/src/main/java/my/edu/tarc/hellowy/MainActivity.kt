package my.edu.tarc.hellowy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

//Instance Name: Type
//intCount : Integer
class MainActivity : AppCompatActivity() {
    //onCreate = main() function
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        //Load UI to memory
        //R = resources class
        setContentView(R.layout.activity_main)

        //Write code after setContentView

        //Declare variable
        //val = value, var = variable
        //get input from user -> use var
        //the value that not easy to change -> use val
        val textViewName: TextView = findViewById(R.id.textViewName)
        val imageViewQR: ImageView = findViewById(R.id.imageViewQR)
        val buttonHide: Button = findViewById(R.id.buttonHide)
        val buttonShow: Button = findViewById(R.id.buttonShow)

        buttonShow.setOnClickListener{
            textViewName.visibility = View.VISIBLE
            imageViewQR.visibility = View.VISIBLE
        }

        buttonHide.setOnClickListener {
            textViewName.visibility = View.INVISIBLE
            imageViewQR.visibility = View.INVISIBLE
        }


    }
}