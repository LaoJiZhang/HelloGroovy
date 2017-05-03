package com.laojizhang.demo.learning

class ListLearning {
    def lst = ["a", "b", "c", "d", "e", "f", "g"]

    def printList() {
        //定义
        println lst
        //输出第index1,index2下标的list
        println lst[2, 5]
        //输出从index1 ~ index2下标的list
        println lst[2..5]
        println lst[-2, -5]
        println lst[-2..-5]
    }

    def iteratorListWithIndex() {
        //list遍历
        lst.eachWithIndex { value, index ->
            println "index:" + index + "   value:" + value
        }
    }

    def findList() {
        //lst find 查找一个; findAll 查找集合中符合闭包中条件的所有值 的新集合
        println "find 'c' :" + lst.find({
            it.equals("c")
        })

        println "findAll > 'c' :" + lst.findAll {
            it > "c"
        }
    }

    def makeNewList() {
        //针对原集合进行闭包后处理 返回一个新集合
        println lst.collect {
            it + "5"
        }
    }
}