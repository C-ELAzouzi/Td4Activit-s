package com.example.newslist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_main);
        setTitle(getLocalClassName());
        Button btn=(Button)findViewById(R.id.GoToNewsActivity);
        final EditText text=(EditText)findViewById(R.id.username);
        final  NewsListApplication app=(NewsListApplication)getApplicationContext();

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String txt="";
                if(text.getText()!=null) {
                    txt = text.getText().toString();
                }
                Intent intent=new Intent(getApplicationContext(),NewsActivity.class);
                intent.putExtra("login",txt);
                app.setLogin(txt);
                startActivity(intent);
            }
        });

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }
}
