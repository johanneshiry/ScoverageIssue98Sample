# Gradle Scoverage Issue #98 Sample Project
This sample project is intended to reproduce the issue discussed in [https://github.com/scoverage/gradle-scoverage/issues/98](https://github.com/scoverage/gradle-scoverage/issues/98)

To reproduce the issue you can call 
`gradle -p mainproject --console=plain --include-build ../subproject1 clean test` from the root folder of the project. The command should let to output similar to

```
> Task :subproject1:checkJavaVersion
> Task :subproject1:compileJava NO-SOURCE
> Task :subproject1:compileGroovy NO-SOURCE
> Task :clean
> Task :checkJavaVersion
> Task :processResources NO-SOURCE
> Task :processTestResources NO-SOURCE
> Task :subproject1:compileScala UP-TO-DATE
> Task :subproject1:processResources UP-TO-DATE
> Task :subproject1:classes UP-TO-DATE
> Task :subproject1:jar UP-TO-DATE
> Task :compileJava NO-SOURCE
> Task :compileGroovy NO-SOURCE

> Task :compileScala
Pruning sources from previous analysis, due to incompatible CompileSetup.

> Task :classes
> Task :compileTestJava NO-SOURCE
> Task :compileTestGroovy NO-SOURCE
> Task :compileTestScala NO-SOURCE
> Task :testClasses UP-TO-DATE

FAILURE: Build failed with an exception.

* What went wrong:
Included build task ':reportScoverage' was never scheduled for execution.

* Try:
Run with --stacktrace option to get the stack trace. Run with --info or --debug option to get more log output. Run with --scan to get full insights.

* Get more help at https://help.gradle.org

Deprecated Gradle features were used in this build, making it incompatible with Gradle 6.0.
Use '--warning-mode all' to show the individual deprecation warnings.
See https://docs.gradle.org/5.6.4/userguide/command_line_interface.html#sec:command_line_warnings

BUILD FAILED in 4s
3 actionable tasks: 3 executed
```