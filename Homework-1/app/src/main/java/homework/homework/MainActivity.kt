package homework.homework


import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView


abstract class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       val button = findViewById(R.id.Btn) as Button;
        val txt = findViewById(R.id.text)as TextView;


       
        
        button.setOnClickListener{
            
            val num = (-100..100).random();
           
            if(num%5 == 0 && num > 0){
        
        txt.text = "yes";
         
        }else{
                
            txt.text = "no";
        }



        }




    }
}


