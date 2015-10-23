// set the name of the project
name := "tbutils"

version := "0.1.1"

scalaVersion := "2.11.6"
 
organization := "com.damianhelme"

libraryDependencies ++= {
  val liftVersion = "2.6.1"
  Seq(
    "net.liftweb" %% "lift-webkit" % liftVersion % "compile" withSources(),
    "ch.qos.logback" % "logback-classic" % "1.1.3" % "compile",
    "org.scalatest" %% "scalatest" % "2.2.4" % "test"
  )
}


scalacOptions ++= Seq("-unchecked", "-deprecation")
	
resolvers += "Java.net Maven2 Repo" at "http://download.java.net/maven/2/"
		
logLevel := Level.Info
