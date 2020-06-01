package com.aaamab.delivery.vovo.ui.registerpage;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.InputType;
import android.text.method.PasswordTransformationMethod;
import android.view.View;

import com.aaamab.delivery.vovo.R;
import com.aaamab.delivery.vovo.databinding.ActivityRegisterBinding;
import com.aaamab.delivery.vovo.ui.loginpage.LoginActivity;

public class RegisterActivity extends AppCompatActivity {
    ActivityRegisterBinding binding ;
    MyClickHandlers handlers ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this , R.layout.activity_register);
        handlers = new MyClickHandlers(this );
        binding.setHandlers(handlers);
        binding.edConfirmPass.setInputType(InputType.TYPE_TEXT_FLAG_NO_SUGGESTIONS); // No suggestions
        binding.edConfirmPass.setTransformationMethod(PasswordTransformationMethod.getInstance());
        binding.edPassregister.setInputType(InputType.TYPE_TEXT_FLAG_NO_SUGGESTIONS); // No suggestions
        binding.edPassregister.setTransformationMethod(PasswordTransformationMethod.getInstance());
    }
    public class MyClickHandlers {
        Context context;

        MyClickHandlers(Context context) {
            context = this.context;

        }
        public void Login(View view){
            startActivity(new Intent(RegisterActivity.this , LoginActivity.class));
            finish();
        }
    }
}
