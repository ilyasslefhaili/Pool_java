
public class UsersArrayList {
    User[] UsersArray;
    int Index;

    UsersArrayList() {
        this.UsersArray = new User[10];
        this.Index = 0;
    }

    public void add(User obj) {
        if (this.Index >= this.UsersArray.length) {
            User[] temp = new User[this.UsersArray.length + this.UsersArray.length / 2];
            for (int i = 0; i < this.UsersArray.length; i++)
                temp[i] = this.UsersArray[i];
            this.UsersArray = temp;
        }
        this.UsersArray[Index] = obj;
        this.Index++;
    }

    public User RetrivebyIndex(int index) {
        if (this.UsersArray.length > index && index >= 0)
            return (this.UsersArray[index]);
        throw (new OutOfMemoryError("out of range"));
    }

    public User RetrivebyId(int id) throws UserNotFoundException {
        for (int i = 0; i < this.Index; i++) {
            if (this.UsersArray[i].getId() == id)
                return (this.UsersArray[i]);
        }
        throw (new UserNotFoundException("User Not found"));
    }

    public int RetriveNumofUsers() {
        return (this.Index);
    }
}