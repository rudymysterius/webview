package com.rudy.webview;

import android.app.*;
import android.os.*;
import android.view.*;
import android.widget.*;
import android.webkit.*;

public class MainActivity extends Activity
{
    /** Called when the activity is first created. */
	WebView wb;
    @Override
    public void onCreate(Bundle savedInstanceState)
	{
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		wb=(WebView) findViewById(R.id.mainWebView1);
		wb.getSettings().setJavaScriptEnabled(true);
		wb.setWebChromeClient(new WebChromeClient());
		wb.setWebViewClient(new WebViewClient());
		wb.loadUrl("http://google.com");
    }
}
