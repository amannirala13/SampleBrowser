package amansoftdevelopers.com.web

import amansoftdevelopers.com.web.R.id.txtUrl
import android.annotation.TargetApi
import android.os.Build
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.webkit.URLUtil
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    @TargetApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        wv.webViewClient
        btn.setOnClickListener({
            wv.loadUrl(
                    if(URLUtil.isValidUrl(txtUrl.text.toString()))
            txtUrl.text.toString()
            else
                "http://"+txtUrl.text.toString())

        })
    }
}
