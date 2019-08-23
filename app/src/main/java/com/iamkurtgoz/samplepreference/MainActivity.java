package com.iamkurtgoz.samplepreference;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.iamkurtgoz.easystore.EasyModel;
import com.iamkurtgoz.easystore.EasyStore;
import com.iamkurtgoz.easystore.EasyStoreFilesCallback;

import java.util.Set;
import java.util.TreeSet;

public class MainActivity extends AppCompatActivity {



    private Button button, button2, button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        registerHandlers();
    }

    private void init(){
        button = (Button) findViewById(R.id.button);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
    }

    private void registerHandlers(){
        setButtonClick();
        setButton2Click();
        setButton3Click();
    }

    private void setButtonClick(){
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, SimpleDataSaveActivity.class));
            }
        });
    }

    private void setButton2Click(){
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, FileDataSaveActivity.class));
            }
        });
    }

    private void setButton3Click(){
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, FileDataReadActivity.class));
            }
        });
    }
}
