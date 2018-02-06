# 迭代器模式

- 提供一种方法顺序访问一个聚合对象中的元素，并且不暴露内部表示
- 包含两种元素：需要遍历的对象，即聚合对象。另一个就是迭代器对象，用于对聚集对象进行遍历
- 当聚集多种方式的遍历时，需要使用迭代器模式
- 分离集合对象的遍历行为，抽象出迭代类进行遍历，不暴露内部结构，又可让外部透明的访问集合数据