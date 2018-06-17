ThisBuild / scalaVersion := "2.12.6"
ThisBuild / organization := "zxxc"

lazy val hello = (project in file("."))
  .settings(
    name := "Hello"
  )
lazy val akkaVersion = "2.5.13"
libraryDependencies ++= Seq(
  "info.mukel" %% "telegrambot4s" % "3.0.14",
  "org.scalatest" %% "scalatest" % "3.0.5" % "test",
   library.akkaHttp,
        library.akkaStream,
        library.akkaHttpCors,
        library.logback,
        library.scalaLogging
)
lazy val library =
  new {
    object Version {
      val akkaVersion  = "2.4.19"
      val akkaActor    = akkaVersion
      val akkaStream   = akkaVersion
      val akkaHttp     = "10.0.10"
      val json4s       = "3.5.3"
      val scalaTest    = "3.0.3"
      val scalajHttp   = "2.3.0"
      val scalamock    = "3.6.0"
      val scalaLogging = "3.7.2"
      val logback      = "1.2.3"
      val akkaHttpCors = "0.2.1"
    }

    val akkaHttp        = "com.typesafe.akka"           %% "akka-http"            % Version.akkaHttp
    val akkaHttpTestkit = "com.typesafe.akka"           %% "akka-http-testkit"    % Version.akkaHttp

    val akkaActor       = "com.typesafe.akka"           %% "akka-actor"           % Version.akkaActor
    val akkaStream      = "com.typesafe.akka"           %% "akka-stream"          % Version.akkaStream
    val json4sCore      = "org.json4s"                  %% "json4s-core"          % Version.json4s
    val json4sJackson   = "org.json4s"                  %% "json4s-jackson"       % Version.json4s
    val json4sNative    = "org.json4s"                  %% "json4s-native"        % Version.json4s
    val json4sExt       = "org.json4s"                  %% "json4s-ext"           % Version.json4s
    val scalajHttp      = "org.scalaj"                  %% "scalaj-http"          % Version.scalajHttp
    val scalaLogging    = "com.typesafe.scala-logging"  %% "scala-logging"        % Version.scalaLogging
    val scalaMock       = "org.scalamock"               %% "scalamock-scalatest-support" % Version.scalamock
    val akkaHttpCors    = "ch.megard"                   %% "akka-http-cors"       % Version.akkaHttpCors
    val scalaTest       = "org.scalatest"               %% "scalatest"            % Version.scalaTest
    val logback         = "ch.qos.logback"              %  "logback-classic"      % Version.logback
  }