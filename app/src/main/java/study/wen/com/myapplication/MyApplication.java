package study.wen.com.myapplication;

import android.app.Application;
import android.util.Log;

import com.taobao.sophix.SophixApplication;
import com.taobao.sophix.SophixManager;
import com.taobao.sophix.listener.PatchLoadStatusListener;

/**
 * Create By Jason
 */

public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        initSophix();
    }

    private void initSophix(){
        String appVersionName;
        try {
            appVersionName=this.getPackageManager().getPackageInfo(this.getPackageName(),0).versionName;
        }catch (Exception e){
            appVersionName="1.0.0";
        }
        SophixManager.getInstance().setContext(this)
                .setAppVersion(appVersionName)
                .setEnableDebug(true)
                .setPatchLoadStatusStub(new PatchLoadStatusListener() {
                    @Override
                    public void onLoad(int mode, int code, String info, int handlePatchVersion) {
                        Log.e("MyApplication","Mode="+mode+";Code="+code+";Info="+info+";Version"+handlePatchVersion);
                    }
                }).initialize();
                SophixManager.getInstance().queryAndLoadNewPatch();
    }




}
