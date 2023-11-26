package generic.app

import generic.data.Company
import generic.data.Manager
import generic.data.VicePresident

fun main() {
    val data1 = Company(VicePresident())
    val data2 = Company(Manager())
    //    val data3 = Company("") error
}