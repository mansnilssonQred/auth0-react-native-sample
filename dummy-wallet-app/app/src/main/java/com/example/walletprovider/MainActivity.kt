package com.example.walletprovider

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    companion object {
        const val SOME_ACTIVITY_IDENTIFIER = 4321;
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onAppToAppVerificationBtnClicked(v: View) {
        intent = Intent("com.auth0samples.a2a");
        intent.setPackage("com.auth0samples")
        intent.flags = Intent.FLAG_INCLUDE_STOPPED_PACKAGES;
        intent.putExtra(Intent.EXTRA_TEXT, "my text");
        startActivityForResult(intent, SOME_ACTIVITY_IDENTIFIER);
    }
}
