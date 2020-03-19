# Generate Pojo classes from JSON files with using Gradle jsonSchema2Pojo plugin:

## Requirements

1. Java - 1.8.x

2. Gradle - 6.2.x

## Steps to Setup

**1. Clone the application**

```bash
git clone https://github.com/AmarBogari/Jsontopojoparent.git
```

**2. Build the application using gradle**

```bash
Its multi module gradle application.
Module Names are :
1)json2java
2)module1
3)targetapp

cd Jsontopojoparent
gradlew build
So here generating pojo classes in "Jsontopojoparent\json2java\build\generated-sources\js2p\example"
We used generated pojo classes in targetappproject. 

```
json2java module have details about json to java.
```bash
propertyjsontojava.json  file have all following datatypes conversion from json to java.

JSON TYPE 	Java type
string		java.lang.String
number		java.lang.Double
integer		java.lang.Integer
boolean		java.lang.Boolean
object		generated Java type
array		java.util.List
array 		(with "uniqueItems":true)	java.util.Set
null		java.lang.Object
any			java.lang.Object
defaultvalue
required 
optional
enum
enum with Java
additionalProperties : default its created Map<String,Object> , if you want disable then provide false.
additionalProperties :false
excludedFromEqualsAndHashCode field level.
```

```bash
customclassname.json file have generated class with our specific package and class name with  following property:
 "javaType" : "json2java.CustomTypeName",
 
additionalProperties : default its created Map<String,Object> , if you change the value type to number of the map.

```

```bash
associationandextends.json file have extends and associations jsons.
```

```bash
interfaces.json file have implements interfaces.

```
```bash
customproperties.json file have custom java properties map and class.
javaName: json property name changes in java property name.
 "a": {      "javaName": "b",      "type": "string"    }
 create run time class.
```

```bash
Gradle file jsonSchema2Pojo have lot of properties and those properties are going to set values on application level.
those properties explained in following git location:

https://github.com/joelittlejohn/jsonschema2pojo/tree/master/jsonschema2pojo-gradle-plugin

```
