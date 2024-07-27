import scala.io.StdIn.readLine

object StudentRecordsApp {
  // Function to validate input
  def validateInput(name: String, marks: Int, totalMarks: Int): (Boolean, Option[String]) = {
    if (name.isEmpty) {
      (false, Some("Name cannot be empty"))
    } else if (marks < 0 || marks > totalMarks) {
      (false, Some(s"Marks should be between 0 and $totalMarks"))
    } else {
      (true, None)
    }
  }

  // Function to get student information and calculate percentage and grade
  def getStudentInfo(): (String, Int, Int, Double, Char) = {
    val name = readLine("Enter student's name: ")
    val marks = readLine("Enter student's marks: ").toInt
    val totalMarks = readLine("Enter total possible marks: ").toInt

    val percentage = (marks.toDouble / totalMarks) * 100
    val grade = percentage match {
      case p if p >= 90 => 'A'
      case p if p >= 75 => 'B'
      case p if p >= 50 => 'C'
      case _ => 'D'
    }

    (name, marks, totalMarks, percentage, grade)
  }

  // Function to print student record
  def printStudentRecord(record: (String, Int, Int, Double, Char)): Unit = {
    val (name, marks, totalMarks, percentage, grade) = record
    println(s"Name: $name")
    println(s"Marks: $marks")
    println(s"Percentage: $percentage%")
    println(s"Grade: $grade")
  }

  // Function to get student info with retry mechanism
  def getStudentInfoWithRetry(): (String, Int, Int, Double, Char) = {
    var isValid = false
    var studentInfo: (String, Int, Int, Double, Char) = null

    while (!isValid) {
      val name = readLine("Enter student's name: ")
      val marks = readLine("Enter student's marks: ").toInt
      val totalMarks = readLine("Enter total possible marks: ").toInt

      val (valid, errorMessage) = validateInput(name, marks, totalMarks)
      if (valid) {
        studentInfo = (name, marks, totalMarks, (marks.toDouble / totalMarks) * 100, {
          val percentage = (marks.toDouble / totalMarks) * 100
          percentage match {
            case p if p >= 90 => 'A'
            case p if p >= 75 => 'B'
            case p if p >= 50 => 'C'
            case _ => 'D'
          }
        })
        isValid = true
      } else {
        println(errorMessage.getOrElse("Invalid input, please try again."))
      }
    }

    studentInfo
  }

  def main(args: Array[String]): Unit = {
    val studentInfo = getStudentInfoWithRetry()
    printStudentRecord(studentInfo)
  }
}
