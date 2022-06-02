package edu.csc.kt_trungtinh;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity_KT1 extends AppCompatActivity {
    EditText CMND, SDT, DC;
    Button capnhat, lamlai;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_kt1);
        capnhat = findViewById(R.id.button1);
        lamlai = findViewById(R.id.button2);
        CMND = findViewById(R.id.CMND);
        SDT = findViewById(R.id.SDT);
        DC = findViewById(R.id.DC);
        capnhat.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity_KT1.this, "Cập nhật thành công",Toast.LENGTH_SHORT).show();
            }
        });
        lamlai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CMND.setText("");
                SDT.setText("");
                DC.setText("");
                CMND.requestFocus();
                Toast.makeText(MainActivity_KT1.this, "Xóa thành công",Toast.LENGTH_SHORT).show();
            }
        });
        ActionBar actionBar =getSupportActionBar();
        actionBar.setTitle("KT SỐ 1");
        actionBar.setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case android.R.id.home:
                onBackPressed();
                return true;
            default:break;
        }
        return super.onOptionsItemSelected(item);
    }
}