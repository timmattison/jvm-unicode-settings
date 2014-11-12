jvm-unicode-settings
====================

This example project illustrates how the JVM's global Unicode settings (did you even know they existed?) can break everything.

`run-with-unicode-support.sh` will run a JVM with Unicode support and should print out this:

```
Your default charset is UTF-8
There should be a registered trademark here in double-quotes -> "®"
```

`run-without-unicode-support.sh` will run a JVM without Unicode support and should print out something else.  Probably this:

```
Your default charset is US-ASCII
There should be a registered trademark here in double-quotes -> "?"
```

`run-with-default-unicode-support.sh` will run a JVM with whatever your default settings are so you can see if you really need
to specify this option or not.  It doesn't usually hurt to specify it anyway but YMMV in a production environment.

If you ever run into Unicode problems you should always make sure your JVM supports Unicode with a simple test like this!
