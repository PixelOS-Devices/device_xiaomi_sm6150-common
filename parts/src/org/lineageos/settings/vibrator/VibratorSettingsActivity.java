package org.lineageos.settings.vibrator;

import android.os.Bundle;
import com.android.settingslib.collapsingtoolbar.CollapsingToolbarBaseActivity;

public class VibratorSettingsActivity extends CollapsingToolbarBaseActivity {

    private static final String TAG = "VibratorSettingsActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getFragmentManager().beginTransaction().replace(com.android.settingslib.collapsingtoolbar.R.id.content_frame,
                new VibratorSettings(), TAG)
        .commit();
    }
}
