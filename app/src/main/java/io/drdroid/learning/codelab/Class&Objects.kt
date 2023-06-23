package io.drdroid.learning.codelab

import java.text.SimpleDateFormat
import java.time.LocalDate;
import java.time.Period
import java.util.Calendar
import java.util.Date
import java.util.Locale

fun main() {
    var admin = Admin(
        id = 1,
        firstName = "aadmin",
        lastName = "admin",
        group = Group(title = "Admins"),
        birthday = Date(),
        privileges = listOf(Privileges("Admins", false, false, false, false)),
        managedGroups = listOf()
    )
    println(
        admin.toString()
    )
}

interface AdminAction {
    fun createUser(user: User)
    fun updateUser(user: User)
}

interface UserAction {
    fun login(userName: String, password: String)
    fun logout()
}

object SpecialAction : UserAction {
    override fun login(userName: String, password: String) {
        println("trying to login with $userName and $password")
    }

    override fun logout() {
        println("logout from current session")
    }
}

open class User(
    open var id: Int = 0,
    var userName: String = "",
    open var firstName: String = "",
    open var lastName: String = "",
    open var birthday: Date = Date(),
    open var group: Group = Group(),
    var accountType: AccountType = AccountType.USER,
    override var gender: String = "",
    override var height: Int = 0
) : Person(), UserAction {
    //    lateinit var age: Integer
//    var birthday : Date = birthday
    var hasPrivileges: Boolean = false
    open var age: Int = 0
        get() {
            val cal: Calendar = Calendar.getInstance()
            cal.time = birthday
            return getAge(
                cal.get(Calendar.YEAR),
                cal.get(Calendar.MONTH),
                cal.get(Calendar.DAY_OF_WEEK)
            )
        }

    init {
        hasPrivileges = accountType == AccountType.ADMIN
    }

    constructor(firstName: String, lastName: String) : this() {}

    override fun login(userName: String, password: String) {
        println("User login")
    }

    override fun logout() {
        println("User logout")
    }

    override fun toString(): String {
        return "[$userName, $firstName, $lastName, ${
            SimpleDateFormat(
                "MM/dd/yyyy",
                Locale.getDefault()
            ).format(birthday)
        }]"
    }
}

class Admin(
    override var id: Int,
    override var firstName: String,
    override var lastName: String,
    override var birthday: Date,
    override var group: Group,
    var privileges: List<Privileges>,
//    var managedGroups: Map<Group, List<User>>
    var managedGroups: List<Group>
) : User(id = id, firstName = firstName, lastName = lastName, birthday = birthday, group = group),
    AdminAction/*, UserAction by SpecialAction*/ {
    fun canManage(user: User): Boolean {
        return user.accountType != AccountType.ADMIN && privileges.any { it.groupName == user.group.title }
    }

    override fun createUser(user: User) {
        println("User ${user.userName} has been created")
    }

    override fun updateUser(user: User) {
        println("User ${user.userName} with ID ${user.id} has been deleted")
    }

    override fun logout() {
//        super.logout()
        println("Admin logout")
    }
}

class Privileges(
    var groupName: String,
    var view: Boolean,
    var create: Boolean,
    var update: Boolean,
    var delete: Boolean
)

abstract class Person {
    abstract var gender: String
    abstract var height: Int
}

data class Group(val title: String = "", var members: Int = 0) {}

enum class AccountType(type: String) {
    USER("User"),
    ADMIN("Admin")
}

fun getAge(year: Int, month: Int, dayOfMonth: Int): Int {
    return Period.between(
        LocalDate.of(year, month, dayOfMonth),
        LocalDate.now()
    ).years
}