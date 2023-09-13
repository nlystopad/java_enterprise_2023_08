package com.hillel.multi.presentation.controller;

import com.hillel.multi.persistent.entity.ClassRoom;
import com.hillel.multi.persistent.entity.ClassRoomState;
import com.hillel.multi.persistent.entity.School;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Validated
@RequestMapping("/api/v1")
public class ClassRoomController {
//    @Autowired
//    private ClassRoomService classRoomService;

    @PostMapping("/classroom")
    public ResponseEntity<ClassRoom> addClassRoom(@RequestBody ClassRoom room) {
        return null;
    }

    @GetMapping("/classroom/{id}")
    public ResponseEntity<ClassRoom> getClassRoomById(@PathVariable Long id) {
        return null;
    }

    @GetMapping("/classroom/school/{schoolId}")
    public ResponseEntity<List<ClassRoom>> getAllClassRoomsBySchoolId(@PathVariable School schoolId) {
        return null;
    }

    @GetMapping("/classroom")
    public ResponseEntity<List<ClassRoom>> getClassRoomById(@RequestParam ClassRoomState state) {
        return null;
    }

    @PutMapping("/classroom/{id}")
    public ResponseEntity<ClassRoom> getClassRoomById(@PathVariable Long id,
                                                      @RequestBody ClassRoom classRoom) {
        return null;
    }

    @DeleteMapping("/classroom/{id}")
    public ResponseEntity<String> deleteClassRoomById(@PathVariable Long id) {
        return null;
    }

    @PatchMapping("/classroom/{classRoomId}/teacher/{teacherId}")
    public ResponseEntity<ClassRoom> updateTeacherById(@PathVariable Long classRoomId,
                                                       @PathVariable Long teacherId) {
        return null;
    }

    @PatchMapping("/classroom/{classRoomId}/school/{schoolId}")
    public ResponseEntity<ClassRoom> updateSchoolById(@PathVariable Long classRoomId,
                                                      @PathVariable Long schoolId) {
        return null;
    }
}
