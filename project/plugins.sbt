resolvers += Resolver.url("artifactory", url("http://scalasbt.artifactoryonline.com/scalasbt/sbt-plugin-releases"))(Resolver.ivyStylePatterns)

resolvers ++= Seq(
  "Era7 maven releases" at "http://releases.era7.com.s3.amazonaws.com",
  "jgit-repo" at "http://download.eclipse.org/jgit/maven",
  "sonatype-releases"  at "http://oss.sonatype.org/content/repositories/releases"
)

addSbtPlugin("com.typesafe.sbt" % "sbt-git" % "0.6.2")

addSbtPlugin("com.typesafe" % "sbt-mima-plugin" % "0.1.6")

addSbtPlugin("com.eed3si9n" % "sbt-assembly" % "0.10.2")

addSbtPlugin("com.typesafe.sbt" % "sbt-ghpages" % "0.5.1")

addSbtPlugin("com.typesafe.sbteclipse" % "sbteclipse-plugin" % "2.4.0")
