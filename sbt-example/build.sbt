lazy val root = (project in file(".")).
  settings(
    name := "SBT_Example",
    version := "1.1-SNAPSHOT",
    scalaVersion := "2.11.4"
  )

  resolvers += "Artifactory" at "https://artifactory-test.global.standardchartered.com/artifactory/sbt-remote/"
  
  //publishTo := Some("Artifactory Realm" at "https://artifactory-test.global.standardchartered.com/artifactory/sbt-local;build.timestamp=" + new java.util.Date().getTime)
  //credentials += Credentials("Artifactory Realm", "artifactory-test.global.standardchartered.com", "server.credentialsId")

  //publishTo := Some("Artifactory Realm" at "https://artifactory-test.global.standardchartered.com/artifactory/sbt-local")
  //publishTo := Some("Artifactory Realm" at "http://localhost:8081/artifactory/libs-snapshot-local")

  //credentials += Credentials(new File("credentials.properties"))

  libraryDependencies += "org.apache.derby" % "derby" % "10.4.1.3"
