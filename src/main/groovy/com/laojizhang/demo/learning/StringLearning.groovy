package com.laojizhang.demo.learning

class StringLearning {

    static void main(String[] args) {
        PrintUtils.printCutLine("stringLearning")
        StringLearning stringLearning = new StringLearning()
        stringLearning.runCMD()

        PrintUtils.printCutLine()
        stringLearning.checkNullString("2222223")
        stringLearning.checkNullString()

        PrintUtils.printCutLine()
        stringLearning.multiValue()
    }

    def runCMD() {
        def order = "groovy -v"
        //Java 执行系统命令
        Process process = Runtime.getRuntime().exec(order)
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(process.getInputStream()))
        def line
        while ((line = bufferedReader.readLine()) != null) {
            println line
        }

        //Groovy 执行系统命令
        println order.execute().text
    }

    def checkNullString(String data = "laojizhang") {
        //Java方式非空判断
        if (data != null) {
            println data.reverse()
        }

        //Groovy方式非空判断
        println data?.reverse()
    }

    def multiValue() {
        //使用多赋值
        def (city, nickName) = "北京-老机长".split("-")
        println "${city}  ${nickName}"

        def (first, second, third) = ["first", "second", "third", "fourth"]
        println first + " " + second + "  " + third

        def (one, two, three) = ["one", "two"]
        println one + " " + two + "  " + three

    }
}