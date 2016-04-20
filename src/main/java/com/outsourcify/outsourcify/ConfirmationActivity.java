package com.outsourcify.outsourcify;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class ConfirmationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirmation);

        ImageView mImageView;
        mImageView = (ImageView) findViewById(R.id.visualConfirmationView);
        mImageView.setImageResource(R.drawable.tick);

        TextView recommendedActionView;
        recommendedActionView = (TextView) findViewById(R.id.recommendedActionView);

        Button btn1 = (Button)findViewById(R.id.returnButton);
        btn1.setOnClickListener(btnListener);

    }

    private View.OnClickListener btnListener = new View.OnClickListener()
    {
        public void onClick(View v) {
            switch(v.getId()) {
                case R.id.returnButton:
                    returnHome(findViewById(R.id.returnButton));
                    break;
                case R.id.previous_activity:
                    previousActivity(findViewById(R.id.previous_activity));
                    break;
                case R.id.return_home:
                    returnHome(findViewById(R.id.return_home));
                    break;
            }
        }
    };


    public void returnHome(View view){
        Intent myIntent = new Intent(ConfirmationActivity.this, TemplateActivity.class);
        startActivity(myIntent);
    }

    public void previousActivity(View view){
        finish();
    }
}
