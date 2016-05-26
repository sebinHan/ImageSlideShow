package kr.hs.emirim.sbb9918.imageslideshow;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ViewFlipper;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    ViewFlipper viewFlipper;
    EditText editTime;
    int time;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewFlipper = (ViewFlipper) findViewById(R.id.view_flip);

        editTime = (EditText)findViewById(R.id.edit_time);
        Button but_start = (Button) findViewById(R.id.but_start);
        Button but_stop = (Button) findViewById(R.id.but_stop);
        but_start.setOnClickListener(this);
        but_stop.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.but_start:
                time = (int)Double.parseDouble(editTime.getText().toString())*1000;
                viewFlipper.setFlipInterval(time);
                viewFlipper.startFlipping();
                break;
            case R.id.but_stop:
                viewFlipper.stopFlipping();
                break;
        }
    }
}
