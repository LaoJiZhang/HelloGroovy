package com.laojizhang.demo

import groovy.io.FileType

class FileLearning {

    File mFile = new File(new File("").getAbsolutePath())
    File mDocFile = new File(new File("").getAbsolutePath() + File.separator + "GroovyDocument.md")

    def printFileContent() {
        mDocFile.eachLine {
            println it
        }

//        println mDocFile.getText()
    }

    def printEachFile() {
        mFile.eachFileRecurse(FileType.FILES, {
            println it
        })
    }

    def printEachFileMatcher() {
        //只进行当前文件夹下文件遍历正则匹配，不能进行文件夹递归遍历
        mFile.eachFileMatch(FileType.ANY, ~/.*\.gradle/, {
            println it
        })
    }
}