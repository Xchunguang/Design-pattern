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

	- 工厂方法模式(Factory)：

	- 抽象工厂模式(Abstractfactory)：

	- 单例模式(Sington)：
	
	- 建造者模式(Builder)：
	
	- 原型模式(Prototype)：

- 结构型模式：对象之间的关系

	- 适配器模式（Adapter Pattern）
	
	- 桥接模式（Bridge Pattern）
	
	- 过滤器模式（Filter、Criteria Pattern）
	
	- 组合模式（Composite Pattern）
	
	- 装饰器模式（Decorator Pattern）
	
	- 外观模式（Facade Pattern）
	
	- 享元模式（Flyweight Pattern）
	
	- 代理模式（Proxy Pattern）
	
- 行为型模式：对象做什么

	- 责任链模式（Chain of Responsibility Pattern）
	
	- 命令模式（Command Pattern）
	
	- 解释器模式（Interpreter Pattern）
	
	- 迭代器模式（Iterator Pattern）
	
	- 中介者模式（Mediator Pattern）
	
	- 备忘录模式（Memento Pattern）
	
	- 观察者模式（Observer Pattern）
	
	- 状态模式（State Pattern）
	
	- 空对象模式（Null Object Pattern）
	
	- 策略模式（Strategy Pattern）
	
	- 模板模式（Template Pattern）
	
	- 访问者模式（Visitor Pattern）
	
	
