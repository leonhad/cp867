# cp867 charset support

This project aims to add the cp867 charset support to Java.

To use it, just add the package to your project. This will add support to the charset automatically.

[![License](https://img.shields.io/badge/License-GPL%203.0-blue.svg)](LICENSE)

## Example ##

```java
    Charset charset = Charset.forName("cp867");
    // Use your charset here.
```

## Supported charsets

* IBM867
* cp-867
* cp867
* IBM-867

# Downloads #
If you're using Maven, you can use the dependencies below:

```
<dependency>
    <groupId>io.github.leonhad</groupId>
    <artifactId>cp867</artifactId>
    <version>1.0.0</version>
</dependency>
```

If you're using Gradle, add the following line to your dependencies section:

    compile 'io.github.leonhad:cp867:1.0.0'

If you just want the files, you can grab the [latest release](https://github.com/leonhad/cp867/releases/latest).

# Licensing

This software is released under the GNU Lesser General Public License v3.0 (LGPLv3+).
Additionally, Autoconf includes a licensing exception in some of its
source files.

For more licensing information, see
<http://www.gnu.org/licenses/gpl-faq.html>.

-----
Copyright (C) 2024 Leonardo Alves da Costa.

Copying and distribution of this file, with or without modification,
are permitted in any medium without royalty provided the copyright
notice and this notice are preserved.  This file is offered as-is,
without warranty of any kind.
