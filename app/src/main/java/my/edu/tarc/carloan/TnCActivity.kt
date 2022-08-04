package my.edu.tarc.carloan

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class TnCActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tn_cactivity)
        val webViewTnC: WebView = findViewById(R.id.webViewTnC)

        webViewTnC.loadUrl("https://seekt.000webhostapp.com/")
    }
}