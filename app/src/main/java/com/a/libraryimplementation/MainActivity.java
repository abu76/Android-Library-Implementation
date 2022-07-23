package com.a.libraryimplementation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    Button button;
    ImageView imageView;
    Animation myAnim;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button=findViewById(R.id.button);
        imageView=findViewById(R.id.imageView);
        myAnim= AnimationUtils.loadAnimation(MainActivity.this, R.anim.my_anim);

        Picasso.get()
                .load("https://th.bing.com/th/id/R.9b5b7e406a5dbfec00b4729aa45cfcd2?rik=o%2ff1dpKRNMCPmg&riu=http%3a%2f%2fwww.youloveit.com%2fuploads%2fposts%2f2020-11%2f1605537238_youloveit_com_disney_princess_wears_masks_profile_pictures06.jpeg&ehk=JrYD%2b38GjkeoJ69dcQw6%2fnJf0o5A7mTMy7s1xyLBtvE%3d&risl=&pid=ImgRaw&r=0")
                .placeholder(R.drawable.girl)
                .into(imageView);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                imageView.startAnimation(myAnim);
            }
        });
    }
}