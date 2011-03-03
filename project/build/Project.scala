import sbt._

class EnterpriseModelProject(info: ProjectInfo) extends ParentProject(info) {
	
	val liftVersion = "2.2"

	val bizOnDemand_libs_Releases     =  "libs-releases-local"   at 
			"http://bizondemand.biz:8081/artifactory/libs-releases-local"
  val bizOnDemand_libs_Snapshots    = "libs-snapshots-local"   at 
			"http://bizondemand.biz:8081/artifactory/libs-snapshots-local"
  val bizOnDemand_plugins_Releases  = "plugins-releases-local" at 
			"http://bizondemand.biz:8081/artifactory/plugins-releases-local"
  val bizOnDemand_plugins_Snapshots = "plugins-snaphots-local" at 
			"http://bizondemand.biz:8081/artifactory/plugins-snapshots-local"
  
	val scalatoolsReleases = 
    "Scala Tools Releases" at "http://scala-tools.org/repo-releases/"
	val scalatoolsSnapshot = 
    "Scala Tools Snapshot" at "http://scala-tools.org/repo-snapshots/"

	val javaNetReleases = "Java Repo" at "http://download.java.net/maven/2/"

	override def managedStyle=ManagedStyle.Maven
	Credentials(Path.userHome / ".ivy2" / ".credentials", log)
  val publishTo = "Biz On Demand Artifacts" at "http://bizondemand.biz:8081/artifactory/libs-releases-local"

	
	val stdLibraryDependencies = Set(
		"org.mortbay.jetty" % "jetty" % "6.1.22" % "test->default",
		"junit" % "junit" % "4.5" % "test->default",
		"javax.servlet" % "servlet-api" % "2.5",
		"org.slf4j" % "slf4j-api" % "1.6.1",
		"org.slf4j" % "slf4j-log4j12" % "1.6.1",
		"joda-time" % "joda-time" % "1.6.2",
		"joda-time" % "joda-time-hibernate" % "1.1",
		"javax.persistence" % "persistence-api" % "1.0",
		"geronimo-spec" % "geronimo-spec-jta"  % "1.0-M1",
		"org.hibernate" % "hibernate-entitymanager" % "3.4.0.GA",
		"org.apache.derby" % "derby" % "10.7.1.1",
		"org.scala-libs" %% "scalajpa" % "1.2",
		"org.scala-tools.testing" %% "specs" % "1.6.6" % "test->default",
		"net.liftweb" %% "lift-webkit" % liftVersion % "compile->default",
		"net.liftweb" %% "lift-jpa" % liftVersion
	) ++ super.libraryDependencies
  


	lazy val model_utils = project("model-utils", "Model Utils", new Core(_))
	lazy val party = project("party-model", "Party Model", new Core(_), model_utils)
	
	lazy val web_interface = project("web-interface", "Web", new Lift(_), party)
	
	class Core(info:ProjectInfo) extends DefaultProject(info) {
		override def libraryDependencies = stdLibraryDependencies
	}
	
	class Lift(info: ProjectInfo) extends DefaultWebProject(info) {
		override def scanDirectories = Nil
		override def libraryDependencies = stdLibraryDependencies
	}
  
}
