// payroll/employee.scala

package payroll

case class Name(first: String, last: String)

case class Employee(name: String, annualGrossSalary: Money)
