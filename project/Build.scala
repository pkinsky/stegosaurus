import sbt._
import Keys._
import play.Project._

object ApplicationBuild extends Build {

  val appName         = "stegosaur"
  val appVersion      = "1.0-SNAPSHOT"

  val appDependencies = Seq(
    jdbc,
    anorm,
    "org.scalaz" %% "scalaz-core" % "7.0.3"
  )


  val main = play.Project(appName, appVersion, appDependencies).settings(
  )

}
