/**
 * Написать четыре класса: Schoolboy(школьник), Student(студент), Workerss(Сотрудник), Slave(Раб).
 * Унаследовать студента от школьника, сотрудника от студента, раба от сотрудника.
 */

public class FromSchoolBoyToSlave {
    public static void main(String[] args) {}
}

class Schoolboy {}
class Student extends Schoolboy {}
class Workerss extends Student {}
class Slave extends Workerss {}