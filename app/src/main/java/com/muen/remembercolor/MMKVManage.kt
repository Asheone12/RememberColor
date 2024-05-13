package com.muen.remembercolor

import com.tencent.mmkv.MMKV

object MMKVManage {
    private val mmkv = MMKV.defaultMMKV()

    //缓存变量
    private const val KEY_LEVEL = "level"

    /**
     * 游戏难度
     */
    var level: Int
        set(value) {
            mmkv.encode(KEY_LEVEL, value)
        }
        get() = mmkv.decodeInt(KEY_LEVEL,4)

}