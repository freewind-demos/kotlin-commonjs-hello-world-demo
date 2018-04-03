package example

@JsModule("hello")
external val hello: dynamic = definedExternally

fun main(args: Array<String>) {
    hello.hello("Kotlin, CommonJS")
}


