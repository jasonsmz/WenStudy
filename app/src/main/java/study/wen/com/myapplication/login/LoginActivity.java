package study.wen.com.myapplication.login;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.support.annotation.NonNull;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.app.LoaderManager.LoaderCallbacks;

import android.content.CursorLoader;
import android.content.Loader;
import android.database.Cursor;
import android.net.Uri;
import android.os.AsyncTask;

import android.os.Build;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.inputmethod.EditorInfo;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import study.wen.com.myapplication.BaseAppActivity;
import study.wen.com.myapplication.R;

import static android.Manifest.permission.READ_CONTACTS;

/**
 *
 */
public class LoginActivity extends BaseAppActivity {

    @BindView(R.id.title)
    TextView titleTV;
    @BindView(R.id.phone)
    EditText phoneET;
    @BindView(R.id.password)
    EditText passWordET;
    @BindView(R.id.login_btn)
    Button loginBtn;
    @BindView(R.id.forget_psw)
    TextView forgetPswTV;
    @BindView(R.id.get_invite)
    TextView getInviteTV;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);



    }


    @OnClick({R.id.login_btn ,R.id.forget_psw , R.id.get_invite})
    @Override
    public void onClick(View view) {
        super.onClick(view);
        switch (view.getId()){
            case R.id.login_btn:
                showToast("登录");
                break;
            case R.id.forget_psw:
                showToast("忘记密码");
                break;
            case R.id.get_invite:
                showToast("获取邀请码");
                break;

            default:
                break;
        }


    }

    public static void StartLoginActivity(Context context){
        Intent intent=new Intent(context,LoginActivity.class);
        context.startActivity(intent);
    }

}

