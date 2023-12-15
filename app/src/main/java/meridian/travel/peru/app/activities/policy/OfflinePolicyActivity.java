package meridian.travel.peru.app.activities.policy;

import static meridian.travel.peru.app.utils.Constants.KEY_PRIVACY_AGREE;
import static meridian.travel.peru.app.utils.Constants.NAME_PREF;
import static meridian.travel.peru.app.utils.Constants.PRIVACY_POLICY_MAIN_TXT;
import static meridian.travel.peru.app.utils.Constants.TEST_SEND_LINK;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import meridian.travel.peru.app.MainActivity;
import meridian.travel.peru.app.R;

public class OfflinePolicyActivity extends AppCompatActivity {
    private TextView txt_v_main_policy, txt_v_continue_policy;
    private Switch sw_agree_policy;
    private SharedPreferences.Editor editor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_offline_policy);
        initAllComponents();
        sw_agree_policy.setOnCheckedChangeListener((textView, isChecked) -> {
            if (isChecked) {
                txt_v_continue_policy.setEnabled(true);
                txt_v_continue_policy.setBackgroundResource(R.drawable.anim_txt_press_enable);
            } else {
                txt_v_continue_policy.setEnabled(false);
                txt_v_continue_policy.setBackgroundResource(R.drawable.anim_click_text);
            }
        });
        txt_v_continue_policy.setOnClickListener(v -> {
            if (sw_agree_policy.isChecked()) {
                addPolicy();
                Toast.makeText(OfflinePolicyActivity.this, R.string.agree_license_txt, Toast.LENGTH_LONG).show();
                Intent goMain = new Intent(this, MainActivity.class);
                startActivity(goMain);
            } else {
                Toast.makeText(OfflinePolicyActivity.this, R.string.explain_policy_txt, Toast.LENGTH_LONG).show();
            }
        });
    }

    private void initAllComponents() {
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        SharedPreferences prefs = getSharedPreferences(NAME_PREF, Context.MODE_PRIVATE);
        editor = prefs.edit();
        sw_agree_policy = findViewById(R.id.sw_agree_policy);
        txt_v_continue_policy = findViewById(R.id.txt_v_continue_policy);
        txt_v_main_policy = findViewById(R.id.txt_v_main_policy);
        txt_v_main_policy.setText(PRIVACY_POLICY_MAIN_TXT);
    }

    private void addPolicy() {
        editor.putBoolean(KEY_PRIVACY_AGREE, true);
        editor.commit();
    }

    @Override
    public void onBackPressed() {
        Toast.makeText(this, R.string.explain_policy_txt, Toast.LENGTH_LONG).show();
    }
}