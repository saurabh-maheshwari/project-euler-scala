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
      scalaVersion := "2.10.2",
      libraryDependencies += "com.typesafe.akka" % "akka-actor_2.10" % "2.1.0",
      libraryDependencies += "com.typesafe" % "scalalogging-slf4j_2.10" % "1.0.1",
      libraryDependencies += "org.slf4j" % "slf4j-log4j12" % "1.7.5",            
	  libraryDependencies += "org.scalatest" % "scalatest_2.10" % "2.0.RC1" % "test"
    )
  )
}
