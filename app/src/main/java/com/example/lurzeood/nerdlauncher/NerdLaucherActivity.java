package com.example.lurzeood.nerdlauncher;

import android.support.v4.app.Fragment;

public class NerdLaucherActivity extends SinglefragmentActivity {


    @Override
    protected Fragment createFragment() {
        return NerdLauncherFragment.newInstance();
    }
}
