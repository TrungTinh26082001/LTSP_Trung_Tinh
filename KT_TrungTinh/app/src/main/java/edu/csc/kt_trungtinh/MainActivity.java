package edu.csc.kt_trungtinh;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    Button button;
    ImageView image1, image2, image3, image4, image5, image6;
    Intent i;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=findViewById(R.id.out);
        image1=findViewById(R.id.imageView1);
        image2=findViewById(R.id.imageView2);
        image3=findViewById(R.id.imageView3);
        image4=findViewById(R.id.imageView4);
        image5=findViewById(R.id.imageView5);
        image6=findViewById(R.id.imageView6);
        image1.setOnClickListener(v ->{
            i=new Intent(MainActivity.this,MainActivity_KT1.class);
            startActivity(i);

        });
        image2.setOnClickListener(v ->{
            i=new Intent(MainActivity.this,MainActivity_KT2.class);
            startActivity(i);

        });
        image3.setOnClickListener(v ->{
            i=new Intent(MainActivity.this,MainActivity_KT3.class);
            startActivity(i);

        });
        image4.setOnClickListener(v ->{
            i=new Intent(MainActivity.this,MainActivity_KT4.class);
            startActivity(i);

        });
        image5.setOnClickListener(v ->{
            i=new Intent(MainActivity.this,MainActivity_KT5.class);
            startActivity(i);

        });
        image6.setOnClickListener(v ->{
            i=new Intent(MainActivity.this,MainActivity_KT6.class);
            startActivity(i);

        });
    }



    public void xulyout(View view) {
        finish();
    }
}