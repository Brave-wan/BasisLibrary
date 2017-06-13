# BasisLibrary


#### 命名规范<br/>
##### 包命名规范<br/>
* 包名全部采用小写<br/>
* 主包名采用[公司性质].[公司名称].[项目名称]的命名方式,一级包名为com，二级包名为xx（一般为公司或个人域名），三级包名根据应用进行命名，四级包名为功能模块名.<br/>
#### 代码命名规范<br/>
命名规则有很多高大上的名词，比如大驼峰，小驼峰，匈牙利命名法。其实最简单的就是按照谷歌命名学习。</br>
* 常量、枚举等均采用大写形式，用下划线区分各单词。使用static final</br>
  例如：private static final String TAG_FOR_ACTIVITY = "XXXX";<br/>
* 类名、接口名、枚举名。第一个和后面的单词都要第一个字母大写<br/>
  例如：MainActivity,PersonalLoginActivity<br/>
* 资源文件命名<br/>
  例如：activity_main.xml，ic_launcher.png</br>
  注意图片文件命名只能用小写字母、数字，否则会导致R文件无法编译出来。也是比较费心的。<br/>
* 继承自安卓组件的类，一般采用父类名作为后缀<br/>
  例如：class LoginActivity extends Activity{}<br/>
* 自定义异常必须以Exception结尾<br/>
* 全局变量添加所有者前缀：实例成员变量前缀m（表示member），类静态变量前缀s（表示static）<br/>
  例如：protected Subscription mSubscription;<br/>
* 控件变量添加组件前缀，顺序在所有者前缀之后，控件缩写button->btn,textview ->txw,listview->lst等<br/>
  例如：全局名称mBtnNext局部名称btnNext<br/>
* 构造方法采用递增方式（参数多的写在后面），参数少的调用参数多的构造函数。这样也减少初始化代码。<br/>
  比如开源库PagerSlidingTabStrip<br/>
  
 #### 编程规范
 
* 　源文件编码格式为 UTF-8。<br/>
*  java代码中不出现中文，最多注释中可以出现中文<br/>
* 　服务端可以实现的，就不要放在客户端<br/>
* 　引用第三方库要慎重，避免应用大容量的第三方库，导致客户端包非常大<br/>
* 　处理应用全局异常和错误，将错误以邮件的形式发送给服务端<br/>
*  图片的.9处理<br/>
*  使用静态变量方式实现界面间共享要慎重<br/>
*  单元测试（逻辑测试、界面测试）<br/>
*  不要重用父类的handler，对应一个类的handler也不应该让其子类用到，否则会导致message.what冲突<br/>
*  activity中在一个View.OnClickListener中处理所有的逻辑<br/>
*  strings.xml中使用%1$s实现字符串的通配<br/>
*  数据一定要效验，例如字符型转数字型，如果转换失败一定要有缺省值；服务端响应数据是否有效判断<br/>
*  对于未完成的方法，使用TODO加以标记<br/>
*  若功能已完成，但存在效率等潜在问题时，使用XXX加以标记<br/>
*  若代码存在严重问题或仅用于调试，使用FIXME加以标记<br/>
*  values目录下文件名称较固定，不得随意更改<br/>

#### 代码提交规范

* 工作目录要及时更新，不要和服务器有太大的差别<br/>
* 提交代码时，如果出现冲突，必须仔细分析解决，不可以强行提交<br/>
* 提交代码之前先在本地进行测试，确保项目能编译通过，且能够正常运行，不可盲目提交<br/>
* 必须保证服务器上的版本是正确的，项目有错误时，不要进行提交<br/>
* 提交之前先更新<br/>
* 提交时注意不要提交本地自动生成的文件，比如我们Android Studio项目中的 idea,build文件夹是不需要提交的。<br/>
* 不要提交自己不明白的代码<br/>
* 提前协调好项目组成员的工作计划，减少冲突<br/>
* 对提交的信息采用明晰的标注（写注释）<br/>

# BasisLibrary 包结构说明

#### base 基类 <br/>
* BaseActivity,BaseFragment.封装Activity和Fragment的父类，抽象出公共的方法，达到模板化方便起到规范代码的目的<br/>
* 封装一些功用的方法:如全局判断网络链接状态<br/>
#### pulltorefresh 上拉加载下拉刷新
* 封装　ListView,ScrollView,WebView等控件的上拉刷新下来加载动画及功能
#### utils 常用工具包
* 封装一些基础工具类．如AppUtils,BarUtils,CameraUtils,CleanUtils,ClipboardUtils,CloseUtils<br/>
 ConstUtils,ConvertUtils,CopyFileUtils,CountDownTimerUtils等等可以直接调用．具体请看源码<br/>
#### video 音视频播放包
* 基于ffmpeg开发并开源的轻量级视频播放器，支持播放本地网络视频，也支持流媒体播放。<br/>
在xml使用<br/>
```Java
<?xml version="1.0" encoding="utf-8"?>
<RelativeLayout
    xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".MainActivity">

    <com.hx.ijkplayer_demo.widget.media.IjkVideoView
        android:id="@+id/video_view"
        android:layout_width="match_parent"
        android:layout_height="match_parent"/>
</RelativeLayout>
```
在java中具体使用如下使用：
```Java
public class MainActivity extends AppCompatActivity {

    private IjkVideoView videoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        videoView = (IjkVideoView) findViewById(R.id.video_view);
        videoView.setAspectRatio(IRenderView.AR_ASPECT_FIT_PARENT);
        videoView.setVideoURI(Uri.parse("http://zv.3gv.ifeng.com/live/zhongwen800k.m3u8"));
        videoView.start();
    }
}
```

#### widget　自定义控件包
* 包含SwitchView,MaterialDialog,BadgeView,NavigationView等等．