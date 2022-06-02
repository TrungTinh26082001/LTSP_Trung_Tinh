package edu.csc.kt_trungtinh;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity_KT2 extends AppCompatActivity {
    Button button;
    EditText editText;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_kt2);
        button=findViewById(R.id.chuyendoi);
        textView=findViewById(R.id.amlich);
        editText=findViewById(R.id.duonglich);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String []arrCan={"Canh","Tân","Nhâm","Quý","Giáp","Ất","Bính","Đinh","Mậu","Kỷ"};
                String []arrChi={"Thân","Dậu","Tuất","Hợi","Tý","Sửu","Dần","Mẹo","Thìn","Tỵ","Ngọ","Mùi"};
                int namDuong=Integer.parseInt(editText.getText().toString());
                String can=arrCan[namDuong%10];
                String chi=arrChi[namDuong%12];
                textView.setText(can+" "+chi);
            }
        });
        ActionBar actionBar =getSupportActionBar();
        actionBar.setTitle("KT SỐ 2");
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