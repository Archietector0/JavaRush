/**
 * Написать четыре класса: Worker(сотрудник), Manager(управляющий),
 * Chief(директор) и Secretary(секретарь).
 * Унаследовать управляющего, директора и секретаря от сотрудника.
 */

public class WeAreWorkers {
    public static void main(String[] args) {
        Manager manager = new Manager();
        Chief chief = new Chief();
        Secretary secretary = new Secretary();

        manager.say();
        chief.say();
        secretary.say();
    }
}

class Worker {
    public void say () {
        System.out.println("We are workers!");
    }
}
class Manager extends Worker {

}
class Chief extends Worker {

}
class Secretary extends Worker {

}








