# Brave-wan-UtilsLibrary


####命名规范
#####包命名规范
* 包名全部采用小写<br/>
* 主包名采用[公司性质].[公司名称].[项目名称]的命名方式,一级包名为com，二级包名为xx（一般为公司或个人域名），三级包名根据应用进行命名，四级包名为功能模块名.<br/>
####代码命名规范<br/>
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