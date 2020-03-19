# Generate Pojo classes from JSON files with using Gradle jsonSchema2Pojo plugin:

## Requirements

1. Java - 1.8.x

2. Gradle - 6.2.x

## Steps to Setup

**1. Clone the application**

```bash
git clone https://gitlab.mynisum.com/abogari/pojo-converter-json-java.git
```

**2. Build the application using gradle**

```bash
cd Pojo-converter-Json-Java
gradle build
So here generating pojo classes in "pojo-converter-json-java\build\generated-sources\js2p\example"

```

Alternatively, you can run the app without packaging it using -

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
