package com.laojizhang.demo.learning

class BaseLearning {

    static void main(String[] args) {
        PrintUtils.printCutLine("baseLearning")
        BaseLearning baseLearning = new BaseLearning()
        baseLearning.base()
    }

    def base() {
        //普通标识符
        //语法与C语言类似，只能以字母、美元符号$、下划线开头等；不能以数字开头
        def name = "name1"
        def $name = "name2"
        def _name = "name3"

        //单引号字符串
        //双引号字符串
        //三重引号字符串

        //简单定义 后面会有更详细说明
        //引用标识符
        def map = [:]
        map.put('flag', 'flag')
        map.'flagA' = 'flagA'
        map."flagB" = "flagB"
        map['flagC'] = 'flagC'

        //{}内可放置定义中包含有$符号的变量
        map["$name"] = "$name"
//        map["$name_type"] = "$name_type"
        map."${name}_type1" = "flag_${name}_1"
        map."${$name}_type2" = "flag_${$name}_2"

        println map

        //简单定义 后面会有更详细说明
        def list = []
        list.add(1)
        list.add('a')
        list.add("b")
        list.add("$_name")

        println list

        //Groovy 三重单引号定义多行文本
        def mutiLines = '''
          第一行输出
              第二行输出
                  第三行输出
                      第四行输出
                  第五行输出
              第六行输出
              '''
        println mutiLines

        def mutiLines2 = """
          第一行输出2
              第二行输出2
                  第三行输出2
                      第四行输出2
                  第五行输出2
              第六行输出2
              """

        println mutiLines2
    }
}