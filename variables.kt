fun main(){
    // there are two ways to declare variable in this language
    //First is using 'var' key when we creates a variable using var keyword it creates mutable variable
    var varName:String = "I am SkSatyam" // we doesn't need to use semicoloun(;) at the end of the line like python
    varName = "I am Programmer" // new value will assign, this will not through any error
    //Second is using 'val' keyword when we creates a variable using 'val' keyword it creates immutable variable
    val valName: String = "This value will not reassign"
    //valName = "Changed value" // This line will through an error
    /*If we doesnt declare datatype of a variable Than in that case this will not through any error because
    Kotlin is indeed a statically-typed programming language,
    but it incorporates features that make type declarations more concise and flexible compared to some other statically-typed languages.
    In Kotlin, there is a feature called type inference, which allows the compiler to automatically determine the type of a variable based on the assigned value.
    This feature helps reduce the need for explicit type declarations while still maintaining the benefits of static typing.
    In other words, You didn't explicitly mention the type, but the compiler figured it out based on the assigned value.
    The type inference in Kotlin helps strike a balance between the benefits of static typing and the convenience of concise code.
    So, while you don't always have to explicitly specify types in Kotlin,
    the language is still statically-typed because the types are checked at compile time.
    If you were to try something incompatible with the inferred type, the compiler would catch it during the compilation process.
    */
//    ForExample
    var newVar = "SkSatyam"
    var newVar2 = 2
    

}