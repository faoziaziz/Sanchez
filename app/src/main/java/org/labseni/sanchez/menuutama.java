package org.labseni.sanchez;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;


public class menuutama extends AppCompatActivity implements View.OnClickListener{
    private FirebaseAuth firebaseAuth;
    private TextView textViewUserEmail;
    private Button buttonLogout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menuutam);

        firebaseAuth=FirebaseAuth.getInstance();

        if(firebaseAuth.getCurrentUser()==null)
        {
            finish();
            startActivity(new Intent(this, Daftar.class));
        }

        FirebaseUser user = firebaseAuth.getCurrentUser();


        textViewUserEmail=(TextView) findViewById(R.id.textViewUserEmail);
        textViewUserEmail.setText("Welcome "+ user.getEmail());
        buttonLogout=(Button)findViewById(R.id.buttonLogout);

        buttonLogout.setOnClickListener(this);
        Button btn2 = (Button) findViewById(R.id.buttonLogout);

        btn2.setOnClickListener(new View.OnClickListener()
        {
            @Override

            public void onClick (View v)
            {
                Intent i1 = new Intent(getApplication(), cekkosan.class);
                startActivity(i1);


            }

        });

        Button btn3 = (Button) findViewById(R.id.c_jadwal);

        btn3.setOnClickListener(new View.OnClickListener()
        {
            @Override

            public void onClick (View v)
            {
                Intent i1 = new Intent(getApplication(), cekjadwal.class);
                startActivity(i1);


            }

        });

    }
    @Override
    public void onClick(View view)
    {
        if(view==buttonLogout)
        {
            firebaseAuth.signOut();
            finish();
            startActivity(new Intent(this, Daftar.class));
        }
    }
}
