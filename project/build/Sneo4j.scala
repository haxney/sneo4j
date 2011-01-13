import sbt._

class Sneo4j(info: ProjectInfo) extends DefaultProject(info)
{
  val codeHaus = "Codehaus" at "http://repository.codehaus.org"
  val scalaToolsReleases = "Scala-Tools Maven2 Releases Repository" at "http://scala-tools.org/repo-releases"
  val specs = "org.scala-tools.testing" % "specs_2.8.1" % "1.6.7"

  val sjson = project("sjson")

}
