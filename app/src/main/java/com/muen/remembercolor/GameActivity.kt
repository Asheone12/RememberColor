package com.muen.remembercolor

import android.os.CountDownTimer
import android.widget.Toast
import com.muen.remembercolor.databinding.ActivityGameBinding
import com.muen.remembercolor.util.BaseActivity

class GameActivity : BaseActivity<ActivityGameBinding>() {
    private var countDownTimer: CountDownTimer? = null
    override fun onCreateViewBinding(): ActivityGameBinding {
        return ActivityGameBinding.inflate(layoutInflater)
    }

    override fun initView() {
        super.initView()
    }

    override fun initListener() {
        super.initListener()
        viewBinding.timeTv.setOnClickListener {
            viewBinding.timeTv.isClickable = false
            viewBinding.gameView.showFace()
            val count = when (MMKVManage.level) {
                2 -> 5
                4 -> 10
                else -> 20
            }
            showCountDownTimer(count)
        }

        viewBinding.gameView.setOnFinishListener {
            viewBinding.timeTv.isClickable = true
            viewBinding.timeTv.text = "开始"
            Toast.makeText(this@GameActivity, "恭喜你完成游戏", Toast.LENGTH_LONG).show()
        }
    }

    private fun showCountDownTimer(countDown: Int) {
        countDownTimer = object : CountDownTimer((countDown * 1000).toLong(), 1000) {
            override fun onTick(millisUntilFinished: Long) {
                viewBinding.timeTv.text = "" + millisUntilFinished / 1000
            }

            override fun onFinish() {
                viewBinding.timeTv.text = "请找出颜色相同的两个色块"
                viewBinding.gameView.startGame()
            }
        }.start()
    }
}