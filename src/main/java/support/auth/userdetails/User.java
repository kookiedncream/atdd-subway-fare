package support.auth.userdetails;

import java.util.List;

public class User implements UserDetails {
    public static final int DEFAULT_AGE = 20;

    private String username;
    private String password;
    private List<String> authorities;
    private int age;

    public static User MockUser() {
        return new  User(null, null, null, DEFAULT_AGE);
    }

    public User(String username, String password, List<String> authorities, int age) {
        this.username = username;
        this.password = password;
        this.authorities = authorities;
        this.age = age;
    }

    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public List<String> getAuthorities() {
        return authorities;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public boolean checkCredentials(Object credentials) {
        return password.equals(credentials.toString());
    }
}
