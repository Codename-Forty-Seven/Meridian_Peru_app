package meridian.travel.peru.app.activities.policy;

import static android.content.ContentValues.TAG;
import static meridian.travel.peru.app.utils.Constants.URL_FOR_REQUEST;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.appcompat.app.AppCompatActivity;

import meridian.travel.peru.app.MainActivity;
import meridian.travel.peru.app.R;


public class OnlinePolicyActivity extends AppCompatActivity {
    private WebView web_view_online_policy;


    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_online_policy);
        web_view_online_policy = findViewById(R.id.web_view_online_policy);
        web_view_online_policy.getSettings().setJavaScriptEnabled(true);
        web_view_online_policy.setWebViewClient(new MyWebViewClient());
        web_view_online_policy.setWebChromeClient(new WebChromeClient());
        web_view_online_policy.loadUrl(URL_FOR_REQUEST);
    }

    private class MyWebViewClient extends WebViewClient {
        @Override
        public void onPageFinished(WebView view, String url) {
            super.onPageFinished(view, url);

            if (url != null && !url.endsWith("tcvTPW")) {
                Intent goOfflinePrivacy = new Intent(OnlinePolicyActivity.this, OfflinePolicyActivity.class);
                startActivity(goOfflinePrivacy);
            }
        }
    }

    @Override
    public void onBackPressed() {
        finishAffinity();
    }
}