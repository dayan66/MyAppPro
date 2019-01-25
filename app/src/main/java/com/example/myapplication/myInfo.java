package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class myInfo extends AppCompatActivity {
    private TextView txtName,txtClass,txtEmail;
    private DatabaseReference mDatabase;
    private Button btnRegister;
    private ImageView back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_info);

        mDatabase= FirebaseDatabase.getInstance().getReference();

        txtName=(TextView)findViewById(R.id.txtName);
        txtClass=(TextView)findViewById(R.id.txtClass);
        txtEmail=(TextView)findViewById(R.id.txtEmail);
        btnRegister = (Button)findViewById(R.id.btnRegisterUser);
        back= (ImageView)findViewById(R.id.back);
        txtEmail.setText(getIntent().getExtras().getString("Email"));

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent back = new Intent(myInfo.this,Dashboard.class);
                startActivity(back);
            }
        });


      /*  btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String Name = txtName.getText().toString().trim();
                String Class = txtClass.getText().toString().trim();

                HashMap<String, String> dataMap = new HashMap<String, String>();
                dataMap.put("Name",Name);
                dataMap.put("Class",Class);

                mDatabase.push().setValue(dataMap).addOnCompleteListener(new OnCompleteListener<Void>() {
                    @Override
                    public void onComplete(@NonNull Task<Void> task) {

                        if (task.isSuccessful()){

                            Toast.makeText(info.this,"Stored.. ",Toast.LENGTH_SHORT).show();

                        }
                        else {
                            Toast.makeText(info.this,"Not Stored...!",Toast.LENGTH_SHORT).show();
                        }
                    }
                });
            }
        });*/


    }
}
