# lure-java

A DSL evaluator that evaluates expression like `APP_VERSION > v3.2.1 && USER_NAME like Tom*`


## Quick Start

```java
Map<String, IData> ctx = new Expr.ContextBuilder()
            .addDoubleContext("PI", 3.14)
            .addCustomizedContext("APP_VERSION", "v3.2.1", "semver")
            .addStringContext("USER_NAME", "Tom Cruise")
            .addIntContext("USER_ID", 123)
            .addStringContext("environment", "Dev")
            .build();
            
boolean res = Expr.compile("APP_VERSION > `v3.2.1` && USER_NAME like `Tom*`").eval(context);

assert res;
```
