package com.paymaya.reader

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val privateKeyReader = PrivateKeyReader()
        val publicKeyReader = PublicKeyReader()

        Log.d("path", this.filesDir.absolutePath)
        Log.d("privateKey", privateKeyReader.getPrivateKey(this.filesDir.absolutePath))
        Log.d("publicKey", publicKeyReader.getPublicKey(this.filesDir.absolutePath))
    }
}
