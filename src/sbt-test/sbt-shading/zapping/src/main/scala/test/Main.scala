package test

import java.io.File
import java.nio.file.Files

object Main extends App {

  val resourceName = "/scala-xml.properties"

  // FIXME: Need a test which checks the *UNSHADED* classpath too!

  // Try to load the resource from the classpath
  val resource = Thread.currentThread().getContextClassLoader.getResource(resourceName)

  if (resource != null) {
    // Zapped resource was unexpectedly on the classpath.
    sys.error(s"Resource $resource was unexpectedly on classpath")
  }

}
