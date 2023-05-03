package com.example.fatalframes;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;


public class AdminCategoryActivity extends AppCompatActivity {

    private ImageView Circular, designed, diamond,doubleframe,trippleframe
            ,supported,vintage;
    private Button logoutBtn,CheckOrdersBtn,maintainProductsBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_category);

        logoutBtn = (Button) findViewById(R.id.admin_logout_btn);
        CheckOrdersBtn = (Button) findViewById(R.id.check_orders_btn);
        maintainProductsBtn = (Button)findViewById(R.id.maintain_btn);

        maintainProductsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AdminCategoryActivity.this, HomeActivity.class);
                intent.putExtra("Admin","Admin");
                startActivity(intent);
                finish();
            }
        });

        logoutBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AdminCategoryActivity.this, MainActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(intent);
                finish();
            }
        });

        CheckOrdersBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminNewOrdersActivity.class);
                startActivity(intent);

            }
        });


        Circular = (ImageView) findViewById(R.id.circleframe);
        designed = (ImageView) findViewById(R.id.designer_frame);
        diamond = (ImageView) findViewById(R.id.diamond);
        doubleframe = (ImageView) findViewById(R.id.doubleframe);
        trippleframe = (ImageView) findViewById(R.id.tripleframe);
        supported = (ImageView) findViewById(R.id.supportedframe);
        vintage = (ImageView) findViewById(R.id.vintageframe);

        Circular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AdminCategoryActivity.this,AdminaddnewproductActivity.class);
                intent.putExtra("category","Circular");
                startActivity(intent);
            }
        });
        designed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminaddnewproductActivity.class);
                intent.putExtra("category","designed");
            }
        });
         diamond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AdminCategoryActivity.this,AdminaddnewproductActivity.class);
                intent.putExtra("category","designed");
            }
        });
        doubleframe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AdminCategoryActivity.this,AdminaddnewproductActivity.class);
                intent.putExtra("category","doubleframe");
            }
        });
        trippleframe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AdminCategoryActivity.this,AdminaddnewproductActivity.class);
                intent.putExtra("category","trippleframe");
            }
        });
        supported.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AdminCategoryActivity.this,AdminaddnewproductActivity.class);
                intent.putExtra("category","supported");
            }
        });
        vintage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AdminCategoryActivity.this,AdminaddnewproductActivity.class);
                intent.putExtra("category","vintage");
            }
        });
    }
}