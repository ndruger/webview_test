package com.example.androidneko;

import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends Activity {

	private final int WC = ViewGroup.LayoutParams.WRAP_CONTENT; 
	
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
		Log.d("neko", "test2");

		WebView webview = new WebView(this);
        webview.setWebViewClient(new WebViewClient() {
        	public boolean shouldOverrideUrlLoading(WebView view, String url) {
        		view.loadUrl("javascript:console.log('neko8')");
        		return true;
        	}
        });
        webview.getSettings().setJavaScriptEnabled(true);

        webview.loadUrl("http://192.168.0.5/~snow/index.html?neko2");
        
        setContentView(webview, new LayoutParams(WC, WC));
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
