package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Toast;

import com.example.myapplication.jni.JniTools;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void toSvg(View view){
        JniTools jniTools = new JniTools();
        Toast.makeText(this , jniTools.addNum(1 , 3) + "" , Toast.LENGTH_LONG).show();
        Intent intent = new Intent(this , SVGActivity.class);
        startActivity(intent);
    }

    public void toCoordinator(View view){
        Intent intent = new Intent(this , CoordinatorActivity.class);
        startActivity(intent);
    }

    public void toCoordinator2(View view){
        Intent intent = new Intent(this , Coordinator2Activity.class);
        startActivity(intent);
    }

    public void toCoordinator3(View view){
        Intent intent = new Intent(this , Coordinator3Activity.class);
        startActivity(intent);
    }

    public void toDrawerLayout1(View view){
        Intent intent = new Intent(this , DrawerLayout1Activity.class);
        startActivity(intent);
    }

    public void toYoutube(View view){
        Intent intent = new Intent(this , YoutTubeActivity.class);
        startActivity(intent);
    }

    public void toMultiState(View view){
        Intent intent = new Intent(this , MultiStateActivity.class);
        startActivity(intent);
    }

    public void toBiometric(View view){
        Intent intent = new Intent(this , BiometricActivity.class);
        startActivity(intent);
    }

    public void toMap(View view){
        Intent intent = new Intent(this , MapActivity.class);
        startActivity(intent);
    }

    public void sendSMSS(View view){
        String content = "hello world";
        String phone = "17759998795";
        SmsManager smsManager = android.telephony.SmsManager
                .getDefault();
        smsManager.sendTextMessage(phone, null, content, null,
                null);
    }
}