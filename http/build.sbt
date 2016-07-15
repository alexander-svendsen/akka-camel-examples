name := "akka-camel-example-http"

version := "1.0"

scalaVersion := "2.11.7"

//Scala doesn't support java 8 yet, so set target t
scalacOptions += "-target:jvm-1.7"

initialize := {
  val _ = initialize.value // run the previous initialization
  val required = "1.7" //scala doesn't support java 8 yet
  val current  = sys.props("java.specification.version")
  assert(current == required, s"Unsupported JDK: java.specification.version $current != $required")
}


/** Dependencies **/

val akkaVersion = "2.4.8"
val akka = Seq(
  //Remember that %% automatically appends the current scala version to the artifactID
  "com.typesafe.akka" %% "akka-actor" % akkaVersion,
  "com.typesafe.akka" %% "akka-camel" % akkaVersion
)

val camelVersion = "2.17.2"
val camel = Seq(
  "org.apache.camel" % "camel-http" % camelVersion
)

libraryDependencies ++= akka ++ camel