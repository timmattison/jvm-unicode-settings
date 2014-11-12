jvm-unicode-settings
====================

This example project illustrates how the JVM's global Unicode settings (did you even know they existed?) can break everything.

`run-with-unicode-support.sh` will run a JVM with Unicode support and should print out this:

```
There should be a registered trademark here in double-quotes -> "®"
```

`run-without-unicode-support.sh` will run a JVM without Unicode support and should print out something else.  Probably this:

```
There should be a registered trademark here in double-quotes -> "?"
```

If you ever run into Unicode problems you should always make sure your JVM supports Unicode with a simple test like this!
