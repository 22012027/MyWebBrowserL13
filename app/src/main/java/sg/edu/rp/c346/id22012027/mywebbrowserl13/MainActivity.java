package sg.edu.rp.c346.id22012027.mywebbrowserl13;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button buttonLoadURL;
    WebView webViewMyPage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonLoadURL= findViewById(R.id.buttonLoadURL);
        webViewMyPage= findViewById(R.id.webViewMyPage);
        webViewMyPage.setWebViewClient(new WebViewClient());

        buttonLoadURL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.rp.edu.sg/soi/home";
                webViewMyPage.loadUrl(url);
            }
        });
    }
}