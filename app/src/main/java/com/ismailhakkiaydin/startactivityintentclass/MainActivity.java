package com.ismailhakkiaydin.startactivityintentclass;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText editUser, editPassword;

    private void init(){

        editUser = findViewById(R.id.editUser);
        editPassword = findViewById(R.id.editPassword);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
        pressedEnter();

    }

    public void clickCancel(View view){

        this.finish();

    }

    public void clickLogin(View view){

        String user = editUser.getText().toString();
        String pass = editPassword.getText().toString();

        Intent intent = new Intent(this, TargetActivity.class);

        if (user.equals("iha")&&pass.equals("ihaydin")){
            intent.putExtra("USER", "IHA");
        }
        else if (user.equals("iha2")&&pass.equals("ihaydin2")){
            intent.putExtra("USER", "IHA 2");
        }
        else{
            Toast.makeText(this, "Login is Failed. Try Again..", Toast.LENGTH_LONG).show();
        }

        this.startActivity(intent);

    }

    private void pressedEnter(){
        editPassword.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View view, int i, KeyEvent keyEvent) {

                if(i == KeyEvent.KEYCODE_ENTER){
                    MainActivity.this.setTitle(editPassword.getText().toString());
                    return true;
                }

                return false;
            }
        });
    }
}
