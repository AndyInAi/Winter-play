name := """Winter-play"""
organization := "winter"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.13.12"

libraryDependencies += guice
libraryDependencies += "org.scalatestplus.play" %% "scalatestplus-play" % "7.0.0" % Test

// Adds additional packages into Twirl
//TwirlKeys.templateImports += "winter.controllers._"

// Adds additional packages into conf/routes
// play.sbt.routes.RoutesKeys.routesImport += "winter.binders._"

resolvers += "tencent" at "https://mirrors.cloud.tencent.com/repository/maven-public/"
resolvers += "aliyun" at "https://maven.aliyun.com/repository/public"


