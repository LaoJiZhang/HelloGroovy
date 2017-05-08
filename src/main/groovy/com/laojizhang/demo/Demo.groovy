package com.laojizhang.demo

import com.laojizhang.demo.learning.*

class Demo {

//    BaseLearning 字符串定义 单引号 双引号 三重单引号
//    StringLearning 运行CMD指令 非空检查 多赋值
//    ClassLearning 类定义
//
//    ListLearning List定义 使用及简单api方法
//    MapLearning  Map定义  使用及简单api方法
//    EachLearning List/Map 遍历
//
//    ClosureLearning 闭包相关使用
//
//    FileLearning 文件操作
//    XmlLearning Xml操作
//    JsonLearning Json相关操作

    static void main(String[] args) {
        println("laojizhang")
        BaseLearning.main(args)
        StringLearning.main(args)

        ClassLearning.main(args)

        ListLearning.main(args)
        MapLearning.main(args)
        EachLearning.main(args)

        ClosureLearning.main(args)

        FileLearning.main(args)
        XmlLearning.main(args)
        JsonLearning.main(args)
    }
}