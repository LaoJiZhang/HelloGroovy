package com.laojizhang.demo.learning

class ClassLearning {
    //notice Groovy会自动的对下面的属性进行Get和Set方法的定义
    def name, age, language

    static void main(String[] args) {
        PrintUtils.printCutLine("classLearning")

//        Exception in thread "main" groovy.lang.MissingPropertyException: No such property: sex for class: com.laojizhang.demo.learning.ClassLearning
//        Possible solutions: age
//        at org.codehaus.groovy.runtime.ScriptBytecodeAdapter.unwrap(ScriptBytecodeAdapter.java:53)
//        at org.codehaus.groovy.runtime.callsite.ConstructorSite$NoParamSite.callConstructor(ConstructorSite.java:127)
//        at org.codehaus.groovy.runtime.callsite.CallSiteArray.defaultCallConstructor(CallSiteArray.java:60)
//        at org.codehaus.groovy.runtime.callsite.AbstractCallSite.callConstructor(AbstractCallSite.java:235)
//        at org.codehaus.groovy.runtime.callsite.AbstractCallSite.callConstructor(AbstractCallSite.java:247)
//        at com.laojizhang.demo.learning.ClassLearning.main(ClassLearning.groovy:9)
//        at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
//        at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
//        at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
//        at java.lang.reflect.Method.invoke(Method.java:498)
//        at com.intellij.rt.execution.application.AppMain.main(AppMain.java:147)
//        ClassLearning person = new ClassLearning(name: "老机长", age: 18, sex: "male")
        ClassLearning person = new ClassLearning(name: "老机长", age: 18)
        println person.toString()
    }

    @Override
    public String toString() {
        return "Person{" +
                "name=" + name +
                ", age=" + age +
                ", language=" + language +
                '}';
    }
}