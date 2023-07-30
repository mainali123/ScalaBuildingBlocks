package ProgrammingInScala.FunctionsAndClosures

object Methods{

}

object Padding:
  def padLines(text: String, minWidth: Int): String = {
    val paddedLines =
      for line <- text.linesIterator yield
        padLine(line, minWidth)
    paddedLines.mkString("\n")
  }

  private def padLine(line: String, minWidth: Int): String = {
    if line.length >= minWidth then line
    else line + " " * (minWidth - line.length)

  }