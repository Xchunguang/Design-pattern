# 建造者模式

- 将一个复杂对象的构建和表示进行分离，使得同样的构建过程可以构建出不同的表示。
- 保证建造流程一致，子类必须实现建造类的所有方法，使得所有方法都得到实现。例如在流程中不会遗漏某些工序
- 建造者模式是创建对象（Product）的复杂算法（ProductBuilder）应独立于对象的组成部分（Product）以及他们的装配方式（Director）使用的模式