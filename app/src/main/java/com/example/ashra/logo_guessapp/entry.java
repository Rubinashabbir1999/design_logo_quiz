package com.example.ashra.logo_guessapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class entry extends AppCompatActivity {

    EditText enter_name;
    Button start_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entry);

        enter_name=(EditText)findViewById(R.id.name_enter);
        start_btn=(Button)findViewById(R.id.start_btn);

        start_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(enter_name!=null)
                {
                    Intent startintent = new Intent(entry.this,levels_activity.class);//use intent to switch a page using class page name

                    startintent.putExtra("name", enter_name.getText().toString()); //to show a data on other page
                    startActivity(startintent);
                }
            }
        });
    }
}
