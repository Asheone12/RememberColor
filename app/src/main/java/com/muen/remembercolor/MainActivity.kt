package com.muen.remembercolor

import android.content.Intent
import com.muen.remembercolor.databinding.ActivityMainBinding
import com.muen.remembercolor.util.BaseActivity

class MainActivity : BaseActivity<ActivityMainBinding>() {
    override fun onCreateViewBinding(): ActivityMainBinding {
        return ActivityMainBinding.inflate(layoutInflater)
    }

    override fun initListener() {
        super.initListener()
        viewBinding.levelSimple.setOnClickListener {
            MMKVManage.level = 2
            val intent = Intent(this,GameActivity::class.java)
            startActivity(intent)
        }

        viewBinding.levelNormal.setOnClickListener {
            MMKVManage.level = 4
            val intent = Intent(this,GameActivity::class.java)
            startActivity(intent)
        }

        viewBinding.levelHard.setOnClickListener {
            MMKVManage.level = 6
            val intent = Intent(this,GameActivity::class.java)
            startActivity(intent)
        }

    }
}