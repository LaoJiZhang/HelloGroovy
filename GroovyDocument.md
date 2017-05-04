# Groovy初稿
* author: 老机长
* time: 2017/04/27
* update: 2017/05/03
* version: 1.2.0

## 什么是Groovy
* Groovy是Java平台上设计的面向对象编程语言
* Groovy的语法与Java非常相似，以至于多数的Java代码也是正确的Groovy代码
* Groovy代码动态地被编译器转换成Java字节码。由于其运行在JVM上的特性，Groovy可以使用其他Java语言编写的库
* Groovy拥有类似Python、Ruby和Smalltalk中的一些特性，可以作为Java平台的脚本语言使用

## 为什么要用Groovy
* 答案在于 Gradle 的运行环境. 虽然 Gradle 以一个通用构建工具为核心, 但是它的重点是Java项目. 在这样的项目中, 显然团队每个成员都对 Java 非常熟悉. 我们认为构建应尽可能对所有团队成员都是透明的, 所以选择了 Groovy.

* 你可能会说，为什么不直接使用 Java 作为构建脚本的语言. 我们认为这是一个很有用的问题. 对于你的团队, 它要有最高的透明度和最低的学习曲线, 也就是说容易掌握. 但由于 Java 的限制, 这样的构建语言不会那么完美和强大. 而像 Python，Groovy 或 Ruby 语言用来作为构建语言会更好. 我们选择了 Groovy 是因为它给 Java 开发人员提供了迄今为止最大的透明度. 其基本的符号和类型与 Java 是一样的，其封装结构和许多其他的地方也是如此. Groovy 在这基础上提供了更多的功能, 而且与 java 有共同的基础.

## 安装Groovy
###Mac/Linux方式
####1.Homebrew 安装方式
>brew install groovy

####2.MacPorts 安装方式
>sudo port install groovy

###Windows方式
>官方下载地址：[Groovy 下载地址](http://groovy-lang.org/download.html)，点击下载解压至磁盘即可
#####<font color="red">note:预先配置环境变量</font>

## 创建Groovy工程
###1.执行命令 
>gradle init --type java-library

<br/>
在build.gradle文件中
###2.添加 Groovy 插件 
>apply plugin: 'groovy'

###3.在dependencies task内部添加依赖配置，如下
>compile 'org.codehaus.groovy:groovy-all:xxx'
 
依赖版本请参考：<a href="http://repo1.maven.org/maven2/org/codehaus/groovy/groovy-all/">Groovy 版本依赖</a>


## Groovy相关语法
### 默认导入包集合：
* java相关包：
  * java.lang
  * java.util
  * java.io
  * java.net
  * java.math.BigDecimal
  * java.math.BigInteger 等
* groovy相关包：
  * groovy.lang
  * groovy.util 等


### Java的JDK VS Groovy的GDK

* 普通标识符
	语法与C语言类似，只能以字母、美元符号$、下划线开头等；不能以数字开头
	* def name 
	* def $name
	* def _name
	
* GString 
	* Java 单引号定义char类型变量，双引号定义字符串
	* GString 支持单引号定义字符串，不支持占位符操作;
	* GString 支持双引号支持占位符,$A.B属性调用 ,${A+B}替代字符串或者表达式使用;
	* GString 支持三重单引号可定义多行文字</li>
	
* 字符串
	* 单引号字符串
	* 双引号字符串
	* 三重单引号字符串
	* 有没有三重双引号字符串呢 ？

* 引用标识符
	* map 
	* list

>参考 ：BaseLearning.groovy


* Groovy遍历初探
>参考 EachLearning.groovy

* Process 操作

>参考 StringLearning.groovy.runCMD()

* 安全操作符,三目运算符(双目运算符)
    * person ?. name
    * preson ?: "defaultName"
>参考 StringLearning.groovy.checkNullString()

* 灵活初始化
>参考 Demo.groovy.testClassLearning()

* 多赋值()
>参考 StringLearning.groovy.multiValue()

* 布尔型求值

* list 及 map集合
>参考 ListLearning.groovy

>参考 MapLearning.groovy

>参考 EachLearning.groovy

* 闭包
```
是groovy.lang.Closure 的实例，像一段代码块或者方法指针

如何定义一个闭包：

{ [closureParameters -> ] statements }

//[closureparameters -> ]是可选的逗号分隔的参数列表，参数类似于方法的参数列表，这些参数可以是类型化或非类型化的。

Example:

{i++}

{-> println it}

{a -> a++}

{String str,int i -> println str + i}


闭包的调用：
closure(params)

closure.call(params)
```

>参考 ：ClosureLearning.groovy

* File文件操作
>参考 FileLearning.groovy

* Json
>参考 JsonLearning.groovy

* XML
>参考 XmlLearning.groovy


## 实战分析
* [美团V2方式打包实践](https://github.com/guomaojian1992/MeiTuanMultiChannelDemo)
* [抓取豌豆荚Apk反编译](https://github.com/guomaojian1992/DecompileApkGroovy)


## 资料来源
* [Groovy - 维基百科](https://zh.wikipedia.org/wiki/Groovy)
* [为什么用 Groovy ？](https://dongchuan.gitbooks.io/gradle-user-guide-/overview/why_groovy.html)
* [The Apache Groovy programming language - Download](http://groovy-lang.org/download.html)
* [Apache Groovy build tools Versions](http://repo1.maven.org/maven2/org/codehaus/groovy/)
* [新一代开源Android渠道包生成工具Walle](http://tech.meituan.com/android-apk-v2-signature-scheme.html)
* [walle-cli](https://github.com/Meituan-Dianping/walle/blob/master/walle-cli/README.md)