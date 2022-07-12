package com.example.activity

import android.content.Context
import android.content.Intent
import android.view.View

class MainActivity : BaseActivity(R.layout.activity_main, "MainActivity") {
    override val context: Context
        get() = this

    override fun navigateToSecondActivity(view: View) {
        super.navigateToSecondActivity(view)
    }

    override fun navigateToThirdActivity(view: View) {
        super.navigateToThirdActivity(view)
    }

}