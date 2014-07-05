import sbt._
import sbt.Keys._

object AkkatutorialBuild extends Build {

  lazy val akkatutorial = Project(
    id = "projectEulerScala",
    base = file("."),
    settings = Project.defaultSettings ++ Seq(
      name := "ProjectEulerScala",
      organization := "com.heliosmi",
      version := "0.2-SNAPSHOT",
      scalaVersion := "2.11.1",
      libraryDependencies += "com.typesafe.akka" % "akka-actor_2.11" % "2.3.3",
      libraryDependencies += "com.typesafe.scala-logging" %% "scala-logging-slf4j" % "2.1.2",
      libraryDependencies += "org.slf4j" % "slf4j-log4j12" % "1.7.5",            
	  libraryDependencies += "org.scalatest" % "scalatest_2.11" % "2.2.0" % "test"
    )
  )
}
