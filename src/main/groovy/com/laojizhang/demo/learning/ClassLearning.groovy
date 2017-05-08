package com.laojizhang.demo.learning

class ClassLearning {
    //notice Groovy会自动的对下面的属性进行Get和Set方法的定义
    def name, age, language

    static void main(String[] args) {
        PrintUtils.printCutLine("classLearning")
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