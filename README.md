# 设计模式
- 什么是设计模式
- 什么时候使用设计模式
- 设计模式六大原则
- 常见设计模式

## 什么是设计模式

设计模式是软件开发人员在软件开发过程中面临一般问题使用的解决方案。设计模式是在软件开发过程中反复积累经验的总结。一般在Java中使用居多，也可称为面向对象设计模式。

## 什么时候使用设计模式

笔者认为任何时候都需要先考虑设计模式，因为设计模式可以达到易扩展，易维护，可重用，易理解等优点。但并非所有场合都使用，比如为一个简单的场合或者演示场景设计一个复杂的设计模式将毫无意义。

学习中看到网友一句话觉得很好：学习，然后全部忘记。熟练理解了设计模式，不用刻意的去设计也会用出最适宜的设计模式。

实际上有网友对Java的设计语言有一定偏见，认为好的语言不会产生那么多设计问题，由此产生如此多设计模式，认为需要语言进行原生实现。
笔者认为编程语言没有好坏，学习设计模式未必不是件好事，当编程语言为你封装了设计模式，而你并不清楚，不是也很悲哀。

## 设计模式六大原则

- 开闭原则（Open Close Principle）
	
	对扩展开放，修改关闭。实现热插拔
	
- 里氏替换（Liskov Substitution Principle）

	里氏替换是面向对象设计原则之一。任何父类可以出现的地方，子类都可以出现
	
	面向对象设计原则：单一职责，开放封闭，里氏替换，接口隔离，依赖倒置

- 依赖倒置（Dependence Inversion Principle）

	是开闭原则的基础，依赖抽象而不依赖具体
	
- 接口隔离（Interface Segregation Principle）

	使用多个隔离的接口，代替使用单个接口。降低类之间的依赖和耦合度

- 迪米特法则，又称最少知道原则（Demeter Principle）

	一个实体尽量少于其他实体发生相互作用，达到模块之间相互独立
	
- 合成复用（Composite Reuse Principle）

	尽量使用聚合/耦合，少用继承
## 常见设计模式

- 创建型模式：对象如何来

	- <a href="https://github.com/Xchunguang/Design-pattern/tree/master/src/main/java/com/mysoft/factorymethod">工厂方法模式</a>(Factory)：使用工厂方法产生实例

	- <a href="https://github.com/Xchunguang/Design-pattern/tree/master/src/main/java/com/mysoft/abstractfactory">抽象工厂模式</a>(Abstractfactory)：使用抽象工厂创建实例对象

	- <a href="https://github.com/Xchunguang/Design-pattern/tree/master/src/main/java/com/mysoft/singleton">单例模式</a>(Sington)：当前实例中类只有一个对象
	
	- <a href="https://github.com/Xchunguang/Design-pattern/tree/master/src/main/java/com/mysoft/builder">建造者模式</a>(Builder)：创建一个复杂对象过程
	
	- <a href="https://github.com/Xchunguang/Design-pattern/tree/master/src/main/java/com/mysoft/prototype">原型模式</a>(Prototype)：对象拷贝，深复制、浅复制

- 结构型模式：对象之间的关系

	- <a href="https://github.com/Xchunguang/Design-pattern/tree/master/src/main/java/com/mysoft/adapter">适配器模式</a>（Adapter Pattern）：适配不兼容接口
	
	- <a href="https://github.com/Xchunguang/Design-pattern/tree/master/src/main/java/com/mysoft/bridge">桥接模式</a>（Bridge Pattern）：抽象部分与实际部分分离
	
	- <a href="https://github.com/Xchunguang/Design-pattern/tree/master/src/main/java/com/mysoft/composite">组合模式</a>（Composite Pattern）：将对象组合成属性结构来表示部分与整体的层次结构
	
	- <a href="https://github.com/Xchunguang/Design-pattern/tree/master/src/main/java/com/mysoft/decorater">装饰器模式</a>（Decorator Pattern）：动态的给一个对象添加一个额外的职责
	
	- <a href="https://github.com/Xchunguang/Design-pattern/tree/master/src/main/java/com/mysoft/facade">外观模式</a>（Facade Pattern）：为子系统的一组接口提供了一个一致的界面
	
	- <a href="https://github.com/Xchunguang/Design-pattern/tree/master/src/main/java/com/mysoft/flyweight">享元模式</a>（Flyweight Pattern）：运用共享技术有效的支持大量细粒度的对象
	
	- <a href="https://github.com/Xchunguang/Design-pattern/tree/master/src/main/java/com/mysoft/proxy">代理模式</a>（Proxy Pattern）：增加中间层代理类与底层实现类实现共同接口，并创建底层实现类对象，以便向外界提供功能接口
	
- 行为型模式：对象做什么

	- <a href="https://github.com/Xchunguang/Design-pattern/tree/master/src/main/java/com/mysoft/chainofresponsibility">责任链模式</a>（Chain of Responsibility Pattern）：使多个对象都有机会处理请求，避免请求的发送者和接受者之间的耦合关系，将这个对象连成一条链
	
	- <a href="https://github.com/Xchunguang/Design-pattern/tree/master/src/main/java/com/mysoft/command">命令模式</a>（Command Pattern）：将一个请求封装成一个对象，使用户对不同请求对客户进行参数化，对请求排队或记录请求日志，请求撤销操作
	
	- <a href="https://github.com/Xchunguang/Design-pattern/tree/master/src/main/java/com/mysoft/interpreter">解释器模式</a>（Interpreter Pattern）：给定一个语言，定义他的一个文法的一种表示，并定义一个解释器。
	
	- <a href="https://github.com/Xchunguang/Design-pattern/tree/master/src/main/java/com/mysoft/iterator">迭代器模式</a>（Iterator Pattern）：提供一种方法顺序访问一个聚合对象中的元素，并且不暴露内部表示
	
	- <a href="https://github.com/Xchunguang/Design-pattern/tree/master/src/main/java/com/mysoft/mediator">中介者模式</a>（Mediator Pattern）：用一个中介对象封装一系列对象的交互
	
	- <a href="https://github.com/Xchunguang/Design-pattern/tree/master/src/main/java/com/mysoft/memento">备忘录模式</a>（Memento Pattern）：在不破坏封装的情况下，捕获一个类的内部状态，并在外部保存。可以将对象恢复到原先的状态
	
	- <a href="https://github.com/Xchunguang/Design-pattern/tree/master/src/main/java/com/mysoft/observer">观察者模式</a>（Observer Pattern）：定义了一种一对多的依赖关系，让多个监听者对象同时监听同一个主题对象
	
	- <a href="https://github.com/Xchunguang/Design-pattern/tree/master/src/main/java/com/mysoft/state">状态模式</a>（State Pattern）：一个对象内在状态改变是允许改变其行为
	
	- <a href="https://github.com/Xchunguang/Design-pattern/tree/master/src/main/java/com/mysoft/strategy">策略模式</a>（Strategy Pattern）：策略模式是一种定义了一系列算法的方法，所有的算法都是完成相同的工作，只是实现方法不同，减少了各种算法类与使用方法之间的耦合
	
	- <a href="https://github.com/Xchunguang/Design-pattern/tree/master/src/main/java/com/mysoft/template">模板模式</a>（Template Pattern）：定义一个操作算法骨架，而将一些步骤延迟到子类。
	
	- <a href="https://github.com/Xchunguang/Design-pattern/tree/master/src/main/java/com/mysoft/visitor">访问者模式</a>（Visitor Pattern）：把数据结构和作用于结构上的操作解耦合，使得操作集合可相对自由地演化
	
	
