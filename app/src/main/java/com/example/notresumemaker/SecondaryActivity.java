package com.example.notresumemaker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SecondaryActivity extends AppCompatActivity {

    TextView mobile,email,address,dob,skill,language,interest,other,fname,lname,profession,summary,college,degree,college_summary,experience,project;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondary);

        mobile = findViewById(R.id.mobile);
        email = findViewById(R.id.email);
        address = findViewById(R.id.address);
        dob = findViewById(R.id.dob);
        skill = findViewById(R.id.skill);
        language = findViewById(R.id.language);
        interest = findViewById(R.id.interest);
        fname = findViewById(R.id.fname);
        lname = findViewById(R.id.lname);
        profession = findViewById(R.id.profession);
        summary = findViewById(R.id.summary);
        college = findViewById(R.id.college);
        degree = findViewById(R.id.degree);
        college_summary = findViewById(R.id.college_summary);


        String Fname = getIntent().getStringExtra("Fname");
        String Lname = getIntent().getStringExtra("Lname");
        String Mobile = getIntent().getStringExtra("contact");
        String Email = getIntent().getStringExtra("email");
        String Address = getIntent().getStringExtra("address");
        String Dob = getIntent().getStringExtra("dob");
        String College = getIntent().getStringExtra("college");
        String Skill = getIntent().getStringExtra("skill");
        String Nation = getIntent().getStringExtra("nation");
        String Degree = getIntent().getStringExtra("degree");
        String Interest = getIntent().getStringExtra("interest");
        String Language = getIntent().getStringExtra("language");
        String Other = getIntent().getStringExtra("other");


        fname.setText(""+Fname);
        lname.setText(""+Lname);
        mobile.setText(""+Mobile);
        email.setText(""+Email);
        address.setText(""+Address);
        dob.setText(""+Dob);
        college.setText(""+College);
        skill.setText(""+Skill);
        interest.setText(""+Interest);
//        nation.setText(""+Nation);
        degree.setText(""+Degree);
        language.setText(""+Language);
//        other.setText(""+Other);

    }
}