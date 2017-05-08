package com.laojizhang.demo.learning

class EachLearning {

    static void main(String[] args) {
        PrintUtils.printCutLine("eachLearning")
        EachLearning eachLearning = new EachLearning()
        eachLearning.printForData()
    }

    def printForData() {
        for (int i = 0; i < 3; i++) {
            println "Java each i=" + i
        }
        PrintUtils.printCutLine()

        //左闭右闭
        for (i in 0..2) {
            println "Groovy each i=" + i
        }
        PrintUtils.printCutLine()

        //从初始值递增值结束值，步长为1
        (-3).upto(3, {
            println "Groovy upto:" + it
        })
        PrintUtils.printCutLine()

        (-3).step(10, 3, {
            println "Groovy step:" + it
        })
        PrintUtils.printCutLine()

        3.times {
            println "Groovy times"
        }
    }
}