
enablePlugins(ShadingPlugin)
shadedModules += "org.scala-lang.modules" %% "scala-xml"
shadingRules += ShadingRule.zap("/scala-xml.properties")

libraryDependencies ++= Seq(
  "org.scala-lang.modules" %% "scala-xml" % "2.2.0",
)

scalaVersion := "2.13.12"
organization := "io.get-coursier.test"
name := "shading-base-test"
version := "0.1.0-SNAPSHOT"
