package com.hamza.oobasics02.bank

class Account private(val customer: Customer, val id: String) {
    private[this] var _balance: Int = 0;

    customer.addAccount(this)

    def balance = _balance;

    def balance_=(newBalance: Int) = {
        if (newBalance < _balance) withdraw(_balance - newBalance)
        else deposit(newBalance - _balance)
    };

    def deposit(amount: Int): Boolean = {
        if (amount < 0) false;
        else {
            _balance += amount;
            true
        }
    }

    def withdraw(amount: Int): Boolean = {
        if (amount < 0 || amount > _balance) false;
        else {
            _balance -= amount;
            true
        }
    }
}

object Account {
    private var nextAccountNumber = 0
    def main(args: Array[String]): Unit = {
        val a = new Account(new Customer("Mark", "Lewis", "id", new Address(Nil)), "id")
        a.balance = 700; // this will deposit 700
        a.balance += 40; // this will do a deposit // translates to -> a.balance = a.balance + 40 -> a.balance = 740 -> deposit(40)
        // after this call current balance is 740
        a.balance -= 40 // this will do a withdraw // translates to -> a.balance = a.balance - 40 -> a.balance = 700 -> withdraw(40)
    }

    def apply(customer: Customer): Account = {
        nextAccountNumber += 13;
        new Account(customer, nextAccountNumber.toString);
    }

    def apply(lines: Iterator[String]): Account = {
        ???
    }
}