package amansoftdevelopers.com.web

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.webkit.URLUtil
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn.setOnClickListener({
            wv.loadUrl(
                    if(URLUtil.isValidUrl(txtUrl.text.toString()))
            txtUrl.text.toString()
            else
                "http://"+txtUrl.text.toString())
        })
    }
}
