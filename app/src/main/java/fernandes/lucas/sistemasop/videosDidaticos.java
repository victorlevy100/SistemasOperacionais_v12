package fernandes.lucas.sistemasop;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import fernandes.lucas.sistemasop.videossistemas.videoHistoria;
import fernandes.lucas.sistemasop.videossistemas.videoLinux;
import fernandes.lucas.sistemasop.videossistemas.videoMacos;
import fernandes.lucas.sistemasop.videossistemas.videoWindows;


public class videosDidaticos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_videos_didaticos);


    }

    public void mostrarHistoria(View view) {
        Intent i = new Intent(videosDidaticos.this, videoHistoria.class);
        startActivity(i);
        overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
    }

    public void mostrarWindows(View view) {
        Intent i = new Intent(videosDidaticos.this, videoWindows.class);
        startActivity(i);
        overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);


    }

    public void mostrarLinux(View view) {
        Intent i = new Intent(videosDidaticos.this, videoLinux.class);
        startActivity(i);
        overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);


    }

    public void mostrarMacos(View view) {
        Intent i = new Intent(videosDidaticos.this, videoMacos.class);
        startActivity(i);
        overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);

    }
}
