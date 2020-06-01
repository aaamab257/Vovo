package com.aaamab.delivery.vovo.ui.loginpage;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.InputType;
import android.text.method.PasswordTransformationMethod;
import android.view.View;

import com.aaamab.delivery.vovo.R;
import com.aaamab.delivery.vovo.databinding.ActivityLoginBinding;
import com.aaamab.delivery.vovo.ui.mainpage.Main;
import com.aaamab.delivery.vovo.ui.registerpage.RegisterActivity;

public class LoginActivity extends AppCompatActivity {
    ActivityLoginBinding binding ;
    MyClickHandlers handlers ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this , R.layout.activity_login);
        handlers = new MyClickHandlers(this);
        binding.setHandlers(handlers);
        binding.edPasslogin.setInputType(InputType.TYPE_TEXT_FLAG_NO_SUGGESTIONS); // No suggestions
        binding.edPasslogin.setTransformationMethod(PasswordTransformationMethod.getInstance());
    }
    public class MyClickHandlers {
        Context context;

        MyClickHandlers(Context context) {
            context = this.context;

        }
        public void Register(View view){
            startActivity(new Intent(LoginActivity.this , RegisterActivity.class));
            finish();
        }
        public void Login(View view){
            startActivity(new Intent(LoginActivity.this , Main.class));
            finish();
        }
    }
}
