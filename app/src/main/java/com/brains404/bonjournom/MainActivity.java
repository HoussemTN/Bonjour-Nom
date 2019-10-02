package com.brains404.bonjournom;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
 Button buttonEnvoyer ;
 EditText nom ;
 TextView messageText ;
String message ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         nom= findViewById(R.id.Nom);
        buttonEnvoyer = findViewById(R.id.Envoyer);
        messageText= findViewById(R.id.TVNom);
        buttonEnvoyer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                message = getResources().getString(R.string.message);
                messageText.setText(message+" "+nom.getText()+" !");



            }
        });

    }
}
