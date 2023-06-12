package se.voxelmanip.base64;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebSettings;
import android.view.Window;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		requestWindowFeature(Window.FEATURE_NO_TITLE);

		WebView wv = new WebView(this);
		setContentView(wv);

		WebSettings ws = wv.getSettings();
		ws.setJavaScriptEnabled(true);
		ws.setCacheMode(WebSettings.LOAD_NO_CACHE);

		wv.loadUrl("file:///android_asset/index.html");
	}
}
