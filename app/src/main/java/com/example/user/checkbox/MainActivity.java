package com.example.user.checkbox;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
  CheckBox fries,pasta,soup,cake;
  Button submit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addListenerOnButtonClick();
    }
        public void addListenerOnButtonClick(){
        fries=findViewById(R.id.cb1);
        pasta=findViewById(R.id.cb2);
        soup=findViewById(R.id.cb3);
        cake=findViewById(R.id.cb4);
        submit=findViewById(R.id.btn1);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int totalamount = 0;
                StringBuilder result = new StringBuilder();
                result.append("Selected item");
                if (fries.isChecked()) {
                    result.append("\n Fries Rs.100");
                    totalamount+=100;
                }
                if (pasta.isChecked()) {
                    result.append("\n Pasta Rs.200");
                    totalamount+=200;
                }
                if (soup.isChecked()) {
                    result.append("\n Soup Rs.180");
                    totalamount+=180;
                }
                if (cake.isChecked()) {
                    result.append("\n Cake Rs.120");
                    totalamount+= 120;
                }
                result.append("\n Total Amount" +totalamount+"Rs");
                Toast.makeText(getApplicationContext(), result.toString(), Toast.LENGTH_SHORT).show();
            }
                });


        }
}
