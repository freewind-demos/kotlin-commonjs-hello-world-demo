Kotlin CommonJS Demo
=======================

Use Kotlin to invoke javascript functions defined in a commonjs module.


Run:

```
npm install
./gradlew clean compileKotlin2Js
cp ./src/main/resources/hello.js node_modules/hello.js
node ./build/classes/kotlin/main/kotlin-commonjs-hello-world-demo.js
```

You will see "Hello, world!" in console.


