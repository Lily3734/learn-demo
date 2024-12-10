package com.itheima.d5_Test;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class FetchInfo {
    private String regex = "\\d{5}:.{2,3}:.:\\d{4}-(0[1-9]|1[0-2])-([1-3]0|[0-2][1-9])";
    private String Info = "\\d{5}|[\\u4e00-\\u9fa5]{2,3}|[男女]|(\\d{4}-[0-1][1,12]-([0-2][0-9]|3[0-1]))";
    private List<User> users = new ArrayList<>();

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public void fetch(String data){
        Pattern pattern = Pattern.compile(this.regex);
        Matcher matcher = pattern.matcher(data);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        while (matcher.find()){
            System.out.println(matcher.group());

            User user = new User();
            Pattern pattern1 = Pattern.compile(this.Info);
            Matcher matcher1 = pattern1.matcher(matcher.group());
            int i = 1;
            while(matcher1.find()){
                System.out.println(matcher1.group());
                switch (i++){
                    case 1:user.setID(Integer.parseInt(matcher1.group()));
                    break;
                    case 2:user.setName(matcher1.group());
                    break;
                    case 3:user.setGender(matcher1.group());
                    break;
                    case 4:user.setBirthday(LocalDate.parse(matcher1.group(),formatter));
                    break;
                }

            }
            users.add(user);
            System.out.println("--------------------------");
        }
    }

}
