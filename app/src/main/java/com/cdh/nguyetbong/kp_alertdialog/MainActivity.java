package com.cdh.nguyetbong.kp_alertdialog;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.btn01);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder arlert = new AlertDialog.Builder(MainActivity.this);
                arlert.setTitle("Ban co chac chan thoat?");
                arlert.setMessage("xac nhan");
                arlert.setCancelable(false);
                arlert.setIcon(R.mipmap.ic_launcher);
                arlert.setPositiveButton("Co", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
//                        Toast.makeText(MainActivity.this, "ban da chon co", Toast.LENGTH_SHORT).show();
                        finish();
                    }
                });
                arlert.setNegativeButton("khong", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(MainActivity.this, "khong", Toast.LENGTH_SHORT).show();
                    }
                });
                arlert.show();
            }
        });
    }
}
