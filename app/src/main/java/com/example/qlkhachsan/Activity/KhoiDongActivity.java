package com.example.qlkhachsan.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.qlkhachsan.R;

public class KhoiDongActivity extends AppCompatActivity {
        TextView txtpower, txtTenNhom;

        //    ProgressBar progressBar;
        static int TimeOut_Millis = 2000;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_khoidong);
            anhXa();
            animation();
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    Intent intent = new Intent(KhoiDongActivity.this, MainActivity.class);
                    startActivity(intent);
                    finish();
                }
            }, TimeOut_Millis);
            ;
        }

        // tạo animation cho slash
        private void animation() {
            Animation animation = AnimationUtils.loadAnimation(KhoiDongActivity.this, R.anim.animation_fadein);
            txtTenNhom.startAnimation(animation);
            txtpower.startAnimation(animation);
        }

        // ánh xạ
        private void anhXa() {
            txtTenNhom = findViewById(R.id.tenNhom);
            txtpower = findViewById(R.id.power);
        }
    }
