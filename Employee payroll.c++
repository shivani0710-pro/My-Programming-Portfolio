#include <iostream>
using namespace std;
int main()
{
    int id;
    char name[50];
    float basic, hra, da, pf;
    float gross, net;
    cout << "EMPLOYEE PAYROLL SYSTEM" << endl;
    cout << "Enter Employee ID: ";
    cin >> id;
    cout << "Enter Employee Name: ";
    cin >> name;
    cout << "Enter Basic Salary: ";
    cin >> basic;
    hra = basic * 0.20;
    da = basic * 0.10;
    pf = basic * 0.12;
    gross = basic + hra + da;
    net = gross - pf;
    cout << "\n----- PAY SLIP -----" << endl;
    cout << "Employee ID: " << id << endl;
    cout << "Employee Name: " << name << endl;
    cout << "Basic Salary: " << basic << endl;
    cout << "HRA: " << hra << endl;
    cout << "DA: " << da << endl;
    cout << "PF: " << pf << endl;
    cout << "Gross Salary: " << gross << endl;
    cout << "Net Salary: " << net << endl;
    return 0;
}
