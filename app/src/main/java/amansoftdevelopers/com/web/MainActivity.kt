package amansoftdevelopers.com.web

import android.annotation.TargetApi
import android.os.Build
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.webkit.URLUtil
import android.webkit.WebView
import android.webkit.WebViewClient
import kotlinx.android.synthetic.main.activity_main.btn
import kotlinx.android.synthetic.main.activity_main.txtUrl
import kotlinx.android.synthetic.main.activity_main.wv

class MainActivity : AppCompatActivity() {
    private var myWebView: WebView? = null

    @TargetApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        myWebView = findViewById(R.id.wv)
        myWebView!!.webViewClient = object : WebViewClient() {

        }

        btn.setOnClickListener({
            wv.loadUrl(
                    if (URLUtil.isValidUrl(txtUrl.text.toString()))
                        txtUrl.text.toString()
                    else
                        "http://" + txtUrl.text.toString())

        })
    }
}
