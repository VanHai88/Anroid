package zzvanhai81.gmail.com.baitap;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void turtleRBClick(View view) {
        TextView bossDescriptionTV = findViewById(R.id.boss1);
        ImageView turtleImage = findViewById(R.id.ivboss);
        switch (view.getId()){
            case R.id.rbboss1:
                bossDescriptionTV.setText("BOSS 1");
                turtleImage.setImageDrawable(getResources().getDrawable(R.drawable.hinh1));
                break;

            case R.id.rbboss2:
                bossDescriptionTV.setText("BOSS 2");
                turtleImage.setImageDrawable(getResources().getDrawable(R.drawable.hinh2));
                break;

            case R.id.rbboss3:
                bossDescriptionTV.setText("BOSS 3");
                turtleImage.setImageDrawable(getResources().getDrawable(R.drawable.hinh3));
                break;

        }
    }

    public void imageDisplaySWClick(View view) {
        Switch theSwitch = findViewById(R.id.displayingSW);
        ImageView turtleImage = findViewById(R.id.ivboss);
        if(theSwitch.isChecked()){
            turtleImage.setVisibility(View.VISIBLE);
        }else{
            turtleImage.setVisibility(View.INVISIBLE);
        }
    }
}
