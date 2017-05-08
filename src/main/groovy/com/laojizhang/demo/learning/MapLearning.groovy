package com.laojizhang.demo.learning

class MapLearning {

    //map集合
    def country = ['CHINA': "Chinese", 'JAPAN': "Japanese", 'USA': 'American', 'Korea': 23333]

    static void main(String[] args) {
        PrintUtils.printCutLine("mapLearning")
        MapLearning mapLearning = new MapLearning()
        mapLearning.printMap()

        PrintUtils.printCutLine()
        mapLearning.printMapWithEntry()
    }

    def printMap() {
        country.each { key, value ->
            println "key=" + key + "    value=" + value
        }
    }

    def printMapWithEntry() {
        country.each { entry ->
            println "entry key=" + entry.getKey() + "   entry value=" + entry.getValue()
        }
    }
}