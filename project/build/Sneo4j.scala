import sbt._

class Sneo4j(info: ProjectInfo) extends DefaultProject(info)
{
  val codeHaus = "Codehaus" at "http://repository.codehaus.org"
  val scalaToolsReleases = "Scala-Tools Maven2 Releases Repository" at "http://scala-tools.org/repo-releases"
  val jackson = "org.codehaus.jackson" % "jackson-jaxrs" % "1.7.0"
  val jerseyClient = "com.sun.jersey" % "jersey-client" % "1.4"
val specs = "org.scala-tools.testing" % "specs_2.8.1" % "1.6.7"
}
