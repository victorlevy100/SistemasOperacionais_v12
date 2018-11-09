package fernandes.lucas.sistemasop;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;



public class entradaTela extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.entrada_tela);


        Animation myanim = AnimationUtils.loadAnimation(this,R.anim.mytransition);

        Handler h = new Handler();
        h.postDelayed(new Runnable() {
            @Override
            public void run() {
                final Intent i = new Intent ( entradaTela.this,menuTela.class);
                startActivity(i);
                finish();
                overridePendingTransition(android.R.anim.fade_in,android.R.anim.fade_out);

            }
        },3000);




    }
}
