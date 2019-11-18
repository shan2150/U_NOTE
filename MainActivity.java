package com.example.myapplication;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Button;import android.content.Intent;

import static android.provider.MediaStore.ACTION_IMAGE_CAPTURE;

//public class MainActivity extends AppCompatActivity {
//    Button camera;
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//        camera=(Button)findViewById(R.id.button);
//        camera.setOnClickListener(new View.OnClickListener(){
//            @Override
//            public void onClick(View view){
//                try{
//                        Intent intent = new Intent();
//                        intent.setAction(ACTION_IMAGE_CAPTURE);
//                        startActivity(intent);}
//                catch(Exception e){
//                    e.printStackTrace();
//                }
//
//            }
//        });
//    }
//
//}


import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

//    ImageView imageView;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//
//        Button btnCamera = (Button)findViewById(R.id.btnCamera);
//        imageView = (ImageView) findViewById(R.id.imageView);
//
//        btnCamera.setOnClickListener(new View.OnClickListener(){
//            @Override
//            public void onClick(View view){
//                Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
//                startActivityForResult(intent,0);
//            }
//        });
//
//    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        Bitmap bitmap = (Bitmap)data.getExtras().get("data");
//        imageView.setImageBitmap(bitmap);
    }



    public void openAboutActivity(View view){
        Intent intent = new Intent (this, AboutActivity.class);
        startActivity(intent);
    }

    public void openIntro(View view){
        Intent intent = new Intent (this, Intro.class);
        startActivity(intent);
    }
}
