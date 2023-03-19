package zerobase.weather.controller;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;
import zerobase.weather.domain.Diary;
import zerobase.weather.error.InvalidDate;
import zerobase.weather.service.DiaryService;

import java.time.LocalDate;
import java.util.List;

@RestController
public class DiaryController {

    private final DiaryService diaryService;

    public DiaryController(DiaryService diaryService) {
        this.diaryService = diaryService;
    }

    @ApiOperation(value="Diary text and Weather will be saved in DB", notes="This is note")
    @PostMapping("/create/diary")
    void createDiary(@RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
                     @ApiParam(example ="2023-03-01")
                     LocalDate date, @RequestBody String text){
        diaryService.createDiary(date, text);
    }

    @ApiOperation("Bring All diary on selected date ")
    @GetMapping("/read/diary")
    List<Diary> readDiary(@RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
                          @ApiParam(example ="2023-03-01")
                   LocalDate date){
//        if (date.isAfter(LocalDate.ofYearDay(2023,1))){
//            throw new InvalidDate();
//        }
        return diaryService.readDiary(date);
    }

    @ApiOperation("Bring All diary between dates")
    @GetMapping("/read/diaries")
    List<Diary> readDiaries
            (@RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
             @ApiParam(value = "The start date for diaries", example ="2023-03-01")
             LocalDate startDate,
             @RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
             @ApiParam(value = "The end date for diaries", example ="2023-03-31")
             LocalDate endDate){
        return diaryService.readDiaries(startDate, endDate);
    }

    @ApiOperation("Update the diary on selected date")
    @PutMapping("/update/diary")
    void updateDiary(@RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
                     @ApiParam(example ="2023-03-01")
                     LocalDate date, @RequestBody String text){
        diaryService.updateDiary(date,text);
    }


    @ApiOperation("Delete the diary on selected date")
    @DeleteMapping("/delete/diary")
    void deleteDiary(@RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
                     @ApiParam(example ="2023-03-01")
                     LocalDate date){
        diaryService.deleteDiary(date);
    }
}
