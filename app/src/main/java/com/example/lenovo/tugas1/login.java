package com.example.lenovo.tugas1;
import java.util.ArrayList;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class login extends Activity {

    EditText un,pw;
    TextView error;
    Button login,cancel,daftar;
    String i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        un=(EditText)findViewById(R.id.et_un);
        pw=(EditText)findViewById(R.id.et_pw);
        login=(Button)findViewById(R.id.btn_login);
        error=(TextView)findViewById(R.id.tv_error);
        login.setOnClickListener(new View.OnClickListener()){
            public void onClick(View v){
                ArrayList<NameValuePair>postParameters = new ArrayList<NameValuePair>();
                postParameters.add(BasicNameValuePair("username",un.getText().toString()));
                postParameters.add(BasicNameValuePair("password",pw.getText().toString()));
                String response = null;
                try{
                    response = CustomHttpClient.executeHttpPost()
                }
            }
        }
    }
}
