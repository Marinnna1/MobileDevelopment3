package com.example.myapplication3

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView


class MainActivity : AppCompatActivity(), View.OnClickListener {
    lateinit var editText: EditText;
    lateinit var textView: TextView;
    lateinit var b1: Button;
    lateinit var b2: Button;
    lateinit var b3: Button;
    lateinit var b4: Button;

    lateinit var thanksButton: Button;
    lateinit var thanksText: TextView;


    var money:Double = 0.0;
    var finalAmount:Double = 0.0;


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editText = findViewById(R.id.edit_text);
        textView = findViewById(R.id.show);
        b1 = findViewById(R.id.firstButton);
        b2 = findViewById(R.id.secondButton);
        b3 = findViewById(R.id.thirdButton);
        b4 = findViewById(R.id.fouthButton);

        thanksButton = findViewById(R.id.thanks);
        thanksText = findViewById(R.id.thankAuthorText);

        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);
        thanksButton.setOnClickListener(this);
    }

    override fun onClick(view: View) {

        if(view.getId()==thanksButton.getId()){
            thanksText.setText("С Вашего счета списано 1000 рублей, личное мое Вам спасибо");
        }
        else if(TextUtils.isEmpty(editText.getText().toString())){
            textView.setTextColor(Color.parseColor("#F81515"));
            textView.setText("Ха!!! я поймал тебя, укажи сумму");
        }
        else {
            money = editText.getText().toString().toDouble();
            textView.setTextColor(Color.parseColor("#000000"));

            if (view.getId() == b1.getId()) {
                finalAmount = money * 0.10;
                finalAmount = Math.round(finalAmount * 100.0) / 100.0;
                textView.setText(finalAmount.toString());

            }

            if (view.getId() == b2.getId()) {
                finalAmount = money * 0.2;
                finalAmount = Math.round(finalAmount * 100.0) / 100.0;
                textView.setText("$" + finalAmount.toString());
            }

            if (view.getId() == b3.getId()) {
                finalAmount = money * 0.3;
                finalAmount = Math.round(finalAmount * 100.0) / 100.0;
                textView.setText("$" + finalAmount.toString());
            }

            if (view.getId() == b4.getId()) {
                finalAmount = money * 0.4;
                finalAmount = Math.round(finalAmount * 100.0) / 100.0;
                textView.setText("$" + finalAmount.toString());
            }

        }
    }

}
