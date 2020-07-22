package com.example.ligadajustica;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnLG (View view) {
        String url = "https://www.aficionados.com.br/liga-da-justica-origem-dc-comics/";
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(url));
        startActivity(intent);

    }
    public void btnMM(View view){
        Intent intent = new Intent(this, mulhermaravilha.class);
        startActivity(intent);
    }
    public void btnB(View view){
        Intent intent = new Intent(this, batman.class);
        startActivity(intent);
    }
    public void btnS(View view){
        Intent intent = new Intent(this, Superhomem.class);
        startActivity(intent);
    }
    public void btnF(View view) {
        Intent intent = new Intent(this, Flash.class);
        startActivity(intent);
    }

}