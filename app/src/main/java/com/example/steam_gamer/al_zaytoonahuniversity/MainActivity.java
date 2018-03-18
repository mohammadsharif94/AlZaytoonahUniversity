package com.example.steam_gamer.al_zaytoonahuniversity;

        import android.content.Intent;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.Gravity;
        import android.view.LayoutInflater;
        import android.view.View;
        import android.view.ViewGroup;
        import android.view.Window;
        import android.view.WindowManager;
        import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        //these line for Fullscreen Activity



        setContentView(R.layout.activity_main);
    }

    public void login(View view) {
        LayoutInflater welcome=getLayoutInflater();
        View myview=welcome.inflate(R.layout.welcomlayout,(ViewGroup)findViewById(R.id.mainlay));
        Toast sh=new Toast(getApplicationContext());
        sh.setGravity(Gravity.FILL,0,0);
        sh.setDuration(Toast.LENGTH_LONG);
        sh.setView(myview);
        sh.show();
        Intent intent=new Intent(this,student.class);
        startActivity(intent);
    }
}
