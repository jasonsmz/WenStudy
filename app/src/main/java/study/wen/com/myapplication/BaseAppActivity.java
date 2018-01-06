package study.wen.com.myapplication;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import java.sql.Struct;

/**
 * Create By User
 * Time Is 2018/1/5
 */

public class BaseAppActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);


    }


    @Override
    public void onClick(View view) {

    }

    /**
     * 显示吐司
     * @param t
     */
    public void showToast(String t){
            Toast.makeText(BaseAppActivity.this, t, Toast.LENGTH_SHORT).show();
    }

    /**
     * 显示底部弹出信息
     * @param v
     * @param s
     */
    public void showSnackBarNoAction(View v, String s){
        Snackbar.make(v,s,Snackbar.LENGTH_SHORT).show();
    }


}
