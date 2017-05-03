package com.laojizhang.demo.learning

class ClosureLearning {

    def printClosure() {

        //闭包定义及调用方式
        def closure1 = {
            println "我是闭包默认参数" + it
        }

        closure1("param1")
        closure1.call("param1")
    }

    def getClosureValue() {

        //闭包隐式包含一个默认参数，it;
        //若存在多参数，需要显示标识参数个数，且和代码块之间用 -> 隔开
        //闭包的返回值；最后一行即为返回值,除非显示返回return，则闭包无返回值
        def closure2 = {
            def sum = 1
            it.each { item ->
                sum *= item
            }
//            "param = " + it     //无显示返回值，闭包返回值是当前传进来的参数
            sum                //返回当前结果
//            return sum         //同上
//            return             //显示标识无返回值
        }

        def total = closure2([1, 2, 3, 4, 5])
        println total
    }

    def passClosure() {
        //闭包可以作为参数传递
        def closure3 = {
            it * 4
        }

        def closure4 = { m, closure ->
            println "m = " + m
            closure.call(closure(m))
        }

        println closure4.call(5, closure3)

        //快捷写法
        //当闭包作为闭包或方法的最后一个参数，可以将闭包从参数圆括号中提取出来接在最后。
        println closure4(5, { it * 4 })
    }

    def passMultiClosure() {
        //对于有多个闭包参数的，只要是在参数声明最后的，均可以按上述方式省略
        def closure6 = { n, c1, c2 ->
            c1(c2(n))
        }
        println closure6(10, { it * 10 }, { it / 5 })
    }

}