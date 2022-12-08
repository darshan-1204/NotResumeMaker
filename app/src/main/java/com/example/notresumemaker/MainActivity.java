package com.example.notresumemaker;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button btn;
    EditText edt_Fname,edt_Lname,edt_dob,edt_address,edt_email,edt_contact,edt_nation,edt_language,edt_interest;
    EditText edt_college,edt_degree,edt_skill,edt_other;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = findViewById(R.id.btn);
        edt_Fname = findViewById(R.id.edt_Fname);
        edt_Lname = findViewById(R.id.edt_Lname);
        edt_dob = findViewById(R.id.edt_dob);
        edt_address = findViewById(R.id.edt_address);
        edt_email = findViewById(R.id.edt_email);
        edt_contact = findViewById(R.id.edt_contact);
        edt_nation = findViewById(R.id.edt_nation);
        edt_language = findViewById(R.id.edt_language);
        edt_interest = findViewById(R.id.edt_hobbies);
        edt_college = findViewById(R.id.edt_college);
        edt_degree = findViewById(R.id.edt_degree);
        edt_skill = findViewById(R.id.edt_skill);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String Fname = edt_Fname.getText().toString();
                String Lname = edt_Lname.getText().toString();
                String dob = edt_dob.getText().toString();
                String Address = edt_address.getText().toString();
                String Email = edt_email.getText().toString();
                String Contact = edt_contact.getText().toString();
                String Nation = edt_nation.getText().toString();
                String Language = edt_language.getText().toString();
                String Interest = edt_interest.getText().toString();
                String College = edt_college.getText().toString();
                String Degree = edt_degree.getText().toString();
                String Skill = edt_skill.getText().toString();

                Intent intent = new Intent(MainActivity.this,SecondaryActivity.class);
                intent.putExtra("Fname",Fname);
                intent.putExtra("Lname",Lname);
                intent.putExtra("dob",dob);
                intent.putExtra("address",Address);
                intent.putExtra("email",Email);
                intent.putExtra("contact",Contact);
                intent.putExtra("nation",Nation);
                intent.putExtra("language",Language);
                intent.putExtra("interest",Interest);
                intent.putExtra("college",College);
                intent.putExtra("degree",Degree);
                intent.putExtra("skill",Skill);
                startActivity(intent);
            }
        });
    }
}