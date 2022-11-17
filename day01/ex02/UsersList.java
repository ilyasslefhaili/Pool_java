public class UsersList {
    private UsersArrayList Array;

    public UsersList() {
        Array = new UsersArrayList();
    }

    public void AddUser(User toAdd) {
        Array.add(toAdd);
    }

    public User RetrieveUserById(int id) throws UserNotFoundException {
        return (Array.RetrivebyId(id));
    }

    public User RetrieveUserByIndex(int index) {
        return (Array.RetrivebyIndex(index));
    }

    public int RetrieveNumOfUsers() {
        return (Array.RetriveNumofUsers());
    }
}