class ATM:
    def __init__(self, account_balance=0):
        self.account_balance = account_balance

    def check_balance(self):
        return self.account_balance

    def deposit(self, amount):
        if amount > 0:
            self.account_balance += amount
            return True
        else:
            return False

    def withdraw(self, amount):
        if 0 < amount <= self.account_balance:
            self.account_balance -= amount
            return True
        else:
            return False


def main():
    atm = ATM(1000)  # Inisialisasi saldo awal
    print("Selamat datang di ATM")
    while True:
        print("\nPilih operasi yang ingin Anda lakukan:")
        print("1. Cek Saldo")
        print("2. Deposit")
        print("3. Penarikan")
        print("4. Keluar")
        choice = input("Masukkan pilihan Anda: ")

        if choice == "1":
            print("Saldo Anda saat ini:", atm.check_balance())
        elif choice == "2":
            amount = float(input("Masukkan jumlah deposit: "))
            if atm.deposit(amount):
                print("Deposit berhasil. Saldo Anda sekarang", atm.check_balance())
            else:
                print("Deposit gagal. Jumlah deposit harus lebih besar dari 0.")
        elif choice == "3":
            amount = float(input("Masukkan jumlah penarikan: "))
            if atm.withdraw(amount):
                print("Penarikan berhasil. Saldo Anda sekarang", atm.check_balance())
            else:
                print("Penarikan gagal. Jumlah penarikan melebihi saldo Anda atau jumlah penarikan tidak valid.")
        elif choice == "4":
            print("Terima kasih telah menggunakan layanan ATM.")
            break
        else:
            print("Pilihan tidak valid. Silakan pilih 1-4.")


if __name__ == "__main__":
    main()
