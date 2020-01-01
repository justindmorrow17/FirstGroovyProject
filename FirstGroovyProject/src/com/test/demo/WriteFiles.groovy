package com.test.demo

File myFile = new File("data11.txt")

myFile.write("This is Line 1 \n")
myFile << "This is Line 2 \n"
myFile.append("This is Line 5")

//myFile.text = "This is Line 3" overwrites everything in the file

//overwrites everything
//myFile.withWriter { writer -> 
//	writer.writeLine("This is Line 4")
//}  
println myFile.length()
println myFile.isFile()
println myFile.text