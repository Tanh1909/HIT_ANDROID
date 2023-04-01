package com.example.btvn_buoi_3


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onResume() {
        super.onResume()
        var ok:Boolean=false
        var res:Double=0.0


        var TEXT: String = ""
        val textres: TextView = findViewById(R.id.textView)
        val text0: TextView = findViewById(R.id.textView18)
        val text1: TextView = findViewById(R.id.textView14)
        val text2: TextView = findViewById(R.id.textView15)
        val text3: TextView = findViewById(R.id.textView16)
        val text4: TextView = findViewById(R.id.textView10)
        val text5: TextView = findViewById(R.id.textView11)
        val text6: TextView = findViewById(R.id.textView12)
        val text7: TextView = findViewById(R.id.textView6)
        val text8: TextView = findViewById(R.id.textView7)
        val text9: TextView = findViewById(R.id.textView8)
        val textcong: TextView = findViewById(R.id.textView17)
        val texttru: TextView = findViewById(R.id.textView13)
        val textnhan: TextView = findViewById(R.id.textView9)
        val textchia: TextView = findViewById(R.id.textView5)
        val textdu: TextView = findViewById(R.id.textView4)
        val textphay: TextView = findViewById(R.id.textView19)
        val textxoa: TextView = findViewById(R.id.textView3)
        val textxoahet: TextView = findViewById(R.id.textView2)
        val textbang: TextView = findViewById(R.id.textView20)

        text0.setOnClickListener {
            if(TEXT.length!=0){
                TEXT = TEXT +"0"
            }
            textres.setText(TEXT)
        }
        text1.setOnClickListener {
            TEXT = TEXT +"1"
            textres.setText(TEXT)
        }
        text2 . setOnClickListener {

            TEXT = TEXT +"2"
            textres.setText(TEXT)
        }
        text3 . setOnClickListener {

            TEXT = TEXT +"3"
            textres.setText(TEXT)
        }
        text4 . setOnClickListener {

            TEXT = TEXT +"4"
            textres.setText(TEXT)
        }
        text5 . setOnClickListener {

            TEXT = TEXT +"5"
            textres.setText(TEXT)
        }
        text6 . setOnClickListener {

            TEXT = TEXT +"6"
            textres.setText(TEXT)
        }
        text7 . setOnClickListener {

            TEXT = TEXT +"7"
            textres.setText(TEXT)
        }
        text8 . setOnClickListener {

            TEXT = TEXT +"8"
            textres.setText(TEXT)
        }
        text9 . setOnClickListener {

            TEXT = TEXT +"9"
            textres.setText(TEXT)
        }
        textphay . setOnClickListener {
            if(!ok){
                TEXT = TEXT +"."
            }
            ok=true
            textres.setText(TEXT)
        }
        textcong . setOnClickListener {
            if(TEXT[TEXT.length-1]!='+'&&TEXT[TEXT.length-1]!='-'&&TEXT[TEXT.length-1]!='*'&&TEXT[TEXT.length-1]!='/'&&TEXT[TEXT.length-1]!='%'){
                TEXT = TEXT +"+"
            }
            textres.setText(TEXT)
        }
        texttru . setOnClickListener {
            if(TEXT[TEXT.length-1]!='+'&&TEXT[TEXT.length-1]!='-'&&TEXT[TEXT.length-1]!='*'&&TEXT[TEXT.length-1]!='/'&&TEXT[TEXT.length-1]!='%'){
                TEXT = TEXT +"-"
            }
            textres.setText(TEXT)
        }
        textnhan . setOnClickListener {
            if(TEXT[TEXT.length-1]!='+'&&TEXT[TEXT.length-1]!='-'&&TEXT[TEXT.length-1]!='*'&&TEXT[TEXT.length-1]!='/'&&TEXT[TEXT.length-1]!='%'){
                TEXT = TEXT +"*"
            }
            textres.setText(TEXT)

        }
        textchia . setOnClickListener {
            if(TEXT[TEXT.length-1]!='+'&&TEXT[TEXT.length-1]!='-'&&TEXT[TEXT.length-1]!='*'&&TEXT[TEXT.length-1]!='/'&&TEXT[TEXT.length-1]!='%'){
                TEXT = TEXT +"/"
            }
            textres.setText(TEXT)
        }
        textdu . setOnClickListener {
            if(TEXT[TEXT.length-1]!='+'&&TEXT[TEXT.length-1]!='-'&&TEXT[TEXT.length-1]!='*'&&TEXT[TEXT.length-1]!='/'&&TEXT[TEXT.length-1]!='%'){
                TEXT = TEXT +"%"
            }
            textres.setText(TEXT)
        }
        textxoahet . setOnClickListener {
            textres.setText("0")
            TEXT=""
        }
        textxoa . setOnClickListener {
            var tp: String=""
            for(i in 0 until TEXT.length-1){
                tp=tp+TEXT[i]
            }
            TEXT=tp
            textres.setText(TEXT)
        }
        textbang . setOnClickListener {
            var listnumber = ArrayList<Double>()
            var res : Double=0.0
            var alpha = ArrayList<String>()
            var tp:String=""
            for(i:Char in TEXT){
                if(i!='+'&&i!='-'&&i!='*'&&i!='/'&&i!='%'){
                    tp+=i.toString()
                }
                else{
                    listnumber.add(tp.toDouble())
                    tp=""
                }

            }
            listnumber.add(tp.toDouble())
            for(i:Char in TEXT){
                if(!(i!='+'&&i!='-'&&i!='*'&&i!='/'&&i!='%')){
                    alpha.add(i.toString())
                }
            }
            for(i in alpha.size-1 downTo  1 ){
                if(alpha.get(i)=="*"){
                    var tmp : Double=listnumber.get(i)*listnumber.get(i+1)
                    listnumber[i]=tmp
                    listnumber.removeAt(i+1)
                }
                if(alpha.get(i)=="/"){
                    var tmp : Double=listnumber.get(i)/listnumber.get(i+1)
                    listnumber[i]=tmp
                    listnumber.removeAt(i+1)
                }
                if(alpha.get(i)=="%"){
                    var tmp : Double=listnumber.get(i)%listnumber.get(i+1)
                    listnumber[i]=tmp
                    listnumber.removeAt(i+1)
                }
                if(alpha.get(i)=="-"){
                    listnumber[i+1]=-listnumber.get(i+1)
                }
            }
            for(i:Double in listnumber){
               res=res+i
            }
            textres.setText(res.toString())
        }
    }
}