package kr.co.company.ecoproject;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;

public class FinalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final);

        ImageView taken = (ImageView)findViewById(R.id.takenPhoto);
        ImageView water = (ImageView)findViewById(R.id.waterImage);
        ImageView tree = (ImageView)findViewById(R.id.treeImage);

        byte[] byteArray = getIntent().getByteArrayExtra("image");
        Bitmap bitmap = BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length);

        taken.setImageBitmap(bitmap);
        water.setImageResource(R.drawable.water2);
        tree.setImageResource(R.drawable.img);

    }
}