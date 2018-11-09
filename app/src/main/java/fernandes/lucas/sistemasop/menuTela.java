package fernandes.lucas.sistemasop;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class menuTela extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_tela);
    }
    public void mostrarHistoria (View view) {
        Intent i = new Intent(menuTela.this, HistoriaOp.class);
        startActivity(i);
        overridePendingTransition(android.R.anim.fade_in,android.R.anim.fade_out);
    }
    public void mostrarVideos (View view){
        Intent i = new Intent(menuTela.this,videosDidaticos.class);
        startActivity(i);
        overridePendingTransition(android.R.anim.fade_in,android.R.anim.fade_out);
   }
    public void mostrarQuiz (View view){
        Intent i = new Intent(menuTela.this,QuizOp.class);
        startActivity(i);
        overridePendingTransition(android.R.anim.fade_in,android.R.anim.fade_out);
    }
}




