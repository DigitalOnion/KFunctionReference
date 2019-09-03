package com.outerspace.kfunctionreference

class Processor {

    // NOTE: In Java, I was putting the Consummer<String> where the dumpTextFunctionReference now is.

    public fun processIt(textToProcess : String, dumpTextFunctionReference : (String) -> (Unit) ) {
        dumpTextFunctionReference(textToProcess.toUpperCase())
    }

}