package vo.cvcompany.com.myapplication;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.OnTextChanged;

public class MainActivity extends AppCompatActivity {
    @BindView(R.id.etName)
    EditText etName;
    @BindView(R.id.etEmail)
    EditText etEmail;
    @BindView(R.id.etPhone)
    EditText etPhone;
    @BindView(R.id.txtNotify)
    TextView txtNotify;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btnSubmit)
    public void btnSubmit(){
        String name = etName.getText().toString().trim();
        String email  = etEmail.getText().toString().trim();
        String phone = etPhone.getText().toString().trim();
        if(name.length()==0 ){
            etName.setBackgroundColor(Color.RED);
        }
        if( email.length()== 0){

                etEmail.setBackgroundColor(Color.RED);
        }

        if(phone.length()==0){
            etPhone.setBackgroundColor(Color.RED);
        }

        txtNotify.setText(""+getResources().getString(R.string.notify)+" "+name+" "+email+" "+phone);

    }

    @OnTextChanged(R.id.etName)
    public void etName(){
        etName.setBackgroundColor(Color.TRANSPARENT);
    }

    @OnTextChanged(R.id.etEmail)
    public void etEmail(){
        etEmail.setBackgroundColor(Color.TRANSPARENT);
    }

    @OnTextChanged(R.id.etPhone)
    public void etPhone(){
        etPhone.setBackgroundColor(Color.TRANSPARENT);
    }


}
