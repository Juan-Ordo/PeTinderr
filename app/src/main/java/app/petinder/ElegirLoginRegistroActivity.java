package app.petinder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ElegirLoginRegistroActivity extends AppCompatActivity {


    private Button mLogin, mRegistro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_elegir_login_registro);

        mLogin = (Button) findViewById(R.id.login);
        mRegistro = (Button) findViewById(R.id.registro);

        mLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ElegirLoginRegistroActivity.this, LoginActivity.class);
                startActivity(intent);
                finish();
                return;
            }
        });


        mRegistro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ElegirLoginRegistroActivity.this, RegistroActivity.class);
                startActivity(intent);
                finish();
                return;
            }
        });
    }
}
