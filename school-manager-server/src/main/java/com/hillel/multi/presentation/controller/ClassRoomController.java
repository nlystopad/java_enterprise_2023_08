package com.hillel.multi.presentation.controller;

import com.hillel.multi.persistent.entity.ClassRoomEntity;
import com.hillel.multi.persistent.entity.ClassRoomState;
import com.hillel.multi.persistent.entity.SchoolEntity;
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
    public ResponseEntity<ClassRoomEntity> addClassRoom(@RequestBody ClassRoomEntity room) {
        return null;
    }

    @GetMapping("/classroom/{id}")
    public ResponseEntity<ClassRoomEntity> getClassRoomById(@PathVariable Long id) {
        return null;
    }

    @GetMapping("/classroom/school/{schoolId}")
    public ResponseEntity<List<ClassRoomEntity>> getAllClassRoomsBySchoolId(@PathVariable Long schoolId) {
        return null;
    }

    @GetMapping("/classroom")
    public ResponseEntity<List<ClassRoomEntity>> getClassRoomById(@RequestParam ClassRoomState state) {
        return null;
    }

    @PutMapping("/classroom/{id}")
    public ResponseEntity<ClassRoomEntity> getClassRoomById(@PathVariable Long id,
                                                            @RequestBody ClassRoomEntity classRoomEntity) {
        return null;
    }

    @DeleteMapping("/classroom/{id}")
    public ResponseEntity<String> deleteClassRoomById(@PathVariable Long id) {
        return null;
    }

    @PatchMapping("/classroom/{classRoomId}/teacher/{teacherId}")
    public ResponseEntity<ClassRoomEntity> updateTeacherById(@PathVariable Long classRoomId,
                                                             @PathVariable Long teacherId) {
        return null;
    }

    @PatchMapping("/classroom/{classRoomId}/school/{schoolId}")
    public ResponseEntity<ClassRoomEntity> updateSchoolById(@PathVariable Long classRoomId,
                                                            @PathVariable Long schoolId) {
        return null;
    }
}
