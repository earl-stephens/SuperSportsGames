# Super Sports Games

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=java&logoColor=white)
![Eclipse](https://img.shields.io/badge/Eclipse-FE7A16.svg?style=for-the-badge&logo=Eclipse&logoColor=white)

## Table of Contents

- [Introduction](#introduction)
- [Installation](#installation)  
- [Getting Started](#getting-started)  
- [Further Improvements](#further-improvements)  
- [Built With](#built-with)  
- [Coverage](#coverage)  
- [Authors](#authors)  

## Introduction

This is a very simple app that calculates the standard deviation of a group of integers.  The project requirements are located at [Super Sports Games](https://backend.turing.edu/module1/projects/super_sports_games).

There are two classes.  The StandardDeviation class has methods that are used to calculate the standard deviation of a set of numbers.  The constructor takes an integer array of the numbers.  The methods start small, calculating the sum of the numbers in the array, and work their way up to finding the standard deviation.

The Event class takes in a String for name and an array of integers.  This class has several simple methods that compute things like max and min values in the array.  The class also instantiates a StandardDeviation object and makes a call to its `standardDeviation()` method.

After the code was written and tested, the Standard Deviation class was refactored.  Initially, all of the attributes and methods were public.  The attributes were set to private.  Next, the `standardDeviation()` method basically chains the calls of the other methods, so all of the other methods were set to private.  This caused a number of errors in the StandardDeviationTest class, since all but the `testForStandardDeviation()` methods could not reach the now private methods.  However, since `standardDeviation()` chains all the methods, only the `testForStandardDeviation()` is required.  The other tests were deleted.  Coverage remained at 100%, since `testForStandardDeviation()` tests all the other methods at the same time.

## Installation

Clone the repo to your local machine.  Navigate to the files in SuperSportsGames/src/main.  For each file, perform the following:  

`javac -d . filename.java`

## Getting Started   

This program does not have a class with a main method to start it off.

## Further Improvements

Add a class with a main method to run the program.  
Add a user interface such that the user can input a set of integers to perform the calculations on.

## Built With

OpenJDK 16.0.1

JUnit 5  

Eclipse 2020-06  

## Coverage

100%

## Authors

[Earl Stephens](https://github.com/earl-stephens)