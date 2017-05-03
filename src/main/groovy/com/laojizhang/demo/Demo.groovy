package com.laojizhang.demo

import com.laojizhang.demo.learning.*

class Demo {

    static void main(String[] args) {
        println("laojizhang")
        testBaseLearning()
        testStringLearning()
        testClosureLearning()
        testEachLearning()
        testClassLearning()
        testListLearning()
        testMapLearning()
        testFileLearning()
        testXmlLearning()
        testJsonLearning()
    }

    static void testBaseLearning() {
        PrintUtils.printCutLine("baseLearning")
        BaseLearning baseLearning = new BaseLearning()
        baseLearning.base()
    }

    static void testClosureLearning() {
        PrintUtils.printCutLine("closureLearning")
        ClosureLearning closureLearning = new ClosureLearning()
        closureLearning.printClosure()
        PrintUtils.printCutLine()
        closureLearning.getClosureValue()
        PrintUtils.printCutLine()
        closureLearning.passClosure()
        PrintUtils.printCutLine()
        closureLearning.passMultiClosure()
    }

    static void testEachLearning() {
        PrintUtils.printCutLine("eachLearning")
        EachLearning eachLearning = new EachLearning()
        eachLearning.printForData()
    }

    static void testClassLearning() {
        PrintUtils.printCutLine("classLearning")
        ClassLearning person = new ClassLearning(name: "老机长", age: 18)

        println person.toString()
    }

    static void testListLearning() {
        PrintUtils.printCutLine("listLearning")
        ListLearning learning = new ListLearning()
        learning.printList()
        PrintUtils.printCutLine()

        learning.iteratorListWithIndex()
        PrintUtils.printCutLine()

        learning.findList()
        PrintUtils.printCutLine()

        learning.makeNewList()

    }

    static void testMapLearning() {
        PrintUtils.printCutLine("mapLearning")
        MapLearning mapLearning = new MapLearning()
        mapLearning.printMap()
        PrintUtils.printCutLine()
        mapLearning.printMapWithEntry()
    }

    static void testStringLearning() {
        PrintUtils.printCutLine("stringLearning")
        StringLearning stringLearning = new StringLearning()
        stringLearning.runCMD()
        PrintUtils.printCutLine()
        stringLearning.checkNullString("2222223")
        stringLearning.checkNullString()
        PrintUtils.printCutLine()
        stringLearning.multiValue()
    }

    static void testFileLearning() {
        PrintUtils.printCutLine("FileLearning")
        com.laojizhang.demo.FileLearning fileLearning = new com.laojizhang.demo.FileLearning()
        fileLearning.printFileContent()
        PrintUtils.printCutLine()
        fileLearning.printEachFile()
        PrintUtils.printCutLine()
        fileLearning.printEachFileMatcher()
    }

    static void testXmlLearning() {
        PrintUtils.printCutLine("XmlLearning")
        def filePath = new File("").getAbsolutePath() + File.separator + "src" + File.separator + "main" + File.separator + "AndroidManifest.xml";
        XmlLearning xmlLearning = new XmlLearning()
        PrintUtils.printCutLine()
        xmlLearning.xmlSlurper(filePath)
        PrintUtils.printCutLine()
        xmlLearning.xmlParser(filePath)
    }

    static void testJsonLearning() {
        PrintUtils.printCutLine("JsonLearning")
        JsonLearning jsonLearning = new JsonLearning()
        jsonLearning.jsonSlurperTest()
        PrintUtils.printCutLine()
        jsonLearning.jsonOutputTest()
    }
}