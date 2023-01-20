package com.example.realtimefirebasecrudcodingwithtea;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText et_name = findViewById(R.id.et_name);
        final EditText et_pos = findViewById(R.id.et_pos);
        Button btn = findViewById(R.id.submit_button);

        DataAccessObjectEmployee dataAccessObjectEmployee = new DataAccessObjectEmployee();
        btn.setOnClickListener(v ->
        {
            //creating a new object employee which we are getting from edit texts
            Employee emp = new Employee(et_name.getText().toString(), et_pos.getText().toString());
            //calling methods from dao class and then we pass object employee

            dataAccessObjectEmployee.add(emp).addOnSuccessListener(suc ->//on sucess
            {
                Toast.makeText(this, "Record is inserted", Toast.LENGTH_SHORT).show();
            }).addOnFailureListener(er->
            {
                Toast.makeText(this, ""+er.getMessage(), Toast.LENGTH_SHORT).show();
            });
        });
    }
}
