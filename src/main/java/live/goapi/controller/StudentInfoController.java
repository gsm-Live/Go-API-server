package live.goapi.controller;

import live.goapi.domain.Student;
import live.goapi.dto.response.ResponseStudent;
import live.goapi.service.StudentInfoService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@Slf4j
@RequiredArgsConstructor
@RequestMapping("/student")
public class StudentInfoController {

    private final StudentInfoService studentInfoService;

    /**
     * @param name
     * @return ResponseStudent
     * name = 김희망
     * {
     * "name" : "김희망"
     * "number" : "1306"
     * "major" : "Back-End"
     * }
     */
    @GetMapping("/info/{name}")
    public ResponseStudent getStudentInfoByName(@PathVariable String name) {
        return studentInfoService.getStudentInfoByName(name);
    }

    @GetMapping("/info/{number}")
    public ResponseStudent getStudentInfoByNumber(@PathVariable String number) {
        return studentInfoService.getStudentInfoByNumber(number);
    }

    @GetMapping("/info/{major}")
    public ArrayList<ResponseStudent> getStudentInfoByMajor(@PathVariable String major) {
        return studentInfoService.getStudentsInfoByMajor(major);
    }
}
