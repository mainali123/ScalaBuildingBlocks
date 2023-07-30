package ProgrammingInScala.FunctionsAndClosures

object LocalFunctions extends App{
  def padLines(text: String, minWidth: Int): String =
    def padLine(line: String, minWidth: Int): String =
      if line.length >= minWidth then line
      else line + " " * (minWidth - line.length)
    val paddedLines =
      for line <- text.linesIterator yield
        padLine(line, minWidth)
    paddedLines.mkString("\n")
}

// Improvement over above function
object Padding_:
  def padLines(text: String, minWidth: Int): String =
    def padline(line: String): String =
      if line.length >= minWidth then line
      else line + " " * (minWidth - line.length)
    val paddedLines =
      for line <- text.linesIterator yield
        padline(line)
    paddedLines.mkString("\n")