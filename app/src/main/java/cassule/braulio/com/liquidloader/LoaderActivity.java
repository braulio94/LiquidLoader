package cassule.braulio.com.liquidloader;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

public class LoaderActivity extends AppCompatActivity {

    private WebView mWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loader);
        mWebView = findViewById(R.id.web_view);
        mWebView.loadUrl("file:///android_asset/liquid_loader/index.html");
    }
}
