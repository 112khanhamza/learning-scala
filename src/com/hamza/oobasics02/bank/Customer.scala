package com.hamza.oobasics02.bank

class Customer(val firstName: String,
               val lastName: String,
               val id: String,
               private var _address: Address) {

    private var _accounts: List[Account] = Nil;

    def addAccount(account: Account): Unit = _accounts ::= account;

    def removeAccount(id: String): Boolean = {
        val index = _accounts.indexWhere(_.id == id);
        if (index < 0) false
        else {
            _accounts = _accounts.patch(index, Nil, 1);
            true
        }
    }

    def accounts = _accounts;

    def address = _address;

    def changeAddress(a: Address): Unit = _address = a;

}
