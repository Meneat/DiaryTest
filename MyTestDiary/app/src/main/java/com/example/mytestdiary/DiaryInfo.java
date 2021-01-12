package com.example.mytestdiary;

public class DiaryInfo {
    private String strDiaryTitle;
    private String strDiaryContent;
    private int numDiaryWriteYear;
    private int numDiaryWriteMonth;
    private int numDiaryWriteDay;
    private int numTypeCode;

    public String getStrDiaryTitle() {
        return strDiaryTitle;
    }

    public void setStrDiaryTitle(String strDiaryTitle) {
        if (strDiaryTitle.equals(""))
            this.strDiaryTitle = "No Title";
        else
            this.strDiaryTitle = strDiaryTitle;
    }

    public String getStrDiaryContent() {
        return strDiaryContent;
    }

    public void setStrDiaryContent(String strDiaryContent) {
        this.strDiaryContent = strDiaryContent;
    }

    public int getNumDiaryWriteMonth() {
        return numDiaryWriteMonth;
    }

    public void setNumDiaryWriteMonth(int numDiaryWriteMonth) {
        this.numDiaryWriteMonth = numDiaryWriteMonth;
    }

    public int getNumDiaryWriteDay() {
        return numDiaryWriteDay;
    }

    public void setNumDiaryWriteDay(int numDiaryWriteDay) {
        this.numDiaryWriteDay = numDiaryWriteDay;
    }

    public int getNumTypeCode() {
        return numTypeCode;
    }

    public void setNumTypeCode(int numTypeCode) {
        this.numTypeCode = numTypeCode;
    }

    public int getNumDiaryWriteYear() {
        return numDiaryWriteYear;
    }

    public void setNumDiaryWriteYear(int numDiaryWriteYear) {
        this.numDiaryWriteYear = numDiaryWriteYear;
    }

    // This Function should return 8 Code
    public int getDBDateCode() {
        return this.numDiaryWriteYear * 10000 + this.numDiaryWriteMonth * 100 + this.numDiaryWriteDay;
    }

    public DiaryInfo() {
        this.strDiaryTitle = "";
        this.strDiaryContent = "";
        this.numDiaryWriteMonth = 0;
        this.numDiaryWriteDay = 0;
        this.numTypeCode = 0;
        this.numDiaryWriteYear = 0;
    }

    public DiaryInfo(DiaryInfo diaryInfo) {
        this.strDiaryTitle = diaryInfo.strDiaryTitle;
        this.strDiaryContent = diaryInfo.strDiaryContent;
        this.numDiaryWriteMonth = diaryInfo.numDiaryWriteMonth;
        this.numDiaryWriteDay = diaryInfo.numDiaryWriteDay;
        this.numTypeCode = diaryInfo.numTypeCode;
        this.numDiaryWriteYear = diaryInfo.numDiaryWriteYear;
    }
}
