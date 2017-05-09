package com.laojizhang.demo.learning

class XmlLearning {

    static void main(String[] args) {
        PrintUtils.printCutLine("XmlLearning")
        def filePath = new File(".").getAbsolutePath() + File.separator + "src" + File.separator + "main" + File.separator + "AndroidManifest.xml";
        XmlLearning xmlLearning = new XmlLearning()
        xmlLearning.xmlSlurper(filePath)

        PrintUtils.printCutLine()
        xmlLearning.xmlParser(filePath)
    }

    static void xmlSlurper(def filePath) {
        def manifest = new XmlSlurper().parse(new File(filePath))
        println "package = " + manifest.'@package'
        println "versionCode = " + manifest.'@android:versionCode'
        println "versionName = " + manifest.'@android:versionName'
        deepSlurperLoop(manifest)
    }

    static void deepSlurperLoop(def node) {
        node.childNodes().each {
            println "name:" + it.name() + "       attributes = " + it.attributes()
            if (it.children() != null) {
                deepSlurperLoop(it)
            }
        }
    }

    static void xmlParser(def filePath) {
        def rootNode = new XmlParser().parse(filePath)
        println rootNode.name() + "  " + rootNode.attributes()
        deepParserLoop(rootNode)
    }

    static void deepParserLoop(def node) {
        node.children().each {
            println "name:" + it.name() + "      attributes = " + it.attributes() + (it.value() != null ? it.value() : "")
            if (it.value()) {
                deepParserLoop(it)
            }
        }
    }

}
