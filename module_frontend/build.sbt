enablePlugins(ScalaJSPlugin)

name := "ModernTalk-frontend"
version := "1.0"
scalaVersion := "2.11.8"
scalaJSUseRhino in Global := false
persistLauncher in Compile := true

resolvers += "sbt-idea-repo" at "http://mpeltonen.github.com/maven/"

libraryDependencies += "be.doeraene" %%% "scalajs-jquery" % "0.9.0"
libraryDependencies += "com.lihaoyi" %% "upickle" % "0.4.0"

skip in packageJSDependencies := false
jsDependencies +=
  "org.webjars" % "jquery" % "2.1.4" / "2.1.4/jquery.js"