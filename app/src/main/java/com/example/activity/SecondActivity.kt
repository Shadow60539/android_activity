package com.example.activity

import android.content.Context
import android.content.Intent
import android.view.View

class SecondActivity : BaseActivity(R.layout.activity_second, "SecondActivity") {
    override val context: Context
        get() = this

    override fun navigateToThirdActivity(view: View) {
        super.navigateToThirdActivity(view)
    }

    override fun navigateToMainActivity(view: View) {
        super.navigateToMainActivity(view)
    }

}