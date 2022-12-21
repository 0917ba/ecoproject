package kr.co.company.ecoproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void toCameraPage(View view) {
        Intent intent = new Intent(getApplicationContext(),
                CameraActivity.class);
        startActivity(intent);
    }
}