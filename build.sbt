val scalaVersion_2_13 = "2.13.6"

lazy val root = project
  .in(file("."))
  .settings(
    name := """jul-to-slf4j-example""",
    organization := "com.github.tototoshi",
    version := "0.1.0-SNAPSHOT",
    scalaVersion := scalaVersion_2_13,
    run / fork := true,
    libraryDependencies ++= Seq(
      "org.slf4j" % "slf4j-api" % "1.7.32",
      "org.slf4j" % "jul-to-slf4j" % "1.7.32",
      "ch.qos.logback" % "logback-classic" % "1.2.6",
      "org.scalaj" %% "scalaj-http" % "2.4.2"
    )
  )
