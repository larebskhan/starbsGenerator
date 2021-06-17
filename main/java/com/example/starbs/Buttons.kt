package com.example.starbs

class Buttons {
    //Initialize Variables
    var isGeneratedCoffee = 0

    //Default Constructor
    constructor() {
        isGeneratedCoffee = 0
    }

    //Parameterized Constructor
    constructor(_isGeneratedCoffee: Int) {
        setIsGeneratedCoffee(_isGeneratedCoffee)
    }

    //Getter
    fun getIsGeneratedCoffee(): Int {
        return isGeneratedCoffee
    }

    //Setter
    private fun setIsGeneratedCoffee(_isGeneratedCoffee: Int) {
        if (_isGeneratedCoffee == 0 || _isGeneratedCoffee == 1) {
            isGeneratedCoffee = _isGeneratedCoffee
        }
    }
}