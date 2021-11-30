import java.io.*;

public class SalaryInSomeYears {
    public static void main(String[] args) throws IOException {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        System.out.print("Enter name: ");
        String name = bufferedReader.readLine();
        System.out.print("Enter salary: ");
        String sSalary = bufferedReader.readLine();
        System.out.print("Enter age: ");
        String sAge = bufferedReader.readLine();

        int intSalary = Integer.parseInt(sSalary);
        int intAge = Integer.parseInt(sAge);

        salaryInSomeYear(name, intSalary, intAge);
    }

    public static void salaryInSomeYear (String name, int intSalary, int intAge) {
        System.out.println( name + " получает " + intSalary + "$ через " + intAge +" лет.");

    }
}