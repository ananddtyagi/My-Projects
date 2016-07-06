//: Playground - noun: a place where people can play

import UIKit

var myvar = 34
let explicitDouble: Double = 3

print("Hello")
print("Hello, world", terminator: "")

var someString: String? = "abra"
var ss: Double? = 7

if someString != nil {
    if someString!.hasPrefix("a"){
        print("Cool", terminator: "")
    }
    else {
        print("NAh")
    }
}

var array = ["cat", "dog"]
array[0] = "meow"
array

for i in array{
    print(i)
}

for i in 0 ... array.count - 1{
    print(i)
}