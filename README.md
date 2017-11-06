# maven-echo-plugin
A simple maven plugin for displaying static and dynamic text. I decided to create this plugin because I got fed up with writing ant scripts that pom files more verbose and builds slower just for simple display instructions

# Goals
Plugin has a single goal, echo

# Properties
* echoExpression (user property echo.expression) - a single expression to display that can contain both static text and any maven property/system property resolvable by Maven
* echoExpressions (user property echo.expressions) - list of properties as defined above that will be printed on separate lines; when provided on the command line, the properties can be separated by commas or semicolons

# Sample configuration
````xml
<configuration>
  <echoExpression>echo test: maven version is ${maven.version}</echoExpression>
  <echoExpressions>
    <expr>echo test: project version is ${project.version}</expr>
  </echoExpressions>
</configuration>
````
