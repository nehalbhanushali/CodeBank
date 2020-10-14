1. Why does constructor not have return type void ?

Because constructor function returns the object it creates, not Void.

2. When is static function/variable used?
 
When the value returned does not depend on an instance. If something just belongs to a class (type) rather than an instannce of a class, it should be static.
Memory saved -  yes, as there is only one copy per class.
See [Flyweight pattern](https://en.wikipedia.org/wiki/Flyweight_pattern) to save more memory


