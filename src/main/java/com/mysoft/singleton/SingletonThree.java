package com.mysoft.singleton;
/**
 * 传言饿汉模式会导致程序启动慢，因为开始就会创建实例
 * 类的加载分为5个步骤：加载、验证、准备、解析、初始化
 * 初始化就是执行编译后的<cinit>()方法，而<cinit>()方法就是在编译时将静态变量赋值和静态块合并到一起生成的。
 * 所以说，“饿汉模式”的创建对象是在类加载的初始化阶段进行的。
 * jvm规范规定有且只有以下7种情况下会进行类加载的初始化阶段：

		* 使用new关键字实例化对象的时候
		* 设置或读取一个类的静态字段（被final修饰，已在编译器把结果放入常量池的静态字段除外）的时候
		* 调用一个类的静态方法的时候
		* 使用java.lang.reflect包的方法对类进行反射调用的时候
		* 初始化一个类的子类（会首先初始化父类）
		* 当虚拟机启动的时候，初始化包含main方法的主类
		* 当使用jdk1.7的动态语言支持时，如果一个java.lang.invoke.MethodHandle实例最后的解析结果REF_getStatic、REF_putStatic、REF_invokeStatic的方法句柄，并且这个方法句柄所对应的类没有进行过初始化，则需要先触发其初始化。
	
 * 基本来说就是只有当你以某种方式调用了这个类的时候，它才会进行初始化，而不是说jvm启动的时候就初始化，所以说假如你的单例类里只有一个
 * getInstance()方法，那基本上就是当你从其他类调用getInstance()方法的时候才会进行初始化，这事实上和“懒汉模式”是一样的效果。而jvm
 * 本身会确保类的初始化只执行一次。
 * 
 * 当然，也有一种可能就是单例类里除了getInstance()方法还有一些其他静态方法，这样当调用其他静态方法的时候，也会初始化实例，这时就可以通过
 * 添加静态内部类方法进行解决：@see com.mysoft.singleton.SingletonTwo
 * @author xuchg1
 *
 */
public class SingletonThree {
	    private static final SingletonThree singleton=new SingletonThree();
	    
	    public static SingletonThree getInstance(){
	        return singleton;
	    }
}
