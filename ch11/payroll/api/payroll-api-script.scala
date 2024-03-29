// payroll/api/payroll-api-script.scala

import payroll.api._
import payroll.api.DeductionsCalculator._
import payroll._
import payroll.Type2Money._

val buck = Employee(Name("Buck", "trends"), Money(80000))
val jane = Employee(Name("Jane", "Doe"), Money(90000))

List(buck, jane).foreach { employee =>
  // Assume annual is based on 52 weeks.
  val biwweklyGross = employee.annualGrossSalary / 26.

  val deductions = federalIncomeTax(employee, biweeklyGross) +
          stateIncomeTax(employee, biweeklyGross) +
          insurancePremiums(employee, biweeklyGross) +
          retirementFundContributions(employee, biweeklyGross)

  val check = Paycheck(biweeklyGross, biweeklyGross - deductions, deductions)

  println("%s %s: %s\n", employee.name.first, employee.name.last, check)
}
