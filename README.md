# Brave-wan-UtilsLibrary


更新日志

﻿V2.0（2017/6/8 ： 14：20）

1、更新上拉刷新下拉加载框架（pulltorefresh）
2、更新基础常用工具类
3、更新ijkplayer是bilibili的一个开源的视频播放器框架，可以直接引用


如要使用只需要在项目中添加如下代码即可：
allprojects {
    repositories {
        jcenter()
        maven { url 'https://jitpack.io' }
    }
}

  compile 'com.github.Brave-wan:Brave-wan-UtilsLibrary:2.0'
