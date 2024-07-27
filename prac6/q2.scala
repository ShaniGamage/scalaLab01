import scala.io.StdIn.readLine;
import scala.util.Try
object student{

    def getStudentInfo():(String,Int,Int,Double,Char)={
        println("Student's Details");
        var name=readLine("Name : ");
        var marks=readLine("Marks : ").toInt;
        var totalMarks=readLine("Total possible marks : ").toInt;

        var percentage= marks.toDouble/totalMarks*100;
        var grade= percentage match
            case p if p>=90 => 'A';
            case p if p>=75 => 'B';
            case p if p>=50 => 'C';
            case p if p<50 => 'D';
        
        return (name,marks,totalMarks,percentage,grade);
    }

    def printStudentRecord(record: (String, Int, Int, Double, Char)): Unit = {
        val (name, marks, totalMarks, percentage, grade) = record
        println(s"Student Name: $name")
        println(s"Marks Obtained: $marks")
        println(s"Total Marks: $totalMarks")
        println(f"Percentage: $percentage%.2f%%")
        println(s"Grade: $grade")
    }

    def validateInput(name: String, marks: String, totalMarks: String):(Boolean,Option[String])={
        if(name.isEmpty()){
            return(false, Some("Please enter name."))
        }

       var marksInt = Try(marks.toInt).toOption;
       var totalMarksInt = Try(totalMarks.toInt).toOption;
    
      (marksInt, totalMarksInt) match {
        case (Some(m), Some(t)) if m >= 0 && m <= t => (true, None)
        case (Some(m), Some(t)) if m < 0 => (false, Some("Marks cannot be negative."))
        case (Some(m), Some(t)) if m > t => (false, Some("Marks cannot exceed total possible marks."))
        case (Some(m), None)             => (false, Some("Total possible marks must be a positive integer."))
        case (None, Some(t))             => (false, Some("Marks must be a positive integer."))
        case _                           => (false, Some("Invalid input for marks or total marks."))
       }
    }

    def getStudentInfoWithRetry(): (String, Int, Int, Double, Char) = {
        var isValid = false
        var record: (String, Int, Int, Double, Char) = ("", 0, 0, 0.0, 'D')
        while (!isValid) {
            val name = readLine("Enter student's name: ").trim
            val marks = readLine("Enter marks obtained: ").trim
            val totalMarks = readLine("Enter total possible marks: ").trim
            val (valid, errorMessage) = validateInput(name, marks, totalMarks)

            if (valid) {
                record = (name, marks.toInt, totalMarks.toInt, (marks.toDouble / totalMarks.toDouble) * 100, 'D')
                record = record.copy(_5 = record._4 match {
                    case p if p >= 90 => 'A'
                    case p if p >= 75 => 'B'
                    case p if p >= 50 => 'C'
                    case _            => 'D'
                })
            isValid = true;

            } else {
                   println(s"Error: ${errorMessage.getOrElse("Unknown error.")}");
            }
        }
    record;
  }


    
    def main(args: Array[String]): Unit = {
        var studentRecord= getStudentInfoWithRetry();
        printStudentRecord(studentRecord);
    }
}