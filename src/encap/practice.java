package encap;

import object.VarParameter;


class Account{
    String name;
    private double balance;
    private String password;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() <= 4 && name.length() >= 2) {
            this.name = name;
        }else{
            System.out.println("名字长度需为2-4，默认为小明");
            this.name = "小明";
        }
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if (password.length() == 6) {
            this.password = password;
        }else{
            System.out.println("密码长度需为6位，默认为000000");
            this.password = "000000";
        }
    }

    public Account(String name, double balance, String password) {
//        this.name = name;
//        this.balance = balance;
//        this.password = password;
        setName(name);
        setBalance(balance);
        setPassword(password);
    }
    public String info(){
        return "姓名=" + name + "\t余额=" + balance + "\t密码=" + password;
    }
}
