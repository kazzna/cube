name := """cube"""
version := "1.0-SNAPSHOT"
lazy val root = (project in file(".")).enablePlugins(PlayScala)
scalaVersion := "2.11.5"
libraryDependencies ++= Seq(
  jdbc,
  cache,
  ws,
  "com.github.nscala-time" %% "nscala-time" % "1.8.0",
  "org.scalaz" %% "scalaz-core" % "7.1.1"
)
