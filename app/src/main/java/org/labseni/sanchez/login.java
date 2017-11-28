package org.labseni.sanchez;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class login extends AppCompatActivity implements View.OnClickListener{
	private Button buttonRegister;
	private EditText editTextEmail;
	private EditText editTextPassword;
	private TextView textViewSignup;
	private ProgressDialog progressDialog;
	private FirebaseAuth firebaseAuth;
     	
   	@Override
    	protected void onCreate(Bundle savedInstanceState) {
        	super.onCreate(savedInstanceState);
        	setContentView(R.layout.activity_login);
		
		firebaseAuth= FirebaseAuth.getInstance();
 		if(firebaseAuth.getCurrentUser()!=null)
		{
			//profile activity
			finish();
			startActivity(new Intent(getApplicationContext(), MENUUTAMA.class));

		}
		progressDialog= new ProgressDialog(this);
        	buttonRegister = (Button) findViewById(R.id.t_daftar);
		editTextEmail = (EditText) findViewById(R.id.editTextEmail);
		editTextPassword = (EditText) findViewById(R.id.editTextPassword);
		textViewSignin = (TextView) findViewById(R.id.textViewSignin)
	
		buttonRegister.setOnClickListener(this);
		textViewSignin.setOnClickListener(this);
	}
	public void registerUser()
	{
		String email=editTextEmail.getText().toString().trim();
		String password=editTextPassword.getText().toString().trim();
		if(TextUtils.isEmpty(email))
		{
			//email is emty
			Toast.makeText(this, "Silfupley, email", Toast.LENGTH_SHORT).show();
			//stop function
			return; 
		}
		if(TextUtils.isEmpty(password))
		{
			//password is empty
			Toast.makeText(this, "Silfupley, password", Toast.LENGTH_SHORT).show()
			//stopping execution furher
			return;
		}
		//if valid 
		progressDialog.setMessage("Lagi registering bro...");
		progressDialog.show();
		firebaseAuth.createUserWithEmailAndPassword(email, password).addOnCompleteListener(this, new OnCompleteListener<AuthResult>(){
	@Override
	public void onComplete(@NonNull Task<AuthResult> task)
	{
		if(task.isSuccessful())

		{

			finish();
			startActivity(new Intent(getApplicationContext(), MENUUTAMA.class));

		}
		else
		{
			Toast.makeText(MainActivity.this,"teregister gagal, coba gosok lagi", Toast.LENGTH_SHORT).show();
		}
	}

	});
		
		
	}
	@Override
	public void onClick(View view)
	{
		if(view==buttonRegister)
		{
			registerUser();
		}
		if (view==textViewSignin)
		{
			//open login activity
			finish();
			startActivity(new Intent(this, Daftar.class)
		}
	}

}
