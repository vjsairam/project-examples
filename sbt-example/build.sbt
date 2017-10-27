lazy val root = (project in file(".")).
  settings(
    name := "SBT_Example",
    version := "1.2-SNAPSHOT",
    scalaVersion := "2.11.4"
  )

 // resolvers += "Artifactory" at "https://artifactory-test.global.standardchartered.com/artifactory/sbt-remote/"
  
  publishTo := Some("Artifactory Realm" at "https://artifactory-test.global.standardchartered.com/artifactory/sbt-release;build.timestamp=" + new java.util.Date().getTime)
  //publishTo := Some("Artifactory Realm" at "http://localhost:8081/artifactory/libs-snapshot-local")
  //credentials += Credentials("Artifactory Realm", "artifactory-test.global.standardchartered.com", "${USERNAME}", "${PASSWORD}")
credentials += Credentials("Artifactory Realm", "artifactory-test.global.standardchartered.com", System.getenv().get("USERNAME"), System.getenv().get("PASSWORD"))

//credentials += Credentials("Artifactory Realm", "artifactory-test.global.standardchartered.com", "admin", "password")
 // credentials += Credentials(new File("credentials.properties"))
//credentials ++= (for {
///  username <- Option(System.getenv().get("USERNAME"))
//  password <- Option(System.getenv().get("PASSWORD"))
//} yield Credentials("JFrog Artifactory", "https://artifactory-test.global.standardchartered.com", username, password)).toSeq

  libraryDependencies += "org.apache.derby" % "derby" % "10.4.1.3"
