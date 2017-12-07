package com.blur.bg;

import android.app.Activity;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.widget.ImageView;

import com.blurr.image.BlurUtil;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView imageView = findViewById(R.id.imageblur);
        Bitmap bitmap = BlurUtil.with(getApplicationContext()).load(R.drawable.bg).intensity(10).getImageBlur();
        imageView.setImageBitmap(bitmap);
    }
}
