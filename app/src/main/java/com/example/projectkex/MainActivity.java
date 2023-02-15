package com.example.projectkex;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    TextView drone_type, connection_status;
    Button open;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        drone_type = (TextView)findViewById(R.id.drone_type);
        connection_status = (TextView)findViewById(R.id.connection_status);
        open = (Button)findViewById(R.id.openBtn);

        drone_type.setText("no drone connected");
        connection_status.setText("no signal from drone");
    }

    public void onClick(View view){
        switch (view.getId()){
            case R.id.openBtn: {
                break;
            }
        }
    }
}