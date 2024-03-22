package test

import java.io.File
import java.nio.file.Files

object Main extends App {

  val resourceName = "/scala-xml.properties"

  // FIXME: Need a test which checks the *UNSHADED* classpath too!

  val expectResource =
    if (args.headOption == Some("--shaded")) {
      false
    } else {
      true
    }

  // Try to load the resource from the classpath
  val maybeResource = Option(Thread.currentThread().getContextClassLoader.getResource(resourceName))

  if (expectResource && maybeResource.isEmpty) {
    sys.error(s"Resource $resourceName was NOT found on classpath")
  } else if (!expectResource && maybeResource.nonEmpty) {
    sys.error(s"Resource $resourceName was unexpectedly on classpath")
  }

}
