/*
 * This file was generated by the Gradle 'init' task.
 */

rootProject.name = "triangle-tools"
include(":triangle-disassembler")
include(":triangle-compiler")
include(":triangle-abstractmachine")
include(":triangle-interpreter")
project(":triangle-disassembler").projectDir = file("Triangle.AbstractMachine.Disassembler")
project(":triangle-compiler").projectDir = file("Triangle.Compiler")
project(":triangle-abstractmachine").projectDir = file("Triangle.AbstractMachine")
project(":triangle-interpreter").projectDir = file("Triangle.AbstractMachine.Interpreter")
