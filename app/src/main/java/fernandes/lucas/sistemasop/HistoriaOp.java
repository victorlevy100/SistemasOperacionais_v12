package fernandes.lucas.sistemasop;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import fernandes.lucas.sistemasop.LinuxR.linuxPrincipal;
import fernandes.lucas.sistemasop.MacR.MacPrincipal;
import fernandes.lucas.sistemasop.windowsR.windowsPrincipal;

//import fernandes.lucas.sistemasop.windowsR.MainActivity;

public class HistoriaOp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_historia_op);
    }
    public void SistemaWindows (View view) {
        Intent i = new Intent(HistoriaOp.this, windowsPrincipal.class);
        startActivity(i);
        overridePendingTransition(android.R.anim.fade_in,android.R.anim.fade_out);
    }

    public void SistemaLinux (View view) {
        Intent i = new Intent(HistoriaOp.this, linuxPrincipal.class);
        startActivity(i);
        overridePendingTransition(android.R.anim.fade_in,android.R.anim.fade_out);
    }

    public void MacPrincipal (View view) {
        Intent i = new Intent(HistoriaOp.this, MacPrincipal.class);
        startActivity(i);
        overridePendingTransition(android.R.anim.fade_in,android.R.anim.fade_out);
    }
}
