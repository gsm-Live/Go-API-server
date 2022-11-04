package live.goapi.util;

import live.goapi.domain.Student;
import live.goapi.dto.response.ResponseStudent;

public class StudentUtil {
    public ResponseStudent makeResponseStudent(Student findStudent) {
        if(findStudent == null){
            throw new NullPointerException("존재하지 않는 학생입니다.");
        }
        ResponseStudent response = new ResponseStudent(
                findStudent.getName(), findStudent.getNumber(), findStudent.getMajor());
        return response;
    }
}